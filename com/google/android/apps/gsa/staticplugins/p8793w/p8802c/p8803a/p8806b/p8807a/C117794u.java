package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.grammar.pumpkin.C66525q;
import com.google.speech.grammar.pumpkin.C66527s;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.u */
/* compiled from: PG */
public final class C117794u extends C68247h {

    /* renamed from: a */
    private final C68283d f326934a;

    /* renamed from: c */
    private final C68283d f326935c;

    /* renamed from: d */
    private final C68283d f326936d;

    /* renamed from: e */
    private final C68283d f326937e;

    public C117794u(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C117794u.class), aVar);
        this.f326934a = C68236af.m98549d(dVar);
        this.f326935c = C68236af.m98549d(dVar2);
        this.f326936d = C68236af.m98549d(dVar3);
        this.f326937e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        b bVar = (b) list.get(0);
        Query query = (Query) list.get(1);
        C86124t tVar = (C86124t) list.get(2);
        C58974d dVar = (C58974d) list.get(3);
        C66527s sVar = bVar.e;
        if (sVar == null || sVar.f180939a.size() == 0) {
            if (!query.f252770i.equals("##.##.##.#############!!!")) {
                ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(18625)).mo56386p("Didn't obtain valid parse for Query");
                if (tVar.mo79746e(C90086ek.f250393cL)) {
                    C59104x d = C117786m.f326911a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "LegacyProducer");
                    C59052c cVar = (C59052c) d;
                    cVar.mo56378ag(C38505d.f101864b, 191808145);
                    ((C59052c) ((C59052c) cVar.mo56382g(new RuntimeException("Query intent missing"))).mo56372aa(18626)).mo56386p("Query intent missing");
                }
            }
            bVar = b.a;
        } else {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(18627)).mo56389s("Obtained valid parses for Query. Top Action is [%s]", ((C66525q) sVar.f180939a.get(0)).f180932b);
        }
        return C60856cj.m92900i(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326934a.mo60297gq(), this.f326935c.mo60297gq(), this.f326936d.mo60297gq(), this.f326937e.mo60297gq());
    }
}
