package android.support.p033v7.widget;

import android.window.OnBackInvokedCallback;

/* renamed from: android.support.v7.widget.iv */
/* compiled from: PG */
public final /* synthetic */ class C0741iv implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ Runnable f2603a;

    public /* synthetic */ C0741iv(Runnable runnable) {
        this.f2603a = runnable;
    }

    public final void onBackInvoked() {
        this.f2603a.run();
    }
}
