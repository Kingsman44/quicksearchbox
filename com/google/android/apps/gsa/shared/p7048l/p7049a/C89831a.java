package com.google.android.apps.gsa.shared.p7048l.p7049a;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.shared.l.a.a */
/* compiled from: PG */
public final class C89831a implements Comparable {

    /* renamed from: a */
    public static final C89831a f243150a = new C89831a();

    /* renamed from: b */
    public final String f243151b;

    /* renamed from: c */
    public final String f243152c;

    /* renamed from: d */
    public final boolean f243153d;

    private C89831a() {
        this.f243151b = BuildConfig.FLAVOR;
        this.f243152c = null;
        this.f243153d = false;
    }

    public C89831a(String str) {
        int a;
        int length = str.length();
        boolean z = false;
        int a2 = m146251a(str, 0);
        if (a2 == length) {
            throw new C89832b("Empty rule");
        } else if (a2 == 0) {
            int b = m146252b(str, 1);
            this.f243151b = str.substring(0, b);
            String str2 = null;
            while (b != length) {
                int a3 = m146251a(str, b + 1);
                if (a3 == length) {
                    break;
                }
                b = m146252b(str, a3 + 1);
                int i = b - a3;
                if (i != 7) {
                    z = (i == 5 && "block".regionMatches(true, 0, str, a3, 5)) ? true : z;
                } else if (!(!"rewrite".regionMatches(true, 0, str, a3, 7) || b == length || (a = m146251a(str, b + 1)) == length)) {
                    int b2 = m146252b(str, a + 1);
                    int i2 = b2;
                    str2 = str.substring(a, b2);
                    b = i2;
                }
                throw new C89832b("Illegal rule: ".concat(str));
            }
            this.f243152c = str2;
            this.f243153d = z;
        } else {
            throw new C89832b("Rule with leading whitespace: ".concat(str));
        }
    }

    /* renamed from: a */
    private static final int m146251a(String str, int i) {
        int length = str.length();
        while (i != length && str.charAt(i) == ' ') {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    private static final int m146252b(String str, int i) {
        int indexOf = str.indexOf(32, i);
        return indexOf != -1 ? indexOf : str.length();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((C89831a) obj).f243151b.compareTo(this.f243151b);
    }
}
