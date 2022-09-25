package androidx.media3.exoplayer.p145h.p146a;

import androidx.media3.exoplayer.p140d.C2903e;
import androidx.media3.exoplayer.p140d.C2905g;

/* renamed from: androidx.media3.exoplayer.h.a.c */
/* compiled from: PG */
public final /* synthetic */ class C3008c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3016k f8715a;

    /* renamed from: b */
    public final /* synthetic */ C3015j f8716b;

    public /* synthetic */ C3008c(C3016k kVar, C3015j jVar) {
        this.f8715a = kVar;
        this.f8716b = jVar;
    }

    public final void run() {
        C3016k kVar = this.f8715a;
        C3015j jVar = this.f8716b;
        C2905g gVar = (C2905g) kVar.f8735a;
        C2903e eVar = (C2903e) gVar.f8255e.remove(kVar);
        gVar.mo6741b();
        if (eVar != null) {
            eVar.f8227d.remove(jVar);
            if (eVar.f8227d.isEmpty()) {
                eVar.f8230g.unregisterAllFriendlyObstructions();
            }
        }
        if (gVar.f8259i != null && gVar.f8255e.isEmpty()) {
            gVar.f8259i.mo6019z(gVar.f8253c);
            gVar.f8259i = null;
        }
    }
}
