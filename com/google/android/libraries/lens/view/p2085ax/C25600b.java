package com.google.android.libraries.lens.view.p2085ax;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import com.google.p440an.p441a.C8841h;

/* renamed from: com.google.android.libraries.lens.view.ax.b */
/* compiled from: PG */
final class C25600b extends C25604f {

    /* renamed from: a */
    private final C119103al f69646a;

    /* renamed from: b */
    private final C58495hd f69647b;

    /* renamed from: c */
    private final C8841h f69648c;

    public C25600b(C119103al alVar, C58495hd hdVar, C8841h hVar) {
        this.f69646a = alVar;
        this.f69647b = hdVar;
        this.f69648c = hVar;
    }

    /* renamed from: a */
    public final C119103al mo30693a() {
        return this.f69646a;
    }

    /* renamed from: b */
    public final C58495hd mo30694b() {
        return this.f69647b;
    }

    /* renamed from: c */
    public final C8841h mo30695c() {
        return this.f69648c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f69648c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.lens.view.p2085ax.C25604f
            r2 = 0
            if (r1 == 0) goto L_0x003a
            com.google.android.libraries.lens.view.ax.f r5 = (com.google.android.libraries.lens.view.p2085ax.C25604f) r5
            com.google.android.apps.h.a.a.a.al r1 = r4.f69646a
            com.google.android.apps.h.a.a.a.al r3 = r5.mo30693a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            com.google.common.b.hd r1 = r4.f69647b
            com.google.common.b.hd r3 = r5.mo30694b()
            boolean r1 = com.google.common.p4522b.C58662ni.m90356o(r1, r3)
            if (r1 == 0) goto L_0x003a
            com.google.an.a.h r1 = r4.f69648c
            if (r1 != 0) goto L_0x002e
            com.google.an.a.h r5 = r5.mo30695c()
            if (r5 != 0) goto L_0x003a
            goto L_0x0039
        L_0x002e:
            com.google.an.a.h r5 = r5.mo30695c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2085ax.C25600b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f69646a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f69647b.entrySet())) * 1000003;
        C8841h hVar = this.f69648c;
        if (hVar == null) {
            i = 0;
        } else {
            i = hVar.f30255g.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f69646a.toString();
        String i = C58662ni.m90350i(this.f69647b);
        String valueOf = String.valueOf(this.f69648c);
        return "PlayRequest{speakrInput=" + obj + ", wordStartIndexPosition=" + i + ", contentLanguage=" + valueOf + "}";
    }
}
