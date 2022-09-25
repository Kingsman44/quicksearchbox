package p5488io.grpc.p5524d;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70373ap;

/* renamed from: io.grpc.d.aa */
/* compiled from: PG */
public final /* synthetic */ class C70300aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C70301ab f187375a;

    /* renamed from: b */
    public final /* synthetic */ Status f187376b;

    /* renamed from: c */
    public final /* synthetic */ C70334de f187377c;

    public /* synthetic */ C70300aa(C70301ab abVar, Status status, C70334de deVar) {
        this.f187375a = abVar;
        this.f187376b = status;
        this.f187377c = deVar;
    }

    public final void run() {
        C70301ab abVar = this.f187375a;
        abVar.f187379b.mo62080a(this.f187376b, C70373ap.PROCESSED, this.f187377c);
    }
}
