package androidx.activity;

import android.window.OnBackInvokedCallback;

/* renamed from: androidx.activity.p */
/* compiled from: PG */
public final /* synthetic */ class C0803p implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f2752a;

    public /* synthetic */ C0803p(Runnable runnable) {
        this.f2752a = runnable;
    }

    public final void onBackInvoked() {
        this.f2752a.run();
    }
}
