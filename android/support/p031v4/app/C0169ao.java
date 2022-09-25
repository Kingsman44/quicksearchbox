package android.support.p031v4.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.p098j.C2013ag;

/* renamed from: android.support.v4.app.ao */
/* compiled from: PG */
final class C0169ao extends AnimationSet implements Runnable {

    /* renamed from: a */
    private final ViewGroup f734a;

    /* renamed from: b */
    private final View f735b;

    /* renamed from: c */
    private boolean f736c;

    /* renamed from: d */
    private boolean f737d;

    /* renamed from: e */
    private boolean f738e = true;

    public C0169ao(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f734a = viewGroup;
        this.f735b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation) {
        this.f738e = true;
        if (this.f736c) {
            return !this.f737d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f736c = true;
            C2013ag.m5361b(this.f734a, this);
        }
        return true;
    }

    public final void run() {
        if (this.f736c || !this.f738e) {
            this.f734a.endViewTransition(this.f735b);
            this.f737d = true;
            return;
        }
        this.f738e = false;
        this.f734a.post(this);
    }

    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f738e = true;
        if (this.f736c) {
            return !this.f737d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f736c = true;
            C2013ag.m5361b(this.f734a, this);
        }
        return true;
    }
}
