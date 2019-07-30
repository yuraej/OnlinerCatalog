public class Item {
    private String application;
    private int power;
    private int cleaningTime;
    private String bodyColor;
    private String ultravioletLamp;

    public Item() {
    }

    public Item(String application, int power, int cleaningTime, String bodyColor, String ultravioletLamp) {
        this.application = application;
        this.power = power;
        this.cleaningTime = cleaningTime;
        this.bodyColor = bodyColor;
        ultravioletLamp = ultravioletLamp;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCleaningTime() {
        return cleaningTime;
    }

    public void setCleaningTime(int cleaningTime) {
        this.cleaningTime = cleaningTime;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getUltravioletLamp() {
        return ultravioletLamp;
    }

    public void setUltravioletLamp(String ultravioletLamp) {
        ultravioletLamp = ultravioletLamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item that = (Item) o;

        if (power != that.power) return false;
        if (cleaningTime != that.cleaningTime) return false;
        if (application != null ? !application.equals(that.application) : that.application != null) return false;
        if (bodyColor != null ? !bodyColor.equals(that.bodyColor) : that.bodyColor != null) return false;
        return ultravioletLamp != null ? ultravioletLamp.equals(that.ultravioletLamp) : that.ultravioletLamp == null;
    }

    @Override
    public int hashCode() {
        int result = application != null ? application.hashCode() : 0;
        result = 31 * result + power;
        result = 31 * result + cleaningTime;
        result = 31 * result + (bodyColor != null ? bodyColor.hashCode() : 0);
        result = 31 * result + (ultravioletLamp != null ? ultravioletLamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CatalogNew{" +
                "application='" + application + '\'' +
                ", power=" + power +
                ", cleaningTime=" + cleaningTime +
                ", bodyColor='" + bodyColor + '\'' +
                ", UltravioletLamp='" + ultravioletLamp + '\'' +
                '}';
    }
}
