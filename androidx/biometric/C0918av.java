package androidx.biometric;

import android.content.Context;
import android.util.Log;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.biometric.av */
/* compiled from: PG */
final class C0918av implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0924ba f3019a;

    public C0918av(C0924ba baVar) {
        this.f3019a = baVar;
    }

    public final void run() {
        C0924ba baVar = this.f3019a;
        Context context = baVar.getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        baVar.f3025c.mo3548q();
        baVar.f3025c.mo3545m(context.getString(R.string.fingerprint_dialog_touch_sensor));
    }
}
