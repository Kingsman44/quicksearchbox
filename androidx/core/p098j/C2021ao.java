package androidx.core.p098j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: androidx.core.j.ao */
/* compiled from: PG */
final class C2021ao implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final WeakHashMap f5934a = new WeakHashMap();

    public final void onGlobalLayout() {
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
