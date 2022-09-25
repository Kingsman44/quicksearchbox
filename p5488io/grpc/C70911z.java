package p5488io.grpc;

import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.grpc.z */
/* compiled from: PG */
public final class C70911z {

    /* renamed from: a */
    public static final C70911z f189100a = new C70911z(new C70907v(), C70908w.f189099a);

    /* renamed from: b */
    public final ConcurrentMap f189101b = new ConcurrentHashMap();

    public C70911z(C70910y... yVarArr) {
        for (C70910y yVar : yVarArr) {
            this.f189101b.put(yVar.mo61728c(), yVar);
        }
    }

    /* renamed from: a */
    public static C70911z m103842a() {
        return new C70911z(new C70910y[0]);
    }
}
