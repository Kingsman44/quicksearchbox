package com.google.android.apps.gsa.staticplugins.s3request.producers;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.search.core.google.C85894bq;
import com.google.android.apps.gsa.search.core.google.C85895br;
import com.google.android.apps.gsa.search.core.p6517ak.C84568a;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92446c;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92455l;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.apps.gsa.staticplugins.s3request.p8692c.C116334a;
import com.google.android.apps.gsa.staticplugins.s3request.p8693d.C116340f;
import com.google.android.libraries.p11033ap.p11034a.C147814a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.recognizer.p5233a.C67451at;
import dagger.C68214a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Future;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.l */
/* compiled from: PG */
public final class C116353l implements C92439c {

    /* renamed from: a */
    public final C90931ca f322608a;

    /* renamed from: b */
    public final C69464a f322609b;

    /* renamed from: c */
    public final C69464a f322610c;

    /* renamed from: d */
    public final C69464a f322611d;

    /* renamed from: e */
    Future f322612e;

    /* renamed from: f */
    private final C92473f f322613f;

    /* renamed from: g */
    private final C86124t f322614g;

    /* renamed from: h */
    private final Query f322615h;

    /* renamed from: i */
    private final Context f322616i;

    /* renamed from: j */
    private final String f322617j;

    /* renamed from: k */
    private final C68214a f322618k;

    /* renamed from: l */
    private final C68214a f322619l;

    /* renamed from: m */
    private final C68214a f322620m;

    /* renamed from: n */
    private final C69464a f322621n;

    /* renamed from: o */
    private final C69464a f322622o;

    /* renamed from: p */
    private final C58833ax f322623p;

    /* renamed from: q */
    private final u f322624q;

    /* renamed from: r */
    private Future f322625r;

    /* renamed from: s */
    private Future f322626s;

    /* renamed from: t */
    private Future f322627t;

    /* renamed from: u */
    private C92455l f322628u;

    /* renamed from: v */
    private C66678l f322629v;

    public C116353l(C92473f fVar, C58833ax axVar, Context context, C86124t tVar, C90931ca caVar, C69464a aVar, C69464a aVar2, C69464a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C69464a aVar7, C84600b bVar, u uVar) {
        this.f322608a = caVar;
        this.f322622o = aVar;
        this.f322614g = tVar;
        this.f322613f = fVar;
        this.f322615h = fVar.f258009E;
        this.f322617j = fVar.f258033u;
        this.f322616i = context;
        this.f322609b = aVar2;
        this.f322610c = aVar3;
        this.f322618k = aVar4;
        this.f322619l = aVar5;
        this.f322620m = aVar6;
        this.f322621n = aVar7;
        this.f322611d = new C116351j(bVar);
        this.f322623p = axVar;
        this.f322624q = uVar;
    }

    /* renamed from: e */
    static /* synthetic */ C84568a m192980e(C84600b bVar) {
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_VOICE_SEARCH_LO);
        d.mo41493b(Duration.ofDays(1));
        return bVar.mo78367a(d.mo41492a());
    }

    /* renamed from: a */
    public final C57981b mo87118a() {
        C92443g gVar;
        C90931ca caVar = this.f322608a;
        this.f322613f.f258015c.mo87195f();
        C58833ax axVar = this.f322623p;
        if (axVar.mo56113h()) {
            InputStream c = this.f322624q.c((C74458k) axVar.mo56107c());
            int f = ((C74458k) this.f322623p.mo56107c()).mo70774a().mo87195f();
            C85895br brVar = (C85895br) this.f322619l.mo27525b();
            this.f322612e = brVar.f232233c.mo28202b("PinholeParamsBuilderTask", new C85894bq(brVar, this.f322615h));
            this.f322625r = this.f322608a.mo85138c(new C92446c((C89037bh) this.f322618k.mo27525b(), (C89045bp) this.f322620m.mo27525b()));
            C90931ca caVar2 = this.f322608a;
            C92473f fVar = this.f322613f;
            this.f322626s = caVar2.mo85138c(new C92448e((C89994f) this.f322609b.mo17428b(), this.f322613f.f258031s, (C92461a) this.f322621n.mo17428b(), fVar.f258019g, fVar.f258007C, (String) null, (String) null));
            int i = this.f322613f.f258014b == C90536a.SOUND_SEARCH_TV ? 1 : 0;
            C90931ca caVar3 = this.f322608a;
            C92473f fVar2 = this.f322613f;
            this.f322627t = caVar3.mo85138c(new C116334a(fVar2.f258019g, fVar2.f258006B, this.f322620m, i, new C147814a(this.f322616i), false));
            this.f322628u = new C92455l(new C116352k(this), this.f322608a, (C92302a) this.f322610c.mo17428b(), (C89994f) this.f322609b.mo17428b(), (Account) null, (String) null, (C66595bu) null);
            C66677k kVar = (C66677k) C66678l.f181384f.createBuilder();
            C67451at n = this.f322613f.f258015c.mo87202n();
            kVar.copyOnWrite();
            C66678l lVar = (C66678l) kVar.instance;
            lVar.f181389b = n.f183321p;
            lVar.f181388a |= 1;
            kVar.copyOnWrite();
            C66678l lVar2 = (C66678l) kVar.instance;
            lVar2.f181388a |= 2;
            lVar2.f181390c = (float) f;
            this.f322629v = (C66678l) kVar.build();
            ArrayList arrayList = new ArrayList();
            C116350i iVar = r6;
            C116350i iVar2 = new C116350i(this.f322625r, this.f322626s, this.f322628u.f257883a, this.f322627t, this.f322612e, this.f322629v, this.f322615h.f252749G, this.f322617j, (C89994f) this.f322609b.mo17428b(), this.f322614g);
            arrayList.add(iVar);
            arrayList.add(new C116343b(c, f));
            if (this.f322612e != null) {
                arrayList.add(new C116344c((C116340f) this.f322622o.mo17428b(), this.f322615h));
            }
            gVar = new C92443g(caVar, (Iterable) arrayList);
            return gVar;
        }
        throw new C90523o("AudioListeningSessionAdapter is empty.", (int) C89885b.S3_CREATE_INPUT_STREAM_FAILED_VALUE);
    }

    /* renamed from: b */
    public final void mo87119b() {
        C92455l lVar = this.f322628u;
        if (lVar != null) {
            lVar.mo87155a();
        }
        Future future = this.f322625r;
        if (future != null) {
            future.cancel(true);
        }
        Future future2 = this.f322626s;
        if (future2 != null) {
            future2.cancel(true);
        }
        Future future3 = this.f322627t;
        if (future3 != null) {
            future3.cancel(true);
        }
        Future future4 = this.f322612e;
        if (future4 != null) {
            future4.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo87120c() {
        C92455l lVar = this.f322628u;
        if (lVar != null) {
            lVar.mo87156b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo87121d() {
        return false;
    }
}
