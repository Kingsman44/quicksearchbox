package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

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
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.p4851a.p4852a.C63324h;
import com.google.protos.p4985f.p5030q.C65196fc;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.af */
/* compiled from: PG */
public final class C117772af extends C68247h {

    /* renamed from: a */
    private final C68283d f326876a;

    /* renamed from: c */
    private final C68283d f326877c;

    /* renamed from: d */
    private final C68283d f326878d;

    /* renamed from: e */
    private final C68283d f326879e;

    /* renamed from: f */
    private final C68283d f326880f;

    public C117772af(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117772af.class), aVar);
        this.f326876a = C68236af.m98549d(dVar);
        this.f326877c = C68236af.m98549d(dVar2);
        this.f326878d = C68236af.m98549d(dVar3);
        this.f326879e = C68236af.m98549d(dVar4);
        this.f326880f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Query query = (Query) list.get(1);
        C58974d dVar = (C58974d) list.get(2);
        C58833ax axVar2 = (C58833ax) list.get(3);
        C86124t tVar = (C86124t) list.get(4);
        if (axVar.mo56113h() && tVar.mo79746e(C90086ek.f250432cy) && axVar2.mo56113h()) {
            C63324h hVar = ((C65196fc) axVar.mo56107c()).f176460f;
            if (hVar == null) {
                hVar = C63324h.f171148d;
            }
            C61752n nVar = hVar.f171151b;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            String str = nVar.f166811b;
            ((C11897m) axVar2.mo56107c()).mo20283d(query, str);
            if (tVar.mo79746e(C90086ek.f250396cO) && !str.isEmpty()) {
                C59104x d = C117770ad.f326866a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PopProducer");
                C59052c cVar = (C59052c) d;
                cVar.mo56378ag(C38505d.f101864b, 189913009);
                ((C59052c) ((C59052c) cVar.mo56382g(new RuntimeException("Pop response present"))).mo56372aa(18648)).mo56386p("Pop response present");
            }
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326876a.mo60297gq(), this.f326877c.mo60297gq(), this.f326878d.mo60297gq(), this.f326879e.mo60297gq(), this.f326880f.mo60297gq());
    }
}
