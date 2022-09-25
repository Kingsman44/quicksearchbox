package com.google.android.apps.gsa.staticplugins.p7903ef;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85379a;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85385b;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.speech.audio.C92207r;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.apps.gsa.speech.p7294j.C92431a;
import com.google.android.apps.gsa.speech.p7294j.C92432b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ef.h */
/* compiled from: PG */
public final class C100493h extends C86734a implements C85385b {

    /* renamed from: a */
    public static final C59071e f280930a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ef.h");

    /* renamed from: b */
    public final C22871g f280931b;

    /* renamed from: c */
    public final C92194i f280932c;

    /* renamed from: f */
    public final C68214a f280933f;

    /* renamed from: g */
    public final C68214a f280934g;

    /* renamed from: h */
    public final C68214a f280935h;

    /* renamed from: i */
    public final C68214a f280936i;

    /* renamed from: j */
    public final C68214a f280937j;

    /* renamed from: k */
    public final C68214a f280938k;

    /* renamed from: l */
    public final C90747d f280939l;

    /* renamed from: m */
    public C92432b f280940m;

    /* renamed from: n */
    public Long f280941n;

    /* renamed from: o */
    public boolean f280942o;

    /* renamed from: p */
    public Query f280943p;

    /* renamed from: q */
    public C58833ax f280944q = C58836b.f156633a;

    /* renamed from: r */
    public final u f280945r;

    /* renamed from: s */
    public final C92214y f280946s;

    public C100493h(C22871g gVar, C68214a aVar, C92214y yVar, C92194i iVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, u uVar) {
        super(C118575h.WORKER_TRANSCRIPTION, "transcription");
        this.f280931b = gVar;
        this.f280939l = C90748e.m148223a(false);
        this.f280933f = aVar;
        this.f280946s = yVar;
        this.f280943p = Query.f252741b;
        this.f280932c = iVar;
        this.f280934g = aVar2;
        this.f280935h = aVar3;
        this.f280936i = aVar4;
        this.f280937j = aVar5;
        this.f280938k = aVar6;
        this.f280945r = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo78908a() {
        if (!this.f280942o) {
            return C118826c.f331423b;
        }
        return mo78911e(!this.f280943p.mo84363bw("android.speech.extra.BEEP_SUPPRESSED"));
    }

    /* renamed from: c */
    public final C60870cx mo78909c(Query query, C85379a aVar, C58833ax axVar, C92431a aVar2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f280944q = axVar;
        return mo91936f("startTranscription", new C100475b(this, query, aVar, aVar2, axVar));
    }

    /* renamed from: d */
    public final C60870cx mo78910d() {
        return mo91936f("stopListening", new C100477c(this));
    }

    /* renamed from: e */
    public final C60870cx mo78911e(boolean z) {
        return mo91936f("cancelTranscription", new C100489d(this, z));
    }

    /* renamed from: f */
    public final C60870cx mo91936f(String str, C22869e eVar) {
        if (!C22872h.m42744d(C86593a.class)) {
            return C118826c.m197213c(this.f280931b.mo28207g(str, eVar));
        }
        eVar.run();
        return C118826c.f331423b;
    }

    /* renamed from: g */
    public final boolean mo91937g(C90129h hVar, String str) {
        return !C58869cf.m90936b(new C58903m(',')).mo56155i(((C90021c) this.f280933f.mo27525b()).mo79758x(hVar)).contains(str);
    }

    /* renamed from: h */
    public final void mo91938h(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C92432b bVar = this.f280940m;
        if (bVar != null) {
            bVar.f257790a = false;
            this.f280940m = null;
        }
        if (this.f280942o) {
            if (z) {
                this.f280932c.mo86849e(C92207r.m151409a(this.f280943p, (C90021c) this.f280933f.mo27525b()));
            }
            this.f280945r.g("TranscriptionWorker", this.f280944q, false);
            this.f280941n = null;
            this.f280942o = false;
            this.f280943p = Query.f252741b;
        }
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        mo78911e(true);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
