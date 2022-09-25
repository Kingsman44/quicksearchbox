package com.google.android.apps.gsa.staticplugins.p7922eo;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8890a.C118843f;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8916f.C119007ao;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8916f.C119008ap;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85423d;
import com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86255j;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.core.service.C86671ci;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.apps.gsa.speech.p7272e.p7273a.C92237c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.q */
/* compiled from: PG */
public final class C100620q extends C86734a implements C85423d {

    /* renamed from: a */
    private final C100585an f281376a;

    /* renamed from: b */
    private final C68214a f281377b;

    /* renamed from: c */
    private final C68214a f281378c;

    /* renamed from: f */
    private final C86671ci f281379f;

    public C100620q(C100585an anVar, C68214a aVar, C68214a aVar2, C86671ci ciVar) {
        super(C118575h.WORKER_VOICE_SEARCH, "voicesearch");
        this.f281376a = anVar;
        this.f281377b = aVar;
        this.f281378c = aVar2;
        this.f281379f = ciVar;
        ciVar.f234147a = C58833ax.m90834k(anVar);
    }

    /* renamed from: a */
    public final C60870cx mo78928a(Query query, ClientConfig clientConfig, C85422c cVar, C86498a aVar, C89356b bVar, C58833ax axVar, C60870cx cxVar) {
        C58833ax k;
        int i;
        Query query2 = query;
        C100585an anVar = this.f281376a;
        boolean dj = query.mo84456dj();
        C58976aa aaVar = C58975e.f156826a;
        int c = ((C118843f) anVar.f281251m.mo27525b()).mo71742c();
        int a = (int) anVar.f281247i.mo79743a(C90082eg.f250028cl);
        if (query2 == null || !query.mo84369cB()) {
            if (query2 != null && !query2.equals(Query.f252741b) && ((c == 1 || clientConfig.mo81898p()) && a > 1 && a != query2.f252762T)) {
                query2 = query2.mo84300al(a);
            }
        } else if (query2.f252762T != 1) {
            query2 = query2.mo84300al(1);
        }
        Query query3 = query2;
        SettableFuture settableFuture = new SettableFuture();
        if (!dj) {
            if (query3.mo84460dn()) {
                i = 177;
            } else if (query3.mo84450de()) {
                i = 174;
            } else {
                i = query3.mo84463dq() ? 175 : 20;
            }
            anVar.f281246h.mo28212l("record client event", new C100629z(anVar, i, clientConfig, query3));
        } else {
            ClientConfig clientConfig2 = clientConfig;
        }
        ((C89994f) anVar.f281250l.mo27525b()).mo83902av();
        if (!query3.mo84435dP()) {
            k = C58836b.f156633a;
        } else {
            C119008ap apVar = anVar.f281263y;
            C100626w wVar = r3;
            C100626w wVar2 = new C100626w(anVar);
            clientConfig.getClass();
            cVar.getClass();
            C86255j jVar = (C86255j) apVar.f332014a.mo17428b();
            C86255j jVar2 = jVar;
            jVar.getClass();
            C85516a aVar2 = (C85516a) apVar.f332015b.mo17428b();
            C85516a aVar3 = aVar2;
            aVar2.getClass();
            C92214y yVar = (C92214y) apVar.f332016c.mo17428b();
            C92214y yVar2 = yVar;
            yVar.getClass();
            C90479a aVar4 = (C90479a) apVar.f332017d.mo17428b();
            C90479a aVar5 = aVar4;
            aVar4.getClass();
            Context context = (Context) apVar.f332018e.mo17428b();
            Context context2 = context;
            context.getClass();
            C86602c cVar2 = (C86602c) apVar.f332019f.mo17428b();
            C86602c cVar3 = cVar2;
            cVar2.getClass();
            C86124t tVar = (C86124t) apVar.f332020g.mo17428b();
            C86124t tVar2 = tVar;
            tVar.getClass();
            C68214a a2 = C68219e.m98518a(((C68226l) apVar.f332021h).f184585a);
            C68214a aVar6 = a2;
            a2.getClass();
            C68214a a3 = C68219e.m98518a(((C68226l) apVar.f332022i).f184585a);
            C68214a aVar7 = a3;
            a3.getClass();
            C68214a a4 = C68219e.m98518a(((C68226l) apVar.f332023j).f184585a);
            C68214a aVar8 = a4;
            a4.getClass();
            C68214a a5 = C68219e.m98518a(((C68226l) apVar.f332024k).f184585a);
            a5.getClass();
            C85710c cVar4 = (C85710c) apVar.f332025l.mo17428b();
            cVar4.getClass();
            C119007ao aoVar = new C119007ao(clientConfig, wVar, bVar, cVar, jVar2, aVar3, yVar2, aVar5, context2, cVar3, tVar2, aVar6, aVar7, aVar8, a5, cVar4);
            if (query3.mo84403cj() || !axVar.mo56113h()) {
                k = C58833ax.m90834k(C60856cj.m92900i(aoVar));
            } else {
                C60870cx g = C60922j.m93044g((C60870cx) axVar.mo56107c(), C100624u.f281387a, C60826bg.f164896a);
                C90476a aVar9 = C91018d.f254254a;
                k = C58833ax.m90834k(C60922j.m93044g(g, new C100625v(aoVar), C60826bg.f164896a));
            }
        }
        C58833ax axVar2 = k;
        C89061q a6 = ((C89037bh) anVar.f281259u.mo27525b()).mo27376a(true != query3.mo84434dO() ? 14 : 53, C89066v.f241382a);
        C85422c cVar5 = cVar;
        cVar5.mo78938d(query3, a6);
        C60870cx d = C100607d.m166734d(a6, anVar.f281245g, anVar.f281247i, anVar.f281254p, (C89994f) anVar.f281250l.mo27525b(), query3, anVar.f281255q, anVar.f281259u, anVar.f281230A);
        C22871g gVar = anVar.f281244f;
        C100576ae aeVar = r2;
        C100576ae aeVar2 = new C100576ae(anVar, settableFuture, a6, query3, clientConfig, cVar5, aVar, bVar, axVar2, cxVar);
        gVar.mo28211k(d, "handleVoiceSearch", aeVar);
        if (anVar.f281235F) {
            anVar.f281244f.mo28211k(settableFuture, "stopAudioListeningSessionAdapter upon failed/cancelled controllerFuture", new C100577af(anVar, cxVar));
        }
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo78929c(Query query, C85422c cVar) {
        return C60856cj.m92900i(this.f281376a.mo91979b(query, cVar));
    }

    /* renamed from: e */
    public final void mo78930e(Query query) {
        C100585an anVar = this.f281376a;
        Uri uri = query.f252787z;
        if (uri != null) {
            try {
                ParcelFileDescriptor openFileDescriptor = anVar.f281242d.getContentResolver().openFileDescriptor(uri, C33259r.f88929b);
                if (openFileDescriptor != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    openFileDescriptor.close();
                }
            } catch (IOException | NullPointerException | SecurityException e) {
                C59104x c = C100585an.f281229a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "VSWorkerHelper");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33703)).mo56386p("#closeAudioProvider");
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        super.mo17602gS(fVar);
        fVar.mo85279c("voice search locale").mo85276a(C90752i.m148229c(((C89994f) this.f281377b.mo27525b()).mo83885ae()));
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f281376a.mo80278a();
        this.f281379f.f234147a = C58836b.f156633a;
        ((C92237c) this.f281378c.mo27525b()).mo86913b();
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
