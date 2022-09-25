package com.google.android.apps.gsa.staticplugins.voiceaccess;

import com.google.android.apps.gsa.c.b;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6719dp.C85407a;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.speech.p7294j.C92436f;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8792g.C117676a;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37728v;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.h */
/* compiled from: PG */
public final class C117618h extends C86734a implements C85407a {

    /* renamed from: a */
    public final C68214a f326490a;

    /* renamed from: b */
    public final C68214a f326491b;

    /* renamed from: c */
    public final C90747d f326492c;

    /* renamed from: f */
    public final C22871g f326493f;

    /* renamed from: g */
    public C117617g f326494g;

    /* renamed from: h */
    public Long f326495h;

    /* renamed from: i */
    public boolean f326496i;

    /* renamed from: j */
    public boolean f326497j;

    /* renamed from: k */
    public C58833ax f326498k = C58836b.f156633a;

    /* renamed from: l */
    private final u f326499l;

    public C117618h(C22871g gVar, C68214a aVar, C68214a aVar2, u uVar) {
        super(C118575h.WORKER_VOICE_ACCESS, "voice_access");
        this.f326493f = gVar;
        this.f326492c = C90748e.m148223a(false);
        this.f326490a = aVar;
        this.f326491b = aVar2;
        this.f326499l = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo78924a() {
        C58976aa aaVar = C58975e.f156826a;
        return mo103407f("stopListening", new C117613c(this));
    }

    /* renamed from: c */
    public final C60870cx mo78925c(C117676a aVar, C92473f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        return mo103407f("startListening", new C117614d(this, aVar, fVar));
    }

    /* renamed from: e */
    public final C58833ax mo103406e(C92473f fVar, C92436f fVar2) {
        u uVar = this.f326499l;
        C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37728v vVar = C37728v.f100156a;
        aVar.copyOnWrite();
        C37773c cVar = (C37773c) aVar.instance;
        vVar.getClass();
        cVar.f100246b = vVar;
        cVar.f100245a = 11;
        bkVar.copyOnWrite();
        C37407bl blVar = (C37407bl) bkVar.instance;
        C37773c cVar2 = (C37773c) aVar.build();
        cVar2.getClass();
        blVar.f99328b = cVar2;
        blVar.f99327a |= 1;
        return C58833ax.m90834k(uVar.a((C37407bl) bkVar.build(), Query.f252741b.mo84271aH(fVar.f258032t), fVar.f258015c, b.e, fVar2, false, C39226b.TAG_CLASSIC_ACCESSIBILITY_VOICE_ACCESS));
    }

    /* renamed from: f */
    public final C60870cx mo103407f(String str, C22862b bVar) {
        if (!C22872h.m42744d(C86593a.class)) {
            return this.f326493f.mo28201a(str, bVar);
        }
        try {
            bVar.mo17947a();
            return C118826c.f331423b;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: g */
    public final void mo103408g(boolean z) {
        C117617g gVar;
        C58976aa aaVar = C58975e.f156826a;
        this.f326492c.mo85091a();
        if (this.f326494g != null && this.f326497j) {
            if (this.f326495h != null) {
                this.f326499l.g("VoiceAccessWorker", this.f326498k, false);
            }
            this.f326495h = null;
            this.f326497j = false;
            if (z && (gVar = this.f326494g) != null) {
                gVar.mo87104j();
            }
            this.f326494g = null;
        }
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C58976aa aaVar = C58975e.f156826a;
        mo78924a();
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return !this.f326497j;
    }
}
