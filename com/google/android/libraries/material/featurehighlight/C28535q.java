package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.p2207c.C28508a;

/* renamed from: com.google.android.libraries.material.featurehighlight.q */
/* compiled from: PG */
final class C28535q extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C28512ac f77568a;

    public C28535q(C28512ac acVar) {
        this.f77568a = acVar;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C28512ac acVar = this.f77568a;
        if (!acVar.f77392A) {
            return false;
        }
        if (!acVar.f77430w) {
            acVar.f77430w = true;
            acVar.f77431x = new LinearInterpolator();
            C28512ac acVar2 = this.f77568a;
            acVar2.f77432y = acVar2.mo34000c(acVar2.f77431x);
            Animator animator = this.f77568a.f77424q;
            if (animator != null) {
                animator.cancel();
            }
            this.f77568a.f77426s.mo33997c();
        }
        float x = motionEvent2.getX();
        float y = motionEvent2.getY();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.f77568a.f77428u = C28508a.m53285a(x, y, x2, y2);
        float dimension = this.f77568a.getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_max_transition_distance);
        C28512ac acVar3 = this.f77568a;
        acVar3.f77429v = Math.min(1.0f, acVar3.f77428u / dimension);
        C28512ac acVar4 = this.f77568a;
        float interpolation = acVar4.f77431x.getInterpolation(acVar4.f77429v);
        float f3 = 1.0f - interpolation;
        float exactCenterX = acVar4.f77408a.exactCenterX();
        float f4 = acVar4.f77412e.f77465i;
        float exactCenterY = acVar4.f77408a.exactCenterY();
        C28517ah ahVar = acVar4.f77412e;
        float f5 = ahVar.f77466j;
        ahVar.setScale(f3);
        int i = (int) (255.0f * f3);
        acVar4.f77412e.setAlpha(i);
        acVar4.f77412e.setTranslationX((exactCenterX - f4) * interpolation);
        acVar4.f77412e.setTranslationY(interpolation * (exactCenterY - f5));
        acVar4.f77413f.setAlpha(i);
        acVar4.f77413f.setScale(f3);
        if (acVar4.mo34024p()) {
            acVar4.f77423p.setElevation(f3 * acVar4.f77415h.getElevation());
        }
        acVar4.f77414g.mo33966a().setAlpha(1.0f - acVar4.f77432y.getInterpolation(acVar4.f77429v));
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C28512ac acVar = this.f77568a;
        if (acVar.f77395D != null && acVar.f77398G.isTouchExplorationEnabled()) {
            C28512ac acVar2 = this.f77568a;
            if (acVar2.f77395D.mAccessibilityFocusedVirtualViewId == 5) {
                acVar2.mo34025q();
                return true;
            }
        }
        C28512ac acVar3 = this.f77568a;
        if (!acVar3.f77393B) {
            return true;
        }
        if (acVar3.mo34016n(x, y) && this.f77568a.f77412e.mo34053e(x, y)) {
            return true;
        }
        this.f77568a.mo34025q();
        return true;
    }
}
