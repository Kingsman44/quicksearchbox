package androidx.core.p098j;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.j.ag */
/* compiled from: PG */
public final class C2013ag implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f5929a;

    /* renamed from: b */
    private ViewTreeObserver f5930b;

    /* renamed from: c */
    private final Runnable f5931c;

    private C2013ag(View view, Runnable runnable) {
        this.f5929a = view;
        this.f5930b = view.getViewTreeObserver();
        this.f5931c = runnable;
    }

    /* renamed from: a */
    public final void mo5175a() {
        if (this.f5930b.isAlive()) {
            this.f5930b.removeOnPreDrawListener(this);
        } else {
            this.f5929a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f5929a.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw() {
        mo5175a();
        this.f5931c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f5930b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        mo5175a();
    }

    /* renamed from: b */
    public static void m5361b(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C2013ag agVar = new C2013ag(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(agVar);
            view.addOnAttachStateChangeListener(agVar);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }
}
