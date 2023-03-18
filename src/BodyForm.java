public class BodyForm {
    double weight;
    int height;
    double bfPercentage;

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setBfPercentage(double bfPercentage) {
        this.bfPercentage = bfPercentage;
    }
    public double getBfPercentage() {
        return bfPercentage;
    }
    BodyForm(double weight, double bfPercentage) {
        this.weight = weight;
        this.bfPercentage = bfPercentage;
    }
    public double calculateBMI() {
        return weight / (height * height);
    }

}
