package androidx.media3.extractor.p163j.p171h;

import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.extractor.j.h.m */
/* compiled from: PG */
public final class C3523m {

    /* renamed from: a */
    private static final Pattern f11019a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static float m10174a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: b */
    public static long m10175b(String str) {
        String[] ar = C2612ak.m6968ar(str, "\\.");
        long j = 0;
        for (String parseLong : C2612ak.m6967aq(ar[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (ar.length == 2) {
            j2 += Long.parseLong(ar[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: c */
    public static Matcher m10176c(C2604ac acVar) {
        String q;
        while (true) {
            String q2 = acVar.mo6149q();
            if (q2 == null) {
                return null;
            }
            if (f11019a.matcher(q2).matches()) {
                do {
                    q = acVar.mo6149q();
                    if (q == null) {
                        break;
                    }
                } while (q.isEmpty());
            } else {
                Matcher matcher = C3521k.f11013a.matcher(q2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    /* renamed from: d */
    public static void m10177d(C2604ac acVar) {
        int i = acVar.f7235b;
        if (!m10178e(acVar)) {
            acVar.mo6131A(i);
            throw C2599az.m6819a("Expected WEBVTT. Got ".concat(String.valueOf(acVar.mo6149q())), (Throwable) null);
        }
    }

    /* renamed from: e */
    public static boolean m10178e(C2604ac acVar) {
        String q = acVar.mo6149q();
        return q != null && q.startsWith("WEBVTT");
    }
}
