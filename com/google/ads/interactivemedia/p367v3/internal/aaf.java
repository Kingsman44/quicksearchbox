package com.google.ads.interactivemedia.p367v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aaf */
/* compiled from: PG */
public final class aaf {

    /* renamed from: a */
    private static final Pattern f20048a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static void m18048a(aee aee) {
        int g = aee.mo14553g();
        if (!m18049b(aee)) {
            aee.mo14554h(g);
            String valueOf = String.valueOf(aee.mo14545I());
            throw new C6886dt(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "));
        }
    }

    /* renamed from: b */
    public static boolean m18049b(aee aee) {
        String I = aee.mo14545I();
        return I != null && I.startsWith("WEBVTT");
    }

    /* renamed from: c */
    public static long m18050c(String str) {
        String[] A = aeu.m18483A(str, "\\.");
        long j = 0;
        for (String parseLong : aeu.m18556z(A[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (A.length == 2) {
            j2 += Long.parseLong(A[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: d */
    public static Matcher m18051d(aee aee) {
        String I;
        while (true) {
            String I2 = aee.mo14545I();
            if (I2 == null) {
                return null;
            }
            if (f20048a.matcher(I2).matches()) {
                do {
                    I = aee.mo14545I();
                    if (I == null) {
                        break;
                    }
                } while (I.isEmpty());
            } else {
                Matcher matcher = aae.f20047a.matcher(I2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
