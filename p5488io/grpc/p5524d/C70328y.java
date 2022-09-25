package p5488io.grpc.p5524d;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70373ap;

/* renamed from: io.grpc.d.y */
/* compiled from: PG */
public final /* synthetic */ class C70328y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C70301ab f187470a;

    /* renamed from: b */
    public final /* synthetic */ Status f187471b;

    public /* synthetic */ C70328y(C70301ab abVar, Status status) {
        this.f187470a = abVar;
        this.f187471b = status;
    }

    public final void run() {
        C70301ab abVar = this.f187470a;
        abVar.f187379b.mo62080a(this.f187471b, C70373ap.PROCESSED, new C70334de());
    }
}
