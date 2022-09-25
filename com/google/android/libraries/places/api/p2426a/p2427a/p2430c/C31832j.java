package com.google.android.libraries.places.api.p2426a.p2427a.p2430c;

import com.google.android.gms.tasks.C146005aa;
import com.google.android.libraries.places.api.p2437b.C31861q;

/* renamed from: com.google.android.libraries.places.api.a.a.c.j */
/* compiled from: PG */
public final /* synthetic */ class C31832j implements C146005aa {

    /* renamed from: a */
    public final /* synthetic */ C31836n f85445a;

    /* renamed from: b */
    public final /* synthetic */ C31861q f85446b;

    /* renamed from: c */
    public final /* synthetic */ String f85447c;

    public /* synthetic */ C31832j(C31836n nVar, C31861q qVar, String str) {
        this.f85445a = nVar;
        this.f85446b = qVar;
        this.f85447c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        if (r0.contains("_optout") == false) goto L_0x008e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.C146006ab mo37394a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.libraries.places.api.a.a.c.n r1 = r0.f85445a
            com.google.android.libraries.places.api.b.q r3 = r0.f85446b
            java.lang.String r2 = r0.f85447c
            r4 = r18
            android.location.Location r4 = (android.location.Location) r4
            java.lang.String r5 = "Location must not be null."
            com.google.common.base.C58838bb.m90866a(r4, r5)
            com.google.android.libraries.places.api.a.a.c.a.r r9 = r1.f85458d
            com.google.android.libraries.places.api.a.a.a.f r1 = r1.f85455a
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r5 < r6) goto L_0x0025
            if (r2 == 0) goto L_0x0025
            android.content.Context r5 = r1.f85408c
            android.content.Context r2 = r5.createAttributionContext(r2)
            r1.f85408c = r2
        L_0x0025:
            android.content.Context r2 = r1.f85408c
            java.lang.String r5 = "wifi"
            java.lang.Object r2 = r2.getSystemService(r5)
            android.net.wifi.WifiManager r2 = (android.net.wifi.WifiManager) r2
            if (r2 == 0) goto L_0x00cf
            boolean r5 = r2.isWifiEnabled()
            if (r5 != 0) goto L_0x0039
            goto L_0x00cf
        L_0x0039:
            java.util.List r5 = r2.getScanResults()
            if (r5 == 0) goto L_0x00ca
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0047
            goto L_0x00ca
        L_0x0047:
            com.google.android.libraries.places.api.a.a.a.e r6 = com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31784e.f85405a
            com.google.common.b.pc r6 = com.google.common.p4522b.C58710pc.m90487d(r6)
            com.google.common.b.gu r5 = com.google.common.p4522b.C58485gu.m89836F(r6, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.net.wifi.WifiInfo r2 = r2.getConnectionInfo()
            r7 = r5
            com.google.common.b.pq r7 = (com.google.common.p4522b.C58724pq) r7
            int r7 = r7.f156474d
            r10 = 0
        L_0x0060:
            if (r10 >= r7) goto L_0x00c5
            java.lang.Object r11 = r5.get(r10)
            android.net.wifi.ScanResult r11 = (android.net.wifi.ScanResult) r11
            if (r11 == 0) goto L_0x00c0
            java.lang.String r12 = r11.SSID
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0073
            goto L_0x00c0
        L_0x0073:
            com.google.android.libraries.f.a r12 = r1.f85407b
            long r12 = r12.mo26871c()
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r14
            long r14 = r11.timestamp
            long r12 = r12 - r14
            long r14 = com.google.android.libraries.places.api.p2426a.p2427a.p2428a.C31785f.f85406a
            java.lang.String r8 = r11.SSID
            if (r8 == 0) goto L_0x00b8
            r0 = 95
            int r0 = r8.indexOf(r0)
            if (r0 >= 0) goto L_0x0091
        L_0x008e:
            r16 = 0
            goto L_0x00a9
        L_0x0091:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r8.toLowerCase(r0)
            java.lang.String r8 = "_nomap"
            boolean r8 = r0.contains(r8)
            r16 = 1
            if (r8 != 0) goto L_0x00a9
            java.lang.String r8 = "_optout"
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x008e
        L_0x00a9:
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x00c0
            if (r16 != 0) goto L_0x00c0
            com.google.android.libraries.places.api.a.a.a.d r0 = new com.google.android.libraries.places.api.a.a.a.d
            r0.<init>(r2, r11)
            r6.add(r0)
            goto L_0x00c0
        L_0x00b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Null SSID."
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            int r10 = r10 + 1
            r0 = r17
            goto L_0x0060
        L_0x00c5:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r6)
            goto L_0x00d3
        L_0x00ca:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x00d3
        L_0x00cf:
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x00d3:
            r5 = r0
            java.util.List r0 = r3.mo37439b()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f5
            com.google.android.gms.common.api.n r0 = new com.google.android.gms.common.api.n
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r2 = 1
            r3 = 9012(0x2334, float:1.2629E-41)
            java.lang.String r4 = "Place Fields must not be empty."
            r5 = 0
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.<init>(r7)
            com.google.android.gms.tasks.ab r0 = com.google.android.gms.tasks.C146021aq.m237849c(r0)
            goto L_0x0131
        L_0x00f5:
            com.google.android.libraries.places.api.a.a.c.a.g r0 = new com.google.android.libraries.places.api.a.a.c.a.g
            com.google.android.libraries.places.api.a.d.a r1 = r9.f85434e
            java.util.Locale r6 = r1.mo37401b()
            com.google.android.libraries.places.api.a.d.a r1 = r9.f85434e
            java.lang.String r7 = r1.mo37400a()
            com.google.android.libraries.places.api.a.d.a r1 = r9.f85434e
            boolean r1 = r1.f85470a
            com.google.android.libraries.places.b.a r8 = r9.f85430a
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.libraries.f.a r1 = r9.f85433d
            long r1 = r1.mo26871c()
            com.google.android.libraries.places.api.a.a.c.e r3 = r9.f85431b
            java.lang.Class<com.google.android.libraries.places.api.a.a.c.a.h> r4 = com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31800h.class
            com.google.android.gms.tasks.ab r0 = r3.mo37392a(r0, r4)
            com.google.android.libraries.places.api.a.a.c.a.p r3 = new com.google.android.libraries.places.api.a.a.c.a.p
            r3.<init>()
            java.util.concurrent.Executor r4 = com.google.android.gms.tasks.C146013ai.f394700a
            com.google.android.gms.tasks.ab r0 = r0.mo122482a(r4, r3)
            com.google.android.libraries.places.api.a.a.c.a.q r3 = new com.google.android.libraries.places.api.a.a.c.a.q
            r3.<init>(r9, r1)
            java.util.concurrent.Executor r1 = com.google.android.gms.tasks.C146013ai.f394700a
            com.google.android.gms.tasks.ab r0 = r0.mo122482a(r1, r3)
        L_0x0131:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.p2426a.p2427a.p2430c.C31832j.mo37394a(java.lang.Object):com.google.android.gms.tasks.ab");
    }
}
