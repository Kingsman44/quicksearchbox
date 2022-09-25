package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.p079a.p080a.p081a.C1596f;

/* renamed from: androidx.constraintlayout.motion.widget.ac */
/* compiled from: PG */
final class C1704ac implements Interpolator {

    /* renamed from: a */
    final /* synthetic */ C1596f f4895a;

    public C1704ac(C1596f fVar) {
        this.f4895a = fVar;
    }

    public final float getInterpolation(float f) {
        return (float) this.f4895a.mo4521a((double) f);
    }
}
