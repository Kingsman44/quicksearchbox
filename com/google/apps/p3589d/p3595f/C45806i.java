package com.google.apps.p3589d.p3595f;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45721l;
import com.google.apps.p3589d.p3591b.C45724o;

/* renamed from: com.google.apps.d.f.i */
/* compiled from: PG */
public final class C45806i {

    /* renamed from: a */
    public static final C45721l f120464a;

    /* renamed from: b */
    public static final C45719j f120465b = C45719j.m81482m(1013, 977, 1008, 981, 1009, 982);

    /* renamed from: c */
    public static final C45719j f120466c = C45719j.m81484o(C45805h.BOLD, C45805h.ITALIC, C45805h.BOLD_ITALIC, C45805h.CALLIGRAPHIC, C45805h.TYPEWRITER, C45805h.SANS_SERIF, C45805h.FRAKTUR, C45805h.BLACKBOARD);

    static {
        C45724o d = C45724o.m81498d();
        d.f120221a.put(C19618h.f54585a, "ℎ");
        f120464a = d.mo49834c();
    }

    /* renamed from: a */
    public static int m81699a(String str) {
        return str.codePointCount(0, str.length());
    }

    /* renamed from: b */
    public static String m81700b(String str, C45821x xVar) {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < str.length()) {
            int codePointAt = str.codePointAt(i2);
            C45821x xVar2 = C45821x.DEFAULT;
            switch (xVar.ordinal()) {
                case 0:
                    i = C45805h.DEFAULT.mo49962a(codePointAt);
                    break;
                case 1:
                    i = codePointAt;
                    break;
                case 2:
                    i = C45805h.BOLD.mo49962a(codePointAt);
                    break;
                case 3:
                    i = C45805h.CALLIGRAPHIC.mo49962a(codePointAt);
                    break;
                case 4:
                    i = C45805h.TYPEWRITER.mo49962a(codePointAt);
                    break;
                case 5:
                    i = C45805h.ITALIC.mo49962a(codePointAt);
                    break;
                case 6:
                    i = C45805h.SANS_SERIF.mo49962a(codePointAt);
                    break;
                case 7:
                    i = C45805h.FRAKTUR.mo49962a(codePointAt);
                    break;
                case 8:
                    i = C45805h.BLACKBOARD.mo49962a(codePointAt);
                    break;
                case 9:
                    i = C45805h.BOLD_ITALIC.mo49962a(codePointAt);
                    break;
                default:
                    String valueOf = String.valueOf(xVar);
                    throw new AssertionError("Unknown style " + valueOf + " for font.");
            }
            sb.appendCodePoint(i);
            i2 += Character.charCount(codePointAt);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static boolean m81701c(int i) {
        if (i >= 12288 && i <= 12543) {
            return true;
        }
        if (i >= 19968 && i <= 40879) {
            return true;
        }
        if (i >= 43360 && i <= 43391) {
            return true;
        }
        if (i < 44032 || i > 55203) {
            return i >= 55216 && i <= 55295;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m81702d(int i) {
        return i >= 48 && i <= 57;
    }

    /* renamed from: e */
    public static boolean m81703e(int i) {
        return i >= 97 && i <= 122;
    }

    /* renamed from: f */
    public static boolean m81704f(int i) {
        return i >= 945 && i <= 969;
    }

    /* renamed from: g */
    public static boolean m81705g(int i) {
        return i >= 65 && i <= 90;
    }

    /* renamed from: h */
    public static boolean m81706h(int i) {
        return i >= 913 && i <= 937;
    }
}
