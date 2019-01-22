class HexColours {


    String hexcolor(int... values) {
        if (values.length != 3) {
            return "";
        } else {
            StringBuilder hex = new StringBuilder("#");
            for (int value : values) {
                String part = Integer.toHexString(value);
                if (part.length() == 1) {
                    hex.append("0").append(part);
                } else {
                    hex.append(part);
                }
            }
            return hex.toString().toUpperCase();
        }
    }
}
