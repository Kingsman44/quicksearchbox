package com.google.android.apps.gsa.search.core.state.p6874f;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.search.core.state.f.b */
/* compiled from: PG */
final class C87035b extends C87037d {

    /* renamed from: a */
    private final Query f235094a;

    /* renamed from: b */
    private final amo f235095b;

    /* renamed from: c */
    private final boolean f235096c;

    /* renamed from: d */
    private final int f235097d;

    /* renamed from: e */
    private final boolean f235098e;

    /* renamed from: f */
    private final C89062r f235099f;

    public C87035b(Query query, amo amo, boolean z, int i, boolean z2, C89062r rVar) {
        this.f235094a = query;
        this.f235095b = amo;
        this.f235096c = z;
        this.f235097d = i;
        this.f235098e = z2;
        this.f235099f = rVar;
    }

    /* renamed from: a */
    public final int mo80653a() {
        return this.f235097d;
    }

    /* renamed from: b */
    public final C89062r mo80654b() {
        return this.f235099f;
    }

    /* renamed from: c */
    public final Query mo80655c() {
        return this.f235094a;
    }

    /* renamed from: d */
    public final amo mo80656d() {
        return this.f235095b;
    }

    /* renamed from: e */
    public final boolean mo80657e() {
        return this.f235098e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r1 = r4.f235099f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.search.core.state.p6874f.C87037d
            r2 = 0
            if (r1 == 0) goto L_0x0052
            com.google.android.apps.gsa.search.core.state.f.d r5 = (com.google.android.apps.gsa.search.core.state.p6874f.C87037d) r5
            com.google.android.apps.gsa.shared.search.Query r1 = r4.f235094a
            com.google.android.apps.gsa.shared.search.Query r3 = r5.mo80655c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            com.google.common.o.amo r1 = r4.f235095b
            com.google.common.o.amo r3 = r5.mo80656d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0052
            boolean r1 = r4.f235096c
            boolean r3 = r5.mo80659f()
            if (r1 != r3) goto L_0x0052
            int r1 = r4.f235097d
            int r3 = r5.mo80653a()
            if (r1 != r3) goto L_0x0052
            boolean r1 = r4.f235098e
            boolean r3 = r5.mo80657e()
            if (r1 != r3) goto L_0x0052
            com.google.android.apps.gsa.shared.aa.r r1 = r4.f235099f
            if (r1 != 0) goto L_0x0046
            com.google.android.apps.gsa.shared.aa.r r5 = r5.mo80654b()
            if (r5 != 0) goto L_0x0052
            goto L_0x0051
        L_0x0046:
            com.google.android.apps.gsa.shared.aa.r r5 = r5.mo80654b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            return r0
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.p6874f.C87035b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo80659f() {
        return this.f235096c;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((((((this.f235094a.hashCode() ^ 1000003) * 1000003) ^ this.f235095b.hashCode()) * 1000003) ^ (true != this.f235096c ? 1237 : 1231)) * 1000003) ^ this.f235097d) * 1000003;
        if (true == this.f235098e) {
            i2 = 1231;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        C89062r rVar = this.f235099f;
        if (rVar == null) {
            i = 0;
        } else {
            i = rVar.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String obj = this.f235094a.toString();
        String num = Integer.toString(this.f235095b.f159234au);
        boolean z = this.f235096c;
        int i = this.f235097d;
        boolean z2 = this.f235098e;
        String valueOf = String.valueOf(this.f235099f);
        return "CommittedQueryEventData{query=" + obj + ", clientId=" + num + ", navigatingInForeground=" + z + ", eventType=" + i + ", logNetwork=" + z2 + ", connectivityInfo=" + valueOf + "}";
    }
}
