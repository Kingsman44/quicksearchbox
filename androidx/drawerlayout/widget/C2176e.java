package androidx.drawerlayout.widget;

import android.window.OnBackInvokedCallback;

/* renamed from: androidx.drawerlayout.widget.e */
/* compiled from: PG */
public final /* synthetic */ class C2176e implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f6188a;

    public /* synthetic */ C2176e(Runnable runnable) {
        this.f6188a = runnable;
    }

    public final void onBackInvoked() {
        this.f6188a.run();
    }
}
