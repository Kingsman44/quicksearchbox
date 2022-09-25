package androidx.mediarouter.app;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: androidx.mediarouter.app.t */
/* compiled from: PG */
final class C3783t extends Animation {

    /* renamed from: a */
    final /* synthetic */ int f12201a;

    /* renamed from: b */
    final /* synthetic */ int f12202b;

    /* renamed from: c */
    final /* synthetic */ View f12203c;

    public C3783t(int i, int i2, View view) {
        this.f12201a = i;
        this.f12202b = i2;
        this.f12203c = view;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f12201a;
        C3758ad.m10898o(this.f12203c, i - ((int) (((float) (i - this.f12202b)) * f)));
    }
}
