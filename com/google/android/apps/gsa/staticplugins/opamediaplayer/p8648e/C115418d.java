package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8648e;

import com.google.android.apps.gsa.search.core.p6491a.C84345ad;
import com.google.android.apps.gsa.search.core.service.C86665cc;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88421as;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88422at;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88459i;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.e.d */
/* compiled from: PG */
public final class C115418d implements C86686h {

    /* renamed from: a */
    public final C87673aa f320229a;

    /* renamed from: c */
    public final C68214a f320230c;

    /* renamed from: d */
    public final C58833ax f320231d;

    /* renamed from: e */
    public final C84345ad f320232e;

    /* renamed from: f */
    private final C22871g f320233f;

    /* renamed from: g */
    private final C86665cc f320234g;

    public C115418d(C87673aa aaVar, C86665cc ccVar, C68214a aVar, C22871g gVar, C58833ax axVar, C84345ad adVar) {
        this.f320229a = aaVar;
        this.f320234g = ccVar;
        this.f320230c = aVar;
        this.f320233f = gVar;
        this.f320231d = axVar;
        this.f320232e = adVar;
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
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        Object obj2;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r5 = C62942bv.checkIsLite(C88422at.f239070a);
        bbVar.mo58887l(r5);
        if (bbVar.f169962ag.mo58857o(r5.f169971d)) {
            this.f320234g.mo80266c(j);
            C62940bt r2 = C62942bv.checkIsLite(C88422at.f239070a);
            bbVar.mo58887l(r2);
            Object l = bbVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj2 = r2.f169969b;
            } else {
                obj2 = r2.mo58889c(l);
            }
            C88421as asVar = (C88421as) obj2;
            if (asVar != null) {
                this.f320233f.mo28212l("handle-opamediaplayer-message", new C115415a(this, asVar));
                return;
            }
            return;
        }
        C62940bt r52 = C62942bv.checkIsLite(C88459i.f239145a);
        bbVar.mo58887l(r52);
        if (bbVar.f169962ag.mo58857o(r52.f169971d)) {
            this.f320234g.mo80266c(j);
            C62940bt r53 = C62942bv.checkIsLite(C88459i.f239145a);
            bbVar.mo58887l(r53);
            Object l2 = bbVar.f169962ag.mo58854l(r53.f169971d);
            if (l2 == null) {
                obj = r53.f169969b;
            } else {
                obj = r53.mo58889c(l2);
            }
            C88458h hVar = (C88458h) obj;
            if (hVar != null) {
                this.f320233f.mo28212l("handle-audioplayer-message", new C115416b(this, hVar, j));
            }
        }
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
