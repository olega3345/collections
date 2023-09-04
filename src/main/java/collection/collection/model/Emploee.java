package collection.collection.model;

import java.util.Objects;

public class  Emploee {
        private final String firstName;
        private final String lasttName;

        public Emploee(String firstName, String lusttName) {
            this.firstName = firstName;
            this.lasttName = lusttName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLusttName() {
            return lasttName;
        }
         public String getFullName() {
            return firstName + " " + lasttName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Emploee emploee = (Emploee) o;
            return Objects.equals(firstName, emploee.firstName) && Objects.equals(lasttName, emploee.lasttName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lasttName);
        }

        @Override
        public String toString() {
            return "Emploee{" +
                    "firstName='" + firstName + '\'' +
                    ", lusttName='" + lasttName + '\'' +
                    '}';
        }
    }

