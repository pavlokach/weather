public enum WeatherTypes {
    HOT, COLD, NICE;
    public String getString(){
        switch (this){
            case HOT:
                return "So temperature, such hot";
            case COLD:
                return "Men's not hot";
            case NICE:
                return "It's awesome";
        }
        return "Invalid temperature";
    }
}
