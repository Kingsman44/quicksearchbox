package com.google.common.base;

/* renamed from: com.google.common.base.d */
/* compiled from: PG */
public final class C58890d {
    /* renamed from: a */
    public static char m90986a(char c) {
        return m90992g(c) ? (char) (c ^ ' ') : c;
    }

    /* renamed from: b */
    public static String m90987b(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return m90988c((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = m90986a(charSequence.charAt(i));
        }
        return String.valueOf(cArr);
    }

    /* renamed from: c */
    public static String m90988c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m90992g(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m90992g(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: d */
    public static String m90989d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m90991f(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m90991f(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: e */
    public static boolean m90990e(CharSequence charSequence, CharSequence charSequence2) {
        int h;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((h = m90993h(charAt)) >= 26 || h != m90993h(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m90991f(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: g */
    public static boolean m90992g(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: h */
    private static int m90993h(char c) {
        return (char) ((c | ' ') - 'a');
    }
}
