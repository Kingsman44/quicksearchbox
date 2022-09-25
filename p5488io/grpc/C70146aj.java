package p5488io.grpc;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: io.grpc.aj */
/* compiled from: PG */
final class C70146aj {

    /* renamed from: a */
    static final C70147ak f186990a;

    static {
        C70147ak akVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            akVar = (C70147ak) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(C70147ak.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            akVar = new C70767fg();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        f186990a = akVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C70148al.f186991c.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
