package io.github.jwdeveloper.tiktok.models.gifts;

import lombok.Data;

import java.util.List;

@Data
public class GiftLabelIcon {
    private String avg_color;
    private int height;
    private int image_type;
    private boolean is_animated;
    private String open_web_url;
    private String uri;
    private List<String> url_list;
    private int width;
}