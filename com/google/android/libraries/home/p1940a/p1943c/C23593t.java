package com.google.android.libraries.home.p1940a.p1943c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.t */
/* compiled from: PG */
public final class C23593t extends C23567en {

    /* renamed from: a */
    public static final C23592s f64610a = new C23592s();

    /* renamed from: b */
    private final C23542dp f64611b;

    /* renamed from: e */
    private final String f64612e;

    /* renamed from: f */
    private final String f64613f;

    /* renamed from: g */
    private final String f64614g;

    public C23593t() {
        this((String) null, 63);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C23593t(java.lang.String r10, int r11) {
        /*
            r9 = this;
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0007
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.SPECTRUM_HSV
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r11 = r11 & 2
            if (r11 == 0) goto L_0x000e
            java.lang.String r10 = ""
        L_0x000e:
            java.lang.String r11 = "paramType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r11)
            java.lang.String r11 = "stringValue"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r11)
            java.lang.String r11 = "colorSetting"
            java.lang.String r8 = "colorName"
            r4 = 1
            r5 = 1
            r1 = r9
            r2 = r0
            r3 = r10
            r6 = r11
            r7 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.f64611b = r0
            r9.f64612e = r10
            r9.f64613f = r11
            r9.f64614g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1940a.p1943c.C23593t.<init>(java.lang.String, int):void");
    }

    /* renamed from: a */
    public final C23542dp mo28874a() {
        return this.f64611b;
    }

    /* renamed from: c */
    public final String mo28875c() {
        return this.f64614g;
    }

    /* renamed from: d */
    public final String mo28876d() {
        return this.f64613f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23593t)) {
            return false;
        }
        C23593t tVar = (C23593t) obj;
        return this.f64611b == tVar.f64611b && C69664n.m101066l(this.f64612e, tVar.f64612e) && C69664n.m101066l(this.f64613f, tVar.f64613f) && C69664n.m101066l(this.f64614g, tVar.f64614g);
    }

    /* renamed from: f */
    public final boolean mo28878f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo28879g() {
        return true;
    }

    public final int hashCode() {
        return (((((((((this.f64611b.hashCode() * 31) + this.f64612e.hashCode()) * 31) + 1) * 31) + 1) * 31) + this.f64613f.hashCode()) * 31) + this.f64614g.hashCode();
    }

    public final String toString() {
        C23542dp dpVar = this.f64611b;
        String str = this.f64612e;
        String str2 = this.f64613f;
        String str3 = this.f64614g;
        return "HomeAutomationColorHsvParameter(paramType=" + dpVar + ", stringValue=" + str + ", readable=true, writable=true, functionNameString=" + str2 + ", executionParameterNameString=" + str3 + ")";
    }
}
