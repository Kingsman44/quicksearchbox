package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dv */
/* compiled from: PG */
public final class C93625dv extends C93623dt {

    /* renamed from: a */
    public final int f261366a;

    /* renamed from: b */
    public int f261367b = -1;

    /* renamed from: c */
    public TimeInterpolator f261368c;

    /* renamed from: d */
    public TimeInterpolator f261369d;

    /* renamed from: e */
    public TimeInterpolator f261370e;

    /* renamed from: f */
    public TimeInterpolator f261371f;

    /* renamed from: g */
    private final int f261372g;

    /* renamed from: h */
    private final int f261373h;

    /* renamed from: i */
    private final int f261374i;

    /* renamed from: j */
    private final int f261375j;

    public C93625dv(int i, int i2, int i3, int i4, int i5) {
        this.f261372g = i;
        this.f261373h = i2;
        this.f261374i = i3;
        this.f261375j = i4;
        this.f261366a = i5;
    }

    /* renamed from: c */
    private static final void m154471c(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view instanceof TextView) {
            transitionValues.values.put("com:google:android:googlequicksearchbox:textslidefade:gravity", Integer.valueOf(((TextView) view).getGravity()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Animator mo87976a(TransitionValues transitionValues, CharSequence charSequence, TransitionValues transitionValues2, CharSequence charSequence2) {
        char c;
        char c2;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        View view = transitionValues4.view;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        int intValue = transitionValues3.values.containsKey("com:google:android:googlequicksearchbox:textslidefade:gravity") ? ((Integer) transitionValues3.values.get("com:google:android:googlequicksearchbox:textslidefade:gravity")).intValue() : 8388611;
        int intValue2 = transitionValues4.values.containsKey("com:google:android:googlequicksearchbox:textslidefade:gravity") ? ((Integer) transitionValues4.values.get("com:google:android:googlequicksearchbox:textslidefade:gravity")).intValue() : 8388611;
        int[] iArr = transitionValues3.values.containsKey("com:google:android:googlequicksearchbox:textslidefade:drawable_state") ? (int[]) transitionValues3.values.get("com:google:android:googlequicksearchbox:textslidefade:drawable_state") : null;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationY", new float[]{view.getTranslationY(), (float) (this.f261374i * this.f261372g)});
        TimeInterpolator timeInterpolator = this.f261369d;
        if (timeInterpolator != null) {
            ofFloat.setInterpolator(timeInterpolator);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "alpha", new float[]{view.getAlpha(), 0.0f});
        TimeInterpolator timeInterpolator2 = this.f261368c;
        if (timeInterpolator2 != null) {
            ofFloat2.setInterpolator(timeInterpolator2);
        }
        C93624du duVar = r0;
        ObjectAnimator objectAnimator = ofFloat2;
        String str = "alpha";
        ObjectAnimator objectAnimator2 = ofFloat;
        C93624du duVar2 = new C93624du(this, textView, charSequence, intValue, iArr, charSequence2, intValue2);
        objectAnimator.addListener(duVar);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, "translationY", new float[]{(float) (this.f261375j * this.f261373h), 0.0f});
        TimeInterpolator timeInterpolator3 = this.f261371f;
        if (timeInterpolator3 != null) {
            ofFloat3.setInterpolator(timeInterpolator3);
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView, str, new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator4 = this.f261370e;
        if (timeInterpolator4 != null) {
            ofFloat4.setInterpolator(timeInterpolator4);
        }
        int i = this.f261367b;
        if (i != -1) {
            long j = (long) (i >> 1);
            Animator[] animatorArr = {objectAnimator2, objectAnimator, ofFloat3, ofFloat4};
            for (int i2 = 0; i2 < 4; i2++) {
                Animator animator = animatorArr[i2];
                if (animator != null) {
                    animator.setDuration(j);
                }
            }
        }
        if (objectAnimator2 != null) {
            c2 = 0;
            c = 1;
            animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2});
        } else {
            c2 = 0;
            c = 1;
        }
        if (ofFloat3 != null) {
            Animator[] animatorArr2 = new Animator[2];
            animatorArr2[c2] = ofFloat4;
            animatorArr2[c] = ofFloat3;
            animatorSet.playTogether(animatorArr2);
        }
        Animator[] animatorArr3 = new Animator[2];
        animatorArr3[c2] = objectAnimator;
        animatorArr3[c] = ofFloat4;
        animatorSet.playSequentially(animatorArr3);
        return animatorSet;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
        C93623dt.m154469b(transitionValues);
        m154471c(transitionValues);
    }

    public final void captureStartValues(TransitionValues transitionValues) {
        C93623dt.m154469b(transitionValues);
        m154471c(transitionValues);
        transitionValues.values.put("com:google:android:googlequicksearchbox:textslidefade:drawable_state", transitionValues.view.getDrawableState());
    }
}
