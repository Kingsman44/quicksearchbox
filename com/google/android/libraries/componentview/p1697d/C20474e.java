package com.google.android.libraries.componentview.p1697d;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.p119j.p120a.p121a.C2300b;

/* renamed from: com.google.android.libraries.componentview.d.e */
/* compiled from: PG */
public final class C20474e {
    /* renamed from: a */
    public static Animator m38426a(View view, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getHeight(), i});
        ofInt.setTarget(view);
        ofInt.addUpdateListener(new C20473d(view));
        ofInt.setDuration(240);
        ofInt.setInterpolator(new C2300b());
        return ofInt;
    }

    /* renamed from: b */
    public static Animator m38427b(View view, int i) {
        Property property = View.ALPHA;
        float[] fArr = new float[2];
        fArr[0] = 1.0f;
        fArr[1] = i == 1 ? 0.25f : 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        ofFloat.setDuration(80);
        ofFloat.setInterpolator(new C2300b());
        if (i != 3) {
            if (i == 2) {
                i = 2;
            }
            return ofFloat;
        }
        ofFloat.addListener(new C20471b(view, i));
        return ofFloat;
    }
}
