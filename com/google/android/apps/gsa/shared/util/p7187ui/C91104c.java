package com.google.android.apps.gsa.shared.util.p7187ui;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.C0826b;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.c */
/* compiled from: PG */
public final class C91104c {

    /* renamed from: a */
    public static final Interpolator f254400a = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public static ViewPropertyAnimator m148852a(TextView textView, CharSequence charSequence, float f) {
        return m148853b(textView).alpha(0.0f).withEndAction(new C91102a(textView, charSequence, f));
    }

    /* renamed from: b */
    public static ViewPropertyAnimator m148853b(View view) {
        C22872h.m42743c(C0826b.class);
        return view.animate().setInterpolator(f254400a).setDuration(100).setStartDelay(0);
    }

    /* renamed from: c */
    public static ViewPropertyAnimator m148854c(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
        }
        return m148853b(view).alpha(1.0f).setListener((Animator.AnimatorListener) null);
    }

    /* renamed from: d */
    public static void m148855d(ViewPropertyAnimator... viewPropertyAnimatorArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            ViewPropertyAnimator viewPropertyAnimator = viewPropertyAnimatorArr[i2];
            viewPropertyAnimator.setStartDelay(((long) i) * 100).setDuration((long) (((float) viewPropertyAnimator.getDuration()) * 0.5f));
            i++;
        }
    }
}
