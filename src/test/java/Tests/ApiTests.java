package Tests;


import Model.UserPost;
import Model.UserPosts;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;


public class ApiTests {
public ApiTests(){

}

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        test1();
    }
public static CompletableFuture<UserPosts> test1() throws IOException, InterruptedException, URISyntaxException {

    HttpRequest request = HttpRequest.newBuilder(new URI("https://jsonplaceholder.typicode.com/posts/"))
            .header("Accept", "application/json")
            .build();

    ObjectMapper objectMapper = new ObjectMapper();

//    return HttpClient.newHttpClient()
//            .sendAsync(request, HttpResponse.BodyHandlers.ofString())
//            .thenApply(HttpResponse::body)
//            .thenApply(x-> {
//                try {
//                    return objectMapper.readValue(x,UserPosts.class);
//                } catch (JsonProcessingException e) {
//                    e.printStackTrace();
//                }
//                return null;
//            });
   HttpClient.newHttpClient()
            .send(request, HttpResponse.BodyHandlers<UserPost>.());
   // UserPosts posts = objectMapper.readValue(response.body(), Posts.class);

    System.out.println(response.body());

}

}
