package com.google.android.apps.gsa.staticplugins.p7699cq;

import com.google.android.apps.gsa.binaries.satin.app.aiq;
import com.google.android.apps.gsa.c.b;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8914d.C118986a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8915e.C118989a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8915e.C118990b;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6638cc.C85073a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88183sf;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.staticplugins.p7699cq.p7700a.p7702b.C98506a;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7751i.C99190a;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7751i.C99192c;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7751i.C99193d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37718l;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cq.g */
/* compiled from: PG */
public final class C98514g extends C86734a implements C85073a {

    /* renamed from: a */
    public static final C59071e f275081a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cq.g");

    /* renamed from: b */
    C118989a f275082b;

    /* renamed from: c */
    private final C22871g f275083c;

    /* renamed from: f */
    private final C22871g f275084f;

    /* renamed from: g */
    private final C68214a f275085g;

    /* renamed from: h */
    private final C69464a f275086h;

    /* renamed from: i */
    private final C68214a f275087i;

    /* renamed from: j */
    private final C68214a f275088j;

    /* renamed from: k */
    private final C68214a f275089k;

    /* renamed from: l */
    private final C68214a f275090l;

    public C98514g(C22871g gVar, C22871g gVar2, C68214a aVar, C69464a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        super(C118575h.WORKER_PRONUNCIATION_LEARNING, "pronunciationlearning");
        this.f275083c = gVar;
        this.f275084f = gVar2;
        this.f275085g = aVar;
        this.f275086h = aVar2;
        this.f275087i = aVar3;
        this.f275088j = aVar4;
        this.f275089k = aVar5;
        this.f275090l = aVar6;
    }

    /* renamed from: e */
    private final void m163169e(C60870cx cxVar, Runnable runnable, String str) {
        C22871g gVar = this.f275084f;
        gVar.mo28211k(cxVar, "Obtained " + str + " signal.", new C98513f(runnable, str));
    }

    /* renamed from: a */
    public final void mo78689a() {
        C58976aa aaVar = C58975e.f156826a;
        C118989a aVar = this.f275082b;
        if (aVar != null) {
            C59081b.m91349a(C58979ad.FULL, "stack size");
            C99192c cVar = (C99192c) aVar;
            C60870cx cxVar = cVar.f277462c;
            if (cxVar != null) {
                cxVar.cancel(true);
                cVar.f277461b.mo83286e().mo54566a();
                return;
            }
            return;
        }
        C59104x d = f275081a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PronLearningWorker");
        ((C59052c) ((C59052c) d).mo56372aa(30703)).mo56386p("mPronunciationLearning is null, PronunciationLearning never started.");
    }

    /* renamed from: c */
    public final void mo78690c(C88183sf sfVar, C98506a aVar, C118990b bVar) {
        C98506a aVar2 = aVar;
        C58976aa aaVar = C58975e.f156826a;
        C89061q a = ((C89037bh) this.f275087i.mo27525b()).mo27376a(50, C89066v.f241382a);
        C89356b a2 = ((C84466a) this.f275086h.mo17428b()).mo78025a("PronunciationLearning", 264, 264);
        Query af = Query.f252741b.mo84294af();
        C92460b a3 = ((C118986a) this.f275089k.mo27525b()).mo104088a(af, ((C92486a) this.f275090l.mo27525b()).mo87252z(af));
        C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
        C37705a aVar3 = (C37705a) C37773c.f100243c.createBuilder();
        C37718l lVar = C37718l.f100146a;
        aVar3.copyOnWrite();
        C37773c cVar = (C37773c) aVar3.instance;
        lVar.getClass();
        cVar.f100246b = lVar;
        cVar.f100245a = 5;
        bkVar.copyOnWrite();
        C37407bl blVar = (C37407bl) bkVar.instance;
        C37773c cVar2 = (C37773c) aVar3.build();
        cVar2.getClass();
        blVar.f99328b = cVar2;
        blVar.f99327a |= 1;
        Query query = af;
        C58833ax k = C58833ax.m90834k(((u) this.f275088j.mo27525b()).a((C37407bl) bkVar.build(), query, a3, b.k, new C98512e(af, aVar2), false, C39226b.TAG_ASSISTANT_TRANSLATE));
        C22871g gVar = this.f275083c;
        C89059o c = a.mo27433c();
        C99193d dVar = ((C99190a) this.f275085g.mo27525b()).f277459a;
        gVar.getClass();
        sfVar.getClass();
        a.getClass();
        c.getClass();
        af.getClass();
        aiq aiq = (aiq) dVar.f277463a.mo17428b();
        aiq.getClass();
        C99192c cVar3 = new C99192c(a2, gVar, sfVar, bVar, a, c, k, query, aiq);
        this.f275082b = cVar3;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C99192c cVar4 = cVar3;
        cVar3.f277462c = cVar3.f277460a.g.mo60297gq();
        C60870cx cxVar = cVar3.f277462c;
        C60870cx h = C60922j.m93045h(cxVar, C98502a.f275063a, C60826bg.f164896a);
        C90476a aVar4 = C91018d.f254254a;
        m163169e(h, new C98509b(aVar2), "audio capture started");
        m163169e(C60922j.m93045h(cxVar, C98510c.f275075a, C60826bg.f164896a), new C98511d(aVar2), "start of speech detected");
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C58976aa aaVar = C58975e.f156826a;
        mo78689a();
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
