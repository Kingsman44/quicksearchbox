package p5488io.grpc;

import java.util.Comparator;

/* renamed from: io.grpc.ev */
/* compiled from: PG */
final class C70717ev implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C70718ew f188458a;

    public C70717ev(C70718ew ewVar) {
        this.f188458a = ewVar;
    }

    public final int compare(Object obj, Object obj2) {
        int a = this.f188458a.mo61969a(obj) - this.f188458a.mo61969a(obj2);
        if (a != 0) {
            return a;
        }
        return obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
