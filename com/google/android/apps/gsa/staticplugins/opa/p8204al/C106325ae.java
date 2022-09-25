package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92472e;
import com.google.android.apps.gsa.speech.p7298l.C92474g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5202d.p5203a.C66488a;
import com.google.speech.p5202d.p5203a.C66489b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.ae */
/* compiled from: PG */
public final class C106325ae extends C68247h {

    /* renamed from: a */
    private final C69464a f296631a;

    /* renamed from: c */
    private final C68283d f296632c;

    /* renamed from: d */
    private final C68283d f296633d;

    /* renamed from: e */
    private final C68283d f296634e;

    /* renamed from: f */
    private final C68283d f296635f;

    /* renamed from: g */
    private final C68283d f296636g;

    /* renamed from: h */
    private final C68283d f296637h;

    public C106325ae(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C106325ae.class), aVar);
        this.f296631a = aVar3;
        this.f296632c = C68236af.m98549d(dVar);
        this.f296633d = C68236af.m98549d(dVar2);
        this.f296634e = C68236af.m98549d(dVar3);
        this.f296635f = C68236af.m98549d(dVar4);
        this.f296636g = C68236af.m98549d(dVar5);
        this.f296637h = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C69464a aVar = this.f296631a;
        C92474g gVar = (C92474g) list.get(0);
        C92460b bVar = (C92460b) list.get(1);
        Query query = (Query) list.get(2);
        C89061q qVar = (C89061q) list.get(3);
        C58833ax axVar = (C58833ax) list.get(4);
        boolean booleanValue = ((Boolean) list.get(5)).booleanValue();
        C92472e eVar = (C92472e) aVar.mo17428b();
        C90536a a = C92474g.m152086a(query);
        boolean z = bVar.mo87187E() != null;
        C66488a aVar2 = (C66488a) C66489b.f180789h.createBuilder();
        aVar2.copyOnWrite();
        C66489b bVar2 = (C66489b) aVar2.instance;
        bVar2.f180791a |= 2048;
        bVar2.f180794d = false;
        aVar2.copyOnWrite();
        C66489b bVar3 = (C66489b) aVar2.instance;
        bVar3.f180791a |= 4096;
        bVar3.f180795e = true;
        C92474g gVar2 = gVar;
        C92472e eVar2 = eVar;
        gVar2.mo87223f(eVar2, query, a, z, booleanValue);
        gVar2.mo87224g(eVar2, bVar, query, qVar, C92252n.VOICE_ACTIONS, a);
        C92474g.m152088j(eVar, (C66422b) axVar.mo56111f(), (C66489b) aVar2.build(), C92252n.VOICE_ACTIONS);
        eVar.f257984g = true;
        return C60856cj.m92900i(eVar.mo87218a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f296632c.mo60297gq(), this.f296633d.mo60297gq(), this.f296634e.mo60297gq(), this.f296635f.mo60297gq(), this.f296636g.mo60297gq(), this.f296637h.mo60297gq());
    }
}
