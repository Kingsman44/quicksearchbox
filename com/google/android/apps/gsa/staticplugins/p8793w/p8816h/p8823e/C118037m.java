package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54948af;
import com.google.p4152bb.p4153a.C55421x;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.m */
/* compiled from: PG */
public final class C118037m extends C68247h {

    /* renamed from: a */
    private final C68283d f327600a;

    /* renamed from: c */
    private final C68283d f327601c;

    /* renamed from: d */
    private final C68283d f327602d;

    /* renamed from: e */
    private final C68283d f327603e;

    /* renamed from: f */
    private final C68283d f327604f;

    /* renamed from: g */
    private final C68283d f327605g;

    /* renamed from: h */
    private final C68283d f327606h;

    public C118037m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C118037m.class), aVar);
        this.f327600a = C68236af.m98549d(dVar);
        this.f327601c = C68236af.m98549d(dVar2);
        this.f327602d = C68236af.m98549d(dVar3);
        this.f327603e = C68236af.m98549d(dVar4);
        this.f327604f = C68236af.m98549d(dVar5);
        this.f327605g = C68236af.m98549d(dVar6);
        this.f327606h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C84809b bVar = (C84809b) list.get(0);
        Query query = (Query) list.get(1);
        ClientConfig clientConfig = (ClientConfig) list.get(2);
        C87541c cVar = (C87541c) list.get(3);
        C58833ax axVar = (C58833ax) list.get(4);
        C58833ax axVar2 = (C58833ax) list.get(5);
        C58833ax axVar3 = (C58833ax) list.get(6);
        C58976aa aaVar = C58975e.f156826a;
        boolean h = (true ^ axVar3.mo56113h()) | (!axVar.mo56113h());
        if (!axVar2.mo56113h() || !((ActionData) axVar2.mo56107c()).mo81108t() || h) {
            return C60856cj.m92900i(C87421i.m141588a(2));
        }
        CardDecision cardDecision = (CardDecision) axVar3.mo56107c();
        ActionData actionData = (ActionData) axVar2.mo56107c();
        VoiceAction voiceAction = (VoiceAction) axVar.mo56107c();
        C54946ad s = ((ActionData) axVar2.mo56107c()).mo81107s();
        s.getClass();
        C54948af afVar = s.f144536d;
        if (afVar == null) {
            afVar = C54948af.f144541h;
        }
        C55421x a = C55421x.m87686a(afVar.f144544b);
        if (a == null) {
            a = C55421x.UNKNOWN_ACTION_TYPE;
        }
        bVar.mo78480H(cVar, clientConfig, query, actionData, voiceAction, cardDecision, a, false);
        if (cardDecision.f236256j) {
            ((VoiceAction) axVar.mo56107c()).mo81055E();
            bVar.mo78503w(query, (ActionData) axVar2.mo56107c(), (VoiceAction) axVar.mo56107c(), cardDecision, cVar, C118028d.f327578a);
        }
        return C60856cj.m92900i(C87421i.f236079a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327600a.mo60297gq(), this.f327601c.mo60297gq(), this.f327602d.mo60297gq(), this.f327603e.mo60297gq(), this.f327604f.mo60297gq(), this.f327605g.mo60297gq(), this.f327606h.mo60297gq());
    }
}
