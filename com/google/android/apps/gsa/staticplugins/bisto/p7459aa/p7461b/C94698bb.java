package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bb */
/* compiled from: PG */
public final class C94698bb extends C68247h {

    /* renamed from: a */
    private final C68283d f264831a;

    /* renamed from: c */
    private final C68283d f264832c;

    /* renamed from: d */
    private final C68283d f264833d;

    public C94698bb(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C94698bb.class), aVar);
        this.f264831a = C68236af.m98549d(dVar);
        this.f264832c = C68236af.m98549d(dVar2);
        this.f264833d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C84809b bVar = (C84809b) list.get(1);
        Query query = (Query) list.get(2);
        if (!axVar.mo56113h()) {
            C59104x c = C94692aw.f264811a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
            ((C59052c) ((C59052c) c).mo56372aa(16849)).mo56386p("actionDataOptional is absent");
            return C60856cj.m92900i(C58836b.f156633a);
        } else if (((ActionData) axVar.mo56107c()).equals(ActionData.f235991b)) {
            C59104x c2 = C94692aw.f264811a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
            ((C59052c) ((C59052c) c2).mo56372aa(16848)).mo56386p("actionData is NONE");
            return C60856cj.m92900i(C58836b.f156633a);
        } else {
            return C90918bo.m148514a(bVar.mo78492k(query, (ActionData) axVar.mo56107c(), (PlaybackStatus) query.mo84478h("android.speech.extra.PLAYBACK_STATUS_FROM_CLIENT"), C94692aw.f264813c, C94692aw.f264812b));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264831a.mo60297gq(), this.f264832c.mo60297gq(), this.f264833d.mo60297gq());
    }
}
