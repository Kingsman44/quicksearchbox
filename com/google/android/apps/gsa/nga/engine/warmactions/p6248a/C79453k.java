package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.am.c.a.aj;
import com.google.android.apps.gsa.nga.engine.am.c.a.al;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128459c;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128460d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128461e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.k */
/* compiled from: PG */
public final class C79453k extends C79455m implements aj, al {

    /* renamed from: b */
    private final C79427aw f218130b = new C79427aw();

    /* renamed from: c */
    private final C79427aw f218131c = new C79427aw();

    public C79453k(C68214a aVar, C81013d dVar) {
        super(aVar, dVar);
    }

    /* renamed from: a */
    public final void mo74075a(boolean z) {
        C128459c f = C128461e.m209629f();
        f.mo108444b((long) (z ? this.f218130b.mo74050a() : this.f218130b.mo74051b().orElse(-1)));
        f.mo108446d(C79570b.ALARM);
        f.mo108445c(z ? C128460d.START : C128460d.STOP);
        mo74077e(f.mo108443a());
    }

    /* renamed from: b */
    public final void mo74076b(boolean z) {
        C128459c f = C128461e.m209629f();
        f.mo108444b((long) (z ? this.f218131c.mo74050a() : this.f218131c.mo74051b().orElse(-1)));
        f.mo108446d(C79570b.TIMER);
        f.mo108445c(z ? C128460d.START : C128460d.STOP);
        mo74077e(f.mo108443a());
    }
}
