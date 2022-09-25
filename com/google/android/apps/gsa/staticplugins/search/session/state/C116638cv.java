package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.cv */
/* compiled from: PG */
public final class C116638cv implements C87143ik {

    /* renamed from: a */
    private final C116637cu f323494a;

    /* renamed from: b */
    private final C86842bk f323495b;

    /* renamed from: c */
    private final C86842bk f323496c;

    /* renamed from: d */
    private final C86842bk f323497d;

    /* renamed from: e */
    private final C86842bk f323498e;

    /* renamed from: f */
    private final C86842bk f323499f;

    public C116638cv(C116637cu cuVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f323494a = cuVar;
        this.f323495b = new C86842bk(aVar);
        this.f323496c = new C86842bk(aVar2);
        this.f323497d = new C86842bk(aVar3);
        this.f323498e = new C86842bk(aVar4);
        this.f323499f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323494a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r15) {
        /*
            r14 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323495b
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323496c
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323497d
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323498e
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323499f
            r0.mo80534b(r15)
            com.google.android.apps.gsa.search.core.state.bk r15 = r14.f323495b
            boolean r0 = r15.f234552a
            if (r0 != 0) goto L_0x0039
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323496c
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0039
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323497d
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0039
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323498e
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0039
            com.google.android.apps.gsa.search.core.state.bk r0 = r14.f323499f
            boolean r0 = r0.f234552a
            if (r0 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            return
        L_0x0039:
            com.google.android.apps.gsa.staticplugins.search.session.state.cu r0 = r14.f323494a
            com.google.android.apps.gsa.search.core.state.bk r1 = r14.f323496c
            com.google.android.apps.gsa.search.core.state.bk r2 = r14.f323497d
            com.google.android.apps.gsa.search.core.state.bk r3 = r14.f323498e
            com.google.android.apps.gsa.search.core.state.bk r4 = r14.f323499f
            com.google.android.apps.gsa.search.core.state.dw r5 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.hd r5 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116755hd) r5
            int r5 = r5.f323883p
            boolean r6 = r2.f234552a
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0063
            com.google.android.apps.gsa.search.core.state.dw r2 = r2.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r2 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r2
            long r9 = r2.f323268b
            long r11 = r0.f323488b
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0063
            r0.f323488b = r9
            r2 = 1
            goto L_0x0064
        L_0x0063:
            r2 = 0
        L_0x0064:
            com.google.android.apps.gsa.search.core.state.dw r6 = r3.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ci r6 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116625ci) r6
            int r9 = r6.f323445b
            r10 = 3
            r11 = 4
            if (r9 == r10) goto L_0x00af
            if (r9 == r11) goto L_0x00af
            r10 = 5
            if (r9 != r10) goto L_0x0076
            goto L_0x00af
        L_0x0076:
            boolean r1 = r1.f234552a
            if (r1 != 0) goto L_0x0086
            boolean r1 = r4.f234552a
            if (r1 != 0) goto L_0x0086
            boolean r1 = r3.f234552a
            if (r1 == 0) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r1 = 0
            r3 = 0
            goto L_0x00ad
        L_0x0086:
            boolean r1 = r0.mo102817g(r8)
            int r3 = r0.f323490d
            if (r3 == r5) goto L_0x009f
            boolean r3 = com.google.android.apps.gsa.searchplate.p6965c.C88927a.m144529d(r3)
            if (r3 != 0) goto L_0x009f
            boolean r3 = com.google.android.apps.gsa.searchplate.p6965c.C88927a.m144529d(r5)
            if (r3 != 0) goto L_0x009f
            boolean r3 = r0.mo102819j(r8)
            goto L_0x00c6
        L_0x009f:
            com.google.android.apps.gsa.search.core.state.dw r3 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gp r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116740gp) r3
            boolean r3 = com.google.android.apps.gsa.staticplugins.search.session.state.C116637cu.m193558e(r5, r6, r3)
            boolean r3 = r0.mo102819j(r3)
        L_0x00ad:
            r4 = 0
            goto L_0x00c7
        L_0x00af:
            com.google.android.apps.gsa.search.core.state.dw r1 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gp r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116740gp) r1
            boolean r1 = com.google.android.apps.gsa.staticplugins.search.session.state.C116637cu.m193558e(r5, r6, r1)
            boolean r3 = r0.mo102819j(r1)
            boolean r1 = r6.mo102805i()
            r1 = r1 ^ r7
            boolean r1 = r0.mo102817g(r1)
        L_0x00c6:
            r4 = 1
        L_0x00c7:
            boolean r6 = r15.f234552a
            if (r6 == 0) goto L_0x00f8
            com.google.android.apps.gsa.search.core.state.dw r15 = r15.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r15 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r15
            com.google.android.apps.gsa.shared.search.Query r15 = r15.f323784p
            boolean r6 = r15.mo84392cY()
            if (r6 == 0) goto L_0x00de
            boolean r8 = r0.mo102818i(r8)
            goto L_0x00f8
        L_0x00de:
            boolean r6 = r15.mo84420dA()
            if (r6 == 0) goto L_0x00f8
            boolean r6 = r15.mo84391cX()
            if (r6 == 0) goto L_0x00f8
            long r9 = r0.f323489c
            long r12 = r15.f252780s
            int r15 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r15 == 0) goto L_0x00f8
            r0.f323489c = r12
            boolean r8 = r0.mo102818i(r7)
        L_0x00f8:
            if (r2 != 0) goto L_0x0104
            if (r3 != 0) goto L_0x0104
            if (r1 != 0) goto L_0x0104
            boolean r15 = r0.f323491e
            if (r15 == 0) goto L_0x0156
            if (r8 == 0) goto L_0x0156
        L_0x0104:
            com.google.android.apps.gsa.search.core.al.be.a r15 = r0.f323487a
            com.google.android.apps.gsa.search.shared.service.al r1 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.UPDATE_LOGO_HEADER_VISIBILITY
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r2)
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88369zc.f238970a
            com.google.android.apps.gsa.search.shared.service.b.ze r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88371ze.f238971e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.zd r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88370zd) r3
            boolean r6 = r0.f323491e
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.android.apps.gsa.search.shared.service.b.ze r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88371ze) r8
            int r9 = r8.f238973a
            r7 = r7 | r9
            r8.f238973a = r7
            r8.f238974b = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.gsa.search.shared.service.b.ze r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88371ze) r6
            int r7 = r6.f238973a
            r7 = r7 | 2
            r6.f238973a = r7
            r6.f238975c = r4
            boolean r4 = r0.f323492f
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.gsa.search.shared.service.b.ze r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88371ze) r6
            int r7 = r6.f238973a
            r7 = r7 | r11
            r6.f238973a = r7
            r6.f238976d = r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.gsa.search.shared.service.b.ze r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88371ze) r3
            r1.mo81965b(r2, r3)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r1 = r1.mo81964a()
            r15.mo78513a(r1)
        L_0x0156:
            r0.f323490d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116638cv.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
