package com.futurecollars.lesson3.exc1;

public class CinemaPlace {
    public class Place {
        private final int placeNumber;
        private final int rowNumber;
        private boolean placeStatus;

        public Place(int placeNumber, int rowNumber, boolean placeStatus) {
            this.placeNumber = placeNumber;
            this.rowNumber = rowNumber;
            this.placeStatus = placeStatus;
        }

        public int getPlaceNumber() {
            return placeNumber;
        }

        public int getRowNumber() {
            return rowNumber;
        }

        public boolean isPlaceStatus() {
            return placeStatus;
        }

        public void setPlaceStatus(boolean placeStatus) {
            this.placeStatus = placeStatus;
        }

    }
}
