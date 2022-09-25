package androidx.media3.exoplayer.p149i;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.p163j.C3508g;

/* renamed from: androidx.media3.exoplayer.i.a */
/* compiled from: PG */
final class C3188a extends C3508g {

    /* renamed from: d */
    final /* synthetic */ C3190c f9539d;

    public C3188a(C3190c cVar) {
        this.f9539d = cVar;
    }

    /* renamed from: c */
    public final void mo5962c() {
        C3190c cVar = this.f9539d;
        C2601a.m6832d(cVar.f9542a.size() < 2);
        C2601a.m6830b(!cVar.f9542a.contains(this));
        mo5953fg();
        cVar.f9542a.addFirst(this);
    }
}
