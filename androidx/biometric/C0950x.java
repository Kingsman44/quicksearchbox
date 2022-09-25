package androidx.biometric;

import java.lang.ref.WeakReference;

/* renamed from: androidx.biometric.x */
/* compiled from: PG */
final class C0950x implements Runnable {

    /* renamed from: a */
    private final WeakReference f3047a;

    public C0950x(C0908al alVar) {
        this.f3047a = new WeakReference(alVar);
    }

    public final void run() {
        if (this.f3047a.get() != null) {
            ((C0908al) this.f3047a.get()).f3004l = false;
        }
    }
}
