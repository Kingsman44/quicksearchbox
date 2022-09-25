package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3504a.C44497b;

/* renamed from: com.google.android.material.tabs.d */
/* compiled from: PG */
class C44901d {
    /* renamed from: b */
    static RectF m79712b(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f117204v || !(view instanceof C44912o)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        C44912o oVar = (C44912o) view;
        View[] viewArr = {oVar.f117233a, oVar.f117234b, oVar.f117235c};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view2 = viewArr[i3];
            if (view2 != null && view2.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        View[] viewArr2 = {oVar.f117233a, oVar.f117234b, oVar.f117235c};
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            View view3 = viewArr2[i7];
            if (view3 != null && view3.getVisibility() == 0) {
                i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i8 = i5 - i6;
        int a = (int) C44741bm.m79308a(oVar.getContext(), 24);
        if (i4 < a) {
            i4 = a;
        }
        int left = (oVar.getLeft() + oVar.getRight()) / 2;
        int top = (oVar.getTop() + oVar.getBottom()) / 2;
        int i9 = i4 / 2;
        return new RectF((float) (left - i9), (float) (top - (i8 / 2)), (float) (i9 + left), (float) (top + (left / 2)));
    }

    /* renamed from: a */
    public void mo48429a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF b = m79712b(tabLayout, view);
        RectF b2 = m79712b(tabLayout, view2);
        drawable.setBounds(C44497b.m78599c((int) b.left, (int) b2.left, f), drawable.getBounds().top, C44497b.m78599c((int) b.right, (int) b2.right, f), drawable.getBounds().bottom);
    }
}
