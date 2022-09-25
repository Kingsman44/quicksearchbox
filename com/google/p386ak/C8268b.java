package com.google.p386ak;

/* renamed from: com.google.ak.b */
/* compiled from: PG */
public enum C8268b implements C8382c {
    IDENTITY,
    UPPER_CAMEL_CASE,
    UPPER_CAMEL_CASE_WITH_SPACES,
    UPPER_CASE_WITH_UNDERSCORES,
    LOWER_CASE_WITH_UNDERSCORES,
    LOWER_CASE_WITH_DASHES,
    LOWER_CASE_WITH_DOTS;

    /* renamed from: a */
    static String m22978a(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: b */
    static String m22979b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (Character.isUpperCase(charAt)) {
                return str;
            } else {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    String substring = str.substring(1);
                    return upperCase + substring;
                }
                String substring2 = str.substring(0, i);
                String substring3 = str.substring(i + 1);
                return substring2 + upperCase + substring3;
            }
        }
        return str;
    }
}
