package pers.yewin.springprofilepropertiesymlfile.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Ye Win
 * @created: 22/10/2022
 * @project: spring-profile-properties-yml-file
 * @package: pers.yewin.springprofilepropertiesymlfile.model
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String title;
    private String activeProfile;
    private String serverPort;
    private String description;
    private String valueFromMainConfig;
}
