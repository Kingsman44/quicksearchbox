package com.google.android.apps.gsa.staticplugins.voiceaccess;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6721dq.C85411a;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.search.core.p6820r.p6832d.C86418g;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7442bc.C94514g;
import com.google.android.apps.gsa.staticplugins.voiceaccess.p8784a.C117609a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.a */
/* compiled from: PG */
public final class C117608a extends C86734a implements C85411a {

    /* renamed from: a */
    C86577w f326474a;

    /* renamed from: b */
    private final C117609a f326475b;

    /* renamed from: c */
    private final C94514g f326476c;

    public C117608a(C94514g gVar, C117609a aVar) {
        super(C118575h.WORKER_VOICE_ACCESS_TO_SRP_TRANSITION, "voice_access_to_srp_transition");
        this.f326476c = gVar;
        this.f326475b = aVar;
    }

    /* renamed from: a */
    public final void mo78926a(Query query, long j, C86498a aVar, C60870cx cxVar, C89356b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        C86577w i = aVar.mo80185i(query, C60856cj.m92900i(new C86418g(C58485gu.m89844l(new C86569o[]{this.f326475b, this.f326476c.mo88489a(j, bVar)}))), cxVar, bVar);
        i.mo80180a();
        this.f326474a = i;
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C60537to toVar = C60537to.UNKNOWN_STATE;
        C86577w wVar = this.f326474a;
        if (wVar != null) {
            wVar.mo80181b();
            this.f326474a = null;
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
