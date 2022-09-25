package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.p3504a.C44497b;

/* renamed from: com.google.android.material.tabs.a */
/* compiled from: PG */
final class C44898a extends C44901d {
    /* renamed from: c */
    private static float m79708c(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: d */
    private static float m79709d(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    /* renamed from: a */
    public final void mo48429a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        RectF b = m79712b(tabLayout, view);
        RectF b2 = m79712b(tabLayout, view2);
        if (b.left < b2.left) {
            f3 = m79708c(f);
            f2 = m79709d(f);
        } else {
            f3 = m79709d(f);
            f2 = m79708c(f);
        }
        drawable.setBounds(C44497b.m78599c((int) b.left, (int) b2.left, f3), drawable.getBounds().top, C44497b.m78599c((int) b.right, (int) b2.right, f2), drawable.getBounds().bottom);
    }
}
