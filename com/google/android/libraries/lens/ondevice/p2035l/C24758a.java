package com.google.android.libraries.lens.ondevice.p2035l;

import com.google.android.libraries.lens.ondevice.p2034k.C24650eg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.ondevice.l.a */
/* compiled from: PG */
final class C24758a extends C24761d {

    /* renamed from: a */
    private final C24650eg f67649a;

    /* renamed from: b */
    private final C60870cx f67650b;

    public C24758a(C24650eg egVar, C60870cx cxVar) {
        if (egVar != null) {
            this.f67649a = egVar;
            this.f67650b = cxVar;
            return;
        }
        throw new NullPointerException("Null primitiveEngine");
    }

    /* renamed from: a */
    public final C24650eg mo29990a() {
        return this.f67649a;
    }

    /* renamed from: b */
    public final C60870cx mo29991b() {
        return this.f67650b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f67650b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.lens.ondevice.p2035l.C24761d
            r2 = 0
            if (r1 == 0) goto L_0x002e
            com.google.android.libraries.lens.ondevice.l.d r5 = (com.google.android.libraries.lens.ondevice.p2035l.C24761d) r5
            com.google.android.libraries.lens.ondevice.k.eg r1 = r4.f67649a
            com.google.android.libraries.lens.ondevice.k.eg r3 = r5.mo29990a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            com.google.common.util.concurrent.cx r1 = r4.f67650b
            if (r1 != 0) goto L_0x0022
            com.google.common.util.concurrent.cx r5 = r5.mo29991b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            com.google.common.util.concurrent.cx r5 = r5.mo29991b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.ondevice.p2035l.C24758a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f67649a.hashCode() ^ 1000003) * 1000003;
        C60870cx cxVar = this.f67650b;
        if (cxVar == null) {
            i = 0;
        } else {
            i = cxVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f67649a.toString();
        String valueOf = String.valueOf(this.f67650b);
        return "PrimitiveState{primitiveEngine=" + obj + ", loadingFuture=" + valueOf + "}";
    }
}
