class addbinry{
    public String addBinary(String a, String b) {
        
        int maxLen = Math.max(a.length(), b.length());
        a = String.format("%" + maxLen + "s", a).replace(' ', '0');
        b = String.format("%" + maxLen + "s", b).replace(' ', '0');

        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for (int i = maxLen - 1; i >= 0; i--) {
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;
            sb.append(sum % 2);   
            carry = sum / 2;      
        }

        if (carry > 0) sb.append("1"); 

        return sb.reverse().toString();
    }
}
