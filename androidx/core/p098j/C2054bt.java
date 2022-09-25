package androidx.core.p098j;

import android.animation.ValueAnimator;
import android.support.p033v7.app.C0378bl;
import android.view.View;

/* renamed from: androidx.core.j.bt */
/* compiled from: PG */
public final /* synthetic */ class C2054bt implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0378bl f5961a;

    public /* synthetic */ C2054bt(C0378bl blVar) {
        this.f5961a = blVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.f5961a.f1267a.f1289c.getParent()).invalidate();
    }
}
