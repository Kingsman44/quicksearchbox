package com.google.common.p4574q;

import com.google.common.p4525e.C58968p;

/* renamed from: com.google.common.q.q */
/* compiled from: PG */
public final class C60738q extends C58968p {

    /* renamed from: a */
    public static final char[] f164756a = {'+'};

    /* renamed from: b */
    public static final char[] f164757b = "0123456789ABCDEF".toCharArray();

    /* renamed from: c */
    public final boolean f164758c;

    /* renamed from: d */
    public final boolean[] f164759d;

    public C60738q(String str, boolean z) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            if (!z || !concat.contains(" ")) {
                this.f164758c = z;
                char[] charArray = concat.toCharArray();
                int i = -1;
                for (char max : charArray) {
                    i = Math.max(max, i);
                }
                boolean[] zArr = new boolean[(i + 1)];
                for (char c : charArray) {
                    zArr[c] = true;
                }
                this.f164759d = zArr;
                return;
            }
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }
}
