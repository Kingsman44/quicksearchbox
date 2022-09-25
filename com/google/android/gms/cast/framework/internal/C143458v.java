package com.google.android.gms.cast.framework.internal;

import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.tasks.C146036p;

/* renamed from: com.google.android.gms.cast.framework.internal.v */
/* compiled from: PG */
public final /* synthetic */ class C143458v implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ C143461y f389004a;

    /* renamed from: b */
    public final /* synthetic */ CastOptions f389005b;

    public /* synthetic */ C143458v(C143461y yVar, CastOptions castOptions) {
        this.f389004a = yVar;
        this.f389005b = castOptions;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22590a(com.google.android.gms.tasks.C146006ab r10) {
        /*
            r9 = this;
            com.google.android.gms.cast.framework.internal.y r0 = r9.f389004a
            com.google.android.gms.cast.framework.CastOptions r1 = r9.f389005b
            boolean r2 = r10.mo122491j()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            java.lang.Object r10 = r10.mo122488g()
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.String r2 = "com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"
            if (r10 == 0) goto L_0x001e
            boolean r5 = r10.containsKey(r2)
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            com.google.android.gms.cast.internal.ae r6 = com.google.android.gms.cast.framework.internal.C143461y.f389011a
            java.lang.Object[] r7 = new java.lang.Object[r4]
            if (r4 == r5) goto L_0x0028
            java.lang.String r8 = "not existed"
            goto L_0x002a
        L_0x0028:
            java.lang.String r8 = "existed"
        L_0x002a:
            r7[r3] = r8
            java.lang.String r8 = "The module-to-client output switcher flag %s"
            r6.mo118884b(r8, r7)
            if (r5 == 0) goto L_0x0038
            boolean r10 = r10.getBoolean(r2)
            goto L_0x0039
        L_0x0038:
            r10 = 1
        L_0x0039:
            com.google.android.gms.cast.internal.ae r2 = com.google.android.gms.cast.framework.internal.C143461y.f389011a
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r10)
            r6[r3] = r7
            boolean r7 = r1.f388841m
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r4] = r7
            java.lang.String r7 = "Set up output switcher flags: %b (from module), %b (from CastOptions)"
            r2.mo118884b(r7, r6)
            if (r10 == 0) goto L_0x0059
            boolean r10 = r1.f388841m
            if (r10 == 0) goto L_0x0059
            r10 = 1
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            androidx.mediarouter.a.aw r1 = r0.f389012b
            if (r1 == 0) goto L_0x00c5
            com.google.android.gms.cast.framework.CastOptions r1 = r0.f389013c
            if (r1 != 0) goto L_0x0063
            goto L_0x00c5
        L_0x0063:
            boolean r2 = r1.f388839k
            boolean r1 = r1.f388838j
            androidx.mediarouter.a.bj r6 = new androidx.mediarouter.a.bj
            r6.<init>()
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 30
            if (r7 < r8) goto L_0x0074
            r6.f11894a = r10
        L_0x0074:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r8) goto L_0x007a
            r6.f11896c = r2
        L_0x007a:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r8) goto L_0x0080
            r6.f11895b = r1
        L_0x0080:
            androidx.mediarouter.a.bk r7 = new androidx.mediarouter.a.bk
            r7.<init>(r6)
            androidx.mediarouter.p175a.C3687aw.m10688r(r7)
            com.google.android.gms.cast.internal.ae r6 = com.google.android.gms.cast.framework.internal.C143461y.f389011a
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7[r3] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r7[r4] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            r7[r5] = r10
            java.lang.String r10 = "session transfer = %b, transfer to local = %b, in-app output switcher = %b"
            r6.mo118888f(r10, r7)
            if (r2 == 0) goto L_0x00be
            com.google.android.gms.cast.framework.internal.u r10 = new com.google.android.gms.cast.framework.internal.u
            com.google.android.gms.cast.framework.internal.ac r0 = r0.f389015e
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)
            r10.<init>(r0)
            androidx.mediarouter.p175a.C3687aw.m10684i()
            androidx.mediarouter.a.ao r0 = androidx.mediarouter.p175a.C3687aw.m10682b()
            r0.f11843y = r10
            com.google.common.o.d.a.c r10 = com.google.common.p4552o.p4557d.p4558a.C59715c.CAST_TRANSFER_TO_LOCAL_ENABLED
            com.google.android.gms.cast.framework.p10772a.p10773a.C143390i.m232669e(r10)
        L_0x00be:
            if (r1 == 0) goto L_0x00c5
            com.google.common.o.d.a.c r10 = com.google.common.p4552o.p4557d.p4558a.C59715c.CAST_OUTPUT_SWITCHER_ENABLED
            com.google.android.gms.cast.framework.p10772a.p10773a.C143390i.m232669e(r10)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.internal.C143458v.mo22590a(com.google.android.gms.tasks.ab):void");
    }
}
