package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.AnimationUtilities */
/* compiled from: PG */
public final class AnimationUtilities {
    private static final float ALPHA_EPSILON = 0.05f;

    /* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.AnimationUtilities$Fade */
    /* compiled from: PG */
    public enum Fade {
        IN,
        OUT
    }

    private AnimationUtilities() {
    }

    public static void animateAlpha(View view, float f, int i) {
        if (i < 0) {
            i = 0;
        }
        float min = Math.min(1.0f, Math.max(0.0f, f));
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        if (i == 0) {
            view.setAlpha(min);
        } else {
            view.animate().setDuration((long) i).alpha(min).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        }
    }

    public static ViewPropertyAnimator animateVisibility(View view, boolean z, int i) {
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        float f = 0.0f;
        if (i == 0) {
            if (true != z) {
                i2 = 8;
            }
            view.setVisibility(i2);
            if (true == z) {
                f = 1.0f;
            }
            view.setAlpha(f);
            return null;
        }
        ViewPropertyAnimator duration = view.animate().setDuration((long) i);
        if (true == z) {
            f = 1.0f;
        }
        ViewPropertyAnimator withEndAction = duration.alpha(f).setInterpolator(new AccelerateDecelerateInterpolator()).withStartAction(new AnimationUtilities$$ExternalSyntheticLambda0(z, view)).withEndAction(new AnimationUtilities$$ExternalSyntheticLambda1(z, view));
        withEndAction.start();
        return withEndAction;
    }

    public static ViewPropertyAnimator fade(View view, Fade fade, int i) {
        return view.animate().setDuration((long) i).setInterpolator(new AccelerateDecelerateInterpolator()).alpha(true != Fade.IN.equals(fade) ? 0.0f : 1.0f);
    }

    public static boolean isVisible(View view) {
        return view.getVisibility() == 0 && view.getAlpha() > ALPHA_EPSILON;
    }

    static /* synthetic */ void lambda$animateVisibility$0(boolean z, View view) {
        if (z && view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
    }

    static /* synthetic */ void lambda$animateVisibility$1(boolean z, View view) {
        if (!z) {
            view.setVisibility(8);
        }
    }
}
