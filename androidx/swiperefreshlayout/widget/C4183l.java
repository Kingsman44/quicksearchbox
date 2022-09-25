package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.l */
/* compiled from: PG */
final class C4183l extends Animation {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f13577a;

    public C4183l(SwipeRefreshLayout swipeRefreshLayout) {
        this.f13577a = swipeRefreshLayout;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f13577a;
        boolean z = swipeRefreshLayout.f13521n;
        int i = swipeRefreshLayout.f13517j;
        int abs = Math.abs(swipeRefreshLayout.f13516i);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f13577a;
        int i2 = swipeRefreshLayout2.f13514g;
        this.f13577a.mo8786fJ((i2 + ((int) (((float) ((i - abs) - i2)) * f))) - swipeRefreshLayout2.f13513f.getTop());
        this.f13577a.f13519l.mo8834c(1.0f - f);
    }
}
