package androidx.media3.exoplayer.p142e;

/* renamed from: androidx.media3.exoplayer.e.i */
/* compiled from: PG */
public final /* synthetic */ class C2979i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2980j f8554a;

    public /* synthetic */ C2979i(C2980j jVar) {
        this.f8554a = jVar;
    }

    public final void run() {
        C2980j jVar = this.f8554a;
        synchronized (jVar.f8555a) {
            if (!jVar.f8564j) {
                long j = jVar.f8563i - 1;
                jVar.f8563i = j;
                if (j <= 0) {
                    if (j < 0) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (jVar.f8555a) {
                            jVar.f8565k = illegalStateException;
                        }
                        return;
                    }
                    jVar.mo6888a();
                }
            }
        }
    }
}
