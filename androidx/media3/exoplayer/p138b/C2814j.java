package androidx.media3.exoplayer.p138b;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2632t;
import androidx.media3.exoplayer.C2843bm;
import androidx.media3.exoplayer.C2845bo;
import androidx.media3.exoplayer.C2848br;

/* renamed from: androidx.media3.exoplayer.b.j */
/* compiled from: PG */
public final /* synthetic */ class C2814j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2820p f7852a;

    /* renamed from: b */
    public final /* synthetic */ boolean f7853b;

    public /* synthetic */ C2814j(C2820p pVar, boolean z) {
        this.f7852a = pVar;
        this.f7853b = z;
    }

    public final void run() {
        C2820p pVar = this.f7852a;
        boolean z = this.f7853b;
        C2845bo boVar = pVar.f7870b;
        int i = C2612ak.f7249a;
        C2848br brVar = boVar.f7944a;
        if (brVar.f8013z != z) {
            brVar.f8013z = z;
            C2632t tVar = brVar.f7992d;
            tVar.mo6204c(23, new C2843bm(z));
            tVar.mo6203b();
        }
    }
}
