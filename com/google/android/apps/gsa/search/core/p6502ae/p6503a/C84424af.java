package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import com.google.android.gms.common.api.C143851w;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21544l;
import com.google.android.libraries.gcoreclient.p1805x.p1807b.C21726a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.af */
/* compiled from: PG */
public final class C84424af {

    /* renamed from: a */
    public final C58881cr f229710a;

    /* renamed from: b */
    public final C21726a f229711b;

    /* renamed from: c */
    public C143851w f229712c = C21544l.m40656c(this.f229713d);

    /* renamed from: d */
    public C21529b f229713d;

    /* renamed from: e */
    private final C21370a f229714e;

    /* renamed from: f */
    private final C68214a f229715f;

    /* renamed from: g */
    private int f229716g;

    /* renamed from: h */
    private long f229717h;

    public C84424af(C58881cr crVar, C21726a aVar, C21370a aVar2, C68214a aVar3) {
        this.f229710a = crVar;
        this.f229711b = aVar;
        this.f229713d = (C21529b) crVar.mo6453a();
        this.f229714e = aVar2;
        new C21544l();
        this.f229715f = aVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r0 > 600000) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77992a() {
        /*
            r6 = this;
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag.f229718a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.f.a r0 = r6.f229714e
            long r0 = r0.mo26870b()
            long r2 = r6.f229717h
            long r0 = r0 - r2
            int r2 = r6.f229716g
            r3 = 3
            r4 = 600000(0x927c0, double:2.964394E-318)
            if (r2 < r3) goto L_0x001b
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            return
        L_0x001b:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0022
        L_0x001f:
            r0 = 0
            r6.f229716g = r0
        L_0x0022:
            com.google.android.libraries.gcoreclient.h.a.a.b r0 = r6.f229713d
            com.google.android.gms.common.api.w r0 = r0.f59932a
            boolean r0 = r0.mo119133h()
            if (r0 != 0) goto L_0x009e
            com.google.android.libraries.f.a r0 = r6.f229714e
            long r0 = r0.mo26871c()
            com.google.android.libraries.gcoreclient.h.a.a.b r2 = r6.f229713d
            long r3 = com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag.f229719b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gcoreclient.h.a.b.c r2 = r2.mo26988b(r3, r5)
            com.google.android.gms.common.ConnectionResult r3 = r2.f59933a
            boolean r3 = r3.mo119068b()
            if (r3 != 0) goto L_0x0089
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag.f229718a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "Search.IcingConnection"
            r0.mo56378ag(r1, r3)
            com.google.android.gms.common.ConnectionResult r1 = r2.f59933a
            int r1 = r1.f389574c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 9288(0x2448, float:1.3015E-41)
            java.lang.String r3 = "Could not connect to Icing. Error code %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r3, r1)
            com.google.android.libraries.f.a r0 = r6.f229714e
            long r0 = r0.mo26870b()
            r6.f229717h = r0
            int r0 = r6.f229716g
            int r0 = r0 + 1
            r6.f229716g = r0
            dagger.a r0 = r6.f229715f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.ae.a.ah r0 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84426ah) r0
            if (r0 == 0) goto L_0x009e
            r0.mo78002a()
            return
        L_0x0089:
            dagger.a r2 = r6.f229715f
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.ae.a.ah r2 = (com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84426ah) r2
            if (r2 == 0) goto L_0x009e
            com.google.android.libraries.f.a r3 = r6.f229714e
            long r3 = r3.mo26871c()
            long r3 = r3 - r0
            int r0 = (int) r3
            r2.mo78003c(r0)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84424af.mo77992a():void");
    }
}
