package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.m */
/* compiled from: PG */
final class C4184m extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f13578a;

    public C4184m(SwipeRefreshLayout swipeRefreshLayout) {
        this.f13578a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        this.f13578a.mo8784fH(f);
    }
}
