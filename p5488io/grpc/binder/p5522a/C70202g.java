package p5488io.grpc.binder.p5522a;

import android.os.IBinder;
import p5488io.grpc.C70256c;
import p5488io.grpc.Status;

/* renamed from: io.grpc.binder.a.g */
/* compiled from: PG */
public final /* synthetic */ class C70202g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C70204i f187103a;

    /* renamed from: b */
    public final /* synthetic */ IBinder f187104b;

    public /* synthetic */ C70202g(C70204i iVar, IBinder iBinder) {
        this.f187103a = iVar;
        this.f187104b = iBinder;
    }

    public final void run() {
        Integer num;
        Status status;
        C70204i iVar = this.f187103a;
        IBinder iBinder = this.f187104b;
        synchronized (iVar) {
            C70256c cVar = iVar.f187126k;
            num = (Integer) cVar.f187256b.get(C70204i.f187117f);
        }
        if (num == null) {
            status = Status.f186910h.withDescription("No remote UID available");
        } else {
            status = iVar.f187107b.mo57957a(num.intValue());
        }
        synchronized (iVar) {
            if (iVar.mo61851y(2)) {
                if (!status.mo61679g()) {
                    iVar.mo61845s(status, true);
                } else if (!iVar.mo61849w(C70184ah.m102228b(iBinder, iVar.f187106a))) {
                    iVar.mo61845s(Status.f186916n.withDescription("Failed to observe outgoing binder"), true);
                } else if (!iVar.mo61848v()) {
                    iVar.mo61850x(3);
                    iVar.f187109d.mo62206b();
                }
            }
        }
    }
}
