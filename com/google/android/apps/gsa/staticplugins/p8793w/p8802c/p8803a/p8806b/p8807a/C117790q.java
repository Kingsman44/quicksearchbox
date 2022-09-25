package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.q */
/* compiled from: PG */
public final class C117790q extends C68247h {

    /* renamed from: a */
    private final C68283d f326920a;

    /* renamed from: c */
    private final C68283d f326921c;

    /* renamed from: d */
    private final C68283d f326922d;

    /* renamed from: e */
    private final C68283d f326923e;

    /* renamed from: f */
    private final C68283d f326924f;

    public C117790q(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117790q.class), aVar);
        this.f326920a = C68236af.m98549d(dVar);
        this.f326921c = C68236af.m98549d(dVar2);
        this.f326922d = C68236af.m98549d(dVar3);
        this.f326923e = C68236af.m98549d(dVar4);
        this.f326924f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C66527s sVar;
        List list = (List) obj;
        b bVar = (b) list.get(0);
        Query query = (Query) list.get(1);
        C58974d dVar = (C58974d) list.get(2);
        C58833ax axVar = (C58833ax) list.get(3);
        C86124t tVar = (C86124t) list.get(4);
        if (!(bVar == b.a || (sVar = bVar.e) == null || sVar.f180939a.size() <= 0)) {
            String str = ((C66525q) bVar.e.f180939a.get(0)).f180932b;
            if (tVar.mo79746e(C90086ek.f250432cy) && axVar.mo56113h()) {
                ((C11897m) axVar.mo56107c()).mo20283d(query, str);
                if (tVar.mo79746e(C90086ek.f250397cP) && !str.isEmpty()) {
                    C59104x d = C117786m.f326911a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "LegacyProducer");
                    C59052c cVar = (C59052c) d;
                    cVar.mo56378ag(C38505d.f101864b, 189912905);
                    ((C59052c) ((C59052c) cVar.mo56382g(new RuntimeException("Pumpkin response missing"))).mo56372aa(18632)).mo56386p("Pumpkin response missing");
                }
                return C118826c.f331423b;
            }
        }
        if (tVar.mo79746e(C90086ek.f250393cL)) {
            C59104x d2 = C117786m.f326911a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "LegacyProducer");
            C59052c cVar2 = (C59052c) d2;
            cVar2.mo56378ag(C38505d.f101864b, 189912905);
            ((C59052c) ((C59052c) cVar2.mo56382g(new RuntimeException("Pumpkin response missing"))).mo56372aa(18630)).mo56386p("Pumpkin response missing");
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326920a.mo60297gq(), this.f326921c.mo60297gq(), this.f326922d.mo60297gq(), this.f326923e.mo60297gq(), this.f326924f.mo60297gq());
    }
}
