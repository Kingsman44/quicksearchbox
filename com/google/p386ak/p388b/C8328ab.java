package com.google.p386ak.p388b;

/* renamed from: com.google.ak.b.ab */
/* compiled from: PG */
public final class C8328ab {

    /* renamed from: a */
    private static final int f29144a;

    static {
        int i;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i = Integer.parseInt(split[0]);
            if (i == 1) {
                i = split.length > 1 ? Integer.parseInt(split[1]) : 1;
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char charAt = property.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        f29144a = i;
    }

    /* renamed from: a */
    public static boolean m23098a() {
        return f29144a >= 9;
    }
}
