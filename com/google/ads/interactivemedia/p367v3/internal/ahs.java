package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ahs */
/* compiled from: PG */
public final class ahs {

    /* renamed from: a */
    private static final int f20668a;

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
        f20668a = i;
    }

    /* renamed from: a */
    public static int m18746a() {
        return f20668a;
    }

    /* renamed from: b */
    public static boolean m18747b() {
        return f20668a >= 9;
    }
}
