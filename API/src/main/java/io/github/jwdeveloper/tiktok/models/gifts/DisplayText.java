package io.github.jwdeveloper.tiktok.models.gifts;

import lombok.Data;

import java.util.List;

@Data
public class DisplayText {
    private DefaultFormat default_format;
    private String default_pattern;
    private String key;
    private List<Object> pieces;
}