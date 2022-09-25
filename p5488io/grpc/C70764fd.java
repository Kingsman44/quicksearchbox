package p5488io.grpc;

import com.google.common.base.C58838bb;

/* renamed from: io.grpc.fd */
/* compiled from: PG */
public final class C70764fd implements Runnable {

    /* renamed from: a */
    final Runnable f188577a;

    /* renamed from: b */
    public boolean f188578b;

    /* renamed from: c */
    public boolean f188579c;

    public C70764fd(Runnable runnable) {
        C58838bb.m90866a(runnable, "task");
        this.f188577a = runnable;
    }

    public final void run() {
        if (!this.f188578b) {
            this.f188579c = true;
            this.f188577a.run();
        }
    }
}
