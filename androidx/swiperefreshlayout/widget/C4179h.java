package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.h */
/* compiled from: PG */
final class C4179h extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f13571a;

    public C4179h(SwipeRefreshLayout swipeRefreshLayout) {
        this.f13571a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f13571a.mo8778c(f);
    }
}
