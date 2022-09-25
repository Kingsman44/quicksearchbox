package androidx.p182p.p185c;

import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.p.c.g */
/* compiled from: PG */
public final class C3945g {

    /* renamed from: a */
    public final String f12614a;

    /* renamed from: b */
    public final String f12615b;

    /* renamed from: c */
    public final boolean f12616c;

    /* renamed from: d */
    public final int f12617d;

    /* renamed from: e */
    public final String f12618e;

    /* renamed from: f */
    public final int f12619f;

    /* renamed from: g */
    public final int f12620g;

    public C3945g(String str, String str2, boolean z, int i, String str3, int i2) {
        C69664n.m101061g(str, "name");
        C69664n.m101061g(str2, "type");
        this.f12614a = str;
        this.f12615b = str2;
        this.f12616c = z;
        this.f12617d = i;
        this.f12618e = str3;
        this.f12619f = i2;
        int i3 = 5;
        if (str2 != null) {
            Locale locale = Locale.US;
            C69664n.m101060f(locale, "US");
            String upperCase = str2.toUpperCase(locale);
            C69664n.m101060f(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (C69764m.m101205y(upperCase, "INT", false)) {
                i3 = 3;
            } else if (C69764m.m101205y(upperCase, "CHAR", false) || C69764m.m101205y(upperCase, "CLOB", false) || C69764m.m101205y(upperCase, "TEXT", false)) {
                i3 = 2;
            } else if (!C69764m.m101205y(upperCase, "BLOB", false)) {
                i3 = (C69764m.m101205y(upperCase, "REAL", false) || C69764m.m101205y(upperCase, "FLOA", false) || C69764m.m101205y(upperCase, "DOUB", false)) ? 4 : 1;
            }
        }
        this.f12620g = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        r1 = r5.f12618e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof androidx.p182p.p185c.C3945g
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r5.f12617d
            androidx.p.c.g r6 = (androidx.p182p.p185c.C3945g) r6
            int r3 = r6.f12617d
            if (r1 != r3) goto L_0x0070
            java.lang.String r1 = r5.f12614a
            java.lang.String r3 = r6.f12614a
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r3)
            if (r1 != 0) goto L_0x001d
            return r2
        L_0x001d:
            boolean r1 = r5.f12616c
            boolean r3 = r6.f12616c
            if (r1 == r3) goto L_0x0024
            return r2
        L_0x0024:
            int r1 = r5.f12619f
            r3 = 2
            if (r1 != r0) goto L_0x003b
            int r1 = r6.f12619f
            if (r1 != r3) goto L_0x003b
            java.lang.String r1 = r5.f12618e
            if (r1 == 0) goto L_0x003b
            java.lang.String r4 = r6.f12618e
            boolean r1 = androidx.p182p.p185c.C3944f.m11298a(r1, r4)
            if (r1 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            return r2
        L_0x003b:
            int r1 = r5.f12619f
            if (r1 != r3) goto L_0x0051
            int r1 = r6.f12619f
            if (r1 != r0) goto L_0x0051
            java.lang.String r1 = r6.f12618e
            if (r1 == 0) goto L_0x0051
            java.lang.String r3 = r5.f12618e
            boolean r1 = androidx.p182p.p185c.C3944f.m11298a(r1, r3)
            if (r1 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            return r2
        L_0x0051:
            int r1 = r5.f12619f
            int r3 = r6.f12619f
            if (r1 != r3) goto L_0x0069
            java.lang.String r1 = r5.f12618e
            if (r1 == 0) goto L_0x0064
            java.lang.String r3 = r6.f12618e
            boolean r1 = androidx.p182p.p185c.C3944f.m11298a(r1, r3)
            if (r1 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0064:
            java.lang.String r1 = r6.f12618e
            if (r1 == 0) goto L_0x0069
        L_0x0068:
            return r2
        L_0x0069:
            int r1 = r5.f12620g
            int r6 = r6.f12620g
            if (r1 != r6) goto L_0x0070
            return r0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p182p.p185c.C3945g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((((this.f12614a.hashCode() * 31) + this.f12620g) * 31) + (true != this.f12616c ? 1237 : 1231)) * 31) + this.f12617d;
    }

    public final String toString() {
        return "Column{name='" + this.f12614a + "', type='" + this.f12615b + "', affinity='" + this.f12620g + "', notNull=" + this.f12616c + ", primaryKeyPosition=" + this.f12617d + ", defaultValue='" + this.f12618e + "'}";
    }
}
