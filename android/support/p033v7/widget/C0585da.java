package android.support.p033v7.widget;

import android.view.ViewParent;

/* renamed from: android.support.v7.widget.da */
/* compiled from: PG */
final class C0585da implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0587dc f2274a;

    public C0585da(C0587dc dcVar) {
        this.f2274a = dcVar;
    }

    public final void run() {
        ViewParent parent = this.f2274a.f2278c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
