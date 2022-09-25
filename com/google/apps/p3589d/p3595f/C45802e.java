package com.google.apps.p3589d.p3595f;

import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.f.e */
/* compiled from: PG */
public final class C45802e extends C45822y {

    /* renamed from: a */
    public final int f120433a;

    /* renamed from: b */
    public final double f120434b;

    /* renamed from: c */
    public final C45946k f120435c;

    /* renamed from: d */
    public final double f120436d;

    /* renamed from: e */
    public final int f120437e;

    /* renamed from: f */
    public final C45822y f120438f;

    public C45802e(int i, double d, C45946k kVar, double d2, int i2, C45822y yVar) {
        this.f120433a = i;
        this.f120434b = d;
        this.f120435c = kVar;
        this.f120436d = d2;
        this.f120437e = i2;
        this.f120438f = yVar;
    }

    /* renamed from: a */
    public final double mo49945a() {
        return this.f120436d;
    }

    /* renamed from: b */
    public final double mo49946b() {
        return this.f120434b;
    }

    /* renamed from: c */
    public final int mo49947c() {
        return this.f120437e;
    }

    /* renamed from: d */
    public final int mo49948d() {
        return this.f120433a;
    }

    /* renamed from: e */
    public final C45822y mo49949e() {
        return this.f120438f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        r1 = r7.f120438f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.apps.p3589d.p3595f.C45822y
            r2 = 0
            if (r1 == 0) goto L_0x0062
            com.google.apps.d.f.y r8 = (com.google.apps.p3589d.p3595f.C45822y) r8
            int r1 = r7.f120433a
            int r3 = r8.mo49948d()
            if (r1 != r3) goto L_0x0062
            double r3 = r7.f120434b
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.mo49946b()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0062
            com.google.apps.d.k.k r1 = r7.f120435c
            com.google.apps.d.k.k r3 = r8.mo49951f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0062
            double r3 = r7.f120436d
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.mo49945a()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0062
            int r1 = r7.f120437e
            int r3 = r8.mo49947c()
            if (r1 != r3) goto L_0x0062
            com.google.apps.d.f.y r1 = r7.f120438f
            if (r1 != 0) goto L_0x0056
            com.google.apps.d.f.y r8 = r8.mo49949e()
            if (r8 != 0) goto L_0x0062
            goto L_0x0061
        L_0x0056:
            com.google.apps.d.f.y r8 = r8.mo49949e()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            return r0
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3595f.C45802e.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C45946k mo49951f() {
        return this.f120435c;
    }

    public final int hashCode() {
        int i;
        int doubleToLongBits = (((((((((this.f120433a ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120434b) >>> 32) ^ Double.doubleToLongBits(this.f120434b)))) * 1000003) ^ this.f120435c.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120436d) >>> 32) ^ Double.doubleToLongBits(this.f120436d)))) * 1000003) ^ this.f120437e) * 1000003;
        C45822y yVar = this.f120438f;
        if (yVar == null) {
            i = 0;
        } else {
            i = yVar.hashCode();
        }
        return doubleToLongBits ^ i;
    }

    public final String toString() {
        int i = this.f120433a;
        double d = this.f120434b;
        String obj = this.f120435c.toString();
        double d2 = this.f120436d;
        int i2 = this.f120437e;
        String valueOf = String.valueOf(this.f120438f);
        return "Glyph{gid=" + i + ", fontSize=" + d + ", rect=" + obj + ", advance=" + d2 + ", codePoint=" + i2 + ", baseGlyph=" + valueOf + "}";
    }
}
