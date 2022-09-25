package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.swiperefreshlayout.widget.g */
/* compiled from: PG */
final class C4178g implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ SwipeRefreshLayout f13570a;

    public C4178g(SwipeRefreshLayout swipeRefreshLayout) {
        this.f13570a = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        C4186o oVar;
        SwipeRefreshLayout swipeRefreshLayout = this.f13570a;
        if (swipeRefreshLayout.f13509b) {
            swipeRefreshLayout.f13519l.setAlpha(PrivateKeyType.INVALID);
            this.f13570a.f13519l.start();
            SwipeRefreshLayout swipeRefreshLayout2 = this.f13570a;
            if (swipeRefreshLayout2.f13520m && (oVar = swipeRefreshLayout2.f13508a) != null) {
                oVar.mo8858a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = this.f13570a;
            swipeRefreshLayout3.f13511d = swipeRefreshLayout3.f13513f.getTop();
            return;
        }
        swipeRefreshLayout.mo8785fI();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
