package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aey */
/* compiled from: PG */
public final class aey {

    /* renamed from: a */
    public final String f20490a;

    private aey(String str) {
        this.f20490a = str;
    }

    /* renamed from: a */
    public static aey m18559a(aee aee) {
        String str;
        aee.mo14557k(2);
        int n = aee.mo14560n();
        int i = n >> 1;
        int n2 = (aee.mo14560n() >> 3) | ((n & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(".0");
        sb.append(n2);
        return new aey(sb.toString());
    }
}
