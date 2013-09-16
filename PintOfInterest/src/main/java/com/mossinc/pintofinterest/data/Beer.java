package com.mossinc.pintofinterest.data;

/**
 * Created by g74sx on 9/15/13.
 */
public class Beer {
    private long id;
    private String name;
    private String style;
    private String description;
    private int rating;

    public Beer() {
    }

    public Beer(long id, String name, String style, String description, int rating) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.description = description;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
