package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.n */
/* compiled from: PG */
final class C4185n extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f13579a;

    public C4185n(SwipeRefreshLayout swipeRefreshLayout) {
        this.f13579a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f13579a;
        float f2 = swipeRefreshLayout.f13515h;
        swipeRefreshLayout.mo8778c(f2 + ((-f2) * f));
        this.f13579a.mo8784fH(f);
    }
}
