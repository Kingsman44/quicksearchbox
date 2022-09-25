package com.google.android.apps.search.lens;

import dagger.C68214a;

/* renamed from: com.google.android.apps.search.lens.q */
/* compiled from: PG */
public final class C139941q extends C139942r {

    /* renamed from: a */
    public final LensExportedActivity f380394a;

    /* renamed from: b */
    public final C68214a f380395b;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C139941q(com.google.android.apps.search.lens.LensExportedActivity r7, com.google.apps.tiktok.account.api.controller.C45989b r8, dagger.C68214a r9, dagger.C68214a r10, com.google.android.libraries.lens.view.p2096f.C25799b r11, boolean r12) {
        /*
            r6 = this;
            r6.<init>()
            r6.f380394a = r7
            r6.f380395b = r10
            boolean r10 = r11.mo30940a()
            if (r10 != 0) goto L_0x0018
            boolean r10 = r11.mo30941b()
            if (r10 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            com.google.common.o.zp r10 = com.google.common.p4552o.C60700zp.DIRECT_INTENT
            goto L_0x00ca
        L_0x0018:
            android.content.Intent r10 = r7.getIntent()
            android.content.ComponentName r10 = r10.getComponent()
            r10.getClass()
            java.lang.String r11 = r10.getClassName()
            int r0 = r11.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case -1247823361: goto L_0x005c;
                case 273293964: goto L_0x0052;
                case 524287780: goto L_0x0048;
                case 1122793363: goto L_0x003e;
                case 1919290499: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0066
        L_0x0034:
            java.lang.String r0 = "com.google.android.apps.lens.MainActivity"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0066
            r11 = 2
            goto L_0x0067
        L_0x003e:
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.lens.LensActivity"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0066
            r11 = 1
            goto L_0x0067
        L_0x0048:
            java.lang.String r0 = "com.google.android..apps.gsa.staticplugins.lens.DummyExportedActivity"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0066
            r11 = 4
            goto L_0x0067
        L_0x0052:
            java.lang.String r0 = "com.google.android.apps.search.lens.LensActivity"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0066
            r11 = 0
            goto L_0x0067
        L_0x005c:
            java.lang.String r0 = "com.google.android.apps.search.lens.LensExportedActivity"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0066
            r11 = 3
            goto L_0x0067
        L_0x0066:
            r11 = -1
        L_0x0067:
            if (r11 == 0) goto L_0x00c8
            if (r11 == r5) goto L_0x00c8
            if (r11 == r3) goto L_0x00c5
            if (r11 == r2) goto L_0x0082
            if (r11 != r1) goto L_0x0072
            goto L_0x0082
        L_0x0072:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Accessed via unsupported component: "
            java.lang.String r9 = r10.toString()
            java.lang.String r8 = r8.concat(r9)
            r7.<init>(r8)
            throw r7
        L_0x0082:
            android.content.Intent r10 = r7.getIntent()
            int r10 = r10.getFlags()
            r11 = 1048576(0x100000, float:1.469368E-39)
            r10 = r10 & r11
            if (r10 == 0) goto L_0x009f
            android.content.Intent r10 = r7.getIntent()
            boolean r10 = com.google.android.libraries.lens.view.p2051ab.C24968a.m46219h(r10)
            if (r10 == 0) goto L_0x009c
            com.google.common.o.zp r10 = com.google.common.p4552o.C60700zp.DIRECT_INTENT
            goto L_0x00ca
        L_0x009c:
            com.google.common.o.zp r10 = com.google.common.p4552o.C60700zp.AGSA_INTENT
            goto L_0x00ca
        L_0x009f:
            android.content.Intent r10 = r7.getIntent()
            java.lang.String r11 = "LensHomescreenShortcut"
            boolean r10 = r10.hasExtra(r11)
            if (r10 == 0) goto L_0x00bd
            android.content.Intent r10 = r7.getIntent()
            android.os.Bundle r10 = r10.getExtras()
            r10.getClass()
            int r10 = r10.size()
            if (r10 != r5) goto L_0x00bd
            r4 = 1
        L_0x00bd:
            java.lang.String r10 = "Launch mode only supported for shortcuts."
            com.google.common.base.C58838bb.m90869d(r4, r10)
            com.google.common.o.zp r10 = com.google.common.p4552o.C60700zp.AGSA_INTENT
            goto L_0x00ca
        L_0x00c5:
            com.google.common.o.zp r10 = com.google.common.p4552o.C60700zp.DIRECT_INTENT
            goto L_0x00ca
        L_0x00c8:
            com.google.common.o.zp r10 = com.google.common.p4552o.C60700zp.AGSA_INTENT
        L_0x00ca:
            r7.mo115339A(r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.lens.C139941q.<init>(com.google.android.apps.search.lens.LensExportedActivity, com.google.apps.tiktok.account.api.controller.b, dagger.a, dagger.a, com.google.android.libraries.lens.view.f.b, boolean):void");
    }
}
