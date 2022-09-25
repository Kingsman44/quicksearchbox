package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.errors.C87413a;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.ba */
/* compiled from: PG */
public final class C94697ba extends C68247h {

    /* renamed from: a */
    private final C68283d f264825a;

    /* renamed from: c */
    private final C68283d f264826c;

    /* renamed from: d */
    private final C68283d f264827d;

    /* renamed from: e */
    private final C68283d f264828e;

    /* renamed from: f */
    private final C68283d f264829f;

    /* renamed from: g */
    private final C68283d f264830g;

    public C94697ba(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C94697ba.class), aVar);
        this.f264825a = C68236af.m98549d(dVar);
        this.f264826c = C68236af.m98549d(dVar2);
        this.f264827d = C68236af.m98549d(dVar3);
        this.f264828e = C68236af.m98549d(dVar4);
        this.f264829f = C68236af.m98549d(dVar5);
        this.f264830g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C84809b bVar = (C84809b) list.get(1);
        C58833ax axVar2 = (C58833ax) list.get(2);
        Query query = (Query) list.get(3);
        ClientConfig clientConfig = (ClientConfig) list.get(4);
        C58833ax axVar3 = (C58833ax) list.get(5);
        if (axVar.mo56113h() && axVar2.mo56113h()) {
            return C90918bo.m148514a(bVar.mo78483K((VoiceAction) axVar.mo56107c(), (ActionData) axVar2.mo56107c(), query, (C87413a) axVar3.mo56111f(), clientConfig, true, ((VoiceAction) axVar.mo56107c()).mo81083v(), false, false, false, ((ActionData) axVar2.mo56107c()).mo81104p()));
        }
        C59104x c = C94692aw.f264811a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
        ((C59052c) ((C59052c) c).mo56372aa(16847)).mo56386p("voiceAction or actionData are absent");
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264825a.mo60297gq(), this.f264826c.mo60297gq(), this.f264827d.mo60297gq(), this.f264828e.mo60297gq(), this.f264829f.mo60297gq(), this.f264830g.mo60297gq());
    }
}
