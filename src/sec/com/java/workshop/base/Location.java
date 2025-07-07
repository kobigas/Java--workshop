public class Location {
     private String name;
        private double latitude;
        private double longitude;
        private String description;
        private String country;
        private String city;
        private String address;
        private long  postalcode;
        public void setName(String aName){
            name=aName;
        }
        public String getName(){
            return name;
        }
        public void setlatitude(double aLatitude){
            latitude=aLatitude;
        }
        public double getLatitude(){
            return latitude;
        }
        public void setLongitude(double alongitude){
            longitude=alongitude;
        }
        public double getlongitude(){
            return longitude;
        }
        public void setDescription(String aDescription){
            description=aDescription;
        }
        public String getDescription(){
            return description;
        }
        public void setCountry(String aCountry){
            country=aCountry;
        } 
        public String getCountry(){
            return country;
        }
        public void setCity(String aCity){
            city=aCity;
        }
        public String getCity()
        {
            return city;
        }
        public void setAddress(String aAddress){
            address=aAddress;
        }
        public String getAddress(){
            return address;
        }
        public void setPostalcode(long aPostalcode)
        {
            postalcode=aPostalcode;
        }
        public long getPostalcode(){
            return postalcode;
        }
@Override
public String toString(){
    return "location{name:"+name+
    ",latitude:"+latitude+
    ",longitude:"+longitude+
    ",description:"+description+
    "country:"+country+
    ",city:"+city+
    ",address:"+address+
    ",postalcode:"+postalcode+"}";}
}
    

