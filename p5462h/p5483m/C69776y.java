package p5462h.p5483m;

import java.util.Locale;
import p5462h.p5463a.C69502as;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69694b;
import p5462h.p5480j.C69695c;

/* renamed from: h.m.y */
/* compiled from: PG */
class C69776y extends C69775x {
    /* renamed from: f */
    public static final String m101227f(String str, Locale locale) {
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            C69664n.m101059e(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            C69664n.m101060f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb.append(upperCase);
        }
        String substring2 = str.substring(1);
        C69664n.m101060f(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    /* renamed from: g */
    public static final boolean m101228g(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: h */
    public static final boolean m101229h(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        C69664n.m101061g(charSequence, "<this>");
        C69502as a = new C69695c(0, charSequence.length() - 1).iterator();
        while (((C69694b) a).f186062a) {
            if (!C69748a.m101207a(charSequence.charAt(a.mo5128a()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static final boolean m101230i(String str, String str2) {
        C69664n.m101061g(str, "<this>");
        return str.endsWith(str2);
    }

    /* renamed from: j */
    public static final String m101231j(String str, String str2, String str3) {
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str3, "newValue");
        int p = C69764m.m101196p(str, str2, 0, false);
        if (p < 0) {
            return str;
        }
        int length = str2.length();
        int i = length <= 0 ? 1 : length;
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append(str, i2, p);
                sb.append(str3);
                i2 = p + length;
                if (p >= str.length() || (p = C69764m.m101196p(str, str2, p + i, false)) <= 0) {
                    sb.append(str, i2, str.length());
                }
                sb.append(str, i2, p);
                sb.append(str3);
                i2 = p + length;
                break;
            } while ((p = C69764m.m101196p(str, str2, p + i, false)) <= 0);
            sb.append(str, i2, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: k */
    public static /* synthetic */ String m101232k(String str, char c) {
        C69664n.m101061g(str, "<this>");
        String replace = str.replace(c, '_');
        C69664n.m101060f(replace, "this as java.lang.String…replace(oldChar, newChar)");
        return replace;
    }

    /* renamed from: l */
    public static final boolean m101233l(String str, String str2, int i) {
        C69664n.m101061g(str, "<this>");
        return str.startsWith(str2, i);
    }

    /* renamed from: m */
    public static final boolean m101234m(String str, String str2) {
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str2, "prefix");
        return str.startsWith(str2);
    }

    /* renamed from: n */
    public static final boolean m101235n(String str, String str2, int i, int i2, boolean z) {
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str2, "other");
        if (!z) {
            return str.regionMatches(0, str2, i, i2);
        }
        return str.regionMatches(true, 0, str2, i, i2);
    }
}
