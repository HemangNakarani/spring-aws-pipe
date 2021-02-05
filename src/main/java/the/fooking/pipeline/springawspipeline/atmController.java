package the.fooking.pipeline.springawspipeline;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class atmController {

    @GetMapping("/")
    public String hi()
    {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>Hemang's App</title>\n" +
                "  </head>\n" +
                "<body>\n" +
                "<style media=\"screen\">\n" +
                "  @import url(https://fonts.googleapis.com/css?family=Fira+Sans:400,300,700);\n" +
                "    body {\n" +
                "    background-color: #4a585f;\n" +
                "    font-family: \"Fira Sans\", sans-serif;\n" +
                "    font-size: 13px;\n" +
                "    }\n" +
                "    .sectionHeroImg {\n" +
                "      width: 100%;\n" +
                "      height: 100vh;\n" +
                "      background-image: url(http://artplague.dk/_assets/JWSB3QDJEW.jpg);\n" +
                "      background-position: center center;\n" +
                "      background-size: cover;\n" +
                "    }\n" +
                "    .sectionHeroImg h1 {\n" +
                "      font-weight: 700;\n" +
                "      font-size: 4vw;\n" +
                "      color: #fff;\n" +
                "      text-transform: uppercase;\n" +
                "      position: absolute;\n" +
                "      left: 50%;\n" +
                "      top: 50%;\n" +
                "      transform: translate(-50%, -50%);\n" +
                "    }\n" +
                "    .sectionHeroImg h1 span {\n" +
                "      font-weight: 300;\n" +
                "    }\n" +
                "    .sectionHeroImg h1 span p {\n" +
                "      font-size: 12px;\n" +
                "      text-transform: capitalize;\n" +
                "    }\n" +
                "</style>\n" +
                "\n" +
                "  <div class='sectionHeroImg'>\n" +
                "    <h1>\n" +
                "      Spring\n" +
                "      <span>\n" +
                "        App\n" +
                "        <p>\n" +
                "          By Hemang\n" +
                "        </p>\n" +
                "      </span>\n" +
                "    </h1>\n" +
                "  </div>\n" +
                "</body>\n" +
                "</html>\n";
    }
}
