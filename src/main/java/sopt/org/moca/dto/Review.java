package sopt.org.moca.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review {

    private int review_id;
    private int cafe_id;
    private String user_id;
    private List<ReviewImage> image;
    private int rating;
    private String title;
    private String content;
    private Date create_date;

    private int like_count;
    private int comment_count;

    private boolean auth;
    private boolean like;
}
