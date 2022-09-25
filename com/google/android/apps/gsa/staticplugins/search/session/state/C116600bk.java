package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bk */
/* compiled from: PG */
public final class C116600bk implements C87143ik {

    /* renamed from: a */
    private final C116599bj f323372a;

    /* renamed from: b */
    private final C86842bk f323373b;

    /* renamed from: c */
    private final C86842bk f323374c;

    /* renamed from: d */
    private final C86842bk f323375d;

    /* renamed from: e */
    private final C86842bk f323376e;

    /* renamed from: f */
    private final C86842bk f323377f;

    public C116600bk(C116599bj bjVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f323372a = bjVar;
        this.f323373b = new C86842bk(aVar);
        this.f323374c = new C86842bk(aVar2);
        this.f323375d = new C86842bk(aVar3);
        this.f323376e = new C86842bk(aVar4);
        this.f323377f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323372a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (r5.mo102883Z(r9) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        if (r1.mo102997ab(r9) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323373b
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323374c
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323375d
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323376e
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323377f
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r1 = r0.f323373b
            boolean r2 = r1.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323374c
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323375d
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323376e
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323377f
            boolean r2 = r2.f234552a
            if (r2 == 0) goto L_0x0199
        L_0x003b:
            com.google.android.apps.gsa.staticplugins.search.session.state.bj r2 = r0.f323372a
            com.google.android.apps.gsa.search.core.state.bk r3 = r0.f323374c
            com.google.android.apps.gsa.search.core.state.bk r4 = r0.f323375d
            com.google.android.apps.gsa.search.core.state.bk r5 = r0.f323376e
            com.google.android.apps.gsa.search.core.state.bk r6 = r0.f323377f
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.util.BitFlags r7 = r2.f323366b
            r8 = 3
            boolean r7 = r7.mo85052e(r8)
            boolean r10 = r5.f234552a
            r11 = 0
            r13 = 1
            r15 = 1
            r16 = 0
            if (r10 == 0) goto L_0x0084
            com.google.android.apps.gsa.search.core.state.dw r10 = r5.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r10 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r10
            com.google.android.apps.gsa.shared.search.Query r8 = r2.f323369e
            com.google.android.apps.gsa.shared.search.Query r9 = r10.f323784p
            boolean r8 = r9.mo84383cP(r8)
            if (r8 == 0) goto L_0x006b
            goto L_0x0084
        L_0x006b:
            com.google.android.apps.gsa.shared.search.Query r8 = r10.f323784p
            r2.f323369e = r8
            com.google.android.apps.gsa.shared.search.Query r8 = r2.f323369e
            boolean r9 = r2.f323371g
            if (r9 != 0) goto L_0x007d
            boolean r8 = r8.mo84385cR()
            if (r8 != 0) goto L_0x007d
            r2.f323371g = r15
        L_0x007d:
            com.google.android.apps.gsa.shared.util.BitFlags r8 = r2.f323366b
            boolean r8 = r8.mo85049c(r13, r11)
            goto L_0x0085
        L_0x0084:
            r8 = 0
        L_0x0085:
            if (r8 != 0) goto L_0x008f
            boolean r9 = r1.f234552a
            if (r9 != 0) goto L_0x008f
            boolean r9 = r4.f234552a
            if (r9 == 0) goto L_0x0136
        L_0x008f:
            com.google.android.apps.gsa.search.core.state.dw r1 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r1
            com.google.android.apps.gsa.search.core.state.dw r5 = r5.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r5 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r5
            com.google.android.apps.gsa.shared.search.Query r9 = r5.f323784p
            com.google.android.apps.gsa.shared.search.Query r10 = r2.f323370f
            boolean r10 = r5.mo102883Z(r10)
            if (r10 == 0) goto L_0x00a8
            com.google.android.apps.gsa.shared.search.Query r10 = r2.f323370f
            goto L_0x00ae
        L_0x00a8:
            boolean r10 = r5.mo102883Z(r9)
            if (r10 != 0) goto L_0x00db
        L_0x00ae:
            com.google.android.apps.gsa.shared.search.Query r10 = r2.f323370f
            boolean r10 = r1.mo102997ab(r10)
            if (r10 == 0) goto L_0x00b9
            com.google.android.apps.gsa.shared.search.Query r10 = r2.f323370f
            goto L_0x00bf
        L_0x00b9:
            boolean r10 = r1.mo102997ab(r9)
            if (r10 != 0) goto L_0x00db
        L_0x00bf:
            boolean r5 = r5.mo102878T()
            if (r5 == 0) goto L_0x00c6
            goto L_0x00db
        L_0x00c6:
            boolean r5 = r1.mo102994Y()
            if (r5 == 0) goto L_0x00fd
            com.google.android.apps.gsa.shared.search.Query r5 = r2.f323370f
            boolean r5 = r1.mo102997ab(r5)
            if (r5 != 0) goto L_0x00fd
            com.google.android.apps.gsa.shared.util.BitFlags r5 = r2.f323366b
            boolean r5 = r5.mo85049c(r13, r11)
            goto L_0x00fe
        L_0x00db:
            com.google.android.apps.gsa.shared.search.Query r5 = r2.f323370f
            r2.f323370f = r9
            com.google.android.apps.gsa.shared.util.BitFlags r5 = r2.f323366b
            boolean r5 = r5.mo85049c(r11, r13)
            if (r5 == 0) goto L_0x00e9
            r5 = 1
            goto L_0x00fe
        L_0x00e9:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.search.session.state.C116599bj.f323365a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "S_ConversationState"
            r5.mo56378ag(r9, r10)
            java.lang.String r9 = "trackExpectingFollowOn - FLAG_CONVERSATION_ON_FOR_FOLLOW_ON already set"
            r10 = 32013(0x7d0d, float:4.486E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r10)).mo56386p(r9)
        L_0x00fd:
            r5 = 0
        L_0x00fe:
            r8 = r8 | r5
            com.google.android.apps.gsa.shared.util.BitFlags r5 = r2.f323366b
            com.google.android.apps.gsa.search.core.state.dw r4 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.aq r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116579aq) r4
            boolean r4 = r4.mo102783g()
            if (r4 != 0) goto L_0x0116
            boolean r1 = r1.mo102995Z()
            if (r1 == 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r1 = 0
            goto L_0x0117
        L_0x0116:
            r1 = 1
        L_0x0117:
            r9 = 2
            r5.mo85055h(r9, r1)
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r2.f323366b
            r4 = 3
            boolean r1 = r1.mo85052e(r4)
            if (r7 != r1) goto L_0x0127
            goto L_0x0136
        L_0x0127:
            if (r1 == 0) goto L_0x0131
            com.google.android.apps.gsa.search.core.al.ab.a r1 = r2.f323367c
            com.google.android.apps.gsa.shared.search.Query r4 = r2.f323369e
            r1.mo78382e(r4)
            goto L_0x0136
        L_0x0131:
            com.google.android.apps.gsa.search.core.al.ab.a r1 = r2.f323367c
            r1.mo78380c()
        L_0x0136:
            boolean r1 = r3.f234552a
            if (r1 == 0) goto L_0x016f
            com.google.android.apps.gsa.search.core.state.dw r1 = r3.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r1
            long r3 = r1.f323268b
            long r9 = r2.f323368d
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x016f
            r2.f323368d = r3
            boolean r1 = r2.mo102793e()
            com.google.android.apps.gsa.search.shared.service.b.yw r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw.f238955d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.yv r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88361yv) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.search.shared.service.b.yw r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw) r4
            int r5 = r4.f238957a
            r5 = r5 | r15
            r4.f238957a = r5
            r4.f238958b = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.apps.gsa.search.shared.service.b.yw r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw) r1
            com.google.android.apps.gsa.search.core.al.ab.a r3 = r2.f323367c
            r3.mo78378a(r1)
        L_0x016f:
            boolean r1 = r6.f234552a
            if (r1 == 0) goto L_0x0192
            com.google.android.apps.gsa.search.core.state.dw r1 = r6.mo80533a()
            com.google.android.apps.gsa.search.core.state.d.bq r1 = (com.google.android.apps.gsa.search.core.state.p6872d.C86950bq) r1
            com.google.android.ssb.g r1 = r1.mo80607e()
            com.google.android.ssb.g r3 = com.google.android.ssb.C45350g.IDLE
            if (r1 != r3) goto L_0x0192
            boolean r1 = r2.f323371g
            if (r1 == 0) goto L_0x0192
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f323369e
            boolean r1 = r1.mo84385cR()
            if (r1 == 0) goto L_0x0192
            com.google.android.apps.gsa.search.core.al.ab.a r1 = r2.f323367c
            r1.mo78379b()
        L_0x0192:
            if (r8 == 0) goto L_0x0199
            com.google.android.apps.gsa.staticplugins.search.session.state.bj r1 = r0.f323372a
            r1.mo80591ar()
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116600bk.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
