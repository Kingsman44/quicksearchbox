package androidx.mediarouter.app;

import android.view.animation.Animation;

/* renamed from: androidx.mediarouter.app.v */
/* compiled from: PG */
final class C3785v implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C3758ad f12207a;

    public C3785v(C3758ad adVar) {
        this.f12207a = adVar;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        OverlayListView overlayListView = this.f12207a.f12135p;
        for (C3764aj ajVar : overlayListView.f12076a) {
            if (!ajVar.f12160k) {
                ajVar.f12159j = overlayListView.getDrawingTime();
                ajVar.f12160k = true;
            }
        }
        C3758ad adVar = this.f12207a;
        adVar.f12135p.postDelayed(adVar.f12107X, (long) adVar.f12102S);
    }
}
