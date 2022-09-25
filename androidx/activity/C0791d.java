package androidx.activity;

import android.text.TextUtils;

/* renamed from: androidx.activity.d */
/* compiled from: PG */
final class C0791d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentActivity f2733a;

    public C0791d(ComponentActivity componentActivity) {
        this.f2733a = componentActivity;
    }

    public final void run() {
        try {
            C0791d.super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
