package p5488io.grpc.p5525e;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.cs */
/* compiled from: PG */
final class C70430cs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187691a;

    /* renamed from: b */
    final /* synthetic */ C70373ap f187692b;

    /* renamed from: c */
    final /* synthetic */ C70334de f187693c;

    /* renamed from: d */
    final /* synthetic */ C70431ct f187694d;

    public C70430cs(C70431ct ctVar, Status status, C70373ap apVar, C70334de deVar) {
        this.f187694d = ctVar;
        this.f187691a = status;
        this.f187692b = apVar;
        this.f187693c = deVar;
    }

    public final void run() {
        this.f187694d.f187695a.mo62080a(this.f187691a, this.f187692b, this.f187693c);
    }
}
