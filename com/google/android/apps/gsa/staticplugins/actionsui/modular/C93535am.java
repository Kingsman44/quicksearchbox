package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.am */
/* compiled from: PG */
public final class C93535am extends Transition {

    /* renamed from: a */
    private static final String[] f261175a = {"com:google:android:googlequicksearchbox:color:color"};

    /* renamed from: a */
    private static final void m154257a(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view instanceof TintableImageButton) {
            transitionValues.values.put("com:google:android:googlequicksearchbox:color:color", Integer.valueOf(((TintableImageButton) view).f261107a));
        }
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        m154257a(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        m154257a(transitionValues);
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int intValue;
        int intValue2;
        if (transitionValues == null || transitionValues2 == null || !transitionValues.values.containsKey("com:google:android:googlequicksearchbox:color:color") || !transitionValues2.values.containsKey("com:google:android:googlequicksearchbox:color:color") || (intValue = ((Integer) transitionValues.values.get("com:google:android:googlequicksearchbox:color:color")).intValue()) == (intValue2 = ((Integer) transitionValues2.values.get("com:google:android:googlequicksearchbox:color:color")).intValue())) {
            return null;
        }
        View view = transitionValues2.view;
        if (!(view instanceof TintableImageButton)) {
            return null;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)});
        ofObject.addUpdateListener(new C93534al((TintableImageButton) view, ofObject));
        return ofObject;
    }

    public final String[] getTransitionProperties() {
        return f261175a;
    }
}
