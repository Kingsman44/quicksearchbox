package android.support.p033v7.widget;

import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.widget.at */
/* compiled from: PG */
final class C0522at implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ AppCompatSpinner f2081a;

    public C0522at(AppCompatSpinner appCompatSpinner) {
        this.f2081a = appCompatSpinner;
    }

    public final void onGlobalLayout() {
        if (!this.f2081a.f1809b.mo2541x()) {
            this.f2081a.mo1970b();
        }
        ViewTreeObserver viewTreeObserver = this.f2081a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            C0523au.m1925a(viewTreeObserver, this);
        }
    }
}
