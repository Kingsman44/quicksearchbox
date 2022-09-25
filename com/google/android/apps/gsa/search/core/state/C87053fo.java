package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.fo */
/* compiled from: PG */
public final class C87053fo implements C87143ik {

    /* renamed from: a */
    private final C87052fn f235190a;

    /* renamed from: b */
    private final C86842bk f235191b;

    /* renamed from: c */
    private final C86842bk f235192c;

    /* renamed from: d */
    private final C86842bk f235193d;

    /* renamed from: e */
    private final C86842bk f235194e;

    public C87053fo(C87052fn fnVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f235190a = fnVar;
        this.f235191b = new C86842bk(aVar);
        this.f235192c = new C86842bk(aVar2);
        this.f235193d = new C86842bk(aVar3);
        this.f235194e = new C86842bk(aVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235190a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x024d, code lost:
        if (r15.f235552g.mo85049c(33554432, 0) != false) goto L_0x0231;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0204  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r15) {
        /*
            r14 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f235191b
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f235192c
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f235193d
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f235194e
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r15 = r14.f235191b
            boolean r0 = r15.f234552a
            if (r0 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f235192c
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f235193d
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f235194e
            boolean r0 = r0.f234552a
            if (r0 == 0) goto L_0x03ea
        L_0x002c:
            com.google.android.apps.gsa.search.core.state.fn r0 = r14.f235190a
            com.google.android.apps.gsa.search.core.state.bk r1 = r14.f235192c
            com.google.android.apps.gsa.search.core.state.bk r2 = r14.f235193d
            com.google.android.apps.gsa.search.core.state.bk r3 = r14.f235194e
            boolean r4 = r1.f234552a
            r5 = 0
            if (r4 == 0) goto L_0x0044
            com.google.android.apps.gsa.search.core.state.dw r1 = r1.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r1 = (com.google.android.apps.gsa.search.core.state.C86812ai) r1
            boolean r1 = r0.mo80705ab(r1)
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            boolean r4 = r15.f234552a
            r6 = 4
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0285
            com.google.android.apps.gsa.search.core.state.dw r15 = r15.mo80533a()
            com.google.android.apps.gsa.search.core.state.z r15 = (com.google.android.apps.gsa.search.core.state.C87171z) r15
            boolean r4 = r15.mo80791X()
            if (r4 == 0) goto L_0x020c
            com.google.android.apps.gsa.shared.search.Query r4 = r15.f235561p
            r15.f235561p = r8
            if (r4 == 0) goto L_0x01a0
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.o.uf r15 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.common.o.tz r15 = (com.google.common.p4552o.C60548tz) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r9 = r15.instance
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9
            int r10 = r9.f164093a
            r10 = r10 | 2
            r9.f164093a = r10
            r10 = 223(0xdf, float:3.12E-43)
            r9.f164258m = r10
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f235177m
            long r9 = r9.f252749G
            java.lang.String r9 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r9)
            r15.copyOnWrite()
            com.google.protobuf.bv r10 = r15.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            r9.getClass()
            int r11 = r10.f164093a
            r11 = r11 | r6
            r10.f164093a = r11
            r10.f164259n = r9
            com.google.protobuf.bv r15 = r15.build()
            com.google.common.o.uf r15 = (com.google.common.p4552o.C60555uf) r15
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r15, r8, r8, r8)
            com.google.android.apps.gsa.search.core.i.t r15 = r0.f235173i
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247150bi
            boolean r15 = r15.mo79746e(r9)
            if (r15 != 0) goto L_0x00b4
            boolean r15 = r0.mo80702Y(r4)
            if (r15 == 0) goto L_0x00b4
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r4)
            r0.f235188x = r15
        L_0x00b1:
            r4 = 1
            goto L_0x0284
        L_0x00b4:
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84383cP(r15)
            if (r15 == 0) goto L_0x019d
            boolean r15 = r4.mo84338bW()
            if (r15 == 0) goto L_0x0107
            com.google.common.o.uf r15 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.common.o.tz r15 = (com.google.common.p4552o.C60548tz) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r9 = r15.instance
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9
            int r10 = r9.f164093a
            r10 = r10 | 2
            r9.f164093a = r10
            r10 = 224(0xe0, float:3.14E-43)
            r9.f164258m = r10
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f235177m
            long r9 = r9.f252749G
            java.lang.String r9 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r9)
            r15.copyOnWrite()
            com.google.protobuf.bv r10 = r15.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            r9.getClass()
            int r11 = r10.f164093a
            r11 = r11 | r6
            r10.f164093a = r11
            r10.f164259n = r9
            com.google.protobuf.bv r15 = r15.build()
            com.google.common.o.uf r15 = (com.google.common.p4552o.C60555uf) r15
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r15, r8, r8, r8)
            com.google.android.apps.gsa.shared.search.Query r15 = r4.mo84493u()
            r0.f235178n = r15
            r0.mo80696Q()
            goto L_0x00b1
        L_0x0107:
            boolean r15 = r4.mo84384cQ()
            if (r15 == 0) goto L_0x014f
            com.google.common.o.uf r15 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.common.o.tz r15 = (com.google.common.p4552o.C60548tz) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r9 = r15.instance
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9
            int r10 = r9.f164093a
            r10 = r10 | 2
            r9.f164093a = r10
            r10 = 225(0xe1, float:3.15E-43)
            r9.f164258m = r10
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f235177m
            long r9 = r9.f252749G
            java.lang.String r9 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r9)
            r15.copyOnWrite()
            com.google.protobuf.bv r10 = r15.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            r9.getClass()
            int r11 = r10.f164093a
            r11 = r11 | r6
            r10.f164093a = r11
            r10.f164259n = r9
            com.google.protobuf.bv r15 = r15.build()
            com.google.common.o.uf r15 = (com.google.common.p4552o.C60555uf) r15
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r15, r8, r8, r8)
            com.google.android.apps.gsa.shared.search.Query r15 = r0.mo80712n(r4)
            r0.f235177m = r15
            goto L_0x0191
        L_0x014f:
            com.google.common.o.uf r15 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.common.o.tz r15 = (com.google.common.p4552o.C60548tz) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r9 = r15.instance
            com.google.common.o.uf r9 = (com.google.common.p4552o.C60555uf) r9
            int r10 = r9.f164093a
            r10 = r10 | 2
            r9.f164093a = r10
            r10 = 226(0xe2, float:3.17E-43)
            r9.f164258m = r10
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f235177m
            long r9 = r9.f252749G
            java.lang.String r9 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r9)
            r15.copyOnWrite()
            com.google.protobuf.bv r10 = r15.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            r9.getClass()
            int r11 = r10.f164093a
            r11 = r11 | r6
            r10.f164093a = r11
            r10.f164259n = r9
            com.google.protobuf.bv r15 = r15.build()
            com.google.common.o.uf r15 = (com.google.common.p4552o.C60555uf) r15
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r15, r8, r8, r8)
            com.google.android.apps.gsa.shared.search.Query r15 = r4.mo84493u()
            r0.mo80720z(r15)
        L_0x0191:
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            r0.f235176l = r15
            com.google.android.apps.gsa.shared.search.Query r15 = com.google.android.apps.gsa.shared.search.Query.f252741b
            r0.f235178n = r15
            r0.f235187w = r7
            goto L_0x00b1
        L_0x019d:
            r4 = 0
            goto L_0x0284
        L_0x01a0:
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r4 = r0.f235168d
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.state.cy r4 = (com.google.android.apps.gsa.search.core.state.C86903cy) r4
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f235177m
            boolean r9 = r9.mo84426dG()
            if (r9 != 0) goto L_0x01f8
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f235177m
            boolean r9 = r9.mo84321bF()
            if (r9 == 0) goto L_0x01f8
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f235177m
            com.google.android.apps.gsa.shared.search.Query r10 = r4.f234678a
            boolean r9 = r10.mo84383cP(r9)
            if (r9 == 0) goto L_0x01f8
            int r4 = r4.f234683f
            if (r4 != r6) goto L_0x01f8
            dagger.a r4 = r0.f235166b
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r4 = (com.google.android.apps.gsa.search.core.state.C87171z) r4
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = r4.f235555j
            com.google.android.apps.gsa.shared.search.Query r10 = r0.f235177m
            boolean r10 = r10.mo84425dF()
            if (r10 == 0) goto L_0x01f8
            com.google.android.apps.gsa.shared.search.Query r10 = r0.f235177m
            boolean r4 = r4.mo80781M(r10)
            if (r4 == 0) goto L_0x01f8
            if (r9 == 0) goto L_0x01f8
            boolean r4 = r9.mo81094f()
            if (r4 != 0) goto L_0x01f8
            com.google.android.apps.gsa.shared.search.Query r4 = r0.f235177m
            com.google.android.apps.gsa.shared.search.Query r4 = r4.mo84277aN()
            com.google.android.apps.gsa.shared.search.Query r4 = r0.mo80712n(r4)
            r0.f235177m = r4
            r4 = 1
            goto L_0x01f9
        L_0x01f8:
            r4 = 0
        L_0x01f9:
            boolean r9 = r0.mo80685B()
            if (r9 == 0) goto L_0x0204
            boolean r9 = r0.mo80703Z()
            goto L_0x0205
        L_0x0204:
            r9 = 0
        L_0x0205:
            r4 = r4 | r9
            boolean r9 = r0.mo80697R()
            r4 = r4 | r9
            goto L_0x020d
        L_0x020c:
            r4 = 0
        L_0x020d:
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r15.f235552g
            r10 = 8192(0x2000, double:4.0474E-320)
            r12 = 0
            boolean r9 = r9.mo85049c(r10, r12)
            if (r9 == 0) goto L_0x021e
            boolean r9 = r0.mo80699U(r5)
            r4 = r4 | r9
        L_0x021e:
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r15.f235552g
            r10 = 16777216(0x1000000, double:8.289046E-317)
            boolean r9 = r9.mo85049c(r10, r12)
            if (r9 == 0) goto L_0x0235
            com.google.android.apps.gsa.search.core.state.fk r9 = new com.google.android.apps.gsa.search.core.state.fk
            r9.<init>()
            r0.mo80706ac(r9)
        L_0x0231:
            r0.mo80461o()
            goto L_0x0250
        L_0x0235:
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r15.f235552g
            r10 = 67108864(0x4000000, double:3.31561842E-316)
            boolean r9 = r9.mo85049c(r10, r12)
            if (r9 == 0) goto L_0x0244
            r0.mo80699U(r5)
            goto L_0x0231
        L_0x0244:
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r15.f235552g
            r10 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r9 = r9.mo85049c(r10, r12)
            if (r9 == 0) goto L_0x0250
            goto L_0x0231
        L_0x0250:
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r15.f235552g
            r10 = 65536(0x10000, double:3.2379E-319)
            boolean r9 = r9.mo85049c(r10, r12)
            if (r9 == 0) goto L_0x0284
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.search.Query r9 = com.google.android.apps.gsa.shared.search.Query.f252741b
            r0.f235178n = r9
            dagger.a r9 = r0.f235169e
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.state.TtsState r9 = (com.google.android.apps.gsa.search.core.state.TtsState) r9
            boolean r9 = r9.mo80399A()
            if (r9 != 0) goto L_0x0284
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = r15.f235555j
            if (r9 == 0) goto L_0x027d
            com.google.android.apps.gsa.shared.search.Query r9 = r0.mo80710j()
            boolean r15 = r15.mo80781M(r9)
            if (r15 == 0) goto L_0x0284
        L_0x027d:
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r0.mo80698T(r15, r7, r7, r5)
            r4 = r4 | r15
        L_0x0284:
            r1 = r1 | r4
        L_0x0285:
            boolean r15 = r3.f234552a
            if (r15 == 0) goto L_0x035f
            com.google.android.apps.gsa.search.core.state.dw r15 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.TtsState r15 = (com.google.android.apps.gsa.search.core.state.TtsState) r15
            boolean r15 = r15.mo80418s()
            if (r15 == 0) goto L_0x035e
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r15 = r0.f235168d
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.state.cy r15 = (com.google.android.apps.gsa.search.core.state.C86903cy) r15
            com.google.android.apps.gsa.search.core.p.cc r3 = r15.mo80561a()
            if (r3 == 0) goto L_0x0304
            boolean r3 = r3.mo79940a()
            if (r3 == 0) goto L_0x0304
            com.google.android.apps.gsa.shared.search.Query r15 = r15.f234678a
            boolean r15 = r15.mo84397cd()
            if (r15 != 0) goto L_0x0304
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84403cj()
            if (r15 == 0) goto L_0x02db
            dagger.a r15 = r0.f235170f
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.state.eq r15 = (com.google.android.apps.gsa.search.core.state.C87023eq) r15
            boolean r15 = r15.f235049n
            if (r15 == 0) goto L_0x02d3
            dagger.a r15 = r0.f235170f
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.state.eq r15 = (com.google.android.apps.gsa.search.core.state.C87023eq) r15
            boolean r15 = r15.f235051p
            if (r15 != 0) goto L_0x02db
        L_0x02d3:
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84337bV()
            if (r15 == 0) goto L_0x0304
        L_0x02db:
            dagger.a r15 = r0.f235167c
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.state.ai r15 = (com.google.android.apps.gsa.search.core.state.C86812ai) r15
            com.google.android.apps.gsa.search.shared.service.ClientConfig r15 = r15.f234471a
            boolean r15 = r15.mo81909y()
            if (r15 == 0) goto L_0x02f9
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            com.google.android.apps.gsa.shared.search.Query r3 = r0.f235179o
            boolean r3 = r3.mo84383cP(r15)
            if (r3 != 0) goto L_0x035e
            r0.f235179o = r15
            r5 = 1
            goto L_0x035e
        L_0x02f9:
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            com.google.android.apps.gsa.shared.search.Query r15 = r15.mo84293ae()
            boolean r5 = r0.mo80686D(r15)
            goto L_0x035e
        L_0x0304:
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r0.mo80692M(r15)
            if (r15 == 0) goto L_0x035a
            dagger.a r15 = r0.f235166b
            java.lang.Object r15 = r15.mo27525b()
            com.google.android.apps.gsa.search.core.state.z r15 = (com.google.android.apps.gsa.search.core.state.C87171z) r15
            boolean r15 = r15.mo80793Z()
            if (r15 != 0) goto L_0x035a
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84338bW()
            if (r15 == 0) goto L_0x0345
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84337bV()
            if (r15 != 0) goto L_0x035a
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84412cs()
            if (r15 != 0) goto L_0x035a
            com.google.android.apps.gsa.search.core.i.t r15 = r0.f235173i
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248833ao
            boolean r15 = r15.mo79746e(r3)
            if (r15 == 0) goto L_0x0345
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84404ck()
            if (r15 == 0) goto L_0x0345
            goto L_0x035a
        L_0x0345:
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84420dA()
            if (r15 == 0) goto L_0x035a
            com.google.android.apps.gsa.shared.search.Query r15 = r0.f235177m
            boolean r15 = r15.mo84391cX()
            if (r15 != 0) goto L_0x035a
            boolean r5 = r0.mo80699U(r5)
            goto L_0x035e
        L_0x035a:
            boolean r5 = r0.mo80696Q()
        L_0x035e:
            r1 = r1 | r5
        L_0x035f:
            boolean r15 = r2.f234552a
            if (r15 == 0) goto L_0x03e3
            com.google.android.apps.gsa.search.core.state.dw r15 = r2.mo80533a()
            com.google.android.apps.gsa.search.core.state.cy r15 = (com.google.android.apps.gsa.search.core.state.C86903cy) r15
            com.google.android.apps.gsa.shared.search.Query r15 = r15.f234682e
            if (r15 == 0) goto L_0x03de
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f235180p
            if (r2 == r15) goto L_0x03de
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f235177m
            boolean r2 = r2.mo84383cP(r15)
            if (r2 == 0) goto L_0x03de
            r0.f235180p = r15
            boolean r2 = r15.mo84420dA()
            if (r2 == 0) goto L_0x0387
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f235177m
            com.google.android.apps.gsa.shared.search.Query r15 = r15.mo84281aR(r2)
        L_0x0387:
            boolean r2 = r15.mo84382cO()
            if (r2 == 0) goto L_0x03de
            java.lang.String r2 = r15.f252770i
            com.google.android.apps.gsa.shared.search.Query r3 = r0.f235177m
            java.lang.String r3 = r3.f252770i
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x03de
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164093a
            r4 = r4 | 2
            r3.f164093a = r4
            r4 = 192(0xc0, float:2.69E-43)
            r3.f164258m = r4
            com.google.android.apps.gsa.shared.search.Query r3 = r0.f235177m
            long r3 = r3.f252749G
            java.lang.String r3 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            r3.getClass()
            int r5 = r4.f164093a
            r5 = r5 | r6
            r4.f164093a = r5
            r4.f164259n = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r2, r8, r8, r8)
            r0.f235176l = r15
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.search.Query r15 = r0.mo80712n(r15)
            r0.f235177m = r15
        L_0x03de:
            boolean r15 = r0.mo80697R()
            r1 = r1 | r15
        L_0x03e3:
            if (r1 == 0) goto L_0x03ea
            com.google.android.apps.gsa.search.core.state.fn r15 = r14.f235190a
            r15.mo80591ar()
        L_0x03ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87053fo.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
