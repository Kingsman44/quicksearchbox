package com.google.android.apps.gsa.staticplugins.p7903ef.p7905b;

import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85379a;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85385b;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.speech.audio.C92207r;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.android.apps.gsa.speech.p7294j.C92431a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ef.b.a */
/* compiled from: PG */
public final class C100476a implements C92431a {

    /* renamed from: a */
    private final Query f280876a;

    /* renamed from: b */
    private final C85379a f280877b;

    /* renamed from: c */
    private final C90747d f280878c = C90748e.m148223a(false);

    /* renamed from: d */
    private final C85385b f280879d;

    /* renamed from: e */
    private final C92194i f280880e;

    /* renamed from: f */
    private final C68214a f280881f;

    /* renamed from: g */
    private final boolean f280882g;

    /* renamed from: h */
    private final C92214y f280883h;

    public C100476a(Query query, C85379a aVar, C85385b bVar, C92194i iVar, C68214a aVar2, C92214y yVar) {
        this.f280876a = query;
        this.f280877b = aVar;
        this.f280879d = bVar;
        this.f280880e = iVar;
        this.f280881f = aVar2;
        this.f280883h = yVar;
        this.f280882g = query.mo84363bw("android.speech.extra.BEEP_SUPPRESSED");
    }

    /* renamed from: a */
    public final void mo87095a(C90528t tVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f280878c.mo85091a();
        if (!this.f280882g) {
            this.f280880e.mo86847c(C92207r.m151409a(this.f280876a, (C90021c) this.f280881f.mo27525b()));
        }
        this.f280879d.mo78911e(false);
        Query query = this.f280876a;
        this.f280883h.mo86892c(query.f252749G);
        this.f280877b.mo78903d(this.f280876a, new VoiceSearchError(query, tVar, (String) null));
        this.f280877b.mo78906g(this.f280876a);
    }

    /* renamed from: b */
    public final void mo87096b() {
    }

    /* renamed from: s */
    public final void mo87113s() {
        C58976aa aaVar = C58975e.f156826a;
        this.f280878c.mo85091a();
        this.f280877b.mo78904e();
    }
}
