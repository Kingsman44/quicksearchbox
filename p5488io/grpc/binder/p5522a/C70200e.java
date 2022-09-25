package p5488io.grpc.binder.p5522a;

import java.util.ArrayList;
import p5488io.grpc.Status;

/* renamed from: io.grpc.binder.a.e */
/* compiled from: PG */
public final /* synthetic */ class C70200e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C70206k f187099a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f187100b;

    /* renamed from: c */
    public final /* synthetic */ Status f187101c;

    public /* synthetic */ C70200e(C70206k kVar, ArrayList arrayList, Status status) {
        this.f187099a = kVar;
        this.f187100b = arrayList;
        this.f187101c = status;
    }

    public final void run() {
        C70206k kVar = this.f187099a;
        ArrayList arrayList = this.f187100b;
        Status status = this.f187101c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C70219x xVar = (C70219x) arrayList.get(i);
            synchronized (xVar) {
                xVar.mo61869h(status, status, false);
            }
        }
        kVar.mo61829j();
        kVar.mo61830k();
    }
}
