package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.p175a.C3685au;
import java.util.Set;

/* renamed from: androidx.mediarouter.app.l */
/* compiled from: PG */
final class C3775l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C3758ad f12193a;

    public C3775l(C3758ad adVar) {
        this.f12193a = adVar;
    }

    public final void onGlobalLayout() {
        this.f12193a.f12135p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        C3758ad adVar = this.f12193a;
        Set set = adVar.f12138s;
        if (set == null || set.size() == 0) {
            adVar.mo7964m(true);
            return;
        }
        C3776m mVar = new C3776m(adVar);
        int firstVisiblePosition = adVar.f12135p.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < adVar.f12135p.getChildCount(); i++) {
            View childAt = adVar.f12135p.getChildAt(i);
            if (adVar.f12138s.contains((C3685au) adVar.f12136q.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) adVar.f12103T);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(mVar);
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
                z = true;
            }
        }
    }
}
