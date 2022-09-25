package com.google.android.apps.gsa.staticplugins.p7444be;

import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.be.b */
/* compiled from: PG */
public final /* synthetic */ class C94543b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94552k f264434a;

    /* renamed from: b */
    public final /* synthetic */ aaj f264435b;

    /* renamed from: c */
    public final /* synthetic */ ClientConfig f264436c;

    /* renamed from: d */
    public final /* synthetic */ boolean f264437d;

    /* renamed from: e */
    public final /* synthetic */ boolean f264438e;

    public /* synthetic */ C94543b(C94552k kVar, aaj aaj, ClientConfig clientConfig, boolean z, boolean z2) {
        this.f264434a = kVar;
        this.f264435b = aaj;
        this.f264436c = clientConfig;
        this.f264437d = z;
        this.f264438e = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.apps.gsa.staticplugins.be.k r1 = r0.f264434a
            com.google.android.apps.gsa.search.shared.service.b.aaj r2 = r0.f264435b
            com.google.android.apps.gsa.search.shared.service.ClientConfig r3 = r0.f264436c
            boolean r5 = r0.f264437d
            boolean r6 = r0.f264438e
            r4 = r19
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            boolean r10 = r2.f237083g
            int r7 = r2.f237077a
            r8 = r7 & 64
            if (r8 == 0) goto L_0x0020
            java.lang.String r8 = r2.f237084h
            r12 = r8
            goto L_0x0021
        L_0x0020:
            r12 = 0
        L_0x0021:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x002d
            java.lang.String r7 = r2.f237082f
            android.net.Uri r7 = android.net.Uri.parse(r7)
            r9 = r7
            goto L_0x002e
        L_0x002d:
            r9 = 0
        L_0x002e:
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r7 = r1.f264476r
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.aj.aw r7 = (com.google.android.apps.gsa.search.core.p6513aj.C84538aw) r7
            boolean r8 = r7.mo78249e()
            java.lang.String r13 = "search"
            java.lang.String r14 = "opa"
            if (r8 == 0) goto L_0x0056
            boolean r8 = r7.mo78248d()
            if (r8 == 0) goto L_0x0054
            com.google.android.apps.gsa.search.core.state.a.i r8 = r7.f230058c
            boolean r8 = r8.mo80453e()
            boolean r7 = r7.mo78250f(r8)
            if (r7 == 0) goto L_0x0056
        L_0x0054:
            r7 = r14
            goto L_0x0057
        L_0x0056:
            r7 = r13
        L_0x0057:
            dagger.a r8 = r1.f264476r
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.search.core.aj.aw r8 = (com.google.android.apps.gsa.search.core.p6513aj.C84538aw) r8
            com.google.android.apps.gsa.search.core.aj.aa r15 = r8.f230057b
            boolean r15 = r15.mo78230d()
            if (r5 != 0) goto L_0x0074
            if (r4 != 0) goto L_0x0074
            if (r15 == 0) goto L_0x0074
            boolean r4 = r8.mo78248d()
            if (r4 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r15 = 0
            goto L_0x0075
        L_0x0074:
            r15 = 1
        L_0x0075:
            java.lang.String r8 = "HandsFreeWorker"
            if (r15 == 0) goto L_0x00b2
            dagger.a r4 = r1.f264478t
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.util.permissions.d r4 = (com.google.android.apps.gsa.shared.util.permissions.C91077d) r4
            com.google.android.apps.gsa.shared.util.permissions.a.a r4 = r4.f254356c
            java.lang.String r11 = "android.permission.RECORD_AUDIO"
            boolean r4 = r4.mo85346a(r11)
            if (r4 != 0) goto L_0x00b2
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p7444be.C94552k.f264451a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r8)
            java.lang.String r3 = "RECORD_AUDIO permission not granted; asking..."
            r4 = 20154(0x4eba, float:2.8242E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            dagger.a r2 = r1.f264465g
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.ak.a.r r2 = (com.google.android.apps.gsa.search.core.p6517ak.p6518a.C84591r) r2
            r3 = 2132091069(0x7f1520bd, float:1.9822496E38)
            r2.mo78355g(r3)
            com.google.android.apps.gsa.handsfree.k r1 = r1.f264484z
            r1.g()
            goto L_0x0431
        L_0x00b2:
            boolean r4 = r1.mo88497f()
            if (r4 != 0) goto L_0x0431
            if (r5 != 0) goto L_0x00c4
            if (r15 == 0) goto L_0x00fe
            com.google.android.apps.gsa.search.core.state.a.i r4 = r1.f264477s
            boolean r4 = r4.mo80452c()
            if (r4 == 0) goto L_0x00fe
        L_0x00c4:
            boolean r4 = r7.equals(r14)
            if (r4 != 0) goto L_0x00fe
            dagger.a r4 = r1.f264466h
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r4 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r4
            java.lang.String r4 = r4.mo79659F()
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L_0x00fe
            android.content.Context r11 = r1.f264463c
            r17 = r8
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r0 = com.google.android.apps.gsa.shared.util.C91035f.m148708d(r4)
            r4 = 0
            r8[r4] = r0
            r0 = 2132092261(0x7f152565, float:1.9824913E38)
            java.lang.String r0 = r11.getString(r0, r8)
            com.google.android.libraries.gsa.k.g r4 = r1.f264473o
            com.google.android.apps.gsa.staticplugins.be.c r8 = new com.google.android.apps.gsa.staticplugins.be.c
            r8.<init>(r1, r0)
            java.lang.String r0 = "showAudioAccountToast"
            r4.mo28212l(r0, r8)
            goto L_0x0100
        L_0x00fe:
            r17 = r8
        L_0x0100:
            boolean r0 = r7.equals(r13)
            r11 = 2
            if (r0 == 0) goto L_0x01b2
            com.google.android.apps.gsa.search.core.service.af r0 = r1.f264462b
            com.google.android.apps.gsa.search.core.service.r r0 = r0.f233977l
            if (r0 == 0) goto L_0x0110
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = r0.f234384f
            goto L_0x0112
        L_0x0110:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = com.google.android.apps.gsa.search.shared.service.ClientConfig.f236948a
        L_0x0112:
            if (r0 == 0) goto L_0x011e
            boolean r8 = r4.mo81876F()
            if (r8 == 0) goto L_0x011b
            goto L_0x011e
        L_0x011b:
            r16 = 0
            goto L_0x0120
        L_0x011e:
            r16 = 1
        L_0x0120:
            java.lang.String r4 = r4.f236953f
            boolean r4 = r7.equals(r4)
            r8 = 1
            r4 = r4 ^ r8
            r4 = r16 | r4
            com.google.android.apps.gsa.search.core.i.t r8 = r1.f264481w
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250649au
            boolean r8 = r8.mo79746e(r13)
            if (r8 == 0) goto L_0x013e
            if (r12 == 0) goto L_0x0431
            java.lang.String r8 = "and.gsa.eyesfree.proxyvoice"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x0431
        L_0x013e:
            if (r4 == 0) goto L_0x0188
            com.google.android.apps.gsa.search.shared.service.c.b.bq r0 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88446bq.f239115d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.bp r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88445bp) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bq r3 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88446bq) r3
            int r4 = r3.f239117a
            r5 = 1
            r4 = r4 | r5
            r3.f239117a = r4
            r3.f239118b = r15
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.search.shared.service.c.b.bq r3 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88446bq) r3
            r2.getClass()
            r3.f239119c = r2
            int r2 = r3.f239117a
            r2 = r2 | r11
            r3.f239117a = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.search.shared.service.c.b.bq r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88446bq) r0
            com.google.android.apps.gsa.search.shared.service.c.b.bb r2 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb.f239082a
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.search.shared.service.c.b.ba r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba) r2
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88447br.f239120a
            r2.mo58885m(r3, r0)
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.gsa.search.shared.service.c.b.bb r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb) r0
            com.google.android.apps.gsa.search.core.service.e.q r1 = r1.f264483y
            r1.mo80275j(r7, r0)
            goto L_0x0431
        L_0x0188:
            dagger.a r1 = r1.f264476r
            java.lang.Object r1 = r1.mo27525b()
            r4 = r1
            com.google.android.apps.gsa.search.core.aj.aw r4 = (com.google.android.apps.gsa.search.core.p6513aj.C84538aw) r4
            boolean r7 = r3.mo81876F()
            r8 = r15
            com.google.android.apps.gsa.shared.search.Query r1 = r4.mo78247c(r5, r6, r7, r8, r9, r10)
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.HANDS_FREE_QUERY_COMMIT
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r4)
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.aah.f237074a
            r3.mo82014b(r4, r2)
            r3.mo82015c(r1)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r1 = r3.mo82013a()
            r0.mo80387i(r1)
            goto L_0x0431
        L_0x01b2:
            dagger.a r0 = r1.f264476r
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.aj.aw r0 = (com.google.android.apps.gsa.search.core.p6513aj.C84538aw) r0
            r4 = r0
            r7 = r15
            r2 = r17
            r8 = r9
            r9 = r10
            com.google.android.apps.gsa.shared.search.Query r4 = r4.mo78245a(r5, r6, r7, r8, r9)
            com.google.common.base.ax r0 = r0.f230056a
            com.google.common.base.bk r0 = (com.google.common.base.C58847bk) r0
            java.lang.Object r0 = r0.f156646a
            com.google.android.apps.gsa.assistant.shared.bd r0 = (com.google.android.apps.gsa.assistant.shared.bd) r0
            com.google.android.apps.gsa.shared.search.Query r0 = r0.j(r4)
            java.lang.String r4 = "android.opa.extra.MINI_PLATE_ENABLED"
            boolean r5 = r0.mo84363bw(r4)
            r6 = 3
            if (r5 == 0) goto L_0x01dd
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84342ba(r6)
        L_0x01dd:
            if (r15 == 0) goto L_0x01f6
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r7 = "user-agent-suffix"
            java.lang.String r8 = "opa-screenless"
            r5.putString(r7, r8)
            java.lang.String r7 = "android.opa.extra.TRIGGERED_BY_HEADSET"
            r8 = 1
            r5.putBoolean(r7, r8)
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84307as(r5)
            goto L_0x01f7
        L_0x01f6:
            r8 = 1
        L_0x01f7:
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84244G(r8)
            com.google.common.base.ax r5 = r1.f264453B
            boolean r5 = r5.mo56113h()
            if (r5 == 0) goto L_0x0239
            dagger.a r5 = r1.f264479u
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.l.a r5 = (com.google.android.apps.gsa.search.core.p6809l.C86152a) r5
            com.google.android.apps.gsa.search.core.l.j r5 = r5.f232820b
            java.lang.String r5 = r5.mo79804a()
            if (r5 == 0) goto L_0x0239
            com.google.common.base.ax r7 = r1.f264453B
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.assistant.shared.bd r7 = (com.google.android.apps.gsa.assistant.shared.bd) r7
            boolean r7 = r7.o(r5)
            if (r7 == 0) goto L_0x0227
            java.lang.String r7 = "android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME"
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84278aO(r7, r5)
        L_0x0227:
            com.google.common.base.ax r7 = r1.f264453B
            java.lang.Object r7 = r7.mo56107c()
            com.google.android.apps.gsa.assistant.shared.bd r7 = (com.google.android.apps.gsa.assistant.shared.bd) r7
            int r5 = r7.i(r5)
            java.lang.String r7 = "android.opa.extra.LAUNCHED_ON"
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84311aw(r7, r5)
        L_0x0239:
            boolean r5 = r3.mo81876F()
            if (r5 != 0) goto L_0x0245
            boolean r5 = r3.mo81904u()
            if (r5 != 0) goto L_0x027f
        L_0x0245:
            dagger.a r5 = r1.f264479u
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.l.a r5 = (com.google.android.apps.gsa.search.core.p6809l.C86152a) r5
            com.google.android.apps.gsa.search.core.l.j r5 = r5.f232820b
            java.lang.String r5 = r5.mo79804a()
            if (r5 == 0) goto L_0x0272
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r8 = "android.intent.extra.ASSIST_PACKAGE"
            r7.putString(r8, r5)
            boolean r8 = r0.mo84403cj()
            if (r8 == 0) goto L_0x0273
            boolean r8 = r3.mo81904u()
            if (r8 != 0) goto L_0x0273
            java.lang.String r8 = "android.opa.extra.FOREGROUND_APP_TRIGGERED_ON"
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84278aO(r8, r5)
            goto L_0x0273
        L_0x0272:
            r7 = 0
        L_0x0273:
            com.google.android.apps.gsa.search.core.state.dd r5 = r1.f264475q
            com.google.android.apps.gsa.search.shared.service.c.a r8 = new com.google.android.apps.gsa.search.shared.service.c.a
            r9 = 100
            r8.<init>(r9, r14)
            r5.mo80620e(r8, r7)
        L_0x027f:
            boolean r5 = r0.mo84337bV()
            if (r5 != 0) goto L_0x02e6
            boolean r5 = r3.mo81904u()
            if (r5 == 0) goto L_0x02b7
            com.google.android.apps.gsa.search.core.service.af r5 = r1.f264462b
            com.google.android.apps.gsa.search.core.state.cu r5 = r5.f233970e
            com.google.android.apps.gsa.search.core.state.a.j r5 = r5.mo80560b(r14)
            com.google.android.apps.gsa.shared.search.Query r5 = r5.mo80460i()
            java.lang.String r5 = r5.mo84355bn()
            if (r5 == 0) goto L_0x02a4
            android.os.Bundle r2 = android.os.Bundle.EMPTY
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84264aA(r5, r2)
            goto L_0x02ee
        L_0x02a4:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.p7444be.C94552k.f264451a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r2)
            java.lang.String r2 = "Source missing for committed OPA query"
            r6 = 20152(0x4eb8, float:2.8239E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r6)).mo56386p(r2)
            goto L_0x02ee
        L_0x02b7:
            boolean r2 = r0.mo84463dq()
            if (r2 == 0) goto L_0x02c0
            java.lang.String r2 = "and.opa.wired"
            goto L_0x02cb
        L_0x02c0:
            boolean r2 = r0.mo84450de()
            if (r2 == 0) goto L_0x02c9
            java.lang.String r2 = "and.opa.bluetooth"
            goto L_0x02cb
        L_0x02c9:
            java.lang.String r2 = "and.opa"
        L_0x02cb:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r7 = "android.opa.extra.INITIAL_QUERY"
            r8 = 1
            r5.putBoolean(r7, r8)
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84264aA(r2, r5)
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84342ba(r6)
            com.google.android.apps.gsa.shared.logger.b.i r2 = r1.f264480v
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_ANDROID_STARTUP_HEADSET
            r2.mo83702b(r5)
            goto L_0x02ee
        L_0x02e6:
            if (r12 != 0) goto L_0x02ea
            java.lang.String r12 = "and.gsa.eyesfree.general"
        L_0x02ea:
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84275aL(r12)
        L_0x02ee:
            boolean r2 = r0.mo84404ck()
            if (r2 != 0) goto L_0x02fa
            boolean r2 = r0.mo84363bw(r4)
            if (r2 == 0) goto L_0x031a
        L_0x02fa:
            com.google.common.base.ax r2 = r1.f264452A
            boolean r2 = r2.mo56113h()
            if (r2 == 0) goto L_0x031a
            com.google.common.base.ax r2 = r1.f264452A
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            r4 = 1
            r2.mo96441f(r4)
            com.google.common.base.ax r2 = r1.f264452A
            java.lang.Object r2 = r2.mo56107c()
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = (com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a) r2
            r4 = 0
            r2.mo96446k(r4)
        L_0x031a:
            com.google.common.o.amo r2 = r3.f236951d
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84272aI(r2)
            boolean r2 = r0.mo84337bV()
            if (r2 == 0) goto L_0x03c9
            com.google.android.apps.gsa.search.core.state.a.i r2 = r1.f264477s
            boolean r2 = r2.mo80452c()
            if (r2 != 0) goto L_0x0336
            com.google.android.apps.gsa.search.core.state.a.i r2 = r1.f264477s
            boolean r2 = r2.mo80451b()
            if (r2 == 0) goto L_0x0346
        L_0x0336:
            com.google.android.apps.gsa.search.core.i.t r2 = r1.f264481w
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247320et
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x0346
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0413
        L_0x0346:
            boolean r2 = r0.mo84459dm()
            if (r2 != 0) goto L_0x0357
            com.google.android.apps.gsa.search.core.state.a.i r2 = r1.f264477s
            boolean r2 = r2.mo80452c()
            if (r2 == 0) goto L_0x0355
            goto L_0x0357
        L_0x0355:
            r2 = 0
            goto L_0x0358
        L_0x0357:
            r2 = 1
        L_0x0358:
            com.google.android.apps.gsa.search.core.aj.y r3 = r1.f264467i
            r4 = 1
            if (r4 == r2) goto L_0x035e
            r11 = 1
        L_0x035e:
            boolean r2 = r0.mo84403cj()
            if (r2 == 0) goto L_0x03c4
            boolean r2 = r0.mo84337bV()
            if (r2 != 0) goto L_0x036b
            goto L_0x03c4
        L_0x036b:
            dagger.a r2 = r3.f230144b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r2
            android.accounts.Account r2 = r2.mo79668a()
            com.google.android.apps.gsa.assistant.shared.bm r4 = r3.f230145c
            boolean r4 = r4.w()
            if (r4 == 0) goto L_0x0382
            if (r2 == 0) goto L_0x0382
            goto L_0x03c4
        L_0x0382:
            android.content.Context r2 = r3.f230143a
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r5 = 268468224(0x10008000, float:2.5342157E-29)
            android.content.Intent r2 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142320s(r2, r4, r5)
            int r11 = r11 + -1
            if (r11 == 0) goto L_0x039e
            r4 = 2132090753(0x7f151f81, float:1.9821855E38)
            r5 = 2132090752(0x7f151f80, float:1.9821853E38)
            r6 = 2132090751(0x7f151f7f, float:1.982185E38)
            goto L_0x03a7
        L_0x039e:
            r4 = 2132090560(0x7f151ec0, float:1.9821463E38)
            r5 = 2132090559(0x7f151ebf, float:1.9821461E38)
            r6 = 2132090558(0x7f151ebe, float:1.982146E38)
        L_0x03a7:
            com.google.android.apps.gsa.handsfree.k r7 = r3.f230146d
            r7.e(r2, r5, r6)
            android.content.Context r2 = r3.f230143a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getString(r4)
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r3 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            r4 = 0
            r3.<init>((java.lang.String) r2, (boolean) r4)
            r2 = 1
            r3.f236281e = r2
            r2 = 0
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84442dW(r3, r2)
        L_0x03c4:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0413
        L_0x03c9:
            dagger.a r2 = r1.f264466h
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r2
            android.accounts.Account r2 = r2.mo79668a()
            if (r2 == 0) goto L_0x03fb
            dagger.a r3 = r1.f264468j
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bm r3 = (com.google.android.apps.gsa.assistant.shared.bm) r3
            boolean r3 = r3.w()
            if (r3 == 0) goto L_0x03fb
            dagger.a r3 = r1.f264470l
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bg r3 = (com.google.android.apps.gsa.assistant.shared.bg) r3
            java.lang.String r2 = r2.name
            boolean r2 = r3.c(r2)
            if (r2 != 0) goto L_0x03f6
            goto L_0x03fb
        L_0x03f6:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0413
        L_0x03fb:
            r2 = 0
            boolean r0 = r1.mo88496e(r0, r2)
            if (r0 != 0) goto L_0x0411
            com.google.common.base.ax r0 = r1.f264471m
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.search.shared.h.k r0 = (com.google.android.apps.gsa.search.shared.p6930h.C87568k) r0
            android.content.Context r2 = r1.f264463c
            android.os.Bundle r3 = android.os.Bundle.EMPTY
            r0.mo81688b(r2, r3)
        L_0x0411:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0413:
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x0431
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
            r2 = 1
            boolean r2 = r1.mo88496e(r0, r2)
            if (r2 != 0) goto L_0x0431
            com.google.android.apps.gsa.search.core.service.af r1 = r1.f264462b
            com.google.android.apps.gsa.search.core.state.cu r1 = r1.f233970e
            com.google.android.apps.gsa.search.core.state.a.j r1 = r1.mo80560b(r14)
            r1.mo80462q(r0)
        L_0x0431:
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7444be.C94543b.mo17879a(java.lang.Object):java.lang.Object");
    }
}
