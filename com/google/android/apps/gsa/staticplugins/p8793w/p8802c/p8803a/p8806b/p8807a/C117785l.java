package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

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
import com.google.speech.p5202d.p5203a.C66489b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.l */
/* compiled from: PG */
public final class C117785l extends C68247h {

    /* renamed from: a */
    private final C68283d f326901a;

    /* renamed from: c */
    private final C68283d f326902c;

    /* renamed from: d */
    private final C69464a f326903d;

    /* renamed from: e */
    private final C68283d f326904e;

    /* renamed from: f */
    private final C68283d f326905f;

    /* renamed from: g */
    private final C68283d f326906g;

    /* renamed from: h */
    private final C68283d f326907h;

    /* renamed from: i */
    private final C68283d f326908i;

    /* renamed from: j */
    private final C68283d f326909j;

    /* renamed from: k */
    private final C68283d f326910k;

    public C117785l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9) {
        super(aVar2, new C68277d(C117785l.class), aVar);
        this.f326901a = C68236af.m98549d(dVar);
        this.f326902c = C68236af.m98549d(dVar2);
        this.f326903d = aVar3;
        this.f326904e = C68236af.m98549d(dVar3);
        this.f326905f = C68236af.m98549d(dVar4);
        this.f326906g = C68236af.m98549d(dVar5);
        this.f326907h = C68236af.m98549d(dVar6);
        this.f326908i = C68236af.m98549d(dVar7);
        this.f326909j = C68236af.m98549d(dVar8);
        this.f326910k = C68236af.m98549d(dVar9);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        C69464a aVar = this.f326903d;
        C90536a aVar2 = (C90536a) list.get(3);
        ((Boolean) list.get(6)).booleanValue();
        C92472e eVar = (C92472e) aVar.mo17428b();
        C92474g gVar = (C92474g) list.get(5);
        C92472e eVar2 = eVar;
        gVar.mo87223f(eVar2, query, aVar2, booleanValue, true);
        gVar.mo87224g(eVar2, (C92460b) list.get(2), query, (C89061q) list.get(4), C92252n.VOICE_ACTIONS, aVar2);
        C92474g.m152088j(eVar, (C66422b) ((C58833ax) list.get(7)).mo56111f(), (C66489b) list.get(8), C92252n.VOICE_ACTIONS);
        eVar.f257984g = true;
        return C60856cj.m92900i(eVar.mo87218a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326901a.mo60297gq(), this.f326902c.mo60297gq(), this.f326904e.mo60297gq(), this.f326905f.mo60297gq(), this.f326906g.mo60297gq(), this.f326907h.mo60297gq(), this.f326908i.mo60297gq(), this.f326909j.mo60297gq(), this.f326910k.mo60297gq());
    }
}
