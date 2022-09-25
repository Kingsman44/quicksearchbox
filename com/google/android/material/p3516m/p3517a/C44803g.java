package com.google.android.material.p3516m.p3517a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.m.a.g */
/* compiled from: PG */
public final class C44803g implements C44805i {

    /* renamed from: a */
    private final int f116841a;

    public C44803g(int i) {
        this.f116841a = i;
    }

    /* renamed from: c */
    private static Animator m79456c(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C44802f(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: d */
    private static boolean m79457d(View view) {
        return C2043bi.m5577f(view) == 1;
    }

    /* renamed from: e */
    private static final int m79458e(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    /* renamed from: a */
    public final Animator mo48165a(ViewGroup viewGroup, View view) {
        int i = this.f116841a;
        int e = m79458e(view.getContext());
        float translationX = view.getTranslationX();
        view.getTranslationY();
        if (i == 8388611) {
            return m79456c(view, m79457d(viewGroup) ? ((float) e) + translationX : translationX - ((float) e), translationX, translationX);
        } else if (i == 8388613) {
            return m79456c(view, m79457d(viewGroup) ? translationX - ((float) e) : ((float) e) + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: b */
    public final Animator mo48166b(ViewGroup viewGroup, View view) {
        int i = this.f116841a;
        int e = m79458e(view.getContext());
        float translationX = view.getTranslationX();
        view.getTranslationY();
        if (i == 8388611) {
            return m79456c(view, translationX, m79457d(viewGroup) ? translationX - ((float) e) : ((float) e) + translationX, translationX);
        } else if (i == 8388613) {
            return m79456c(view, translationX, m79457d(viewGroup) ? ((float) e) + translationX : translationX - ((float) e), translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }
}
