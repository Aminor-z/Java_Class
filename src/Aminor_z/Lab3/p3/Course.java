package Aminor_z.Lab3.p3;

public  class Course {
        private String id;
        private String name;
        private double mark;

        public Course() {
        }

        public Course(String id, String name, double mark) {
            this.id = id;
            this.name = name;
            this.mark = mark;
        }

        public void set_id(String id) {
            this.id = id;
        }

        public void set_name(String name) {
            this.name = name;
        }

        public void set_mark(double mark) {
            this.mark = mark;
        }

        public String get_id() {
            return id;
        }

        public String get_name() {
            return name;
        }

        public double get_mark() {
            return mark;
        }

        public double get_ClassHour() {
            return mark * 16;
        }
    }
