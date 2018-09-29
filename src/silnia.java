class Silnia {

    public int silnia(int n) {
        if (n == 0)
            return 1;
        else
            return n * silnia(n - 1);
    }

    static public void main(String argv[]) {
        Silnia s = new Silnia();

        System.out.println(s.silnia(5));
    }
}
