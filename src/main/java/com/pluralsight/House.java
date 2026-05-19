package com.pluralsight;

public class House extends FixedAsset  {

        private int yearBuilt;
        private int squareFeet;
        private int bedrooms;

        //constructor
        public House(String name,
                     double marketValue,
                     int yearBuilt,
                     int squareFeet,
                     int bedrooms) {


            //intialize parent
            super(name, marketValue);

            //intialize child
            this.yearBuilt = yearBuilt;
            this.squareFeet = squareFeet;
            this.bedrooms = bedrooms;

        }
        //getters and setters
        public int getYearBuilt() {
        return yearBuilt;
        }
        public void setYearBuilt(int yearBuilt) {
            this.yearBuilt = yearBuilt;
        }
        public int getSquareFeet() {
            return squareFeet;
        }
        public void setSquareFeet(int squareFeet) {
            this.squareFeet = squareFeet;
        }
        public int getBedrooms() {
            return bedrooms;
        }
        public void setBedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
        }

        //override getValue to return the value of the house
        @Override
        public double getValue() {
            return getMarketValue();
        }
}
