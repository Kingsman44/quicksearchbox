package com.google.android.libraries.home.p1940a.p1943c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ax */
/* compiled from: PG */
public final class C23421ax extends C23581h {

    /* renamed from: b */
    public static final C23420aw f64137b = new C23420aw();

    /* renamed from: c */
    public boolean f64138c;

    /* renamed from: d */
    private final C23542dp f64139d;

    /* renamed from: e */
    private final String f64140e;

    /* renamed from: f */
    private final String f64141f;

    public C23421ax() {
        this(false, 63);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C23421ax(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0007
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.DOCK
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r11 = r11 & 2
            if (r11 == 0) goto L_0x000e
            r11 = 0
            goto L_0x000f
        L_0x000e:
            r11 = 1
        L_0x000f:
            r10 = r10 & r11
            java.lang.String r11 = "paramType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r11)
            java.lang.String r11 = "dock"
            java.lang.String r8 = ""
            r4 = 1
            r5 = 1
            r1 = r9
            r2 = r0
            r3 = r10
            r6 = r11
            r7 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.f64139d = r0
            r9.f64138c = r10
            r9.f64140e = r11
            r9.f64141f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1940a.p1943c.C23421ax.<init>(boolean, int):void");
    }

    /* renamed from: a */
    public final C23542dp mo28874a() {
        return this.f64139d;
    }

    /* renamed from: c */
    public final String mo28875c() {
        return this.f64141f;
    }

    /* renamed from: d */
    public final String mo28876d() {
        return this.f64140e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23421ax)) {
            return false;
        }
        C23421ax axVar = (C23421ax) obj;
        return this.f64139d == axVar.f64139d && this.f64138c == axVar.f64138c && C69664n.m101066l(this.f64140e, axVar.f64140e) && C69664n.m101066l(this.f64141f, axVar.f64141f);
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
        return (((((((((this.f64139d.hashCode() * 31) + (this.f64138c ? 1 : 0)) * 31) + 1) * 31) + 1) * 31) + this.f64140e.hashCode()) * 31) + this.f64141f.hashCode();
    }

    public final String toString() {
        C23542dp dpVar = this.f64139d;
        boolean z = this.f64138c;
        String str = this.f64140e;
        String str2 = this.f64141f;
        return "HomeAutomationDockParameter(paramType=" + dpVar + ", docked=" + z + ", readable=true, writable=true, functionNameString=" + str + ", executionParameterNameString=" + str2 + ")";
    }
}
