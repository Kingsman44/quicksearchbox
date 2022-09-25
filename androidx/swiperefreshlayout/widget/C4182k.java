package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;

/* renamed from: androidx.swiperefreshlayout.widget.k */
/* compiled from: PG */
final class C4182k implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f13576a;

    public C4182k(SwipeRefreshLayout swipeRefreshLayout) {
        this.f13576a = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f13576a;
        if (!swipeRefreshLayout.f13512e) {
            swipeRefreshLayout.mo8795n((Animation.AnimationListener) null);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
