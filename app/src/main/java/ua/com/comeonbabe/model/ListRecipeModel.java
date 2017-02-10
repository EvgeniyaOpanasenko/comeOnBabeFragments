package ua.com.comeonbabe.model;

/**
 * Created by Lisa on 2/9/2017.
 */

public class ListRecipeModel {

    private  String titleRecipe ="";
    private  String image ="";
    private  String url ="";

    public ListRecipeModel(String image, String titleRecipe, String url) {
        this.image = image;
        this.titleRecipe = titleRecipe;
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitleRecipe() {
        return titleRecipe;
    }

    public void setTitleRecipe(String titleRecipe) {
        this.titleRecipe = titleRecipe;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
