package com.pluralsight;

public class CellPhone {
        private int serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;

        public CellPhone() {
            this.serialNumber = 0;
            this.model = "";
            this.carrier = "";
            this.phoneNumber = "";
            this.owner = "";
        }

        //Getter & Setter for Serial Number
        public int getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
        }

        //Getter & Setter for Model
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        //Getter & Setter for Carrier
        public String getCarrier() {
            return carrier;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        //Getter & Setter for Phone Number
        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        //Getter & Setter for Owner
        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
    }