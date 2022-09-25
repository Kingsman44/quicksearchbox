package com.google.android.apps.gsa.staticplugins.p7909eg.p7910a;

import com.google.android.apps.gsa.p6487s3.C84294l;
import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84296n;
import com.google.android.apps.gsa.p8889z.p8890a.C118849l;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6788g.p6789a.C85772b;
import com.google.android.apps.gsa.search.core.p6788g.p6789a.C85773c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.C90768bl;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.apps.gsa.staticplugins.p7761cz.C99248f;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.android.apps.gsa.staticplugins.p7909eg.p7911b.C100511f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.a.d */
/* compiled from: PG */
public final class C100498d implements C85773c {

    /* renamed from: c */
    private static final C59071e f280949c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eg.a.d");

    /* renamed from: a */
    final C68214a f280950a;

    /* renamed from: b */
    C100501g f280951b;

    /* renamed from: d */
    private final C100504j f280952d;

    /* renamed from: e */
    private final C118849l f280953e;

    /* renamed from: f */
    private final C90931ca f280954f;

    /* renamed from: g */
    private final C22871g f280955g;

    /* renamed from: h */
    private final C68214a f280956h;

    /* renamed from: i */
    private final C89859i f280957i;

    /* renamed from: j */
    private final C89012aj f280958j;

    /* renamed from: k */
    private final C100511f f280959k;

    /* renamed from: l */
    private C90908be f280960l;

    /* renamed from: m */
    private C84294l f280961m;

    /* renamed from: n */
    private final C99248f f280962n;

    public C100498d(C99248f fVar, C100504j jVar, C118849l lVar, C90931ca caVar, C22871g gVar, C68214a aVar, C89859i iVar, C68214a aVar2, C100511f fVar2, C89012aj ajVar) {
        this.f280962n = fVar;
        this.f280958j = ajVar;
        this.f280952d = jVar;
        this.f280953e = lVar;
        this.f280954f = caVar;
        this.f280955g = gVar;
        this.f280956h = aVar;
        this.f280957i = iVar;
        this.f280950a = aVar2;
        this.f280959k = fVar2;
    }

    /* renamed from: e */
    private final void m166592e(TtsRequest ttsRequest, String str, C90908be beVar, C90908be beVar2, C90908be beVar3, C85772b bVar, boolean z, int i) {
        if (this.f280961m != null) {
            C59104x d = f280949c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S3TtsSynthesizer");
            ((C59052c) ((C59052c) d).mo56372aa(33489)).mo56386p("An active synthesis is canceled because of a new request.");
            mo91940d(this.f280960l);
        }
        C58976aa aaVar = C58975e.f156826a;
        long nextLong = C90719ac.f253778a.f253779b.nextLong();
        C90908be beVar4 = beVar2;
        this.f280960l = beVar4;
        C100501g gVar = new C100501g(this, nextLong, this.f280953e, this.f280959k, beVar, beVar4, beVar3, bVar, z, i, this.f280956h, this.f280957i);
        this.f280951b = gVar;
        C99248f fVar = this.f280962n;
        C100504j jVar = this.f280952d;
        str.getClass();
        C90931ca caVar = (C90931ca) jVar.f280995a.mo17428b();
        caVar.getClass();
        C69464a aVar = jVar.f280996b;
        C86124t tVar = (C86124t) jVar.f280997c.mo17428b();
        tVar.getClass();
        C89994f fVar2 = (C89994f) jVar.f280998d.mo17428b();
        fVar2.getClass();
        C92302a aVar2 = (C92302a) jVar.f280999e.mo17428b();
        aVar2.getClass();
        C92461a aVar3 = (C92461a) jVar.f281000f.mo17428b();
        aVar3.getClass();
        C84600b bVar2 = (C84600b) jVar.f281001g.mo17428b();
        bVar2.getClass();
        C68214a a = C68219e.m98518a(((C68226l) jVar.f281002h).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) jVar.f281003i).f184585a);
        a2.getClass();
        C84294l a3 = fVar.mo91390a((C84295m) C90768bl.m148268a(this.f280955g, C84295m.class, gVar), new C100503i(ttsRequest, str, nextLong, caVar, aVar, tVar, fVar2, aVar2, aVar3, bVar2, a, a2), new C84296n(), this.f280958j);
        this.f280961m = a3;
        a3.mo77824a();
        C58833ax axVar = (C58833ax) this.f280950a.mo27525b();
        if (axVar.mo56113h()) {
            ((C100321a) axVar.mo56107c()).mo91879c("S3TtsSynthesizer", "TTS_START", "TTS_TYPE_CLIENT", ttsRequest.toString(), (String) null);
        }
    }

    /* renamed from: a */
    public final void mo79431a() {
        if (this.f280961m != null) {
            C58976aa aaVar = C58975e.f156826a;
            mo91940d(this.f280960l);
        }
    }

    /* renamed from: b */
    public final void mo79432b(TtsRequest ttsRequest, String str, C90908be beVar, C90908be beVar2, C90908be beVar3, C85772b bVar, boolean z) {
        m166592e(ttsRequest, str, beVar, beVar2, beVar3, bVar, z, 1);
    }

    /* renamed from: c */
    public final void mo79433c(TtsRequest ttsRequest, String str, C90908be beVar, C90908be beVar2, int i) {
        m166592e(ttsRequest, str, new C100496b(), beVar, beVar2, new C100497c(), false, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo91940d(C90908be beVar) {
        C84294l lVar = this.f280961m;
        if (lVar != null) {
            lVar.mo77825b();
            this.f280961m = null;
            C100501g gVar = this.f280951b;
            if (gVar != null) {
                gVar.f280968d.set(true);
                this.f280951b = null;
            }
            if (beVar != null) {
                this.f280954f.mo85139d(beVar);
            }
        }
    }
}
