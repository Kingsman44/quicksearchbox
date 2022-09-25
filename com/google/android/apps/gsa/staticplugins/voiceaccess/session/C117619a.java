package com.google.android.apps.gsa.staticplugins.voiceaccess.session;

import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8790e.C117674e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.a */
/* compiled from: PG */
public final class C117619a implements C86686h {

    /* renamed from: a */
    private final C117674e f326500a;

    public C117619a(C117674e eVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f326500a = eVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
        C58976aa aaVar = C58975e.f156826a;
        this.f326500a.mo103427d();
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (r3 != 0) goto L_0x005a;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80297j(long r2, com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb r4, com.google.common.base.C58833ax r5) {
        /*
            r1 = this;
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.e.e r5 = r1.f326500a
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.e.a r0 = new com.google.android.apps.gsa.staticplugins.voiceaccess.session.e.a
            r0.<init>(r5, r2)
            r5.mo103426c(r0)
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.b.b r2 = r5.f326622d
            r2.f326513b = r5
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.ae r2 = r5.f326623e
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.g.a r2 = r2.f326531b
            r2.f326628a = r5
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.a.d r2 = r5.f326621c
            r2.f326505b = r5
            r2 = 1
            if (r4 == 0) goto L_0x0059
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88441bl.f239105a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r0 = r4.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r0.mo58857o(r3)
            if (r3 == 0) goto L_0x0059
            com.google.protobuf.bt r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88441bl.f239105a
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r4.mo58887l(r3)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r0 = r3.f169971d
            java.lang.Object r4 = r4.mo58854l(r0)
            if (r4 != 0) goto L_0x0046
            java.lang.Object r3 = r3.f169969b
            goto L_0x004a
        L_0x0046:
            java.lang.Object r3 = r3.mo58889c(r4)
        L_0x004a:
            com.google.android.apps.gsa.search.shared.service.c.b.bi r3 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88438bi) r3
            int r4 = r3.f239102a
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0059
            int r3 = r3.f239103b
            int r3 = com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88440bk.m142810a(r3)
            if (r3 != 0) goto L_0x005a
        L_0x0059:
            r3 = 1
        L_0x005a:
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.ae r4 = r5.f326623e
            int r3 = r3 + -1
            if (r3 == r2) goto L_0x006b
            r2 = 2
            if (r3 == r2) goto L_0x0068
            java.lang.String r2 = "and.va.unknown"
            r4.f326530a = r2
            goto L_0x006f
        L_0x0068:
            java.lang.String r2 = "and.va.hotword"
            goto L_0x006d
        L_0x006b:
            java.lang.String r2 = "and.va.deeplink"
        L_0x006d:
            r4.f326530a = r2
        L_0x006f:
            r2 = 0
            r4.f326534e = r2
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.c r2 = r5.mo103425b()
            com.google.android.apps.gsa.binaries.satin.app.azf r2 = (com.google.android.apps.gsa.binaries.satin.app.azf) r2
            dagger.b.d r2 = r2.b
            com.google.common.util.concurrent.cx r2 = r2.mo60297gq()
            com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.ae r3 = r5.f326623e
            r3.f326533d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.voiceaccess.session.C117619a.mo80297j(long, com.google.android.apps.gsa.search.shared.service.c.b.bb, com.google.common.base.ax):void");
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
