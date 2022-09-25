package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import android.content.Intent;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.d */
/* compiled from: PG */
public final /* synthetic */ class C98673d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C98682m f275635a;

    /* renamed from: b */
    public final /* synthetic */ Intent f275636b;

    /* renamed from: c */
    public final /* synthetic */ C98681l f275637c;

    public /* synthetic */ C98673d(C98682m mVar, Intent intent, C98681l lVar) {
        this.f275635a = mVar;
        this.f275636b = intent;
        this.f275637c = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x06cc  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0704  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x077c  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0786  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x07a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            com.google.android.apps.gsa.staticplugins.customtabs.intent.m r1 = r0.f275635a
            android.content.Intent r2 = r0.f275636b
            com.google.android.apps.gsa.staticplugins.customtabs.intent.l r3 = r0.f275637c
            r4 = r23
            com.google.android.apps.gsa.x.c r4 = (com.google.android.apps.gsa.p8883x.C118826c) r4
            com.google.android.apps.gsa.staticplugins.customtabs.intent.b r3 = (com.google.android.apps.gsa.staticplugins.customtabs.intent.C98671b) r3
            com.google.common.base.ax r4 = r3.f275634b
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.staticplugins.customtabs.a.h r4 = (com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h) r4
            java.lang.String r5 = "com.google.android.apps.gsa.customtabs.EXTRA_REUSE_LAST_SESSION"
            r6 = 0
            boolean r5 = r2.getBooleanExtra(r5, r6)
            if (r5 == 0) goto L_0x0024
            com.google.android.apps.gsa.staticplugins.customtabs.b.q r5 = r1.f275647b
            com.google.android.apps.gsa.staticplugins.customtabs.b.y r5 = r5.f275478i
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            java.lang.String r10 = "com.google.android.apps.gsa.customtabs.SOURCE"
            r11 = 1
            if (r5 != 0) goto L_0x00e1
            com.google.android.apps.gsa.staticplugins.customtabs.b.q r5 = r1.f275647b
            com.google.android.libraries.d.ad r12 = r4.f57882c
            java.lang.String r12 = r12.mo25582b()
            com.google.android.libraries.d.u r13 = r5.f275477h
            com.google.android.apps.gsa.staticplugins.customtabs.b.y r14 = r5.f275479j
            if (r13 == 0) goto L_0x00e0
            if (r14 == 0) goto L_0x00e0
            com.google.android.libraries.d.z r15 = r14.f275506k
            com.google.android.libraries.d.u r15 = r15.f57938a
            java.lang.String r15 = r15.f57932a
            boolean r12 = android.text.TextUtils.equals(r15, r12)
            if (r12 == 0) goto L_0x00e0
            r5.f275478i = r14
            android.net.Uri r12 = r2.getData()
            r12.getClass()
            java.lang.String r12 = r12.toString()
            int r15 = r2.getIntExtra(r10, r6)
            com.google.common.o.rz r15 = com.google.common.p4552o.C60494rz.m92598a(r15)
            java.lang.String r7 = "disable_send_navigation_info"
            boolean r7 = r2.getBooleanExtra(r7, r6)
            com.google.common.base.ax r6 = com.google.android.apps.gsa.shared.logger.p7061g.C89917a.m146440a(r2)
            com.google.android.apps.gsa.search.core.j.f r17 = com.google.android.apps.gsa.search.core.p6807j.C86137f.f232804f
            com.google.protobuf.bn r17 = r17.createBuilder()
            r8 = r17
            com.google.android.apps.gsa.search.core.j.e r8 = (com.google.android.apps.gsa.search.core.p6807j.C86136e) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.search.core.j.f r9 = (com.google.android.apps.gsa.search.core.p6807j.C86137f) r9
            r12.getClass()
            int r0 = r9.f232806a
            r0 = r0 | r11
            r9.f232806a = r0
            r9.f232807b = r12
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.search.core.j.f r0 = (com.google.android.apps.gsa.search.core.p6807j.C86137f) r0
            int r9 = r0.f232806a
            r12 = 2
            r9 = r9 | r12
            r0.f232806a = r9
            r7 = r7 ^ r11
            r0.f232808c = r7
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.search.core.j.f r0 = (com.google.android.apps.gsa.search.core.p6807j.C86137f) r0
            int r7 = r15.f163762v
            r0.f232809d = r7
            int r7 = r0.f232806a
            r9 = 4
            r7 = r7 | r9
            r0.f232806a = r7
            com.google.android.apps.gsa.shared.logger.g.a r0 = r14.f275504i
            p3186j$.util.Objects.requireNonNull(r0)
            com.google.android.apps.gsa.staticplugins.customtabs.b.u r0 = new com.google.android.apps.gsa.staticplugins.customtabs.b.u
            r0.<init>()
            java.lang.Object r0 = r6.mo56108d(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.apps.gsa.search.core.j.f r0 = (com.google.android.apps.gsa.search.core.p6807j.C86137f) r0
            int r9 = r0.f232806a
            r9 = r9 | 8
            r0.f232806a = r9
            r0.f232810e = r6
            com.google.protobuf.bv r0 = r8.build()
            com.google.android.apps.gsa.search.core.j.f r0 = (com.google.android.apps.gsa.search.core.p6807j.C86137f) r0
            r14.mo91243a(r0)
            r14.f275516u = r11
            com.google.android.libraries.gsa.k.g r0 = r14.f275500e
            com.google.android.apps.gsa.staticplugins.customtabs.b.v r6 = new com.google.android.apps.gsa.staticplugins.customtabs.b.v
            r6.<init>(r14)
            java.lang.String r7 = "Initialize current URL"
            r0.mo28212l(r7, r6)
            r5.mo91233e(r13)
            r5 = r14
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            com.google.android.apps.gsa.staticplugins.customtabs.intent.p r0 = r1.f275651f
            com.google.common.base.ax r6 = r3.f275633a
            java.lang.Object r6 = r6.mo56107c()
            com.google.common.o.rx r6 = (com.google.common.p4552o.C60492rx) r6
            com.google.android.libraries.d.ad r7 = r4.f57882c
            java.lang.String r7 = r7.mo25582b()
            r7.getClass()
            if (r5 == 0) goto L_0x00fd
            com.google.android.libraries.d.z r8 = r5.f275506k
            androidx.browser.a.k r8 = r8.mo25663b()
            goto L_0x0102
        L_0x00fd:
            androidx.browser.a.k r8 = new androidx.browser.a.k
            r8.<init>()
        L_0x0102:
            android.content.Context r9 = r0.f275663a
            r12 = 2130772152(0x7f0100b8, float:1.7147414E38)
            r13 = 0
            r8.mo3585d(r9, r13, r12)
            com.google.android.apps.gsa.staticplugins.customtabs.a.i r9 = r4.f275308b
            boolean r9 = r9.f275311c
            if (r9 == 0) goto L_0x011b
            r9 = 27
            boolean r9 = r4.mo25587k(r9)
            if (r9 == 0) goto L_0x011b
            r9 = 1
            goto L_0x011c
        L_0x011b:
            r9 = 0
        L_0x011c:
            android.content.Context r12 = r0.f275663a
            android.content.res.Resources r12 = r12.getResources()
            dagger.a r13 = r0.f275664b
            java.lang.Object r13 = r13.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r13 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r13
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250587L
            boolean r13 = r13.mo79746e(r14)
            if (r13 == 0) goto L_0x0137
            r13 = 2
            r8.mo3583b(r13)
            goto L_0x014d
        L_0x0137:
            if (r9 == 0) goto L_0x013e
            r9 = 0
            r8.mo3583b(r9)
            goto L_0x014d
        L_0x013e:
            r9 = 2131100354(0x7f0602c2, float:1.7813087E38)
            int r9 = r12.getColor(r9)
            androidx.browser.a.a r12 = r8.f3068b
            r12.mo3569c(r9)
            r8.mo3583b(r11)
        L_0x014d:
            r8.mo3588g(r11)
            dagger.a r9 = r0.f275664b
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r9 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r9
            com.google.android.apps.gsa.shared.m.f r12 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250579D
            long r12 = r9.mo79743a(r12)
            r14 = 0
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x0181
            com.google.android.apps.gsa.search.core.ag.a.e r9 = r0.f275665c
            boolean r9 = r9.mo78133v()
            if (r9 != 0) goto L_0x0181
            android.widget.RemoteViews r9 = new android.widget.RemoteViews
            android.content.Context r12 = r0.f275663a
            java.lang.String r12 = r12.getPackageName()
            r13 = 2131624803(0x7f0e0363, float:1.8876796E38)
            r9.<init>(r12, r13)
            r12 = 0
            int[] r13 = new int[r12]
            r8.mo3586e(r9, r13)
            goto L_0x0182
        L_0x0181:
            r12 = 0
        L_0x0182:
            java.lang.String r9 = "com.google.android.gms.instantapps.DO_NOT_LAUNCH_INSTANT_APP"
            boolean r9 = r2.hasExtra(r9)
            if (r9 == 0) goto L_0x018c
            r8.f3071e = r12
        L_0x018c:
            androidx.browser.a.l r8 = r8.mo3582a()
            android.content.Intent r8 = r8.f3074a
            r2.putExtras(r8)
            java.lang.String r8 = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING"
            r2.putExtra(r8, r11)
            java.lang.String r8 = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON"
            r2.putExtra(r8, r11)
            android.content.Intent r8 = new android.content.Intent
            android.content.Context r9 = r0.f275663a
            java.lang.Class<com.google.android.ssb.service.SsbService> r12 = com.google.android.ssb.service.SsbService.class
            r8.<init>(r9, r12)
            java.lang.String r9 = "android.support.customtabs.extra.KEEP_ALIVE"
            r2.putExtra(r9, r8)
            java.lang.String r8 = "android.support.customtabs.extra.TINT_ACTION_BUTTON"
            r2.putExtra(r8, r11)
            r8 = 0
            int r9 = r2.getIntExtra(r10, r8)
            r8 = 9
            r12 = 3
            if (r9 == r12) goto L_0x01c1
            if (r9 != r8) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r9 = 0
            goto L_0x01c2
        L_0x01c1:
            r9 = 1
        L_0x01c2:
            com.google.android.apps.gsa.search.core.ag.a.e r13 = r0.f275665c
            boolean r13 = r13.mo78132u()
            java.lang.String r14 = "1"
            if (r13 != 0) goto L_0x01de
            if (r9 == 0) goto L_0x01fd
            dagger.a r9 = r0.f275664b
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r9 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r9
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250718x
            boolean r9 = r9.mo79746e(r13)
            if (r9 == 0) goto L_0x01fd
        L_0x01de:
            android.net.Uri r9 = r2.getData()
            if (r9 == 0) goto L_0x01f8
            com.google.android.apps.gsa.search.core.google.b r13 = r0.f275670h
            boolean r13 = r13.mo79502a(r9)
            if (r13 == 0) goto L_0x01f8
            java.lang.String r13 = "dd"
            java.lang.String r9 = r9.getQueryParameter(r13)
            boolean r9 = r14.equals(r9)
            if (r9 != 0) goto L_0x01fd
        L_0x01f8:
            java.lang.String r9 = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER"
            r2.putExtra(r9, r11)
        L_0x01fd:
            com.google.android.apps.gsa.search.core.ag.a.e r9 = r0.f275665c
            boolean r9 = r9.mo78077V()
            if (r9 == 0) goto L_0x0214
            com.google.android.apps.gsa.search.core.ag.a.e r9 = r0.f275665c
            com.google.common.b.gu r9 = r9.mo78115d()
            int[] r9 = com.google.common.p4575r.C60757n.m92752m(r9)
            java.lang.String r13 = "org.chromium.chrome.browser.customtabs.AGA_EXPERIMENT_IDS"
            r2.putExtra(r13, r9)
        L_0x0214:
            dagger.a r9 = r0.f275664b
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r9 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r9
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250577B
            boolean r9 = r9.mo79746e(r13)
            if (r9 == 0) goto L_0x0229
            java.lang.String r9 = "org.chromium.chrome.browser.init.DISABLE_STARTUP_TAB_PRELOADER"
            r2.putExtra(r9, r11)
        L_0x0229:
            r2.setPackage(r7)
            java.lang.String r9 = "com.google.android.apps.gsa.customtabs.EXTRA_LAUNCH_NEW_TASK_OVERRIDE"
            boolean r13 = r2.hasExtra(r9)
            if (r13 == 0) goto L_0x024b
            r13 = 0
            boolean r9 = r2.getBooleanExtra(r9, r13)
            if (r9 == 0) goto L_0x024b
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r9)
            r9 = 524288(0x80000, float:7.34684E-40)
            r2.addFlags(r9)
            r9 = 134217728(0x8000000, float:3.85186E-34)
            r2.addFlags(r9)
            goto L_0x0256
        L_0x024b:
            int r9 = r2.getFlags()
            r13 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r9 = r9 & r13
            r2.setFlags(r9)
        L_0x0256:
            java.lang.String r9 = "com.google.android.apps.gsa.customtabs.EXTRA_USE_PROVIDED_TRANSITION"
            r13 = 0
            boolean r9 = r2.getBooleanExtra(r9, r13)
            if (r9 != 0) goto L_0x0279
            java.lang.String r9 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION"
            r2.putExtra(r9, r12)
            android.content.Context r9 = r0.f275663a
            r13 = 2130772151(0x7f0100b7, float:1.7147412E38)
            r15 = 2130772019(0x7f010033, float:1.7147145E38)
            android.app.ActivityOptions r9 = android.app.ActivityOptions.makeCustomAnimation(r9, r13, r15)
            android.os.Bundle r9 = r9.toBundle()
            java.lang.String r13 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.CUSTOM_TRANSITION"
            r2.putExtra(r13, r9)
        L_0x0279:
            com.google.common.b.gu r9 = com.google.android.apps.gsa.shared.util.C90721ae.f253800i
            com.google.android.libraries.d.ad r13 = r4.f57882c
            java.lang.String r13 = r13.mo25582b()
            boolean r9 = r9.contains(r13)
            if (r9 == 0) goto L_0x02d2
            java.lang.String r9 = "com.android.chrome.extra.GSA_ACCOUNT_NAME_PENDING_INTENT"
            android.app.PendingIntent r13 = r0.f275667e
            r2.putExtra(r9, r13)
            java.lang.String r9 = "trusted_application_code_extra"
            android.app.PendingIntent r13 = r0.f275667e
            r2.putExtra(r9, r13)
            android.content.Context r9 = r0.f275663a
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r13 = "com.android.browser.application_id"
            r2.putExtra(r13, r9)
            r9 = 5
            boolean r9 = r4.mo25587k(r9)
            if (r9 == 0) goto L_0x02d2
            com.google.android.apps.gsa.staticplugins.customtabs.a.i r9 = r4.f275308b
            boolean r9 = r9.mo91195e()
            if (r9 != 0) goto L_0x02d2
            java.lang.String r9 = "com.android.chrome.extra.GSA_ACCOUNT_NAME"
            java.lang.String r13 = r4.mo91187h()
            r2.putExtra(r9, r13)
            android.content.Context r9 = r0.f275663a
            android.content.res.Resources r9 = r9.getResources()
            java.lang.Object[] r13 = new java.lang.Object[r11]
            java.lang.String r15 = "%s"
            r16 = 0
            r13[r16] = r15
            r15 = 2132092989(0x7f15283d, float:1.982639E38)
            java.lang.String r9 = r9.getString(r15, r13)
            java.lang.String r13 = "com.android.chrome.extra.ACCOUNT_MISMATCH_TOAST_MESSAGE"
            r2.putExtra(r13, r9)
        L_0x02d2:
            java.lang.String r9 = "com.google.android.apps.gsa.customtabs.PREFERRED_URL"
            java.lang.String r13 = r2.getStringExtra(r9)
            if (r13 == 0) goto L_0x02e4
            android.net.Uri r13 = android.net.Uri.parse(r13)
            r2.setData(r13)
            r2.removeExtra(r9)
        L_0x02e4:
            java.lang.String r9 = "com.google.android.apps.gsa.customtabs.EXTRA_DISABLE_ACTION_BUTTONS"
            r13 = 0
            boolean r9 = r2.getBooleanExtra(r9, r13)
            java.lang.String r15 = "android.support.customtabs.extra.TOOLBAR_ITEMS"
            if (r9 == 0) goto L_0x02f1
        L_0x02ef:
            r9 = 0
            goto L_0x0343
        L_0x02f1:
            com.google.android.apps.gsa.search.core.google.gaia.o r9 = r0.f275668f
            java.lang.String r9 = r9.mo79659F()
            if (r9 == 0) goto L_0x0303
            java.lang.String r9 = "com.google.android.apps.gsa.customtabs.EXTRA_REMOVE_SAVE_BUTTON"
            boolean r9 = r2.getBooleanExtra(r9, r13)
            if (r9 != 0) goto L_0x0303
            r9 = 1
            goto L_0x0304
        L_0x0303:
            r9 = 0
        L_0x0304:
            r8 = 18
            boolean r8 = r4.mo25587k(r8)
            if (r8 == 0) goto L_0x032f
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r9 == 0) goto L_0x031a
            android.os.Bundle r9 = r0.mo91260d(r2, r13)
            r8.add(r9)
        L_0x031a:
            int r9 = r8.size()
            r12 = 2
            if (r9 >= r12) goto L_0x032a
            android.os.Bundle r9 = r0.mo91261e(r13)
            r8.add(r13, r9)
            r9 = 1
            goto L_0x032b
        L_0x032a:
            r9 = 0
        L_0x032b:
            r2.putParcelableArrayListExtra(r15, r8)
            goto L_0x0343
        L_0x032f:
            java.lang.String r8 = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE"
            if (r9 == 0) goto L_0x033b
            android.os.Bundle r9 = r0.mo91260d(r2, r11)
            r2.putExtra(r8, r9)
            goto L_0x02ef
        L_0x033b:
            android.os.Bundle r9 = r0.mo91261e(r11)
            r2.putExtra(r8, r9)
            r9 = 1
        L_0x0343:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r9 != 0) goto L_0x0360
            android.content.Context r9 = r0.f275663a
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2132086059(0x7f150d2b, float:1.9812334E38)
            java.lang.String r9 = r9.getString(r12)
            java.lang.String r12 = "com.google.android.apps.gsa.broadcastreceiver.ACTION_CCT_SHARE_URL"
            android.os.Bundle r9 = r0.mo91259c(r12, r9)
            r8.add(r9)
        L_0x0360:
            android.content.Context r9 = r0.f275663a
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2132086054(0x7f150d26, float:1.9812324E38)
            java.lang.String r9 = r9.getString(r12)
            java.lang.String r12 = "com.google.android.apps.gsa.broadcastreceiver.ACTION_CCT_COPY_URL"
            android.os.Bundle r9 = r0.mo91259c(r12, r9)
            r8.add(r9)
            com.google.android.apps.gsa.search.core.aj.a.a r9 = r0.f275666d
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            r11 = 0
            r13 = 3
            android.content.Intent r9 = r9.mo78225h(r13, r11, r12)
            android.app.PendingIntent r9 = r0.mo91258a(r9)
            android.content.Context r11 = r0.f275663a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2132092075(0x7f1524ab, float:1.9824536E38)
            java.lang.String r11 = r11.getString(r12)
            android.os.Bundle r9 = com.google.android.apps.gsa.staticplugins.customtabs.intent.C98685p.m163472b(r9, r11)
            r8.add(r9)
            android.content.Context r9 = r0.f275663a
            android.app.PendingIntent r9 = com.google.android.apps.gsa.p5855h.p5858m.C74537b.m120511a(r9)
            android.content.Context r11 = r0.f275663a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2132086058(0x7f150d2a, float:1.9812332E38)
            java.lang.String r11 = r11.getString(r12)
            android.os.Bundle r9 = com.google.android.apps.gsa.staticplugins.customtabs.intent.C98685p.m163472b(r9, r11)
            r8.add(r9)
            com.google.android.apps.gsa.search.core.ag.a.e r9 = r0.f275665c
            boolean r9 = r9.mo78126o()
            if (r9 == 0) goto L_0x03d0
            android.content.Context r9 = r0.f275663a
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2132086057(0x7f150d29, float:1.981233E38)
            java.lang.String r9 = r9.getString(r11)
            java.lang.String r11 = "com.google.android.apps.gsa.broadcastreceiver.ACTION_CCT_PERSONAL_INFO_REMOVAL"
            android.os.Bundle r9 = r0.mo91259c(r11, r9)
            r8.add(r9)
        L_0x03d0:
            r9 = 0
            int r11 = r2.getIntExtra(r10, r9)
            r9 = 4
            if (r11 == r9) goto L_0x03dc
            r9 = 9
            if (r11 != r9) goto L_0x03f2
        L_0x03dc:
            android.content.Context r9 = r0.f275663a
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2132086055(0x7f150d27, float:1.9812326E38)
            java.lang.String r9 = r9.getString(r11)
            java.lang.String r11 = "com.google.android.apps.gsa.broadcastreceiver.ACTION_CCT_HELP"
            android.os.Bundle r9 = r0.mo91259c(r11, r9)
            r8.add(r9)
        L_0x03f2:
            r9 = 4
            boolean r4 = r4.mo25587k(r9)
            if (r4 != 0) goto L_0x0417
            com.google.common.o.rx r4 = com.google.common.p4552o.C60492rx.YES_IMPLICIT
            if (r6 == r4) goto L_0x0401
            com.google.common.o.rx r4 = com.google.common.p4552o.C60492rx.YES_OVERRIDE
            if (r6 != r4) goto L_0x0417
        L_0x0401:
            android.content.Context r4 = r0.f275663a
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2132086056(0x7f150d28, float:1.9812328E38)
            java.lang.String r4 = r4.getString(r6)
            java.lang.String r6 = "com.google.android.apps.gsa.broadcastreceiver.ACTION_CCT_REOPEN_URL"
            android.os.Bundle r4 = r0.mo91259c(r6, r4)
            r8.add(r4)
        L_0x0417:
            java.lang.String r4 = "android.support.customtabs.extra.MENU_ITEMS"
            r2.putParcelableArrayListExtra(r4, r8)
            com.google.android.apps.gsa.staticplugins.customtabs.b.a r4 = r0.f275669g
            java.lang.String r6 = "com.google.android.apps.gsa.customtabs.PREFERRED_REDIRECT_ENDPOINT"
            java.lang.String r8 = r2.getStringExtra(r6)
            r2.removeExtra(r6)
            if (r8 == 0) goto L_0x042e
            android.net.Uri r11 = android.net.Uri.parse(r8)
            goto L_0x042f
        L_0x042e:
            r11 = 0
        L_0x042f:
            android.net.Uri r6 = r2.getData()
            java.lang.String r8 = "android.support.customtabs.REDIRECT_ENDPOINT"
            if (r6 == 0) goto L_0x0562
            boolean r9 = r6.isHierarchical()
            if (r9 != 0) goto L_0x043f
            goto L_0x0562
        L_0x043f:
            android.net.Uri r9 = r6.normalizeScheme()
            com.google.android.apps.gsa.search.core.i.t r12 = r4.f275369a
            com.google.android.apps.gsa.shared.m.h r13 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250598W
            com.google.common.b.gu r12 = r12.mo79745c(r13)
            int r13 = r12.size()
            r18 = r15
            r15 = 0
        L_0x0452:
            if (r15 >= r13) goto L_0x055f
            java.lang.Object r19 = r12.get(r15)
            java.lang.String r19 = (java.lang.String) r19
            android.net.Uri r19 = android.net.Uri.parse(r19)
            r20 = r12
            java.lang.String r12 = r19.getAuthority()
            r12.getClass()
            r21 = r13
            java.lang.String r13 = r19.getScheme()
            r13.getClass()
            r19 = r3
            java.lang.String r3 = r9.getAuthority()
            boolean r3 = r12.equals(r3)
            if (r3 == 0) goto L_0x0555
            java.lang.String r3 = r9.getScheme()
            boolean r3 = r13.equals(r3)
            if (r3 == 0) goto L_0x0555
            java.lang.String r3 = "ae"
            java.lang.String r3 = r6.getQueryParameter(r3)
            if (r3 == 0) goto L_0x0566
            boolean r6 = r14.equals(r3)
            if (r6 == 0) goto L_0x04fe
            android.net.Uri r3 = r2.getData()
            com.google.common.base.C58893dc.m90996a(r3)
            com.google.android.apps.gsa.search.core.i.t r6 = r4.f275369a
            com.google.android.apps.gsa.shared.m.h r9 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250599X
            com.google.common.b.gu r6 = r6.mo79745c(r9)
            int r9 = r6.size()
            r12 = 0
        L_0x04a8:
            if (r12 >= r9) goto L_0x04ca
            java.lang.Object r13 = r6.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r3.getQueryParameter(r13)
            if (r13 == 0) goto L_0x04c7
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r15 = r13.getScheme()
            if (r15 == 0) goto L_0x04c7
            java.lang.String r15 = r13.getAuthority()
            if (r15 == 0) goto L_0x04c7
            goto L_0x04cb
        L_0x04c7:
            int r12 = r12 + 1
            goto L_0x04a8
        L_0x04ca:
            r13 = 0
        L_0x04cb:
            if (r13 == 0) goto L_0x0566
            android.net.Uri r3 = com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98595a.m163340a(r3)
            int r6 = r4.mo91205e(r5)
            r9 = 1
            if (r6 != r9) goto L_0x04f3
            if (r11 != 0) goto L_0x04db
            r11 = r13
        L_0x04db:
            r2.setData(r11)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r6 = "act"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r6, r14)
            java.lang.String r6 = "ri"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r6, r14)
            android.net.Uri r3 = r3.build()
            goto L_0x0549
        L_0x04f3:
            android.net.Uri r3 = com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98595a.m163341d(r3, r6)
            r2.setData(r3)
            r2.putExtra(r8, r13)
            goto L_0x0566
        L_0x04fe:
            java.lang.String r6 = "2"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0566
            com.google.android.apps.gsa.search.core.i.t r3 = r4.f275369a
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250601Z
            boolean r3 = r3.mo79746e(r6)
            if (r3 == 0) goto L_0x0566
            android.net.Uri r3 = r2.getData()
            com.google.common.base.C58893dc.m90996a(r3)
            android.net.Uri r3 = com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98595a.m163340a(r3)
            int r6 = r4.mo91205e(r5)
            r9 = 1
            if (r6 != r9) goto L_0x054d
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r9 = "&dct=1"
            java.lang.String r6 = r6.concat(r9)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r2.setData(r6)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "&act=1&ri=1"
            java.lang.String r3 = r3.concat(r6)
            android.net.Uri r3 = android.net.Uri.parse(r3)
        L_0x0549:
            r4.mo91203b(r2, r3)
            goto L_0x0566
        L_0x054d:
            android.net.Uri r3 = com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98595a.m163341d(r3, r6)
            r2.setData(r3)
            goto L_0x0566
        L_0x0555:
            int r15 = r15 + 1
            r3 = r19
            r12 = r20
            r13 = r21
            goto L_0x0452
        L_0x055f:
            r19 = r3
            goto L_0x0566
        L_0x0562:
            r19 = r3
            r18 = r15
        L_0x0566:
            r3 = 0
            int r4 = r2.getIntExtra(r10, r3)
            r3 = 3
            if (r4 != r3) goto L_0x0574
            java.lang.String r3 = "com.google.android.search.core.extra.EXTRA_STAY_BOUND_TO_SERVICE_AFTER_INTENT_LAUNCH"
            r4 = 1
            r2.putExtra(r3, r4)
        L_0x0574:
            if (r5 != 0) goto L_0x0578
            r3 = 1
            goto L_0x0579
        L_0x0578:
            r3 = 0
        L_0x0579:
            java.lang.String r4 = "com.google.android.apps.gsa.customtabs.LOG_NO_SESSION_APP_FLOW"
            r2.putExtra(r4, r3)
            if (r5 == 0) goto L_0x0591
            java.lang.String r3 = "com.google.android.apps.gsa.customtabs.AMP_HEADER"
            r4 = 0
            boolean r6 = r2.getBooleanExtra(r3, r4)
            r2.removeExtra(r3)
            com.google.android.libraries.d.z r3 = r5.f275506k
            com.google.android.libraries.d.y r4 = r3.f57941d
            r4.mo25661a(r3, r6)
        L_0x0591:
            dagger.a r3 = r0.f275664b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250591P
            boolean r3 = r3.mo79746e(r4)
            java.lang.String r4 = "com.google.chrome.transition_type"
            if (r3 == 0) goto L_0x05ad
            r2.removeExtra(r4)
            java.lang.String r3 = "androidx.browser.customtabs.extra.HIDE_VISITS_FROM_CCT"
            r6 = 1
            r2.putExtra(r3, r6)
            goto L_0x05c6
        L_0x05ad:
            r6 = 1
            dagger.a r3 = r0.f275664b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250590O
            boolean r3 = r3.mo79746e(r9)
            if (r3 == 0) goto L_0x05c6
            r2.removeExtra(r4)
            java.lang.String r3 = "androidx.browser.customtabs.extra.HIDE_OMNIBOX_SUGGESTIONS_FROM_CCT"
            r2.putExtra(r3, r6)
        L_0x05c6:
            dagger.a r3 = r0.f275664b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250720z
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x05db
            java.lang.String r3 = "androidx.browser.customtabs.extra.BLOCK_NEW_NOTIFICATION_REQUESTS_IN_CCT"
            r2.putExtra(r3, r6)
        L_0x05db:
            dagger.a r3 = r0.f275664b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250588M
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x05f0
            java.lang.String r3 = "androidx.browser.customtabs.extra.HIDE_OPEN_IN_CHROME_MENU_ITEM"
            r2.putExtra(r3, r6)
        L_0x05f0:
            dagger.a r3 = r0.f275664b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250589N
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0605
            java.lang.String r3 = "androidx.browser.customtabs.extra.HIDE_OPEN_IN_CHROME_MENU_ITEM_IN_CONTEXT_MENU"
            r2.putExtra(r3, r6)
        L_0x0605:
            dagger.a r3 = r0.f275664b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r3 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r3
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250596U
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x064f
            android.content.Context r3 = r0.f275663a
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            r4 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0625 }
            long r14 = androidx.core.content.p090a.C1846a.m5060a(r3)     // Catch:{ NameNotFoundException -> 0x0625 }
            goto L_0x0628
        L_0x0625:
            r14 = 0
        L_0x0628:
            dagger.a r0 = r0.f275664b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250595T
            long r3 = r0.mo79743a(r3)
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x064f
            java.lang.String r0 = "com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB"
            r3 = 1
            r2.putExtra(r0, r3)
            java.lang.String r0 = "org.chromium.chrome.browser.customtabs.FORCE_ENABLE_FOR_EXPERIMENT"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "org.chromium.chrome.browser.customtabs.HIDE_INCOGNITO_ICON"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "org.chromium.chrome.browser.customtabs.USE_NORMAL_PROFILE_STYLE"
            r2.putExtra(r0, r3)
        L_0x064f:
            android.content.SharedPreferences r0 = r1.f275649d
            java.lang.String r3 = "has_custom_tabs_first_run_experience_shown"
            r13 = 0
            boolean r0 = r0.getBoolean(r3, r13)
            if (r0 != 0) goto L_0x0674
            com.google.android.libraries.gsa.k.g r0 = r1.f275653h
            com.google.android.apps.gsa.staticplugins.customtabs.intent.e r4 = new com.google.android.apps.gsa.staticplugins.customtabs.intent.e
            r4.<init>(r1)
            java.lang.String r6 = "Web settings toast"
            r0.mo28212l(r6, r4)
            android.content.SharedPreferences r0 = r1.f275649d
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r4 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r4)
            r0.apply()
        L_0x0674:
            com.google.android.apps.gsa.staticplugins.customtabs.intent.o r0 = r1.f275652g
            r3 = r19
            com.google.common.base.ax r1 = r3.f275633a
            java.lang.Object r1 = r1.mo56107c()
            com.google.common.o.rx r1 = (com.google.common.p4552o.C60492rx) r1
            com.google.common.o.uf r1 = com.google.android.apps.gsa.staticplugins.customtabs.intent.C98684o.m163471a(r2, r1)
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1
            com.google.protobuf.bv r3 = r1.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            com.google.common.o.sa r3 = r3.f164103aJ
            if (r3 != 0) goto L_0x0694
            com.google.common.o.sa r3 = com.google.common.p4552o.C60496sa.f163764k
        L_0x0694:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.common.o.rv r3 = (com.google.common.p4552o.C60490rv) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.sa r4 = (com.google.common.p4552o.C60496sa) r4
            int r6 = r4.f163766a
            r7 = 1
            r6 = r6 | r7
            r4.f163766a = r6
            r4.f163767b = r7
            boolean r4 = r2.hasExtra(r8)
            java.lang.String r6 = "android.support.customtabs.PARALLEL_REQUEST_URL"
            if (r4 != 0) goto L_0x06ba
            boolean r4 = r2.hasExtra(r6)
            if (r4 == 0) goto L_0x06b8
            goto L_0x06ba
        L_0x06b8:
            r4 = 0
            goto L_0x06bb
        L_0x06ba:
            r4 = 1
        L_0x06bb:
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.common.o.sa r7 = (com.google.common.p4552o.C60496sa) r7
            int r8 = r7.f163766a
            r8 = r8 | 8
            r7.f163766a = r8
            r7.f163770e = r4
            if (r5 == 0) goto L_0x06fe
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.sa r4 = (com.google.common.p4552o.C60496sa) r4
            int r7 = r4.f163766a
            r7 = r7 | 64
            r4.f163766a = r7
            r7 = 1
            r4.f163773h = r7
            boolean r4 = r5.f275508m
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.common.o.sa r7 = (com.google.common.p4552o.C60496sa) r7
            int r8 = r7.f163766a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7.f163766a = r8
            r7.f163774i = r4
            boolean r4 = r5.f275509n
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.common.o.sa r7 = (com.google.common.p4552o.C60496sa) r7
            int r8 = r7.f163766a
            r8 = r8 | 16
            r7.f163766a = r8
            r7.f163771f = r4
        L_0x06fe:
            boolean r4 = r2.hasExtra(r6)
            if (r4 == 0) goto L_0x0714
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.sa r4 = (com.google.common.p4552o.C60496sa) r4
            int r6 = r4.f163766a
            r6 = r6 | 32
            r4.f163766a = r6
            r6 = 1
            r4.f163772g = r6
        L_0x0714:
            r4 = r18
            java.util.ArrayList r4 = r2.getParcelableArrayListExtra(r4)
            if (r4 == 0) goto L_0x0747
            int r6 = r4.size()
        L_0x0720:
            if (r13 >= r6) goto L_0x0747
            int r7 = r13 + 1
            java.lang.Object r8 = r4.get(r13)
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r9 = "android.support.customtabs.customaction.ID"
            int r8 = r8.getInt(r9)
            r9 = 102(0x66, float:1.43E-43)
            if (r8 != r9) goto L_0x0745
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.sa r4 = (com.google.common.p4552o.C60496sa) r4
            int r6 = r4.f163766a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r4.f163766a = r6
            r8 = 1
            r4.f163775j = r8
            goto L_0x0747
        L_0x0745:
            r13 = r7
            goto L_0x0720
        L_0x0747:
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.sa r3 = (com.google.common.p4552o.C60496sa) r3
            r3.getClass()
            r4.f164103aJ = r3
            int r3 = r4.f164250e
            r6 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r6
            r4.f164250e = r3
            com.google.protobuf.bv r3 = r1.build()
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            r4 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r3, r4, r4, r4)
            com.google.android.apps.gsa.staticplugins.customtabs.b.ab r0 = r0.f275662a
            long r9 = android.os.SystemClock.uptimeMillis()
            com.google.common.base.ax r11 = com.google.android.apps.gsa.shared.logger.p7061g.C89917a.m146440a(r2)
            com.google.protobuf.bv r1 = r1.instance
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            long r12 = r1.f164261p
            if (r5 == 0) goto L_0x0786
            com.google.android.libraries.d.z r1 = r5.f275506k
            com.google.android.libraries.d.u r1 = r1.f57938a
            java.lang.Integer r7 = r1.mo25584iG()
            r14 = r7
            goto L_0x0787
        L_0x0786:
            r14 = r4
        L_0x0787:
            com.google.android.apps.gsa.staticplugins.customtabs.b.aa r1 = new com.google.android.apps.gsa.staticplugins.customtabs.b.aa
            g.a.a r3 = r0.f275380a
            dagger.a.l r3 = (dagger.p5294a.C68226l) r3
            g.a.a r3 = r3.f184585a
            dagger.a r7 = dagger.p5294a.C68219e.m98518a(r3)
            r7.getClass()
            g.a.a r0 = r0.f275381b
            java.lang.Object r0 = r0.mo17428b()
            r8 = r0
            com.google.android.libraries.f.a r8 = (com.google.android.libraries.p1730f.C21370a) r8
            r8.getClass()
            r6 = r1
            r6.<init>(r7, r8, r9, r11, r12, r14)
            if (r5 == 0) goto L_0x07aa
            r5.f275511p = r1
        L_0x07aa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.customtabs.intent.C98673d.apply(java.lang.Object):java.lang.Object");
    }
}
