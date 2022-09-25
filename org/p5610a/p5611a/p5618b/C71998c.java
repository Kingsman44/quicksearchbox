package org.p5610a.p5611a.p5618b;

/* renamed from: org.a.a.b.c */
/* compiled from: PG */
public final class C71998c {
    /* renamed from: a */
    public static boolean m105303a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
