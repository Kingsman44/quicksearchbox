package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Intent;

/* renamed from: androidx.biometric.q */
/* compiled from: PG */
final class C0943q {
    /* renamed from: a */
    static Intent m2862a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
