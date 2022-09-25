package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.q */
/* compiled from: PG */
public final class C118041q extends C68247h {

    /* renamed from: a */
    private final C68283d f327616a;

    /* renamed from: c */
    private final C68283d f327617c;

    /* renamed from: d */
    private final C68283d f327618d;

    public C118041q(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C118041q.class), aVar);
        this.f327616a = C68236af.m98549d(dVar);
        this.f327617c = C68236af.m98549d(dVar2);
        this.f327618d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C84809b bVar = (C84809b) list.get(1);
        Query query = (Query) list.get(2);
        C58976aa aaVar = C58975e.f156826a;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C90918bo.m148514a(bVar.mo78492k(query, (ActionData) axVar.mo56107c(), (PlaybackStatus) query.mo84478h("android.speech.extra.PLAYBACK_STATUS_FROM_CLIENT"), C118033i.f327585d, C118033i.f327584c));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327616a.mo60297gq(), this.f327617c.mo60297gq(), this.f327618d.mo60297gq());
    }
}
