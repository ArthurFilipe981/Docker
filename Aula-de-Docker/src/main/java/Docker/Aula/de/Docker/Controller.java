package Docker.Aula.de.Docker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    //so para testar o docker
    @GetMapping("/docker")
    public String mensagen(){
        return "Essa é uma aplicaçao Docker";
    }
}
