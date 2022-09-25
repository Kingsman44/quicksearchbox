package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.l */
/* compiled from: PG */
public final /* synthetic */ class C107342l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C107345o f298728a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f298729b;

    public /* synthetic */ C107342l(C107345o oVar, Boolean bool) {
        this.f298728a = oVar;
        this.f298729b = bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43756g(r3) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43756g(r3) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43756g(r3) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43754e(r3) != false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            com.google.android.apps.gsa.staticplugins.opa.appintegration.o r0 = r13.f298728a
            java.lang.Boolean r1 = r13.f298729b
            com.google.android.libraries.gsa.q.a.c r2 = r0.f298734a
            if (r2 == 0) goto L_0x0017
            boolean r3 = r2.mo28821d()
            if (r3 != 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            boolean r1 = r1.booleanValue()
            r0.mo95921a(r1)
            return
        L_0x0017:
            boolean r2 = r2.f63839j
            if (r2 != 0) goto L_0x00e9
            com.google.android.libraries.gsa.q.a.c r2 = r0.f298734a
            boolean r2 = r2.mo28821d()
            if (r2 != 0) goto L_0x00e9
            com.google.android.libraries.gsa.q.a.c r2 = r0.f298734a
            com.google.android.apps.gsa.staticplugins.opa.appintegration.n r3 = new com.google.android.apps.gsa.staticplugins.opa.appintegration.n
            r3.<init>(r0)
            com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43753b()
            r2.f63840k = r3
            android.content.Context r3 = r2.f63838i
            java.lang.String r4 = "uimode"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.app.UiModeManager r4 = (android.app.UiModeManager) r4
            r5 = 0
            java.lang.String r6 = "com.google.android.googlequicksearchbox"
            java.lang.String r7 = "com.google.android.katniss"
            r8 = 1
            if (r4 == 0) goto L_0x0057
            int r9 = r4.getCurrentModeType()
            r10 = 4
            if (r9 != r10) goto L_0x0057
            boolean r4 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43754e(r3)
            if (r4 == 0) goto L_0x0050
        L_0x004e:
            r5 = r7
            goto L_0x00af
        L_0x0050:
            boolean r3 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43756g(r3)
            if (r3 == 0) goto L_0x00af
            goto L_0x00a6
        L_0x0057:
            r9 = 0
            r10 = 2
            if (r4 == 0) goto L_0x007d
            int r11 = r4.getCurrentModeType()
            r12 = 3
            if (r11 != r12) goto L_0x007d
            byte[][] r4 = new byte[r10][]
            byte[] r10 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.f63826b
            r4[r9] = r10
            byte[] r9 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.f63827c
            r4[r8] = r9
            java.lang.String r9 = "com.google.android.carassistant"
            boolean r4 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43755f(r3, r9, r8, r4)
            if (r4 == 0) goto L_0x0076
        L_0x0074:
            r5 = r9
            goto L_0x00af
        L_0x0076:
            boolean r3 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43756g(r3)
            if (r3 == 0) goto L_0x00af
            goto L_0x00a6
        L_0x007d:
            if (r4 == 0) goto L_0x00a0
            int r4 = r4.getCurrentModeType()
            r11 = 6
            if (r4 != r11) goto L_0x00a0
            byte[][] r4 = new byte[r10][]
            byte[] r10 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.f63828d
            r4[r9] = r10
            byte[] r9 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.f63829e
            r4[r8] = r9
            java.lang.String r9 = "com.google.android.wearable.assistant"
            boolean r4 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43755f(r3, r9, r8, r4)
            if (r4 == 0) goto L_0x0099
            goto L_0x0074
        L_0x0099:
            boolean r3 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43756g(r3)
            if (r3 == 0) goto L_0x00af
            goto L_0x00a6
        L_0x00a0:
            boolean r4 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43756g(r3)
            if (r4 == 0) goto L_0x00a8
        L_0x00a6:
            r5 = r6
            goto L_0x00af
        L_0x00a8:
            boolean r3 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43754e(r3)
            if (r3 == 0) goto L_0x00af
            goto L_0x004e
        L_0x00af:
            if (r5 != 0) goto L_0x00b2
            goto L_0x00e9
        L_0x00b2:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "com.google.android.ssb.action.SSB_SERVICE"
            r3.<init>(r4)
            android.content.Intent r3 = r3.setPackage(r5)
            boolean r4 = r5.equals(r7)
            if (r4 == 0) goto L_0x00dd
            android.content.Context r4 = r2.f63838i
            android.content.pm.PackageInfo r4 = com.google.android.libraries.gsa.p1932q.p1933a.C23324c.m43752a(r4, r7)
            if (r4 == 0) goto L_0x00dd
            int r4 = r4.versionCode
            r6 = 13001070(0xc6616e, float:1.821838E-38)
            if (r4 < r6) goto L_0x00dd
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "com.google.android.apps.tvsearch.voice.search.KVS_SERVICE"
            r3.<init>(r4)
            android.content.Intent r3 = r3.setPackage(r5)
        L_0x00dd:
            android.content.Context r4 = r2.f63838i
            com.google.android.libraries.gsa.q.a.b r5 = r2.f63837h
            boolean r3 = r4.bindService(r3, r5, r8)
            r2.f63839j = r3
            boolean r2 = r2.f63839j
        L_0x00e9:
            java.util.Queue r0 = r0.f298735b
            r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.appintegration.C107342l.run():void");
    }
}
