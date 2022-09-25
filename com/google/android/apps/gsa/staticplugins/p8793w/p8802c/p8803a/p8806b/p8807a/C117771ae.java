package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85728p;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.p4851a.p4852a.C63324h;
import com.google.protos.p4985f.p5030q.C65195fb;
import com.google.protos.p4985f.p5030q.C65196fc;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.ae */
/* compiled from: PG */
public final class C117771ae extends C68247h {

    /* renamed from: a */
    private final C68283d f326867a;

    /* renamed from: c */
    private final C68283d f326868c;

    /* renamed from: d */
    private final C68283d f326869d;

    /* renamed from: e */
    private final C68283d f326870e;

    /* renamed from: f */
    private final C68283d f326871f;

    /* renamed from: g */
    private final C68283d f326872g;

    /* renamed from: h */
    private final C68283d f326873h;

    /* renamed from: i */
    private final C68283d f326874i;

    /* renamed from: j */
    private final C68283d f326875j;

    public C117771ae(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9) {
        super(aVar2, new C68277d(C117771ae.class), aVar);
        this.f326867a = C68236af.m98549d(dVar);
        this.f326868c = C68236af.m98549d(dVar2);
        this.f326869d = C68236af.m98549d(dVar3);
        this.f326870e = C68236af.m98549d(dVar4);
        this.f326871f = C68236af.m98549d(dVar5);
        this.f326872g = C68236af.m98549d(dVar6);
        this.f326873h = C68236af.m98549d(dVar7);
        this.f326874i = C68236af.m98549d(dVar8);
        this.f326875j = C68236af.m98549d(dVar9);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Query query = (Query) list.get(1);
        C85596b bVar = (C85596b) list.get(2);
        b bVar2 = (b) list.get(3);
        C85728p pVar = (C85728p) list.get(4);
        C86124t tVar = (C86124t) list.get(5);
        C58974d dVar = (C58974d) list.get(6);
        C68282c cVar = (C68282c) list.get(7);
        C58833ax axVar2 = (C58833ax) list.get(8);
        if (axVar.mo56113h()) {
            if (((C65196fc) axVar.mo56107c()).f176460f != null && ((C65196fc) axVar.mo56107c()).f176460f == null) {
                C63324h hVar = C63324h.f171148d;
            }
            C65195fb fbVar = C65195fb.NO_ERROR;
            C65195fb a = C65195fb.m96585a(((C65196fc) axVar.mo56107c()).f176458d);
            if (a == null) {
                a = C65195fb.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 3) {
                    C58970a aVar = (C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(18643);
                    C65195fb a2 = C65195fb.m96585a(((C65196fc) axVar.mo56107c()).f176458d);
                    if (a2 == null) {
                        a2 = C65195fb.UNRECOGNIZED;
                    }
                    aVar.mo56389s("Pop didn't produce an intent. Failed with status [%s]", a2.name());
                }
            } else if (pVar.mo79378b()) {
                ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(18645)).mo56386p("Returning Portmon built ConversationDelta");
                bVar2.d();
                if (axVar2.mo56113h() && tVar.mo79746e(C90086ek.f250433cz)) {
                    ((C11897m) axVar2.mo56107c()).mo20290k(query, 5);
                    C11897m mVar = (C11897m) axVar2.mo56107c();
                    C19088t tVar2 = ((C65196fc) axVar.mo56107c()).f176462h;
                    if (tVar2 == null) {
                        tVar2 = C19088t.f53533p;
                    }
                    mVar.mo20286g(query, tVar2);
                }
                C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
                C52081en enVar = ((C65196fc) axVar.mo56107c()).f176461g;
                if (enVar == null) {
                    enVar = C52081en.f136679i;
                }
                eVar.copyOnWrite();
                C51195j jVar = (C51195j) eVar.instance;
                enVar.getClass();
                jVar.f133275j = enVar;
                jVar.f133266a |= 128;
                return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar.build()));
            }
            C58970a aVar2 = (C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(18644);
            C63324h hVar2 = ((C65196fc) axVar.mo56107c()).f176460f;
            if (hVar2 == null) {
                hVar2 = C63324h.f171148d;
            }
            C61752n nVar = hVar2.f171151b;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            aVar2.mo56389s("Sending IntentQuery [%s] to OfflineAssistantResponseWork", nVar.f166811b);
            bVar2.c();
            if (axVar2.mo56113h() && tVar.mo79746e(C90086ek.f250433cz)) {
                ((C11897m) axVar2.mo56107c()).mo20290k(query, 7);
                C11897m mVar2 = (C11897m) axVar2.mo56107c();
                C19088t tVar3 = ((C65196fc) axVar.mo56107c()).f176462h;
                if (tVar3 == null) {
                    tVar3 = C19088t.f53533p;
                }
                mVar2.mo20286g(query, tVar3);
            }
            C63324h hVar3 = ((C65196fc) axVar.mo56107c()).f176460f;
            if (hVar3 == null) {
                hVar3 = C63324h.f171148d;
            }
            C61752n nVar2 = hVar3.f171151b;
            if (nVar2 == null) {
                nVar2 = C61752n.f166808f;
            }
            return bVar.mo20303c(nVar2, query);
        }
        if (tVar.mo79746e(C90086ek.f250392cK)) {
            C59104x d = C117770ad.f326866a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PopProducer");
            C59052c cVar2 = (C59052c) d;
            cVar2.mo56378ag(C38505d.f101864b, 189913009);
            ((C59052c) ((C59052c) cVar2.mo56382g(new RuntimeException("Pop response missing"))).mo56372aa(18642)).mo56386p("Pop response missing");
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326867a.mo60297gq(), this.f326868c.mo60297gq(), this.f326869d.mo60297gq(), this.f326870e.mo60297gq(), this.f326871f.mo60297gq(), this.f326872g.mo60297gq(), this.f326873h.mo60297gq(), C68236af.m98546a(this.f326874i.mo60297gq()), this.f326875j.mo60297gq());
    }
}
