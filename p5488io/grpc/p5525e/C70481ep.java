package p5488io.grpc.p5525e;

import java.util.ArrayList;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ep */
/* compiled from: PG */
final class C70481ep implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f187834a;

    /* renamed from: b */
    final /* synthetic */ C70493fa f187835b;

    public C70481ep(C70493fa faVar, Status status) {
        this.f187835b = faVar;
        this.f187834a = status;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList(this.f187835b.f187864l);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C70556hj) arrayList.get(i)).mo61832m(this.f187834a);
        }
    }
}
