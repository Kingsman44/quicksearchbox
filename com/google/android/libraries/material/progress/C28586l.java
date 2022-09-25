package com.google.android.libraries.material.progress;

import android.animation.ObjectAnimator;
import com.google.android.libraries.material.p2205a.C28497j;

/* renamed from: com.google.android.libraries.material.progress.l */
/* compiled from: PG */
final class C28586l {
    /* renamed from: a */
    public static ObjectAnimator m53482a(Object obj) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "growScale", new float[]{1.0f});
        ofFloat.setInterpolator(C28497j.f77331c);
        ofFloat.setDuration(500);
        return ofFloat;
    }

    /* renamed from: b */
    public static ObjectAnimator m53483b(Object obj) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "growScale", new float[]{0.0f});
        ofFloat.setInterpolator(C28497j.f77331c);
        ofFloat.setDuration(500);
        return ofFloat;
    }
}
