class TVAdapter implements Russianman {
    private Englishman english;

    public TVAdapter(Englishman english) {
        this.english = english;
    }

    @Override
    public void overlook() {english.watch();}

}