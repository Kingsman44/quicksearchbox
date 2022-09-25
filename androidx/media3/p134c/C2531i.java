package androidx.media3.p134c;

/* renamed from: androidx.media3.c.i */
/* compiled from: PG */
final class C2531i extends Thread {

    /* renamed from: a */
    final /* synthetic */ C2532j f6962a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2531i(C2532j jVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f6962a = jVar;
    }

    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.f6962a.mo5969k());
    }
}
