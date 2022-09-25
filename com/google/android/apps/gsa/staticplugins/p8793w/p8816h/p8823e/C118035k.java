package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.search.Query;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.k */
/* compiled from: PG */
public final class C118035k extends C68247h {

    /* renamed from: a */
    private final C68283d f327590a;

    /* renamed from: c */
    private final C68283d f327591c;

    /* renamed from: d */
    private final C68283d f327592d;

    /* renamed from: e */
    private final C68283d f327593e;

    /* renamed from: f */
    private final C68283d f327594f;

    public C118035k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C118035k.class), aVar);
        this.f327590a = C68236af.m98549d(dVar);
        this.f327591c = C68236af.m98549d(dVar2);
        this.f327592d = C68236af.m98549d(dVar3);
        this.f327593e = C68236af.m98549d(dVar4);
        this.f327594f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C84809b bVar = (C84809b) list.get(0);
        Query query = (Query) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C118826c cVar = (C118826c) list.get(3);
        C58833ax axVar2 = (C58833ax) list.get(4);
        C58976aa aaVar = C58975e.f156826a;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C118033i.f327583b);
        }
        if (((CardDecision) axVar.mo56107c()).f236254h) {
            return C60856cj.m92900i(C87421i.f236079a);
        }
        if (!axVar2.mo56113h()) {
            return C60856cj.m92900i(C118033i.f327583b);
        }
        if (!((VoiceAction) axVar2.mo56107c()).mo81133M()) {
            return C60856cj.m92900i(C118033i.f327583b);
        }
        VoiceAction voiceAction = (VoiceAction) axVar2.mo56107c();
        if (voiceAction.mo81087y() || voiceAction.mo81053C() || voiceAction.mo81084w() || voiceAction.mo81083v() || voiceAction.mo81052B()) {
            return C60856cj.m92900i(C118033i.f327583b);
        }
        VoiceAction voiceAction2 = (VoiceAction) axVar2.mo56107c();
        voiceAction2.mo81060J(1);
        voiceAction2.mo81058H();
        return bVar.mo78488g(voiceAction2, query, C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327590a.mo60297gq(), this.f327591c.mo60297gq(), this.f327592d.mo60297gq(), this.f327593e.mo60297gq(), this.f327594f.mo60297gq());
    }
}
