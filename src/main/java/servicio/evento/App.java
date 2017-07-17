package servicio.evento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
