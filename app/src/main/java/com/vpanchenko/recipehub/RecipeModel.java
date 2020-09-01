package com.vpanchenko.recipehub;

public class RecipeModel {
    private int id;
    private String name;
    private String description;
    private String ingredients;
    private String howToCook;
    //    private String url; //TODO: add it later
    private String photo; //TODO: added external link
    private boolean isExpanded;

    public RecipeModel(int id, String name, String description, String ingredients, String howToCook, String photo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.howToCook = howToCook;
//        this.url = url;
        this.photo = photo;
        isExpanded = false;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getHowToCook() {
        return howToCook;
    }

    public void setHowToCook(String howToCook) {
        this.howToCook = howToCook;
    }

//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", howToCook='" + howToCook + '\'' +
//                ", url='" + url + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
