package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import com.google.android.apps.gsa.p8889z.p8890a.C118846i;
import com.google.android.apps.gsa.search.core.p6519al.p6524ab.C84617a;
import com.google.android.apps.gsa.search.core.p6519al.p6697de.C85351a;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87835fi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87836fj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87837fk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87838fl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87839fm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88058np;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88061ns;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88062nt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88354yo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88355yp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.shared.speech.C90605m;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.ssb.C45350g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.f */
/* compiled from: PG */
public final class C94785f {

    /* renamed from: a */
    public static final C59071e f265029a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.aa.f");

    /* renamed from: b */
    public final C85392b f265030b;

    /* renamed from: c */
    public final C84617a f265031c;

    /* renamed from: d */
    public final C85351a f265032d;

    /* renamed from: e */
    public SettableFuture f265033e = new SettableFuture();

    /* renamed from: f */
    public SettableFuture f265034f = new SettableFuture();

    /* renamed from: g */
    private final C86683e f265035g;

    /* renamed from: h */
    private final C22871g f265036h;

    public C94785f(C86683e eVar, C22871g gVar, C85392b bVar, C84617a aVar, C85351a aVar2) {
        this.f265035g = eVar;
        this.f265036h = gVar;
        this.f265030b = bVar;
        this.f265031c = aVar;
        this.f265032d = aVar2;
    }

    /* renamed from: a */
    public final void mo88607a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f265031c.mo78379b();
        this.f265032d.mo78885c(C45350g.IDLE);
        mo88613g(new C87684al(C88244um.BISTO_NOTIFY_COMPLETED_CONVERSATION).mo81964a());
    }

    /* renamed from: b */
    public final void mo88608b(C86253h hVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f265032d.mo78885c(C45350g.IDLE);
        C88061ns nsVar = (C88061ns) C88062nt.f238105c.createBuilder();
        if (hVar != null) {
            int ordinal = hVar.ordinal();
            if (ordinal == 0) {
                nsVar.copyOnWrite();
                C88062nt ntVar = (C88062nt) nsVar.instance;
                ntVar.f238108b = 1;
                ntVar.f238107a = 1 | ntVar.f238107a;
            } else if (ordinal == 1) {
                nsVar.copyOnWrite();
                C88062nt ntVar2 = (C88062nt) nsVar.instance;
                ntVar2.f238108b = 2;
                ntVar2.f238107a = 1 | ntVar2.f238107a;
            } else if (ordinal == 2) {
                nsVar.copyOnWrite();
                C88062nt ntVar3 = (C88062nt) nsVar.instance;
                ntVar3.f238108b = 3;
                ntVar3.f238107a = 1 | ntVar3.f238107a;
            }
        }
        C87684al alVar = new C87684al(C88244um.BISTO_NOTIFY_REQUEST_FOLLOW_ON);
        alVar.mo81965b(C88058np.f238103a, (C88062nt) nsVar.build());
        mo88613g(alVar.mo81964a());
    }

    /* renamed from: c */
    public final void mo88609c(String str) {
        C59104x c = f265029a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoEventHandler");
        ((C59052c) ((C59052c) c).mo56372aa(16747)).mo56389s("%s", str);
        this.f265031c.mo78379b();
        this.f265032d.mo78885c(C45350g.IDLE);
        mo88613g(new C87684al(C88244um.BISTO_FORCE_CLOSE).mo81964a());
    }

    /* renamed from: d */
    public final void mo88610d(SearchError searchError) {
        C59104x c = f265029a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoEventHandler");
        ((C59052c) ((C59052c) c).mo56372aa(16748)).mo56386p("handleSearchError");
        this.f265031c.mo78379b();
        this.f265032d.mo78885c(C45350g.IDLE);
        C87684al alVar = new C87684al(C88244um.BISTO_FORCE_CLOSE);
        alVar.mo81966c(new ParcelableVoiceAction(searchError));
        mo88613g(alVar.mo81964a());
    }

    /* renamed from: e */
    public final void mo88611e(C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h()) {
            SettableFuture settableFuture = this.f265033e;
            C90605m mVar = new C90605m();
            mVar.mo84746b((C63088z) axVar.mo56107c());
            settableFuture.mo57356n(C58833ax.m90834k(mVar.mo84745a()));
            return;
        }
        this.f265033e.mo57356n(C58836b.f156633a);
    }

    /* renamed from: f */
    public final void mo88612f() {
        C58976aa aaVar = C58975e.f156826a;
        mo88613g(new C87684al(C88244um.BISTO_VOICE_SEARCH_DONE).mo81964a());
    }

    /* renamed from: g */
    public final void mo88613g(ServiceEventData serviceEventData) {
        C87682aj ajVar = this.f265035g.f234157a;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(serviceEventData);
        }
    }

    /* renamed from: h */
    public final void mo88614h(C87835fi fiVar) {
        C59104x b = f265029a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoEventHandler");
        ((C59052c) ((C59052c) b).mo56372aa(16754)).mo56386p("Sending GACS execute event");
        C87684al alVar = new C87684al(C88244um.GACS_EXECUTE_EVENT);
        alVar.mo81965b(C87836fj.f237654a, fiVar);
        mo88613g(alVar.mo81964a());
    }

    /* renamed from: i */
    public final void mo88615i() {
        mo88613g(new C87684al(C88244um.BISTO_PR_REQUEST_PERMISSION).mo81964a());
    }

    /* renamed from: j */
    public final void mo88616j() {
        new C90873ag(this.f265033e, this.f265036h, "sendTtsToClient", new C94776d(this)).mo85223a(C94784e.f265028a);
    }

    /* renamed from: k */
    public final void mo88617k(byte[] bArr, String str) {
        C88355yp ypVar = (C88355yp) C88356yq.f238944d.createBuilder();
        String d = C118846i.m197278d(bArr);
        ypVar.copyOnWrite();
        C88356yq yqVar = (C88356yq) ypVar.instance;
        yqVar.f238946a |= 1;
        yqVar.f238947b = d;
        C88356yq yqVar2 = (C88356yq) ypVar.build();
        C87684al alVar = new C87684al(C88244um.BISTO_TTS_RESULT_EVENT);
        if (str != null) {
            C87837fk fkVar = (C87837fk) C87838fl.f237655d.createBuilder();
            fkVar.copyOnWrite();
            C87838fl flVar = (C87838fl) fkVar.instance;
            yqVar2.getClass();
            flVar.f237658b = yqVar2;
            flVar.f237657a |= 1;
            fkVar.copyOnWrite();
            C87838fl flVar2 = (C87838fl) fkVar.instance;
            flVar2.f237657a |= 2;
            flVar2.f237659c = str;
            alVar = new C87684al(C88244um.GACS_TTS_RESULT_EVENT);
            alVar.mo81965b(C87839fm.f237660a, (C87838fl) fkVar.build());
        } else {
            alVar.mo81965b(C88354yo.f238943a, yqVar2);
        }
        C59104x b = f265029a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoEventHandler");
        ((C59052c) ((C59052c) b).mo56372aa(16755)).mo56386p("Sending TTS to client");
        mo88613g(alVar.mo81964a());
    }
}
