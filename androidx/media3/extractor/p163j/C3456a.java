package androidx.media3.extractor.p163j;

import androidx.media3.p134c.C2530h;

/* renamed from: androidx.media3.extractor.j.a */
/* compiled from: PG */
final class C3456a extends C3508g {

    /* renamed from: d */
    final /* synthetic */ C3470b f10679d;

    public C3456a(C3470b bVar) {
        this.f10679d = bVar;
    }

    /* renamed from: c */
    public final void mo5962c() {
        C3470b bVar = this.f10679d;
        synchronized (bVar.f6963a) {
            mo5953fg();
            C2530h[] hVarArr = bVar.f6965c;
            int i = bVar.f6967e;
            bVar.f6967e = i + 1;
            hVarArr[i] = this;
            bVar.mo5968j();
        }
    }
}
