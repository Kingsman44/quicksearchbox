package androidx.media3.exoplayer;

import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.exoplayer.bt */
/* compiled from: PG */
public final /* synthetic */ class C2850bt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2891ct f8015a;

    public /* synthetic */ C2850bt(C2891ct ctVar) {
        this.f8015a = ctVar;
    }

    public final void run() {
        try {
            C2872ca.m7948f(this.f8015a);
        } catch (C3267o e) {
            C2633u.m7048c("ExoPlayerImplInternal", C2633u.m7046a("Unexpected error delivering message on external thread.", e));
            throw new RuntimeException(e);
        }
    }
}
