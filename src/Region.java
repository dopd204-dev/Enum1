public enum Region {

        BISHKEK("Бишкек", 1200000, "Кыргызстандын борбору"),
        BATKEN("Баткен", 500000, "Бийик тоолуу жана жемиш бактары"),
        TALAS("Талас", 250000, "Тоолуу жерлер жана тарыхый жерлер"),
        NARYN("Нарын", 280000, "Бийик тоолуу жана кой чарбасы"),
        ISSYK_KUL("Иссык-Куль", 430000, "Көл жана курорттор"),
        MANAS("Манас", 1100000, "Мөмө-жемиштер жана термалдык булактар"),
        OSH("Ош", 1100000, "Тарыхый шаар жана кол өнөрчүлүк");

        private String name;
        private int population;
        private String feature;

        Region(String name, int population, String feature) {
            this.name = name;
            this.population = population;
            this.feature = feature;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }
    }

