package androidx.media3.exoplayer.p140d;

import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.d.b */
/* compiled from: PG */
public final /* synthetic */ class C2900b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2903e f8209a;

    public /* synthetic */ C2900b(C2903e eVar) {
        this.f8209a = eVar;
    }

    public final void run() {
        C2903e eVar = this.f8209a;
        eVar.mo6731L(new IOException("Ad loading timed out"));
        eVar.mo6735P();
    }
}
