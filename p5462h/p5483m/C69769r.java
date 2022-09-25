package p5462h.p5483m;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: h.m.r */
/* compiled from: PG */
class C69769r extends C69765n {
    /* renamed from: b */
    public static final String m101222b(String str, String str2) {
        C69664n.m101061g(str, "<this>");
        return C69734n.m101146n(C69734n.m101143k(C69764m.m101204x(str), new C69768q(str2)), "\n", (CharSequence) null, (CharSequence) null, 62);
    }

    /* renamed from: c */
    public static final String m101223c(String str) {
        int i;
        Comparable comparable;
        String str2;
        List w = C69764m.m101203w(str);
        ArrayList arrayList = new ArrayList();
        for (Object next : w) {
            if (!C69764m.m101229h((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i < length) {
                    if (!C69748a.m101207a(str3.charAt(i))) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i = str3.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        w.size();
        C69626l e = m101225e();
        int c = C69540x.m100945c(w);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : w) {
            int i2 = i + 1;
            if (i < 0) {
                C69540x.m100952j();
            }
            String str4 = (String) next2;
            if ((i == 0 || i == c) && C69764m.m101229h(str4)) {
                str4 = null;
            } else {
                C69664n.m101061g(str4, "<this>");
                if (intValue >= 0) {
                    int length3 = str4.length();
                    if (intValue <= length3) {
                        length3 = intValue;
                    }
                    String substring = str4.substring(length3);
                    C69664n.m101060f(substring, "this as java.lang.String).substring(startIndex)");
                    if (!(substring == null || (str2 = (String) e.mo5761a(substring)) == null)) {
                        str4 = str2;
                    }
                } else {
                    throw new IllegalArgumentException("Requested character count " + intValue + " is less than zero.");
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length2);
        C69540x.m100850af(arrayList3, sb, "\n", BuildConfig.FLAVOR, BuildConfig.FLAVOR, -1, "...", (C69626l) null);
        return sb.toString();
    }

    /* renamed from: d */
    public static final String m101224d(String str, String str2) {
        String str3;
        if (!C69764m.m101229h(str2)) {
            List w = C69764m.m101203w(str);
            int length = str.length();
            w.size();
            C69626l e = m101225e();
            int c = C69540x.m100945c(w);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object next : w) {
                int i2 = i + 1;
                if (i < 0) {
                    C69540x.m100952j();
                }
                String str4 = (String) next;
                String str5 = null;
                if ((i == 0 || i == c) && C69764m.m101229h(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            if (!C69748a.m101207a(str4.charAt(i3))) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 != -1 && C69764m.m101233l(str4, str2, i3)) {
                        C69664n.m101059e(str4, "null cannot be cast to non-null type java.lang.String");
                        str5 = str4.substring(i3 + str2.length());
                        C69664n.m101060f(str5, "this as java.lang.String).substring(startIndex)");
                    }
                    if (!(str5 == null || (str3 = (String) e.mo5761a(str5)) == null)) {
                        str4 = str3;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i = i2;
            }
            StringBuilder sb = new StringBuilder(length);
            C69540x.m100850af(arrayList, sb, "\n", BuildConfig.FLAVOR, BuildConfig.FLAVOR, -1, "...", (C69626l) null);
            return sb.toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    /* renamed from: e */
    private static final C69626l m101225e() {
        return BuildConfig.FLAVOR.length() == 0 ? C69766o.f186149a : new C69767p();
    }
}
