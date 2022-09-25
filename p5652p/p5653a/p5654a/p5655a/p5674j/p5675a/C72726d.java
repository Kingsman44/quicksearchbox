package p5652p.p5653a.p5654a.p5655a.p5674j.p5675a;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;

/* renamed from: p.a.a.a.j.a.d */
/* compiled from: PG */
final class C72726d implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f193376a;

    /* renamed from: b */
    final /* synthetic */ C72727e f193377b;

    public C72726d(C72727e eVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f193377b = eVar;
        this.f193376a = onGlobalLayoutListener;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        ((NestedScrollView) this.f193377b.f56305p).getViewTreeObserver().removeOnGlobalLayoutListener(this.f193376a);
    }
}
