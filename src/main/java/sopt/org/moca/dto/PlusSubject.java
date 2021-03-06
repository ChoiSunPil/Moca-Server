package sopt.org.moca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlusSubject {

    private int plus_subject_id;
    private String editor_id;
    private String editor_name;
    private String editor_img_url;
    private String plus_subject_title;
    private String plus_subject_img_url;

}
