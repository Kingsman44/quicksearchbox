package com.google.apps.p3589d.p3590a;

import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.a.g */
/* compiled from: PG */
public final class C45690g extends C45708y {

    /* renamed from: a */
    private final double f120186a;

    /* renamed from: b */
    private final int f120187b;

    /* renamed from: c */
    private final C45946k f120188c;

    /* renamed from: d */
    private final C45946k f120189d;

    /* renamed from: e */
    private final C45944i f120190e;

    /* renamed from: f */
    private final boolean f120191f;

    /* renamed from: g */
    private final C45941f f120192g;

    /* renamed from: h */
    private final String f120193h;

    public C45690g(double d, int i, C45946k kVar, C45946k kVar2, C45944i iVar, boolean z, C45941f fVar, String str) {
        this.f120186a = d;
        this.f120187b = i;
        this.f120188c = kVar;
        this.f120189d = kVar2;
        this.f120190e = iVar;
        this.f120191f = z;
        if (fVar != null) {
            this.f120192g = fVar;
            if (str != null) {
                this.f120193h = str;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null color");
    }

    /* renamed from: a */
    public final double mo49767a() {
        return this.f120186a;
    }

    /* renamed from: b */
    public final int mo49768b() {
        return this.f120187b;
    }

    /* renamed from: c */
    public final C45941f mo49769c() {
        return this.f120192g;
    }

    /* renamed from: d */
    public final C45944i mo49770d() {
        return this.f120190e;
    }

    /* renamed from: e */
    public final C45946k mo49771e() {
        return this.f120189d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r1 = r7.f120189d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.apps.p3589d.p3590a.C45708y
            r2 = 0
            if (r1 == 0) goto L_0x0074
            com.google.apps.d.a.y r8 = (com.google.apps.p3589d.p3590a.C45708y) r8
            double r3 = r7.f120186a
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = r8.mo49767a()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0074
            int r1 = r7.f120187b
            int r3 = r8.mo49768b()
            if (r1 != r3) goto L_0x0074
            com.google.apps.d.k.k r1 = r7.f120188c
            com.google.apps.d.k.k r3 = r8.mo49773f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            com.google.apps.d.k.k r1 = r7.f120189d
            if (r1 != 0) goto L_0x003c
            com.google.apps.d.k.k r1 = r8.mo49771e()
            if (r1 != 0) goto L_0x0074
            goto L_0x0047
        L_0x003c:
            com.google.apps.d.k.k r3 = r8.mo49771e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0047
            goto L_0x0074
        L_0x0047:
            com.google.apps.d.k.i r1 = r7.f120190e
            com.google.apps.d.k.i r3 = r8.mo49770d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            boolean r1 = r7.f120191f
            boolean r3 = r8.mo49775h()
            if (r1 != r3) goto L_0x0074
            com.google.apps.d.k.f r1 = r7.f120192g
            com.google.apps.d.k.f r3 = r8.mo49769c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = r7.f120193h
            java.lang.String r8 = r8.mo49774g()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0074
            return r0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3590a.C45690g.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C45946k mo49773f() {
        return this.f120188c;
    }

    /* renamed from: g */
    public final String mo49774g() {
        return this.f120193h;
    }

    /* renamed from: h */
    public final boolean mo49775h() {
        return this.f120191f;
    }

    public final int hashCode() {
        int i;
        int doubleToLongBits = (((((((int) ((Double.doubleToLongBits(this.f120186a) >>> 32) ^ Double.doubleToLongBits(this.f120186a))) ^ 1000003) * 1000003) ^ this.f120187b) * 1000003) ^ this.f120188c.hashCode()) * 1000003;
        C45946k kVar = this.f120189d;
        if (kVar == null) {
            i = 0;
        } else {
            i = kVar.hashCode();
        }
        return this.f120193h.hashCode() ^ ((((((((doubleToLongBits ^ i) * 1000003) ^ this.f120190e.hashCode()) * 1000003) ^ (true != this.f120191f ? 1237 : 1231)) * 1000003) ^ this.f120192g.hashCode()) * 1000003);
    }

    public final String toString() {
        double d = this.f120186a;
        int i = this.f120187b;
        String obj = this.f120188c.toString();
        String valueOf = String.valueOf(this.f120189d);
        String obj2 = this.f120190e.toString();
        boolean z = this.f120191f;
        String obj3 = this.f120192g.toString();
        String str = this.f120193h;
        return "GlyphData{fontSize=" + d + ", codePoint=" + i + ", bounds=" + obj + ", baseGlyphBounds=" + valueOf + ", offset=" + obj2 + ", rotate90=" + z + ", color=" + obj3 + ", text=" + str + "}";
    }
}
