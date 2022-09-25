package androidx.p182p.p185c;

import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.p.c.f */
/* compiled from: PG */
public final class C3944f {
    /* renamed from: a */
    public static final boolean m11298a(String str, String str2) {
        if (C69664n.m101066l(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0) {
                        if (charAt != '(') {
                            break;
                        }
                        i3 = 0;
                        charAt = '(';
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    C69664n.m101060f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return C69664n.m101066l(C69764m.m101197q(substring).toString(), str2);
                }
            }
        }
        return false;
    }
}
