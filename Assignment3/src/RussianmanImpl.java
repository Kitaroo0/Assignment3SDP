class RussianmanImpl implements Russianman {
    private String name;

    public RussianmanImpl(String name) {
        this.name = name;
    }

    @Override
    public void overlook() {
        System.out.println(name + " is watching video in russian");
    }
}