package gatech.cs2340.shelterme.models;

import android.util.Log;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

import gatech.cs2340.shelterme.models.Shelter;

/**
 * Created by danielholliday on 3/8/18.
 */

public class RestfulClient {
    RestTemplate restTemplate;
    Shelter[] shelters;
    String url = "http://10.0.2.2:8080/shelters";

    public RestfulClient() {
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        /*
        RestTemplate restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM);
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
        */
    }

    /**
     * get entity for getting all shelters
     * @return shelters list of shelter objects with fields from API
     */
    public Shelter[] getAllShelters() {
        System.out.println("Begin /GET request for all shelters");
        shelters = new Shelter[12];
        url += "/?unique_key=";
        try {
            for (int i = 0; i < 12; i++) {
                url += i;
                Shelter getResponse = restTemplate.getForObject(url, Shelter.class);
                shelters[i] = getResponse;
            }
            return shelters;
        } catch (Exception e) {
            Log.e("RestfulClient-getAll", e.getMessage(), e);
        }

        return null;
    }

    /**
     * get entity for getting specific shelter
     * @param uniqueKey uniqueKey used to identify a shelter
     * @return shelter based on uniqueKey
     */
    public Shelter getShelter(int uniqueKey) {
        System.out.println("Begin /GET request for shelter " + uniqueKey);
        url += "/?unique_key=" + uniqueKey;
        try {
            HttpHeaders httpHeaders = restTemplate.headForHeaders(url);
            Shelter shelter = restTemplate.getForObject(url, Shelter.class);

            //ObjectMapper objectMapper = new ObjectMapper();
            //Shelter shelter = objectMapper.readValue(getResponse.toString(), Shelter.class); //(getResponse.getBody(), Shelter.class);
            //getResponse = Arrays.asList(getResponse);
            return shelter;
        } catch (Exception e) {
            Log.e("RestfulClient-getShelt", e.getMessage(), e);
        }

        return null;
    }
}
