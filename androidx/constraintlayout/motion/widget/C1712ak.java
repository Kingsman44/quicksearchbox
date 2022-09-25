package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;

/* renamed from: androidx.constraintlayout.motion.widget.ak */
/* compiled from: PG */
final class C1712ak implements Interpolator {

    /* renamed from: a */
    final /* synthetic */ C1596f f4972a;

    public C1712ak(C1596f fVar) {
        this.f4972a = fVar;
    }

    public final float getInterpolation(float f) {
        return (float) this.f4972a.mo4521a((double) f);
    }
}
