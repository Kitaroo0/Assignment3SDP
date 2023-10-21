class EnglishmanImpl implements Englishman {
    private String name;

    public EnglishmanImpl(String name) {
        this.name = name;
    }

    @Override
    public void watch() {
        System.out.println(name + " is watching video in english");
    }
}