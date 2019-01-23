class Balanced {

    boolean balanced(String input) {
        if (input.isEmpty()) {
            return true;
        }
        long x = input.chars().filter(c -> c == 120).count();
        long y = input.chars().filter(c -> c == 121).count();

        return x == y;
    }
}
