package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.jo */
/* compiled from: PG */
public final class C116820jo implements C87143ik {

    /* renamed from: a */
    private final C116819jn f324191a;

    /* renamed from: b */
    private final C86842bk f324192b;

    /* renamed from: c */
    private final C86842bk f324193c;

    /* renamed from: d */
    private final C86842bk f324194d;

    /* renamed from: e */
    private final C86842bk f324195e;

    /* renamed from: f */
    private final C86842bk f324196f;

    /* renamed from: g */
    private final C86842bk f324197g;

    public C116820jo(C116819jn jnVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f324191a = jnVar;
        this.f324192b = new C86842bk(aVar);
        this.f324193c = new C86842bk(aVar2);
        this.f324194d = new C86842bk(aVar3);
        this.f324195e = new C86842bk(aVar4);
        this.f324196f = new C86842bk(aVar5);
        this.f324197g = new C86842bk(aVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f324191a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030c, code lost:
        if (r10.mo84369cB() != false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0315, code lost:
        if (r4.f323783o.mo84373cF() != false) goto L_0x0317;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324192b
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324193c
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324194d
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324195e
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324196f
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324197g
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r1 = r0.f324192b
            boolean r2 = r1.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324193c
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324194d
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324195e
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324196f
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f324197g
            boolean r2 = r2.f234552a
            if (r2 == 0) goto L_0x0441
        L_0x0046:
            com.google.android.apps.gsa.staticplugins.search.session.state.jn r2 = r0.f324191a
            com.google.android.apps.gsa.search.core.state.bk r3 = r0.f324193c
            com.google.android.apps.gsa.search.core.state.bk r4 = r0.f324194d
            com.google.android.apps.gsa.search.core.state.bk r5 = r0.f324195e
            com.google.android.apps.gsa.search.core.state.bk r6 = r0.f324196f
            com.google.android.apps.gsa.search.core.state.bk r7 = r0.f324197g
            boolean r8 = r2.f324145E
            r9 = 0
            if (r8 != 0) goto L_0x005a
            goto L_0x00e3
        L_0x005a:
            long r13 = r2.mo102954e()
            long r11 = r2.f324190z
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x00ae
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            long r11 = r2.f324190z
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x0075
            boolean r13 = r2.f324141A
            if (r13 == 0) goto L_0x0074
            r13 = 1
            r2.f324142B = r13
            goto L_0x00e3
        L_0x0074:
            r13 = r9
        L_0x0075:
            int r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x0081
            com.google.android.apps.gsa.search.core.al.ds.d r15 = r2.f324175k
            r15.mo78968j(r11)
            r8 = 0
            r2.f324142B = r8
        L_0x0081:
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x00ab
            com.google.android.apps.gsa.search.core.al.ds.d r11 = r2.f324175k
            long r8 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r8 = r2.mo102956i(r8)
            r11.mo78964f(r8, r13)
            com.google.android.apps.gsa.search.core.al.ds.d r8 = r2.f324175k
            long r11 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r9 = r2.mo102956i(r11)
            r8.mo78977t(r9, r13)
            dagger.a r8 = r2.f324167c
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r8 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r8
            com.google.android.apps.gsa.search.shared.service.ClientConfig r8 = r8.f323267a
            boolean r8 = r8.mo81896n()
            r2.f324141A = r8
        L_0x00ab:
            r2.f324190z = r13
            goto L_0x00e3
        L_0x00ae:
            boolean r8 = r2.f324142B
            if (r8 == 0) goto L_0x00e3
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8 = 0
            r2.f324142B = r8
            r9 = 0
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x00e3
            com.google.android.apps.gsa.search.core.al.ds.d r9 = r2.f324175k
            long r10 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r10 = r2.mo102956i(r10)
            r9.mo78964f(r10, r13)
            com.google.android.apps.gsa.search.core.al.ds.d r9 = r2.f324175k
            long r10 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r10 = r2.mo102956i(r10)
            r9.mo78977t(r10, r13)
            dagger.a r9 = r2.f324167c
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r9 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r9
            com.google.android.apps.gsa.search.shared.service.ClientConfig r9 = r9.f323267a
            boolean r9 = r9.mo81896n()
            r2.f324141A = r9
        L_0x00e3:
            boolean r9 = r2.f324145E
            if (r9 != 0) goto L_0x00e9
            goto L_0x01bd
        L_0x00e9:
            dagger.a r9 = r2.f324167c
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r9 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r9
            com.google.android.apps.gsa.search.shared.service.ClientConfig r9 = r9.f323267a
            boolean r10 = r9.mo81885c()
            if (r10 == 0) goto L_0x00fb
        L_0x00f9:
            r9 = 0
            goto L_0x011f
        L_0x00fb:
            dagger.a r10 = r2.f324169e
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.search.core.state.a.r r10 = (com.google.android.apps.gsa.search.core.state.p6864a.C86803r) r10
            boolean r10 = r10.mo80510o()
            if (r10 == 0) goto L_0x010a
            goto L_0x00f9
        L_0x010a:
            dagger.a r10 = r2.f324168d
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r10 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r10
            boolean r10 = r10.mo102894al()
            if (r10 == 0) goto L_0x011e
            boolean r9 = r9.mo81902t()
            if (r9 == 0) goto L_0x00f9
        L_0x011e:
            r9 = 1
        L_0x011f:
            boolean r10 = r2.f324150M
            if (r10 == r9) goto L_0x0130
            com.google.android.apps.gsa.search.core.al.ds.d r10 = r2.f324175k
            long r11 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r11 = r2.mo102956i(r11)
            r10.mo78972n(r11, r9)
            r2.f324150M = r9
        L_0x0130:
            com.google.android.apps.gsa.search.core.i.t r9 = r2.f324174j
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90110fh.f250634af
            boolean r9 = r9.mo79746e(r10)
            if (r9 == 0) goto L_0x016f
            dagger.a r9 = r2.f324167c
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r9 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r9
            long r9 = r9.f323268b
            dagger.a r11 = r2.f324170f
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.aj r11 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116572aj) r11
            long r11 = r11.f323290a
            long r13 = r2.f324187w
            int r17 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r17 != 0) goto L_0x015a
            long r13 = r2.f324188x
            int r17 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x017d
        L_0x015a:
            r2.f324187w = r9
            r2.f324188x = r11
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            g.a.a r9 = r2.f324176l
            java.lang.Object r9 = r9.mo17428b()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r2.f324179o = r9
            goto L_0x017d
        L_0x016f:
            g.a.a r9 = r2.f324176l
            java.lang.Object r9 = r9.mo17428b()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r2.f324179o = r9
        L_0x017d:
            java.lang.Boolean r9 = r2.f324178n
            if (r9 != 0) goto L_0x018c
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r9 = r2.f324179o
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r2.f324178n = r9
            goto L_0x01bd
        L_0x018c:
            boolean r9 = r9.booleanValue()
            boolean r10 = r2.f324179o
            if (r9 == r10) goto L_0x01b9
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Boolean r9 = r2.f324178n
            boolean r9 = r2.f324179o
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r2.f324178n = r9
            dagger.a r9 = r2.f324177m
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.p.bt r9 = (com.google.android.apps.gsa.search.core.p6816p.C86237bt) r9
            r9.mo79905b()
            com.google.android.apps.gsa.search.core.al.ds.d r9 = r2.f324175k
            long r10 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r10 = r2.mo102956i(r10)
            com.google.android.apps.gsa.shared.search.Query r11 = r2.f324189y
            r9.mo78976s(r10, r11)
            goto L_0x01bd
        L_0x01b9:
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Boolean r9 = r2.f324178n
        L_0x01bd:
            boolean r9 = r2.f324145E
            if (r9 == 0) goto L_0x0244
            boolean r9 = r4.f234552a
            if (r9 != 0) goto L_0x01c9
            boolean r9 = r1.f234552a
            if (r9 == 0) goto L_0x01df
        L_0x01c9:
            com.google.android.apps.gsa.search.core.al.ds.d r9 = r2.f324175k
            r2.mo102960o()
            long r10 = r2.f324151N
            com.google.android.apps.gsa.search.core.state.dw r12 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gp r12 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116740gp) r12
            boolean r12 = r12.mo102914k()
            r13 = 1
            r12 = r12 ^ r13
            r9.mo78980w(r10, r12)
        L_0x01df:
            com.google.android.apps.gsa.search.core.state.dw r4 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gp r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116740gp) r4
            com.google.android.apps.gsa.search.core.state.dw r9 = r3.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.cn r9 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116630cn) r9
            long r10 = r2.mo102954e()
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r9.f323463b
            long r12 = r9.f253762b
            r8 = 1
            boolean r8 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r12, r8)
            boolean r4 = r4.mo102914k()
            if (r4 == 0) goto L_0x020d
            r2.mo102960o()
            com.google.android.apps.gsa.search.core.al.ds.d r4 = r2.f324175k
            r4.mo78982y(r8, r10)
            com.google.android.apps.gsa.search.core.al.ds.d r4 = r2.f324175k
            r4.mo78979v(r8)
            goto L_0x022a
        L_0x020d:
            dagger.a r4 = r2.f324168d
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r4
            com.google.android.apps.gsa.shared.search.Query r4 = r4.f323784p
            boolean r4 = r4.mo84385cR()
            if (r4 != 0) goto L_0x022a
            r2.mo102960o()
            com.google.android.apps.gsa.search.core.al.ds.d r4 = r2.f324175k
            r4.mo78971m(r10)
            com.google.android.apps.gsa.search.core.al.ds.d r4 = r2.f324175k
            r4.mo78978u()
        L_0x022a:
            dagger.a r4 = r2.f324168d
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r4
            boolean r4 = r4.mo102896at()
            if (r4 == 0) goto L_0x0244
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.al.ds.d r4 = r2.f324175k
            r2.mo102960o()
            long r8 = r2.f324151N
            r4.mo78966h(r8)
        L_0x0244:
            com.google.android.apps.gsa.search.core.state.dw r4 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r4
            boolean r8 = r1.f234552a
            if (r8 != 0) goto L_0x0257
            boolean r8 = r7.f234552a
            if (r8 == 0) goto L_0x0253
            goto L_0x0257
        L_0x0253:
            r8 = 0
            r13 = 0
            goto L_0x031d
        L_0x0257:
            com.google.android.apps.gsa.shared.search.Query r8 = r4.f323784p
            com.google.android.apps.gsa.shared.search.Query r9 = r2.f324157T
            long r9 = r9.f252749G
            long r11 = r8.f252749G
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x02a9
            r2.f324157T = r8
            boolean r9 = r8.mo84397cd()
            if (r9 == 0) goto L_0x02a9
            boolean r8 = r8.mo84416cw()
            if (r8 == 0) goto L_0x02a9
            long r9 = r2.f324151N
            r11 = -1
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x027f
            long r11 = r2.f324153P
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x02a9
        L_0x027f:
            long r11 = r2.f324152O
            r2.f324151N = r11
            r8 = 0
            r2.f324158U = r8
            com.google.android.apps.gsa.shared.x.a r11 = r2.f324156S
            java.util.concurrent.atomic.AtomicLong r11 = r11.f254534a
            long r11 = r11.incrementAndGet()
            r2.f324152O = r11
            long r18 = r2.mo102954e()
            r11 = 0
            int r13 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x02a9
            com.google.android.apps.gsa.search.core.al.ds.d r11 = r2.f324175k
            long r12 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r22 = r2.mo102956i(r12)
            r17 = r11
            r20 = r9
            r17.mo78967i(r18, r20, r22)
        L_0x02a9:
            long r9 = r2.f324181q
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x02f0
            boolean r11 = r2.mo102967v()
            if (r11 != 0) goto L_0x02f0
            java.util.List r11 = r4.f323789u
            java.util.Iterator r11 = r11.iterator()
        L_0x02bd:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02d6
            java.lang.Object r12 = r11.next()
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.String r13 = "velvet:query_state:search_result_id"
            r14 = 0
            long r12 = r12.getLong(r13, r14)
            int r16 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r16 != 0) goto L_0x02bd
            goto L_0x02f0
        L_0x02d6:
            r14 = 0
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.f324181q = r14
            com.google.android.apps.gsa.shared.search.Query r9 = com.google.android.apps.gsa.shared.search.Query.f252741b
            r2.f324182r = r9
            com.google.android.apps.gsa.shared.search.Query r9 = com.google.android.apps.gsa.shared.search.Query.f252741b
            r2.f324189y = r9
            r8 = 0
            r2.f324144D = r8
            r2.mo102961p()
            r9 = 1
            r2.mo102968x(r9)
            r9 = 1
            goto L_0x02f2
        L_0x02f0:
            r8 = 0
            r9 = 0
        L_0x02f2:
            boolean r10 = r2.f324145E
            if (r10 != 0) goto L_0x031c
            com.google.android.apps.gsa.shared.search.Query r10 = r4.f323783o
            boolean r10 = r10.mo84391cX()
            if (r10 != 0) goto L_0x0317
            com.google.android.apps.gsa.shared.search.Query r10 = r4.f323783o
            java.lang.CharSequence r11 = r10.f252768g
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x030f
            boolean r10 = r10.mo84369cB()
            if (r10 == 0) goto L_0x030f
            goto L_0x0317
        L_0x030f:
            com.google.android.apps.gsa.shared.search.Query r10 = r4.f323783o
            boolean r10 = r10.mo84373cF()
            if (r10 == 0) goto L_0x031c
        L_0x0317:
            r9 = 1
            r2.f324145E = r9
            r13 = 1
            goto L_0x031d
        L_0x031c:
            r13 = r9
        L_0x031d:
            boolean r1 = r1.f234552a
            if (r1 != 0) goto L_0x0329
            boolean r1 = r7.f234552a
            if (r1 != 0) goto L_0x0329
            boolean r1 = r6.f234552a
            if (r1 == 0) goto L_0x03ba
        L_0x0329:
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f324174j
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90091ep.f250548k
            boolean r1 = r1.mo79746e(r7)
            if (r1 == 0) goto L_0x0345
            long r9 = r2.f324155R
            com.google.android.apps.gsa.shared.search.Query r1 = r4.f323783o
            long r11 = r1.f252780s
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x0345
            boolean r1 = r4.mo102879U()
            if (r1 == 0) goto L_0x0345
            r1 = 1
            goto L_0x0346
        L_0x0345:
            r1 = 0
        L_0x0346:
            boolean r7 = r2.f324154Q
            if (r7 == 0) goto L_0x034c
            if (r1 == 0) goto L_0x03ba
        L_0x034c:
            boolean r1 = r2.f324145E
            if (r1 == 0) goto L_0x03ba
            com.google.android.apps.gsa.search.core.state.dw r1 = r6.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.hx r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116775hx) r1
            boolean r1 = r1.f323957j
            if (r1 != 0) goto L_0x03ba
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f324174j
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90117fo.f250746b
            boolean r1 = r1.mo79746e(r6)
            if (r1 != 0) goto L_0x03ba
            boolean r1 = r2.f324154Q
            if (r1 != 0) goto L_0x037d
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f324174j
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90091ep.f250551n
            boolean r1 = r1.mo79746e(r6)
            if (r1 == 0) goto L_0x037d
            dagger.a r1 = r2.f324168d
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r1
            r1.mo102896at()
        L_0x037d:
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f324174j
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90091ep.f250548k
            boolean r1 = r1.mo79746e(r6)
            if (r1 == 0) goto L_0x0393
            com.google.android.apps.gsa.search.core.al.ds.d r1 = r2.f324175k
            long r6 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r6 = r2.mo102956i(r6)
            r1.mo78973p(r6)
            goto L_0x03b1
        L_0x0393:
            com.google.android.apps.gsa.search.core.al.ds.d r1 = r2.f324175k
            long r6 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r6 = r2.mo102956i(r6)
            boolean r7 = r4.mo80455H()
            if (r7 != 0) goto L_0x03ad
            com.google.android.apps.gsa.search.core.i.t r7 = r2.f324174j
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250840g
            boolean r7 = r7.mo79746e(r9)
            if (r7 == 0) goto L_0x03ad
            r12 = 1
            goto L_0x03ae
        L_0x03ad:
            r12 = 0
        L_0x03ae:
            r1.mo78974q(r6, r12)
        L_0x03b1:
            com.google.android.apps.gsa.shared.search.Query r1 = r4.f323783o
            long r6 = r1.f252780s
            r2.f324155R = r6
            r1 = 1
            r2.f324154Q = r1
        L_0x03ba:
            com.google.android.apps.gsa.search.core.state.dw r1 = r3.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.cn r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116630cn) r1
            boolean r1 = r1.mo102814j()
            boolean r3 = r2.f324148H
            if (r1 == r3) goto L_0x03e0
            if (r1 == 0) goto L_0x03de
            boolean r3 = r2.f324145E
            if (r3 == 0) goto L_0x03de
            com.google.android.apps.gsa.search.core.al.ds.d r3 = r2.f324175k
            r2.mo102960o()
            long r6 = r2.f324151N
            com.google.android.libraries.f.a r4 = r2.f324172h
            long r8 = r4.mo26871c()
            r3.mo78981x(r6, r8)
        L_0x03de:
            r2.f324148H = r1
        L_0x03e0:
            boolean r1 = r5.f234552a
            if (r1 == 0) goto L_0x043f
            com.google.android.apps.gsa.search.core.state.dw r1 = r5.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.bg r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116596bg) r1
            android.util.Pair r3 = r1.f323359g
            r4 = 0
            if (r3 == 0) goto L_0x03f2
            r1.f323359g = r4
            goto L_0x03f3
        L_0x03f2:
            r3 = r4
        L_0x03f3:
            if (r3 == 0) goto L_0x043f
            java.lang.Object r1 = r3.first
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r4 = r3.second
            com.google.common.base.ax r4 = (com.google.common.base.C58833ax) r4
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0435
            java.lang.Object r3 = r3.second
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            java.lang.Object r3 = r3.mo56107c()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0435
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.core.al.ds.d r4 = r2.f324175k
            long r5 = r2.f324151N
            com.google.android.apps.gsa.search.core.al.ds.b r5 = r2.mo102956i(r5)
            r6 = 1
            if (r6 == r1) goto L_0x0427
            java.lang.String r6 = "(false);"
            goto L_0x0429
        L_0x0427:
            java.lang.String r6 = "(true);"
        L_0x0429:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.concat(r6)
            r4.mo78970l(r5, r3)
            r13 = 1
        L_0x0435:
            if (r1 == 0) goto L_0x043f
            boolean r1 = r2.f324186v
            if (r1 != 0) goto L_0x043f
            r1 = 1
            r2.f324186v = r1
            goto L_0x0442
        L_0x043f:
            if (r13 != 0) goto L_0x0442
        L_0x0441:
            return
        L_0x0442:
            com.google.android.apps.gsa.staticplugins.search.session.state.jn r1 = r0.f324191a
            r1.mo80591ar()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116820jo.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
