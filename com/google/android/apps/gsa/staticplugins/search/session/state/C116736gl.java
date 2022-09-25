package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gl */
/* compiled from: PG */
public final class C116736gl implements C87143ik {

    /* renamed from: a */
    private final C116735gk f323795a;

    /* renamed from: b */
    private final C86842bk f323796b;

    /* renamed from: c */
    private final C86842bk f323797c;

    /* renamed from: d */
    private final C86842bk f323798d;

    /* renamed from: e */
    private final C86842bk f323799e;

    /* renamed from: f */
    private final C86842bk f323800f;

    public C116736gl(C116735gk gkVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f323795a = gkVar;
        this.f323796b = new C86842bk(aVar);
        this.f323797c = new C86842bk(aVar2);
        this.f323798d = new C86842bk(aVar3);
        this.f323799e = new C86842bk(aVar4);
        this.f323800f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323795a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0151, code lost:
        if (r1.f324248h.mo85049c(33554432, 0) != false) goto L_0x0134;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323796b
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323797c
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323798d
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323799e
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323800f
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r1 = r0.f323796b
            boolean r2 = r1.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323797c
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323798d
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323799e
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323800f
            boolean r2 = r2.f234552a
            if (r2 == 0) goto L_0x0411
        L_0x003b:
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r2 = r0.f323795a
            com.google.android.apps.gsa.search.core.state.bk r3 = r0.f323797c
            com.google.android.apps.gsa.search.core.state.bk r4 = r0.f323798d
            com.google.android.apps.gsa.search.core.state.bk r5 = r0.f323799e
            com.google.android.apps.gsa.search.core.state.bk r6 = r0.f323800f
            boolean r7 = r3.f234552a
            if (r7 == 0) goto L_0x0054
            com.google.android.apps.gsa.search.core.state.dw r3 = r3.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r3
            boolean r3 = r2.mo102897au(r3)
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            boolean r7 = r1.f234552a
            r9 = 4
            r10 = 2
            r12 = 0
            r13 = 0
            if (r7 == 0) goto L_0x018d
            com.google.android.apps.gsa.search.core.state.dw r1 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r1
            boolean r7 = r1.mo102998ac()
            if (r7 == 0) goto L_0x0110
            com.google.android.apps.gsa.shared.search.Query r7 = r1.f324254n
            r1.f324254n = r12
            if (r7 == 0) goto L_0x00b4
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.o.uf r1 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.common.o.uf r15 = (com.google.common.p4552o.C60555uf) r15
            int r11 = r15.f164093a
            r11 = r11 | r10
            r15.f164093a = r11
            r11 = 223(0xdf, float:3.12E-43)
            r15.f164258m = r11
            com.google.android.apps.gsa.shared.search.Query r11 = r2.f323784p
            long r10 = r11.f252749G
            java.lang.String r10 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r10)
            r1.copyOnWrite()
            com.google.protobuf.bv r11 = r1.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            r10.getClass()
            int r15 = r11.f164093a
            r15 = r15 | r9
            r11.f164093a = r15
            r11.f164259n = r10
            com.google.protobuf.bv r1 = r1.build()
            com.google.common.o.uf r1 = (com.google.common.p4552o.C60555uf) r1
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r1, r12, r12, r12)
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            boolean r1 = r2.mo102895as(r1, r7)
            goto L_0x018c
        L_0x00b4:
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r7 = r2.f323773e
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.cl r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116628cl) r7
            com.google.android.apps.gsa.shared.search.Query r10 = r2.f323784p
            boolean r10 = r10.mo84426dG()
            if (r10 != 0) goto L_0x0109
            com.google.android.apps.gsa.shared.search.Query r10 = r2.f323784p
            boolean r10 = r10.mo84321bF()
            if (r10 == 0) goto L_0x0109
            com.google.android.apps.gsa.shared.search.Query r10 = r2.f323784p
            com.google.android.apps.gsa.shared.search.Query r11 = r7.f323450a
            boolean r10 = r11.mo84383cP(r10)
            if (r10 == 0) goto L_0x0109
            int r7 = r7.f323458i
            if (r7 != r9) goto L_0x0109
            dagger.a r7 = r2.f323770b
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r7
            com.google.android.apps.gsa.search.shared.actions.ActionData r10 = r7.f324250j
            com.google.android.apps.gsa.shared.search.Query r11 = r2.f323784p
            boolean r11 = r11.mo84425dF()
            if (r11 == 0) goto L_0x0109
            com.google.android.apps.gsa.shared.search.Query r11 = r2.f323784p
            boolean r7 = r7.mo102986P(r11)
            if (r7 == 0) goto L_0x0109
            if (r10 == 0) goto L_0x0109
            boolean r7 = r10.mo81094f()
            if (r7 != 0) goto L_0x0109
            com.google.android.apps.gsa.shared.search.Query r7 = r2.f323784p
            com.google.android.apps.gsa.shared.search.Query r7 = r7.mo84277aN()
            r2.mo102873N(r7)
            r7 = 1
            goto L_0x010a
        L_0x0109:
            r7 = 0
        L_0x010a:
            boolean r10 = r2.mo102887ad()
            r7 = r7 | r10
            goto L_0x0111
        L_0x0110:
            r7 = 0
        L_0x0111:
            com.google.android.apps.gsa.shared.util.BitFlags r10 = r1.f324248h
            r8 = 8192(0x2000, double:4.0474E-320)
            boolean r8 = r10.mo85049c(r8, r13)
            if (r8 == 0) goto L_0x0121
            r8 = 0
            boolean r9 = r2.mo102889af(r8)
            r7 = r7 | r9
        L_0x0121:
            com.google.android.apps.gsa.shared.util.BitFlags r8 = r1.f324248h
            r9 = 16777216(0x1000000, double:8.289046E-317)
            boolean r8 = r8.mo85049c(r9, r13)
            if (r8 == 0) goto L_0x0138
            com.google.android.apps.gsa.staticplugins.search.session.state.gg r8 = new com.google.android.apps.gsa.staticplugins.search.session.state.gg
            r8.<init>()
            r2.mo102890ah(r8)
        L_0x0134:
            r2.mo80461o()
            goto L_0x0154
        L_0x0138:
            com.google.android.apps.gsa.shared.util.BitFlags r8 = r1.f324248h
            r9 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r8 = r8.mo85049c(r9, r13)
            if (r8 == 0) goto L_0x0148
            r8 = 0
            r2.mo102889af(r8)
            goto L_0x0134
        L_0x0148:
            com.google.android.apps.gsa.shared.util.BitFlags r8 = r1.f324248h
            r9 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r8 = r8.mo85049c(r9, r13)
            if (r8 == 0) goto L_0x0154
            goto L_0x0134
        L_0x0154:
            com.google.android.apps.gsa.shared.util.BitFlags r8 = r1.f324248h
            r9 = 65536(0x10000, double:3.2379E-319)
            boolean r8 = r8.mo85049c(r9, r13)
            if (r8 == 0) goto L_0x018b
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.search.Query r8 = com.google.android.apps.gsa.shared.search.Query.f252741b
            r2.f323785q = r8
            dagger.a r8 = r2.f323774f
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.TtsState r8 = (com.google.android.apps.gsa.staticplugins.search.session.state.TtsState) r8
            boolean r8 = r8.mo102748A()
            if (r8 != 0) goto L_0x018b
            com.google.android.apps.gsa.search.shared.actions.ActionData r8 = r1.f324250j
            if (r8 == 0) goto L_0x0181
            com.google.android.apps.gsa.shared.search.Query r8 = r2.mo102900k()
            boolean r1 = r1.mo102986P(r8)
            if (r1 == 0) goto L_0x018b
        L_0x0181:
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            r8 = 1
            r9 = 0
            boolean r1 = r2.mo102888ae(r1, r8, r8, r9)
            r1 = r1 | r7
            goto L_0x018c
        L_0x018b:
            r1 = r7
        L_0x018c:
            r3 = r3 | r1
        L_0x018d:
            boolean r1 = r5.f234552a
            if (r1 == 0) goto L_0x02c2
            com.google.android.apps.gsa.search.core.state.dw r1 = r5.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.TtsState r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.TtsState) r1
            boolean r1 = r1.mo102762r()
            if (r1 == 0) goto L_0x02c0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r1 = r2.f323773e
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.cl r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116628cl) r1
            com.google.android.apps.gsa.search.core.p.cc r5 = r1.mo102807e()
            if (r5 == 0) goto L_0x01e6
            boolean r5 = r5.mo79940a()
            if (r5 == 0) goto L_0x01e6
            com.google.android.apps.gsa.shared.search.Query r1 = r1.f323450a
            boolean r1 = r1.mo84397cd()
            if (r1 != 0) goto L_0x01e6
            dagger.a r1 = r2.f323771c
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r1
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = r1.f323267a
            boolean r1 = r1.mo81909y()
            if (r1 == 0) goto L_0x01da
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            com.google.android.apps.gsa.shared.search.Query r5 = r2.f323786r
            boolean r5 = r5.mo84383cP(r1)
            if (r5 != 0) goto L_0x02c0
            r2.f323786r = r1
            r1 = 1
            goto L_0x02c1
        L_0x01da:
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            com.google.android.apps.gsa.shared.search.Query r1 = r1.mo84293ae()
            boolean r1 = r2.mo102875P(r1)
            goto L_0x02c1
        L_0x01e6:
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            boolean r1 = r2.mo102881W(r1)
            if (r1 == 0) goto L_0x02bb
            dagger.a r1 = r2.f323770b
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r1
            boolean r1 = r1.mo103000ae()
            if (r1 != 0) goto L_0x02bb
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            boolean r1 = r1.mo84420dA()
            if (r1 == 0) goto L_0x02bb
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            boolean r1 = r1.mo84391cX()
            if (r1 != 0) goto L_0x02bb
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f323779k
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250663bH
            boolean r1 = r1.mo79746e(r5)
            if (r1 == 0) goto L_0x02b4
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            boolean r5 = r2.mo102884aa()
            if (r5 == 0) goto L_0x028b
            com.google.android.apps.gsa.shared.search.Query r5 = r2.f323784p
            com.google.android.apps.gsa.search.core.i.t r7 = r2.f323779k
            com.google.android.apps.gsa.shared.m.h r8 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250705k
            com.google.common.b.gu r7 = r7.mo79745c(r8)
            com.google.android.apps.gsa.search.core.i.t r8 = r2.f323779k
            com.google.android.apps.gsa.shared.m.h r9 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250636ah
            com.google.common.b.gu r8 = r8.mo79745c(r9)
            boolean r5 = r5.mo84395cb(r7, r8)
            if (r5 == 0) goto L_0x028b
            com.google.android.apps.gsa.shared.search.Query r5 = r2.f323784p
            boolean r5 = r5.mo84461do()
            if (r5 != 0) goto L_0x028b
            com.google.android.apps.gsa.shared.search.Query r5 = com.google.android.apps.gsa.shared.search.Query.f252741b
            com.google.android.apps.gsa.shared.search.Query r5 = r5.mo84294af()
            com.google.android.apps.gsa.shared.search.f r5 = r5.mo84480i()
            r7 = 262144(0x40000, double:1.295163E-318)
            r5.mo84573e(r13, r7)
            com.google.android.apps.gsa.shared.search.Query r5 = r5.mo84568a()
            java.lang.String r7 = r1.mo84355bn()
            if (r7 == 0) goto L_0x0263
            java.lang.String r7 = r1.mo84355bn()
            r7.getClass()
            com.google.android.apps.gsa.shared.search.Query r5 = r5.mo84275aL(r7)
        L_0x0263:
            boolean r5 = r2.mo102875P(r5)
            dagger.a r7 = r2.f323777i
            com.google.android.apps.gsa.shared.logger.b.f r8 = new com.google.android.apps.gsa.shared.logger.b.f
            r8.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_RESTARTED_BY_NUDGE
            r8.f246201a = r9
            long r9 = r1.f252749G
            java.lang.String r9 = java.lang.Long.toString(r9)
            java.lang.String r10 = "rId"
            r8.mo83701c(r10, r9)
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r7 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r7
            com.google.android.apps.gsa.shared.logger.b.g r8 = r8.mo83699a()
            r7.mo74236a(r8)
            goto L_0x0291
        L_0x028b:
            r5 = 0
            boolean r7 = r2.mo102889af(r5)
            r5 = r7
        L_0x0291:
            boolean r1 = r1.mo84461do()
            if (r1 != 0) goto L_0x02b9
            dagger.a r1 = r2.f323780l
            java.lang.Object r1 = r1.mo27525b()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            android.content.SharedPreferences$Editor r7 = r1.edit()
            java.lang.String r8 = "agsa_legacy_voice_search_punt_count"
            long r9 = r1.getLong(r8, r13)
            r16 = 1
            long r9 = r9 + r16
            r7.putLong(r8, r9)
            r7.apply()
            goto L_0x02b9
        L_0x02b4:
            r1 = 0
            boolean r5 = r2.mo102889af(r1)
        L_0x02b9:
            r1 = r5
            goto L_0x02c1
        L_0x02bb:
            boolean r1 = r2.mo102886ac()
            goto L_0x02c1
        L_0x02c0:
            r1 = 0
        L_0x02c1:
            r3 = r3 | r1
        L_0x02c2:
            boolean r1 = r6.f234552a
            if (r1 == 0) goto L_0x038a
            com.google.android.apps.gsa.search.core.state.dw r1 = r6.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.jn r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn) r1
            boolean r5 = r1.f324185u
            r6 = 0
            r1.f324185u = r6
            if (r5 == 0) goto L_0x034a
            boolean r5 = r2.mo102886ac()
            dagger.a r6 = r2.f323773e
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.cl r6 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116628cl) r6
            com.google.android.apps.gsa.shared.search.Query r7 = r2.f323784p
            boolean r7 = r7.mo84426dG()
            if (r7 != 0) goto L_0x0347
            com.google.android.apps.gsa.shared.search.Query r7 = r2.f323784p
            boolean r7 = r7.mo84321bF()
            if (r7 == 0) goto L_0x0347
            com.google.android.apps.gsa.shared.search.Query r7 = r2.f323784p
            com.google.android.apps.gsa.shared.search.Query r8 = r6.f323450a
            boolean r7 = r8.mo84383cP(r7)
            if (r7 == 0) goto L_0x0347
            int r6 = r6.f323458i
            r7 = 2
            if (r6 != r7) goto L_0x0347
            dagger.a r6 = r2.f323776h
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.jn r6 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn) r6
            dagger.a r7 = r6.f324168d
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r7
            long r8 = r6.f324181q
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0317
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x033c
        L_0x0317:
            boolean r8 = r7.f323735A
            if (r8 != 0) goto L_0x031e
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x033c
        L_0x031e:
            dagger.a r6 = r6.f324166b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r6 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r6
            com.google.android.apps.gsa.shared.search.Query r7 = r7.f323784p
            boolean r7 = r6.mo102986P(r7)
            if (r7 == 0) goto L_0x0347
            boolean r7 = r6.mo102998ac()
            if (r7 == 0) goto L_0x0347
            boolean r6 = r6.mo102990U()
            if (r6 != 0) goto L_0x0347
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x033c:
            com.google.android.apps.gsa.shared.search.Query r6 = r2.f323784p
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84277aN()
            r2.mo102873N(r6)
            r8 = 1
            goto L_0x0348
        L_0x0347:
            r8 = 0
        L_0x0348:
            r8 = r8 | r5
            goto L_0x034b
        L_0x034a:
            r8 = 0
        L_0x034b:
            boolean r5 = r1.f324186v
            r6 = 0
            r1.f324186v = r6
            if (r5 == 0) goto L_0x0389
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            boolean r1 = r1.mo84468dv()
            if (r1 == 0) goto L_0x0387
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            java.lang.String r5 = "android.search.extra.EVENT_ID"
            java.lang.String r1 = r1.mo84347bf(r5)
            if (r1 == 0) goto L_0x037f
            com.google.android.apps.gsa.shared.search.Query r5 = r2.f323784p
            com.google.android.apps.gsa.shared.search.f r5 = r5.mo84480i()
            boolean r6 = r5.f252965C
            java.lang.String r7 = r5.f252977O
            boolean r7 = android.text.TextUtils.equals(r7, r1)
            r9 = 1
            r7 = r7 ^ r9
            r6 = r6 | r7
            r5.f252965C = r6
            r5.f252977O = r1
            com.google.android.apps.gsa.shared.search.Query r1 = r5.mo84568a()
            r2.f323784p = r1
        L_0x037f:
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323784p
            boolean r1 = r2.mo102891ai(r1)
            r8 = r8 | r1
            goto L_0x0389
        L_0x0387:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0389:
            r3 = r3 | r8
        L_0x038a:
            boolean r1 = r4.f234552a
            if (r1 == 0) goto L_0x040a
            com.google.android.apps.gsa.search.core.state.dw r1 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.cl r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116628cl) r1
            com.google.android.apps.gsa.shared.search.Query r1 = r1.f323455f
            if (r1 == 0) goto L_0x0405
            com.google.android.apps.gsa.shared.search.Query r4 = r2.f323787s
            if (r4 == r1) goto L_0x0405
            com.google.android.apps.gsa.shared.search.Query r4 = r2.f323784p
            boolean r4 = r4.mo84383cP(r1)
            if (r4 == 0) goto L_0x0405
            r2.f323787s = r1
            boolean r4 = r1.mo84420dA()
            if (r4 == 0) goto L_0x03b2
            com.google.android.apps.gsa.shared.search.Query r4 = r2.f323784p
            com.google.android.apps.gsa.shared.search.Query r1 = r1.mo84281aR(r4)
        L_0x03b2:
            boolean r4 = r1.mo84382cO()
            if (r4 == 0) goto L_0x0405
            java.lang.String r4 = r1.f252770i
            com.google.android.apps.gsa.shared.search.Query r5 = r2.f323784p
            java.lang.String r5 = r5.f252770i
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0405
            com.google.common.o.uf r4 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.common.o.tz r4 = (com.google.common.p4552o.C60548tz) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            int r6 = r5.f164093a
            r7 = 2
            r6 = r6 | r7
            r5.f164093a = r6
            r6 = 192(0xc0, float:2.69E-43)
            r5.f164258m = r6
            com.google.android.apps.gsa.shared.search.Query r5 = r2.f323784p
            long r5 = r5.f252749G
            java.lang.String r5 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r5)
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.common.o.uf r6 = (com.google.common.p4552o.C60555uf) r6
            r5.getClass()
            int r7 = r6.f164093a
            r8 = 4
            r7 = r7 | r8
            r6.f164093a = r7
            r6.f164259n = r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r4, r12, r12, r12)
            r2.f323783o = r1
            r2.mo102873N(r1)
        L_0x0405:
            boolean r1 = r2.mo102887ad()
            r3 = r3 | r1
        L_0x040a:
            if (r3 == 0) goto L_0x0411
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r1 = r0.f323795a
            r1.mo80591ar()
        L_0x0411:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116736gl.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
