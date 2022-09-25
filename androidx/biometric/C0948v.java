package androidx.biometric;

import java.lang.ref.WeakReference;

/* renamed from: androidx.biometric.v */
/* compiled from: PG */
public final class C0948v implements Runnable {

    /* renamed from: a */
    private final WeakReference f3045a;

    public C0948v(C0951y yVar) {
        this.f3045a = new WeakReference(yVar);
    }

    public final void run() {
        if (this.f3045a.get() != null) {
            ((C0951y) this.f3045a.get()).mo3562c();
        }
    }
}
