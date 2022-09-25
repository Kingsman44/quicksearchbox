package androidx.media3.exoplayer.p145h.p146a;

import androidx.media3.common.C2659c;
import androidx.media3.common.p136b.C2601a;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.h.a.i */
/* compiled from: PG */
public final /* synthetic */ class C3014i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3015j f8729a;

    /* renamed from: b */
    public final /* synthetic */ C2659c f8730b;

    public /* synthetic */ C3014i(C3015j jVar, C2659c cVar) {
        this.f8729a = jVar;
        this.f8730b = cVar;
    }

    public final void run() {
        C3015j jVar = this.f8729a;
        C2659c cVar = this.f8730b;
        if (!jVar.f8732b) {
            C3016k kVar = jVar.f8733c;
            C2659c cVar2 = kVar.f8740f;
            boolean z = false;
            if (cVar2 == null) {
                kVar.f8741g = new C3010e[cVar.f7415c][];
                Arrays.fill(kVar.f8741g, new C3010e[0]);
            } else {
                if (cVar.f7415c == cVar2.f7415c) {
                    z = true;
                }
                C2601a.m6832d(z);
            }
            kVar.f8740f = cVar;
            kVar.mo6965n();
            kVar.mo6962E();
        }
    }
}
