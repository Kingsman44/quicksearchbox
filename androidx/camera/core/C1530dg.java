package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.camera.core.dg */
/* compiled from: PG */
final class C1530dg extends C1414ao {

    /* renamed from: b */
    private final AtomicBoolean f4226b = new AtomicBoolean(false);

    public C1530dg(C1473bs bsVar) {
        super(bsVar);
    }

    public final void close() {
        if (!this.f4226b.getAndSet(true)) {
            super.close();
        }
    }
}
