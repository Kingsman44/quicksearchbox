package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.k */
/* compiled from: PG */
public final class C102369k {
    /* renamed from: a */
    public static long m169696a(String str) {
        int length = str.length();
        int i = length - 2;
        try {
            double parseDouble = Double.parseDouble(str.substring(0, i));
            String upperCase = str.substring(i, length).toUpperCase();
            if (!upperCase.equals("KB")) {
                if (upperCase.equals("MB")) {
                    parseDouble *= 1024.0d;
                }
                return -1;
            }
            return (long) (parseDouble * 1024.0d);
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
        }
    }
}
