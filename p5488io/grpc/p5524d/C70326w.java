package p5488io.grpc.p5524d;

import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70373ap;

/* renamed from: io.grpc.d.w */
/* compiled from: PG */
public final /* synthetic */ class C70326w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C70301ab f187466a;

    /* renamed from: b */
    public final /* synthetic */ Status f187467b;

    /* renamed from: c */
    public final /* synthetic */ C70334de f187468c;

    public /* synthetic */ C70326w(C70301ab abVar, Status status, C70334de deVar) {
        this.f187466a = abVar;
        this.f187467b = status;
        this.f187468c = deVar;
    }

    public final void run() {
        C70301ab abVar = this.f187466a;
        abVar.f187379b.mo62080a(this.f187467b, C70373ap.PROCESSED, this.f187468c);
    }
}
