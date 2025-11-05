class excel_title {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust because 'A' starts at 1, not 0
            int remainder = columnNumber % 26;
            char ch = (char)('A' + remainder);
            result.append(ch);
            columnNumber /= 26;
        }

        return result.reverse().toString(); // Reverse because we appended backwards
    }
}


