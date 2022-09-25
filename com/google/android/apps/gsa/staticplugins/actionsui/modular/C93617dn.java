package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dn */
/* compiled from: PG */
public final class C93617dn extends Visibility {

    /* renamed from: a */
    private final int f261350a;

    /* renamed from: b */
    private final int f261351b;

    /* renamed from: c */
    private final int f261352c;

    /* renamed from: d */
    private final int f261353d;

    public C93617dn(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i == 0 && i2 == 0) {
            i2 = 0;
            z = false;
        }
        C58838bb.m90868c(z);
        this.f261350a = i;
        this.f261351b = i2;
        this.f261352c = i3;
        this.f261353d = i4;
    }

    /* renamed from: a */
    public static C93617dn m154465a(int i, int i2) {
        C58838bb.m90868c(i2 > 0);
        return new C93617dn(0, i, 0, i2);
    }

    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        if (transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.view;
        if (this.f261350a != 0) {
            int i3 = -this.f261352c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{(float) i3, 0.0f});
            ofFloat.addListener(new C93613dj(view, i3));
            return ofFloat;
        }
        int i4 = this.f261351b;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f261353d * i4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) i5, 0.0f});
        ofFloat2.addListener(new C93614dk(view, i5));
        return ofFloat2;
    }

    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        if (this.f261350a != 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, (float) (-this.f261352c)});
            ofFloat.addListener(new C93615dl(view));
            return ofFloat;
        }
        int i3 = this.f261351b;
        if (i3 == 0) {
            return null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) (this.f261353d * i3)});
        ofFloat2.addListener(new C93616dm(view));
        return ofFloat2;
    }
}
