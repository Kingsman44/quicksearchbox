package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.p3504a.C44497b;

/* renamed from: com.google.android.material.tabs.b */
/* compiled from: PG */
final class C44899b extends C44901d {
    /* renamed from: a */
    public final void mo48429a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        if (f >= 0.5f) {
            view = view2;
        }
        RectF b = m79712b(tabLayout, view);
        if (f < 0.5f) {
            f2 = C44497b.m78598b(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            f2 = C44497b.m78598b(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) b.left, drawable.getBounds().top, (int) b.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (f2 * 255.0f));
    }
}
