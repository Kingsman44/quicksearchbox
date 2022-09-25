package p5488io.grpc.p5525e;

import p5488io.grpc.C70148al;

/* renamed from: io.grpc.e.bf */
/* compiled from: PG */
abstract class C70390bf implements Runnable {

    /* renamed from: a */
    private final C70148al f187598a;

    protected C70390bf(C70148al alVar) {
        this.f187598a = alVar;
    }

    /* renamed from: a */
    public abstract void mo62079a();

    public final void run() {
        C70148al a = this.f187598a.mo61696a();
        try {
            mo62079a();
        } finally {
            this.f187598a.mo61702f(a);
        }
    }
}
