package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: PG */
public final class LauncherAnimUtils {
    static final WeakHashMap sAnimators = new WeakHashMap();
    static final Animator.AnimatorListener sEndAnimListener = new Animator.AnimatorListener() {
        public final void onAnimationCancel(Animator animator) {
            LauncherAnimUtils.sAnimators.remove(animator);
        }

        public final void onAnimationEnd(Animator animator) {
            LauncherAnimUtils.sAnimators.remove(animator);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            LauncherAnimUtils.sAnimators.put(animator, (Object) null);
        }
    };

    public static AnimatorSet createAnimatorSet() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(sEndAnimListener);
        return animatorSet;
    }

    public static ObjectAnimator ofFloat(View view, String str, float... fArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setPropertyName(str);
        objectAnimator.setFloatValues(fArr);
        objectAnimator.addListener(sEndAnimListener);
        new FirstFrameAnimatorHelper((ValueAnimator) objectAnimator, view);
        return objectAnimator;
    }

    public static ValueAnimator ofFloat$ar$ds(float... fArr) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(fArr);
        valueAnimator.addListener(sEndAnimListener);
        return valueAnimator;
    }

    public static ObjectAnimator ofPropertyValuesHolder(View view, PropertyValuesHolder... propertyValuesHolderArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setValues(propertyValuesHolderArr);
        objectAnimator.addListener(sEndAnimListener);
        new FirstFrameAnimatorHelper((ValueAnimator) objectAnimator, view);
        return objectAnimator;
    }

    public static void onDestroyActivity() {
        Iterator it = new HashSet(sAnimators.keySet()).iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (animator.isRunning()) {
                animator.cancel();
            }
            sAnimators.remove(animator);
        }
    }

    public static ObjectAnimator ofPropertyValuesHolder(Object obj, View view, PropertyValuesHolder... propertyValuesHolderArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(obj);
        objectAnimator.setValues(propertyValuesHolderArr);
        objectAnimator.addListener(sEndAnimListener);
        new FirstFrameAnimatorHelper((ValueAnimator) objectAnimator, view);
        return objectAnimator;
    }
}
