package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7746e;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.e.k */
/* compiled from: PG */
public final class C99118k extends C68247h {

    /* renamed from: a */
    private final C69464a f277199a;

    /* renamed from: c */
    private final C68283d f277200c;

    /* renamed from: d */
    private final C68283d f277201d;

    /* renamed from: e */
    private final C68283d f277202e;

    /* renamed from: f */
    private final C68283d f277203f;

    /* renamed from: g */
    private final C68283d f277204g;

    /* renamed from: h */
    private final C68283d f277205h;

    /* renamed from: i */
    private final C68283d f277206i;

    /* renamed from: j */
    private final C68283d f277207j;

    /* renamed from: k */
    private final C68283d f277208k;

    public C99118k(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9) {
        super(aVar2, new C68277d(C99118k.class), aVar);
        this.f277199a = aVar3;
        this.f277200c = C68236af.m98549d(dVar);
        this.f277201d = C68236af.m98549d(dVar2);
        this.f277202e = C68236af.m98549d(dVar3);
        this.f277203f = C68236af.m98549d(dVar4);
        this.f277204g = C68236af.m98549d(dVar5);
        this.f277205h = C68236af.m98549d(dVar6);
        this.f277206i = C68236af.m98549d(dVar7);
        this.f277207j = C68236af.m98549d(dVar8);
        this.f277208k = C68236af.m98549d(dVar9);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C69464a aVar = this.f277199a;
        Query query = (Query) list.get(2);
        C90536a aVar2 = (C90536a) list.get(4);
        boolean booleanValue = ((Boolean) list.get(7)).booleanValue();
        boolean booleanValue2 = ((Boolean) list.get(8)).booleanValue();
        C92472e eVar = (C92472e) aVar.mo17428b();
        C92474g gVar = (C92474g) list.get(0);
        C92472e eVar2 = eVar;
        C66489b bVar = (C66489b) list.get(6);
        gVar.mo87223f(eVar2, query, aVar2, booleanValue, booleanValue2);
        gVar.mo87224g(eVar2, (C92460b) list.get(1), query, (C89061q) list.get(3), C92252n.VOICE_ACTIONS, aVar2);
        C92474g.m152088j(eVar, (C66422b) ((C58833ax) list.get(5)).mo56111f(), bVar, C92252n.VOICE_ACTIONS);
        eVar.f257984g = true;
        return C60856cj.m92900i(eVar.mo87218a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277200c.mo60297gq(), this.f277201d.mo60297gq(), this.f277202e.mo60297gq(), this.f277203f.mo60297gq(), this.f277204g.mo60297gq(), this.f277205h.mo60297gq(), this.f277206i.mo60297gq(), this.f277207j.mo60297gq(), this.f277208k.mo60297gq());
    }
}
