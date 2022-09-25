package com.google.android.apps.gsa.searchplate.p6966d;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.searchplate.d.k */
/* compiled from: PG */
public final class C88939k {

    /* renamed from: a */
    public static final Interpolator f240930a = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public static float m144545a(float f, float f2) {
        return f2 > f ? f + ((f2 - f) * 0.3f) : f * 0.92f;
    }

    /* renamed from: b */
    static ViewPropertyAnimator m144546b(View view) {
        return view.animate().setInterpolator(f240930a).setDuration(100).setStartDelay(0);
    }

    /* renamed from: c */
    public static ViewPropertyAnimator m144547c(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
        }
        return m144546b(view).alpha(1.0f).setListener((Animator.AnimatorListener) null);
    }

    /* renamed from: d */
    public static void m144548d(ValueAnimator valueAnimator, long j, TimeInterpolator timeInterpolator, float... fArr) {
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        m144550f(valueAnimator, j, timeInterpolator, fArr);
        valueAnimator.start();
    }

    /* renamed from: e */
    public static void m144549e(ValueAnimator valueAnimator, long j, TimeInterpolator timeInterpolator, int... iArr) {
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setIntValues(iArr);
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator.setDuration(j);
        valueAnimator.start();
    }

    /* renamed from: f */
    public static void m144550f(ValueAnimator valueAnimator, long j, TimeInterpolator timeInterpolator, float... fArr) {
        valueAnimator.setFloatValues(fArr);
        valueAnimator.setInterpolator(timeInterpolator);
        valueAnimator.setDuration(j);
    }

    /* renamed from: g */
    public static void m144551g(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        marginLayoutParams.setMargins(i, i2, i3, i4);
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i3);
    }

    /* renamed from: h */
    public static void m144552h(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: i */
    public static boolean m144553i() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* renamed from: j */
    public static boolean m144554j(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 66 || keyCode == 160;
    }

    /* renamed from: k */
    public static boolean m144555k(View view) {
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: l */
    public static ViewPropertyAnimator m144556l(View view) {
        return m144546b(view).alpha(0.0f).setListener(new C88938j(view));
    }
}
