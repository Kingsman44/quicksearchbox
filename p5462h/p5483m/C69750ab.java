package p5462h.p5483m;

import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69502as;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69693a;
import p5462h.p5480j.C69695c;
import p5462h.p5480j.C69699g;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69734n;
import p5462h.p5482l.C69744x;

/* renamed from: h.m.ab */
/* compiled from: PG */
class C69750ab extends C69776y {
    /* renamed from: A */
    public static final boolean m101184A(CharSequence charSequence, char c) {
        return C69764m.m101185B(charSequence, c, 0, 2) >= 0;
    }

    /* renamed from: B */
    public static /* synthetic */ int m101185B(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C69664n.m101061g(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        C69664n.m101061g(charSequence, "<this>");
        if (i < 0) {
            i = 0;
        }
        C69502as a = new C69695c(i, C69764m.m101195o(charSequence)).iterator();
        while (a.hasNext()) {
            int a2 = a.mo5128a();
            char charAt = charSequence.charAt(a2);
            int i3 = 0;
            while (true) {
                if (i3 <= 0) {
                    if (C69748a.m101209c(cArr[i3], charAt, false)) {
                        return a2;
                    }
                    i3++;
                }
            }
        }
        return -1;
    }

    /* renamed from: C */
    public static /* synthetic */ int m101186C(CharSequence charSequence, String str, int i, boolean z, int i2) {
        boolean z2 = false;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) == 0) {
            z2 = true;
        }
        return C69764m.m101196p(charSequence, str, i, z & z2);
    }

    /* renamed from: D */
    public static /* synthetic */ int m101187D(CharSequence charSequence, char c) {
        int o = C69764m.m101195o(charSequence);
        C69664n.m101061g(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, o);
        }
        char[] cArr = {c};
        C69664n.m101061g(charSequence, "<this>");
        int o2 = C69764m.m101195o(charSequence);
        if (o > o2) {
            o = o2;
        }
        while (o >= 0) {
            char charAt = charSequence.charAt(o);
            for (int i = 0; i <= 0; i++) {
                if (C69748a.m101209c(cArr[i], charAt, false)) {
                    return o;
                }
            }
            o--;
        }
        return -1;
    }

    /* renamed from: E */
    public static final List m101188E(CharSequence charSequence, String[] strArr) {
        C69664n.m101061g(charSequence, "<this>");
        String str = strArr[0];
        if (str.length() != 0) {
            return m101194K(charSequence, str, 0);
        }
        C69744x<C69695c> xVar = new C69744x(m101193J(charSequence, strArr));
        ArrayList arrayList = new ArrayList(C69540x.m100804k(xVar, 10));
        for (C69695c t : xVar) {
            arrayList.add(C69764m.m101200t(charSequence, t));
        }
        return arrayList;
    }

    /* renamed from: F */
    public static /* synthetic */ List m101189F(CharSequence charSequence, char[] cArr, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        C69664n.m101061g(charSequence, "<this>");
        return m101194K(charSequence, String.valueOf(cArr[0]), i);
    }

    /* renamed from: G */
    public static final String m101190G(String str, String str2) {
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str2, "missingDelimiterValue");
        int D = C69764m.m101187D(str, '.');
        if (D == -1) {
            return str2;
        }
        String substring = str.substring(D + 1, str.length());
        C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: H */
    public static /* synthetic */ int m101191H(CharSequence charSequence, String str) {
        int o = C69764m.m101195o(charSequence);
        C69664n.m101061g(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            return m101192I(charSequence, str, o, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, o);
    }

    /* renamed from: I */
    private static final int m101192I(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C69693a aVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVar = new C69695c(i, i2);
        } else {
            int o = C69764m.m101195o(charSequence);
            if (i > o) {
                i = o;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            aVar = C69699g.m101121c(i, i2);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i3 = aVar.f186059a;
            int i4 = aVar.f186060b;
            int i5 = aVar.f186061c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                return -1;
            }
            while (true) {
                if (C69764m.m101206z(charSequence2, 0, charSequence, i3, charSequence2.length(), z)) {
                    return i3;
                }
                if (i3 == i4) {
                    return -1;
                }
                i3 += i5;
            }
        } else {
            int i6 = aVar.f186059a;
            int i7 = aVar.f186060b;
            int i8 = aVar.f186061c;
            if ((i8 <= 0 || i6 > i7) && (i8 >= 0 || i7 > i6)) {
                return -1;
            }
            while (true) {
                if (C69764m.m101235n((String) charSequence2, (String) charSequence, i6, charSequence2.length(), z)) {
                    return i6;
                }
                if (i6 == i7) {
                    return -1;
                }
                i6 += i8;
            }
        }
    }

    /* renamed from: J */
    private static final C69731k m101193J(CharSequence charSequence, String[] strArr) {
        return new C69757f(charSequence, new C69777z(C69531o.m100923a(strArr)));
    }

    /* renamed from: K */
    private static final List m101194K(CharSequence charSequence, String str, int i) {
        int p = C69764m.m101196p(charSequence, str, 0, false);
        if (p != -1) {
            boolean z = true;
            if (i != 1) {
                if (i <= 0) {
                    z = false;
                }
                ArrayList arrayList = new ArrayList(z ? i : 10);
                int i2 = 0;
                do {
                    arrayList.add(charSequence.subSequence(i2, p).toString());
                    i2 = str.length() + p;
                    if ((z && arrayList.size() == i - 1) || (p = C69764m.m101196p(charSequence, str, i2, false)) == -1) {
                        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                    }
                    arrayList.add(charSequence.subSequence(i2, p).toString());
                    i2 = str.length() + p;
                    break;
                } while ((p = C69764m.m101196p(charSequence, str, i2, false)) == -1);
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                return arrayList;
            }
        }
        return C69540x.m100944b(charSequence.toString());
    }

    /* renamed from: o */
    public static final int m101195o(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: p */
    public static final int m101196p(CharSequence charSequence, String str, int i, boolean z) {
        C69664n.m101061g(charSequence, "<this>");
        C69664n.m101061g(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m101192I(charSequence, str, i, charSequence.length(), z, false);
    }

    /* renamed from: q */
    public static final CharSequence m101197q(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C69748a.m101207a(charSequence.charAt(true != z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: r */
    public static final String m101198r(String str, CharSequence charSequence) {
        boolean z;
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str, "<this>");
        if (str instanceof String) {
            z = C69764m.m101234m(str, (String) charSequence);
        } else {
            z = C69764m.m101206z(str, 0, charSequence, 0, charSequence.length(), false);
        }
        if (!z) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C69664n.m101060f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: s */
    public static final String m101199s(String str, CharSequence charSequence) {
        boolean z;
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str, "<this>");
        if (str instanceof String) {
            z = C69764m.m101230i(str, (String) charSequence);
        } else {
            z = C69764m.m101206z(str, str.length() - charSequence.length(), charSequence, 0, charSequence.length(), false);
        }
        if (!z) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: t */
    public static final String m101200t(CharSequence charSequence, C69695c cVar) {
        C69664n.m101061g(charSequence, "<this>");
        C69664n.m101061g(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.f186059a).intValue(), Integer.valueOf(cVar.f186060b).intValue() + 1).toString();
    }

    /* renamed from: u */
    public static final String m101201u(String str, String str2, String str3) {
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str3, "missingDelimiterValue");
        int C = C69764m.m101186C(str, str2, 0, false, 6);
        if (C == -1) {
            return str3;
        }
        String substring = str.substring(C + str2.length(), str.length());
        C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: v */
    public static final String m101202v(String str, String str2, String str3) {
        C69664n.m101061g(str, "<this>");
        C69664n.m101061g(str3, "missingDelimiterValue");
        int H = C69764m.m101191H(str, str2);
        if (H == -1) {
            return str3;
        }
        String substring = str.substring(0, H);
        C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: w */
    public static final List m101203w(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "<this>");
        return C69734n.m101138f(C69764m.m101204x(charSequence));
    }

    /* renamed from: x */
    public static final C69731k m101204x(CharSequence charSequence) {
        C69664n.m101061g(charSequence, "<this>");
        String[] strArr = {"\r\n", "\n", "\r"};
        C69664n.m101061g(charSequence, "<this>");
        return C69734n.m101143k(m101193J(charSequence, strArr), new C69749aa(charSequence));
    }

    /* renamed from: y */
    public static final boolean m101205y(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C69664n.m101061g(charSequence, "<this>");
        C69664n.m101061g(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (m101192I(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
                return true;
            }
        } else if (C69764m.m101186C(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static final boolean m101206z(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C69664n.m101061g(charSequence, "<this>");
        C69664n.m101061g(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C69748a.m101209c(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }
}
