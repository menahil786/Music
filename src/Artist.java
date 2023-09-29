public class Artist {
    private String name;
    private String nationality;
    private int rating;

    public String getName(){
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



    public Artist(String name, String nationality, int rating) {
        this.name = name;
        this.nationality = nationality;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%20s %10s %5d",name,nationality,rating);
    }
}
