package com.google.android.apps.search.fedora.p10094c;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.fedora.c.l */
/* compiled from: PG */
public final /* synthetic */ class C132737l implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C132738m f362162a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f362163b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f362164c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f362165d;

    public /* synthetic */ C132737l(C132738m mVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f362162a = mVar;
        this.f362163b = cxVar;
        this.f362164c = cxVar2;
        this.f362165d = cxVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ee, code lost:
        if (r8 != false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r13 = this;
            com.google.android.apps.search.fedora.c.m r0 = r13.f362162a
            com.google.common.util.concurrent.cx r1 = r13.f362163b
            com.google.common.util.concurrent.cx r2 = r13.f362164c
            com.google.common.util.concurrent.cx r3 = r13.f362165d
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r1)
            com.google.android.apps.search.fedora.e.ar r1 = (com.google.android.apps.search.fedora.p10099e.C132787ar) r1
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            com.google.android.apps.search.fedora.e.ad r2 = (com.google.android.apps.search.fedora.p10099e.C132773ad) r2
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0033
            com.google.common.f.e r3 = com.google.android.apps.search.fedora.p10094c.C132738m.f362166a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Ekho dir cannot be provided for empty accounts."
            r8 = 39808(0x9b80, float:5.5783E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r8)).mo56386p(r4)
            r3 = 0
            goto L_0x0056
        L_0x0033:
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]
            android.content.Context r8 = r0.f362167b
            java.io.File r8 = r8.getNoBackupFilesDir()
            java.lang.String r8 = r8.getAbsolutePath()
            r4[r6] = r8
            java.lang.String r8 = "fedass"
            r4[r7] = r8
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r6] = r3
            java.lang.String r3 = "training_cache_%s"
            java.lang.String r3 = java.lang.String.format(r3, r8)
            r4[r5] = r3
            java.lang.String r3 = com.google.common.util.C60790c.m92793a(r4)
        L_0x0056:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0062
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x01db
        L_0x0062:
            com.google.speech.m.aa r4 = com.google.speech.p5228m.C67270aa.f182856g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.speech.m.z r4 = (com.google.speech.p5228m.C67362z) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.speech.m.aa r8 = (com.google.speech.p5228m.C67270aa) r8
            r3.getClass()
            int r9 = r8.f182858a
            r9 = r9 | r7
            r8.f182858a = r9
            r8.f182859b = r3
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.speech.m.aa r3 = (com.google.speech.p5228m.C67270aa) r3
            int r8 = r3.f182858a
            r8 = r8 | r5
            r3.f182858a = r8
            r3.f182860c = r7
            com.google.android.apps.search.fedora.e.ao r3 = r1.f362285c
            if (r3 != 0) goto L_0x008f
            com.google.android.apps.search.fedora.e.ao r3 = com.google.android.apps.search.fedora.p10099e.C132784ao.f362255t
        L_0x008f:
            boolean r8 = r3.f362258b
            if (r8 == 0) goto L_0x00f1
            com.google.android.apps.search.fedora.g.b r8 = r0.f362168c
            j$.util.Optional r9 = r8.f362496b
            boolean r9 = r9.isPresent()
            if (r9 == 0) goto L_0x00bb
            j$.util.Optional r8 = r8.f362496b
            java.lang.Object r8 = r8.get()
            com.google.android.apps.search.fedora.g.a r8 = (com.google.android.apps.search.fedora.p10101g.C132852a) r8
            boolean r8 = r8.mo110922a()
            if (r8 == 0) goto L_0x00bb
            com.google.common.f.e r6 = com.google.android.apps.search.fedora.p10101g.C132871b.f362495a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r8 = "getFlSettingEnabledWithOverride: true"
            r9 = 39860(0x9bb4, float:5.5856E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56386p(r8)
        L_0x00b9:
            r6 = 1
            goto L_0x00f1
        L_0x00bb:
            com.google.android.apps.search.fedora.e.ao r8 = r1.f362285c
            if (r8 != 0) goto L_0x00c1
            com.google.android.apps.search.fedora.e.ao r8 = com.google.android.apps.search.fedora.p10099e.C132784ao.f362255t
        L_0x00c1:
            boolean r8 = r8.f362262f
            if (r8 == 0) goto L_0x00d4
            com.google.common.f.e r6 = com.google.android.apps.search.fedora.p10101g.C132871b.f362495a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r8 = "getFlSettingEnabledWithDogfood: true"
            r9 = 39859(0x9bb3, float:5.5854E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56386p(r8)
            goto L_0x00b9
        L_0x00d4:
            com.google.android.apps.search.fedora.e.af r8 = r2.f362228b
            if (r8 != 0) goto L_0x00da
            com.google.android.apps.search.fedora.e.af r8 = com.google.android.apps.search.fedora.p10099e.C132775af.f362231g
        L_0x00da:
            boolean r8 = r8.f362234b
            com.google.common.f.e r9 = com.google.android.apps.search.fedora.p10101g.C132871b.f362495a
            com.google.common.f.x r9 = r9.mo56224b()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            r11 = 39858(0x9bb2, float:5.5853E-41)
            java.lang.String r12 = "getFlSettingEnabledWithSettingsToggle: %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r11)).mo56389s(r12, r10)
            if (r8 == 0) goto L_0x00f1
            goto L_0x00b9
        L_0x00f1:
            com.google.speech.m.e r8 = com.google.speech.p5228m.C67341e.f183034i
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.speech.m.a r8 = (com.google.speech.p5228m.C67251a) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.speech.m.e r9 = (com.google.speech.p5228m.C67341e) r9
            int r10 = r9.f183037a
            r10 = r10 | r7
            r9.f183037a = r10
            r9.f183038b = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.speech.m.e r9 = (com.google.speech.p5228m.C67341e) r9
            int r10 = r9.f183037a
            r10 = r10 | r5
            r9.f183037a = r10
            r9.f183039c = r6
            com.google.protobuf.dn r6 = r3.f362261e
            java.util.Map r6 = java.util.Collections.unmodifiableMap(r6)
            r8.mo59781a(r6)
            long r9 = r3.f362263g
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.speech.m.e r3 = (com.google.speech.p5228m.C67341e) r3
            int r6 = r3.f183037a
            r6 = r6 | 8
            r3.f183037a = r6
            r3.f183042f = r9
            boolean r3 = r1.f362288f
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.speech.m.e r6 = (com.google.speech.p5228m.C67341e) r6
            int r9 = r6.f183037a
            r9 = r9 | 32
            r6.f183037a = r9
            r6.f183043g = r3
            com.google.android.apps.search.fedora.e.ao r3 = r1.f362285c
            if (r3 != 0) goto L_0x0146
            com.google.android.apps.search.fedora.e.ao r3 = com.google.android.apps.search.fedora.p10099e.C132784ao.f362255t
        L_0x0146:
            int r3 = r3.f362274r
            int r3 = com.google.speech.p5228m.C67340d.m97452a(r3)
            if (r3 != 0) goto L_0x014f
            r3 = 1
        L_0x014f:
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.speech.m.e r6 = (com.google.speech.p5228m.C67341e) r6
            int r3 = r3 + -1
            r6.f183044h = r3
            int r3 = r6.f183037a
            r3 = r3 | 64
            r6.f183037a = r3
            com.google.protobuf.bv r3 = r8.build()
            com.google.speech.m.e r3 = (com.google.speech.p5228m.C67341e) r3
            com.google.speech.m.s r6 = com.google.speech.p5228m.C67355s.f183081a
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.speech.m.r r6 = (com.google.speech.p5228m.C67354r) r6
            com.google.protobuf.bt r8 = com.google.speech.p5228m.C67341e.f183035j
            r6.mo58885m(r8, r3)
            com.google.protobuf.bv r3 = r6.build()
            com.google.speech.m.s r3 = (com.google.speech.p5228m.C67355s) r3
            com.google.speech.m.ac r6 = com.google.speech.p5228m.C67272ac.f182865c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.speech.m.ab r6 = (com.google.speech.p5228m.C67271ab) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.speech.m.ac r8 = (com.google.speech.p5228m.C67272ac) r8
            r3.getClass()
            r8.f182868b = r3
            int r3 = r8.f182867a
            r3 = r3 | r5
            r8.f182867a = r3
            com.google.protobuf.bv r3 = r6.build()
            com.google.speech.m.ac r3 = (com.google.speech.p5228m.C67272ac) r3
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.speech.m.aa r5 = (com.google.speech.p5228m.C67270aa) r5
            r3.getClass()
            r5.f182862e = r3
            int r3 = r5.f182858a
            r3 = r3 | 32
            r5.f182858a = r3
            com.google.android.apps.search.fedora.c.a.a r0 = r0.f362169d
            com.google.speech.m.cn r0 = r0.mo110895a(r1, r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.speech.m.aa r1 = (com.google.speech.p5228m.C67270aa) r1
            r0.getClass()
            r1.f182861d = r0
            int r0 = r1.f182858a
            r0 = r0 | 8
            r1.f182858a = r0
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.speech.m.aa r0 = (com.google.speech.p5228m.C67270aa) r0
            int r1 = r0.f182858a
            r1 = r1 | 64
            r0.f182858a = r1
            r0.f182863f = r7
            com.google.protobuf.bv r0 = r4.build()
            com.google.speech.m.aa r0 = (com.google.speech.p5228m.C67270aa) r0
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x01db:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.fedora.p10094c.C132737l.call():java.lang.Object");
    }
}
