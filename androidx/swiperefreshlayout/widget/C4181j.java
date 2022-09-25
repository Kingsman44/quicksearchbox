package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.swiperefreshlayout.widget.j */
/* compiled from: PG */
final class C4181j extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f13573a;

    /* renamed from: b */
    final /* synthetic */ int f13574b;

    /* renamed from: c */
    final /* synthetic */ SwipeRefreshLayout f13575c;

    public C4181j(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.f13575c = swipeRefreshLayout;
        this.f13573a = i;
        this.f13574b = i2;
    }

    public final void applyTransformation(float f, Transformation transformation) {
        C4176e eVar = this.f13575c.f13519l;
        int i = this.f13573a;
        eVar.setAlpha((int) (((float) i) + (((float) (this.f13574b - i)) * f)));
    }
}
