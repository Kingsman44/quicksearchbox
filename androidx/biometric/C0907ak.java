package androidx.biometric;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* renamed from: androidx.biometric.ak */
/* compiled from: PG */
final class C0907ak implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final WeakReference f2992a;

    public C0907ak(C0908al alVar) {
        this.f2992a = new WeakReference(alVar);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f2992a.get() != null) {
            ((C0908al) this.f2992a.get()).mo3546n(true);
        }
    }
}
