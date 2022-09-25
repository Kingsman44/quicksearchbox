package com.google.android.gms.googlehelp.internal.common;

import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: com.google.android.gms.googlehelp.internal.common.f */
/* compiled from: PG */
public final class C144311f implements Runnable {

    /* renamed from: a */
    public final GoogleHelp f390841a;

    /* renamed from: b */
    public final C144310e f390842b;

    /* renamed from: c */
    private final C144280a f390843c;

    /* renamed from: d */
    private boolean f390844d;

    public C144311f(GoogleHelp googleHelp, C144280a aVar, C144310e eVar) {
        this.f390841a = googleHelp;
        this.f390843c = aVar;
        this.f390842b = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo119851a() {
        if (this.f390844d) {
            return false;
        }
        this.f390844d = true;
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|(2:5|3)|19|6|(1:8)|9|10|11|12|13|16|(2:18|20)(1:21)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x007c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            java.lang.String r0 = "gms:googlehelp:sync_help_psd_collection_time_ms"
            r1 = 0
            r9.f390844d = r1
            com.google.android.gms.libs.d.c.c r1 = new com.google.android.gms.libs.d.c.c
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.google.android.gms.googlehelp.internal.common.d r2 = new com.google.android.gms.googlehelp.internal.common.d
            r2.<init>(r9)
            com.google.android.gms.googlehelp.GoogleHelp r3 = r9.f390841a
            int r3 = r3.f390740C
            long r3 = (long) r3
            r1.postDelayed(r2, r3)
            com.google.android.gms.feedback.a.a.b r3 = new com.google.android.gms.feedback.a.a.b     // Catch:{ Exception -> 0x0092 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ Exception -> 0x0092 }
            long r4 = r3.mo119734b()     // Catch:{ Exception -> 0x0092 }
            r3.f390596b = r4     // Catch:{ Exception -> 0x0092 }
            com.google.android.gms.googlehelp.a r4 = r9.f390843c     // Catch:{ Exception -> 0x0092 }
            com.google.android.libraries.gcoreclient.o.a.c r4 = (com.google.android.libraries.gcoreclient.p1782o.p1783a.C21591c) r4     // Catch:{ Exception -> 0x0092 }
            com.google.android.libraries.gcoreclient.o.a r4 = r4.f59966a     // Catch:{ Exception -> 0x0092 }
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ Exception -> 0x0092 }
            com.google.android.apps.gsa.staticplugins.feedback.l r4 = (com.google.android.apps.gsa.staticplugins.feedback.C101243l) r4     // Catch:{ Exception -> 0x0092 }
            com.google.android.apps.gsa.staticplugins.feedback.o r4 = r4.f282535a     // Catch:{ Exception -> 0x0092 }
            java.util.Map r4 = r4.f252712x     // Catch:{ Exception -> 0x0092 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Exception -> 0x0092 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0092 }
        L_0x003f:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x0092 }
            if (r6 == 0) goto L_0x0060
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x0092 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Exception -> 0x0092 }
            android.util.Pair r7 = new android.util.Pair     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r8 = r6.getKey()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0092 }
            r7.<init>(r8, r6)     // Catch:{ Exception -> 0x0092 }
            r5.mo55395g(r7)     // Catch:{ Exception -> 0x0092 }
            goto L_0x003f
        L_0x0060:
            com.google.common.b.gu r4 = r5.mo55394f()     // Catch:{ Exception -> 0x0092 }
            if (r4 != 0) goto L_0x006c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0092 }
            r5 = 1
            r4.<init>(r5)     // Catch:{ Exception -> 0x0092 }
        L_0x006c:
            long r5 = r3.mo119733a()     // Catch:{ UnsupportedOperationException -> 0x007c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ UnsupportedOperationException -> 0x007c }
            android.util.Pair r5 = android.util.Pair.create(r0, r5)     // Catch:{ UnsupportedOperationException -> 0x007c }
            r4.add(r5)     // Catch:{ UnsupportedOperationException -> 0x007c }
            goto L_0x00a6
        L_0x007c:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0092 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0092 }
            long r3 = r3.mo119733a()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0092 }
            android.util.Pair r0 = android.util.Pair.create(r0, r3)     // Catch:{ Exception -> 0x0092 }
            r5.add(r0)     // Catch:{ Exception -> 0x0092 }
            r4 = r5
            goto L_0x00a6
        L_0x0092:
            r0 = move-exception
            java.lang.String r3 = "gH_GetSyncHelpPsd"
            java.lang.String r4 = "Failed to get sync help psd."
            android.util.Log.w(r3, r4, r0)
            java.lang.String r0 = "gms:googlehelp:sync_help_psd_failure"
            java.lang.String r3 = "exception"
            android.util.Pair r0 = android.util.Pair.create(r0, r3)
            java.util.List r4 = com.google.android.gms.common.util.C144004d.m234183a(r0)
        L_0x00a6:
            boolean r0 = r9.mo119851a()
            if (r0 == 0) goto L_0x00be
            r1.removeCallbacks(r2)
            com.google.android.gms.googlehelp.GoogleHelp r0 = r9.f390841a
            android.os.Bundle r1 = com.google.android.gms.feedback.p10795a.p10796a.C144191a.m234429a(r4)
            r0.f390754d = r1
            com.google.android.gms.googlehelp.internal.common.e r0 = r9.f390842b
            com.google.android.gms.googlehelp.GoogleHelp r1 = r9.f390841a
            r0.mo119850a(r1)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.internal.common.C144311f.run():void");
    }
}
