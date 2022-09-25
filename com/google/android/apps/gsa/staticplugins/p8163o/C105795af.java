package com.google.android.apps.gsa.staticplugins.p8163o;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6519al.p6628by.p6629a.C85043g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88459i;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.af */
/* compiled from: PG */
public final class C105795af implements C86686h {

    /* renamed from: a */
    public final C90476a f295139a;

    /* renamed from: c */
    public final C22871g f295140c;

    /* renamed from: d */
    public final Context f295141d;

    /* renamed from: e */
    public C87673aa f295142e;

    /* renamed from: f */
    public boolean f295143f;

    /* renamed from: g */
    public final C85043g f295144g;

    public C105795af(Context context, C22871g gVar, C85043g gVar2, C90476a aVar) {
        this.f295144g = gVar2;
        this.f295139a = aVar;
        this.f295140c = gVar;
        this.f295141d = context;
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
        C87673aa aaVar;
        if (this.f295143f && (aaVar = this.f295142e) != null) {
            C22871g gVar = this.f295140c;
            Objects.requireNonNull(aaVar);
            gVar.mo28212l("disconnect-search-service-client", new C105792ac(aaVar));
        }
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        C62940bt r1 = C62942bv.checkIsLite(C88459i.f239145a);
        bbVar.mo58887l(r1);
        if (bbVar.f169962ag.mo58857o(r1.f169971d)) {
            this.f295140c.mo28212l("handle-notification-message", new C105793ad(this, bbVar));
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
