package androidx.biometric;

import java.lang.ref.WeakReference;

/* renamed from: androidx.biometric.w */
/* compiled from: PG */
final class C0949w implements Runnable {

    /* renamed from: a */
    private final WeakReference f3046a;

    public C0949w(C0908al alVar) {
        this.f3046a = new WeakReference(alVar);
    }

    public final void run() {
        if (this.f3046a.get() != null) {
            ((C0908al) this.f3046a.get()).f3003k = false;
        }
    }
}
