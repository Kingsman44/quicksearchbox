package com.google.android.apps.gsa.staticplugins.p7627by.p7629b;

import com.google.android.apps.gsa.search.core.p6814o.C86187b;
import com.google.android.apps.gsa.search.core.p6884y.p6914h.C87382b;
import com.google.android.apps.gsa.search.core.p6884y.p6914h.p6916b.C87385c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6848e.C86689k;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.by.b.a */
/* compiled from: PG */
public final class C97475a implements C86686h {

    /* renamed from: a */
    private static final C59071e f272173a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.by.b.a");

    /* renamed from: c */
    private static final C58528ij f272174c = new C58759qy(C87739bu.CANVAS_WORKER_BINDER_REQUEST);

    /* renamed from: d */
    private final C87382b f272175d;

    /* renamed from: e */
    private final C86689k f272176e;

    /* renamed from: f */
    private final C86187b f272177f;

    public C97475a(C87382b bVar, C86689k kVar, C86187b bVar2) {
        this.f272175d = bVar;
        this.f272176e = kVar;
        this.f272177f = bVar2;
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
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (C86187b.f232891b.contains(a)) {
            this.f272177f.mo79827a(clientEventData);
        } else if (C87382b.f235960a.contains(a)) {
            this.f272175d.mo81043c(clientEventData);
        } else if (((C58759qy) f272174c).f156534a.equals(a)) {
            cVar.mo80279a(clientEventData);
        } else {
            ((C59052c) ((C59052c) f272173a.mo56226d()).mo56372aa(21309)).mo56389s("Received unknown event %s.", a);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85287n(this.f272175d);
    }

    /* renamed from: h */
    public final void mo80295h() {
        this.f272175d.mo81041a();
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        this.f272175d.mo81042b(aVar);
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        C86689k kVar = this.f272176e;
        C62940bt btVar = C87385c.f235968a;
        if (axVar.mo56113h()) {
            C88433bd bdVar = (C88433bd) axVar.mo56107c();
            if (kVar.mo80301a(bdVar) == 1) {
                C62940bt r2 = C62942bv.checkIsLite(btVar);
                bdVar.mo58887l(r2);
                if (bdVar.f169962ag.mo58857o(r2.f169971d)) {
                    C62940bt r22 = C62942bv.checkIsLite(btVar);
                    bdVar.mo58887l(r22);
                    Object l = bdVar.f169962ag.mo58854l(r22.f169971d);
                    if (l == null) {
                        obj = r22.f169969b;
                    } else {
                        obj = r22.mo58889c(l);
                    }
                    C58833ax.m90834k(obj);
                }
            }
        }
        this.f272175d.mo81044e(bbVar);
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final boolean mo80299l() {
        return false;
    }
}
