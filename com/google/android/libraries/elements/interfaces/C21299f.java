package com.google.android.libraries.elements.interfaces;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3134c.C40340d;
import com.google.common.p4522b.C58485gu;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.interfaces.f */
/* compiled from: PG */
final class C21299f extends C21256az {

    /* renamed from: a */
    public final C69464a f59658a;

    /* renamed from: b */
    public final String f59659b;

    /* renamed from: c */
    public final C21252av f59660c;

    /* renamed from: d */
    public final C21261bd f59661d;

    /* renamed from: e */
    public final boolean f59662e;

    /* renamed from: f */
    public final Object f59663f;

    /* renamed from: g */
    public final C21274bq f59664g;

    /* renamed from: h */
    public final boolean f59665h;

    /* renamed from: i */
    public final C40340d f59666i;

    public C21299f(C69464a aVar, C40340d dVar, String str, C21252av avVar, C21261bd bdVar, boolean z, Object obj, C21274bq bqVar, boolean z2) {
        this.f59658a = aVar;
        this.f59666i = dVar;
        this.f59659b = str;
        this.f59660c = avVar;
        this.f59661d = bdVar;
        this.f59662e = z;
        this.f59663f = obj;
        this.f59664g = bqVar;
        this.f59665h = z2;
    }

    /* renamed from: a */
    public final C21252av mo26720a() {
        return this.f59660c;
    }

    /* renamed from: b */
    public final C21255ay mo26721b() {
        return new C21298e(this);
    }

    /* renamed from: c */
    public final C21261bd mo26722c() {
        return this.f59661d;
    }

    /* renamed from: d */
    public final C21274bq mo26723d() {
        return this.f59664g;
    }

    /* renamed from: e */
    public final C58485gu mo26724e() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r1 = r4.f59661d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        r1 = r4.f59663f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r1 = r4.f59664g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f59666i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.elements.interfaces.C21256az
            r2 = 0
            if (r1 == 0) goto L_0x009b
            com.google.android.libraries.elements.interfaces.az r5 = (com.google.android.libraries.elements.interfaces.C21256az) r5
            g.a.a r1 = r4.f59658a
            g.a.a r3 = r5.mo26727h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009b
            com.google.android.libraries.search.rendering.xuikit.d.c.d r1 = r4.f59666i
            if (r1 != 0) goto L_0x0022
            com.google.android.libraries.search.rendering.xuikit.d.c.d r1 = r5.mo26730k()
            if (r1 != 0) goto L_0x009b
            goto L_0x002c
        L_0x0022:
            com.google.android.libraries.search.rendering.xuikit.d.c.d r3 = r5.mo26730k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009b
        L_0x002c:
            java.lang.String r1 = r4.f59659b
            java.lang.String r3 = r5.mo26726g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009b
            com.google.android.libraries.elements.interfaces.av r1 = r4.f59660c
            com.google.android.libraries.elements.interfaces.av r3 = r5.mo26720a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009b
            com.google.android.libraries.elements.interfaces.bd r1 = r4.f59661d
            if (r1 != 0) goto L_0x004f
            com.google.android.libraries.elements.interfaces.bd r1 = r5.mo26722c()
            if (r1 != 0) goto L_0x009b
            goto L_0x0059
        L_0x004f:
            com.google.android.libraries.elements.interfaces.bd r3 = r5.mo26722c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009b
        L_0x0059:
            boolean r1 = r4.f59662e
            boolean r3 = r5.mo26729j()
            if (r1 != r3) goto L_0x009b
            java.lang.Object r1 = r4.f59663f
            if (r1 != 0) goto L_0x006c
            java.lang.Object r1 = r5.mo26725f()
            if (r1 != 0) goto L_0x009b
            goto L_0x0076
        L_0x006c:
            java.lang.Object r3 = r5.mo26725f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009b
        L_0x0076:
            com.google.android.libraries.elements.interfaces.bq r1 = r4.f59664g
            if (r1 != 0) goto L_0x0081
            com.google.android.libraries.elements.interfaces.bq r1 = r5.mo26723d()
            if (r1 != 0) goto L_0x009b
            goto L_0x008c
        L_0x0081:
            com.google.android.libraries.elements.interfaces.bq r3 = r5.mo26723d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x008c
            goto L_0x009b
        L_0x008c:
            boolean r1 = r4.f59665h
            boolean r3 = r5.mo26728i()
            if (r1 != r3) goto L_0x009b
            com.google.common.b.gu r5 = r5.mo26724e()
            if (r5 != 0) goto L_0x009b
            return r0
        L_0x009b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.interfaces.C21299f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Object mo26725f() {
        return this.f59663f;
    }

    /* renamed from: g */
    public final String mo26726g() {
        return this.f59659b;
    }

    /* renamed from: h */
    public final C69464a mo26727h() {
        return this.f59658a;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.f59658a.hashCode() ^ 1000003) * 1000003;
        C40340d dVar = this.f59666i;
        int i4 = 0;
        if (dVar == null) {
            i = 0;
        } else {
            i = dVar.hashCode();
        }
        int hashCode2 = (((((hashCode ^ i) * 1000003) ^ this.f59659b.hashCode()) * 1000003) ^ this.f59660c.hashCode()) * 1000003;
        C21261bd bdVar = this.f59661d;
        if (bdVar == null) {
            i2 = 0;
        } else {
            i2 = bdVar.hashCode();
        }
        int i5 = 1237;
        int i6 = (((hashCode2 ^ i2) * 1000003) ^ (true != this.f59662e ? 1237 : 1231)) * 1000003;
        Object obj = this.f59663f;
        if (obj == null) {
            i3 = 0;
        } else {
            i3 = obj.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        C21274bq bqVar = this.f59664g;
        if (bqVar != null) {
            i4 = bqVar.hashCode();
        }
        int i8 = (i7 ^ i4) * 1000003;
        if (true == this.f59665h) {
            i5 = 1231;
        }
        return (i8 ^ i5) * 1000003;
    }

    /* renamed from: i */
    public final boolean mo26728i() {
        return this.f59665h;
    }

    /* renamed from: j */
    public final boolean mo26729j() {
        return this.f59662e;
    }

    /* renamed from: k */
    public final C40340d mo26730k() {
        return this.f59666i;
    }

    public final String toString() {
        String obj = this.f59658a.toString();
        String valueOf = String.valueOf(this.f59666i);
        String str = this.f59659b;
        String obj2 = this.f59660c.toString();
        String valueOf2 = String.valueOf(this.f59661d);
        boolean z = this.f59662e;
        String valueOf3 = String.valueOf(this.f59663f);
        String valueOf4 = String.valueOf(this.f59664g);
        boolean z2 = this.f59665h;
        return "ElementsConfig{converterProvider=" + obj + ", layoutExecutor=" + valueOf + ", logTag=" + str + ", perfLoggerFactory=" + obj2 + ", elementsInteractionLogger=" + valueOf2 + ", useIncrementalMount=" + z + ", userData=" + valueOf3 + ", recyclerConfig=" + valueOf4 + ", nestedScrollingEnabled=" + z2 + ", globalCommandDataDecorators=null}";
    }
}
