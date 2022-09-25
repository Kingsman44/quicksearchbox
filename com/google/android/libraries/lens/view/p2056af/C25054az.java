package com.google.android.libraries.lens.view.p2056af;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.af.az */
/* compiled from: PG */
final class C25054az implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f68286a;

    /* renamed from: b */
    final /* synthetic */ String f68287b;

    /* renamed from: c */
    final /* synthetic */ boolean f68288c;

    /* renamed from: d */
    final /* synthetic */ C25057bb f68289d;

    /* renamed from: e */
    final /* synthetic */ int f68290e;

    /* renamed from: f */
    final /* synthetic */ int f68291f;

    public C25054az(C25057bb bbVar, boolean z, String str, int i, int i2, boolean z2) {
        this.f68289d = bbVar;
        this.f68286a = z;
        this.f68287b = str;
        this.f68290e = i;
        this.f68291f = i2;
        this.f68288c = z2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) C25057bb.f68295a.mo56226d()).mo56372aa(49660)).mo56386p("Unable to get Lens Device Settings");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17911gm(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Void r11 = (java.lang.Void) r11
            boolean r11 = r10.f68286a
            r0 = 1
            if (r11 == 0) goto L_0x0031
            com.google.android.libraries.lens.view.af.bb r11 = r10.f68289d
            com.google.android.libraries.lens.view.ak.bd r11 = r11.f68297c
            java.lang.String r1 = r10.f68287b
            com.google.android.libraries.lens.view.ak.bt r11 = r11.f68662a
            com.google.protobuf.MessageLite r11 = r11.mo30362b(r0)
            com.google.android.libraries.lens.view.ak.ae r11 = (com.google.android.libraries.lens.view.p2067ak.C25199ae) r11
            com.google.android.libraries.lens.view.ak.u r11 = r11.f68641n
            if (r11 != 0) goto L_0x001b
            com.google.android.libraries.lens.view.ak.u r11 = com.google.android.libraries.lens.view.p2067ak.C25282u.f68773d
        L_0x001b:
            r1.getClass()
            com.google.protobuf.dn r11 = r11.f68776b
            boolean r2 = r11.containsKey(r1)
            if (r2 == 0) goto L_0x005b
            java.lang.Object r11 = r11.get(r1)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            goto L_0x005c
        L_0x0031:
            com.google.android.libraries.lens.view.af.bb r11 = r10.f68289d
            com.google.android.libraries.lens.view.ak.bd r11 = r11.f68297c
            java.lang.String r1 = r10.f68287b
            com.google.android.libraries.lens.view.ak.bt r11 = r11.f68662a
            com.google.protobuf.MessageLite r11 = r11.mo30362b(r0)
            com.google.android.libraries.lens.view.ak.ae r11 = (com.google.android.libraries.lens.view.p2067ak.C25199ae) r11
            com.google.android.libraries.lens.view.ak.u r11 = r11.f68641n
            if (r11 != 0) goto L_0x0045
            com.google.android.libraries.lens.view.ak.u r11 = com.google.android.libraries.lens.view.p2067ak.C25282u.f68773d
        L_0x0045:
            r1.getClass()
            com.google.protobuf.dn r11 = r11.f68777c
            boolean r2 = r11.containsKey(r1)
            if (r2 == 0) goto L_0x005b
            java.lang.Object r11 = r11.get(r1)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            goto L_0x005c
        L_0x005b:
            r11 = 1
        L_0x005c:
            r1 = 20
            int r11 = java.lang.Math.min(r11, r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.android.libraries.lens.view.af.bb r1 = r10.f68289d
            com.google.android.libraries.lens.view.af.ao r1 = r1.f68296b
            int r2 = r10.f68290e
            r3 = 2
            if (r2 == r0) goto L_0x0077
            if (r2 == r3) goto L_0x0074
            java.lang.String r2 = "FAILED"
            goto L_0x0079
        L_0x0074:
            java.lang.String r2 = "CANCELED"
            goto L_0x0079
        L_0x0077:
            java.lang.String r2 = "SUCCESS"
        L_0x0079:
            java.lang.String r4 = r10.f68287b
            int r5 = r10.f68291f
            boolean r6 = r10.f68288c
            boolean r7 = r10.f68286a
            com.google.common.base.cr r1 = r1.f68263o
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.libraries.au.d r1 = (com.google.android.libraries.p1635au.C19567d) r1
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r9 = 0
            r8[r9] = r2
            r8[r0] = r4
            java.lang.String r0 = com.google.android.libraries.lens.view.p2056af.C25056ba.m46357a(r5)
            r8[r3] = r0
            r0 = 3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r8[r0] = r2
            r0 = 4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            r8[r0] = r2
            r0 = 5
            r8[r0] = r11
            r2 = 1
            r1.mo24822a(r2, r8)
            boolean r11 = r10.f68286a
            if (r11 == 0) goto L_0x00c2
            com.google.android.libraries.lens.view.af.bb r11 = r10.f68289d
            com.google.android.libraries.lens.view.ak.bd r11 = r11.f68297c
            java.lang.String r0 = r10.f68287b
            com.google.android.libraries.lens.view.ak.bt r11 = r11.f68662a
            com.google.android.libraries.lens.view.ak.ah r1 = new com.google.android.libraries.lens.view.ak.ah
            r1.<init>(r0)
            r11.mo30363c(r1)
            return
        L_0x00c2:
            com.google.android.libraries.lens.view.af.bb r11 = r10.f68289d
            com.google.android.libraries.lens.view.ak.bd r11 = r11.f68297c
            java.lang.String r0 = r10.f68287b
            com.google.android.libraries.lens.view.ak.bt r11 = r11.f68662a
            com.google.android.libraries.lens.view.ak.av r1 = new com.google.android.libraries.lens.view.ak.av
            r1.<init>(r0)
            r11.mo30363c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2056af.C25054az.mo17911gm(java.lang.Object):void");
    }
}
