package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;

/* renamed from: androidx.constraintlayout.motion.widget.q */
/* compiled from: PG */
final class C1732q implements Interpolator {

    /* renamed from: a */
    final /* synthetic */ C1596f f5129a;

    public C1732q(C1596f fVar) {
        this.f5129a = fVar;
    }

    public final float getInterpolation(float f) {
        return (float) this.f5129a.mo4521a((double) f);
    }
}
