package com.google.android.material.snackbar;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.C44741bm;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.q */
/* compiled from: PG */
final class C44886q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final WeakReference f117133a;

    /* renamed from: b */
    private final WeakReference f117134b;

    public C44886q(BaseTransientBottomBar baseTransientBottomBar, View view) {
        this.f117134b = new WeakReference(baseTransientBottomBar);
        this.f117133a = new WeakReference(view);
    }

    /* renamed from: b */
    private final boolean m79677b() {
        if (this.f117134b.get() != null) {
            return false;
        }
        mo48379a();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo48379a() {
        if (this.f117133a.get() != null) {
            ((View) this.f117133a.get()).removeOnAttachStateChangeListener(this);
            C44741bm.m79315h((View) this.f117133a.get(), this);
        }
        this.f117133a.clear();
        this.f117134b.clear();
    }

    public final void onGlobalLayout() {
        if (!m79677b()) {
            String str = BaseTransientBottomBar.f117074b;
            boolean z = ((BaseTransientBottomBar) this.f117134b.get()).f117091l;
        }
    }

    public final void onViewAttachedToWindow(View view) {
        if (!m79677b()) {
            C44741bm.m79312e(view, this);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        if (!m79677b()) {
            C44741bm.m79315h(view, this);
        }
    }
}
