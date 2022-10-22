package pers.yewin.springprofilepropertiesymlfile.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.yewin.springprofilepropertiesymlfile.model.Message;

/**
 * @author: Ye Win
 * @created: 22/10/2022
 * @project: spring-profile-properties-yml-file
 * @package: pers.yewin.springprofilepropertiesymlfile.controller
 */

@RestController
@Slf4j
public class ProfileTestMessageController {


    /**
     * You can reference reading properties values by using @Value in below url.
     * Refer to <a href="https://github.com/yewin-mm/reading-properties-file-values">Reading Properties File Values</a>
     */

    @Value("${spring.profiles.active}")
    private String activeProfile; // getting active profile name

    @Value("${server.port}")
    private String serverPort; // getting server port

    @Value("${message.title}")
    private String msgTitle;

    @Value("${message.description}")
    private String msgdDscription;

    @Value("${message.valueFromMainConfig}")
    private String valueFromMainConfig;

    @GetMapping("/getMessage")
    public ResponseEntity<Message> getMessage(){
        Message message = new Message(msgTitle, activeProfile, serverPort, msgdDscription, valueFromMainConfig);
        log.info("Response: {}", message);
        return ResponseEntity.ok(message);
    }
}
