package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.i */
/* compiled from: PG */
final class C4180i extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f13572a;

    public C4180i(SwipeRefreshLayout swipeRefreshLayout) {
        this.f13572a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f13572a.mo8778c(1.0f - f);
    }
}
