package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.navigation.C44819f;
import com.google.android.material.navigation.C44822i;

/* renamed from: com.google.android.material.bottomnavigation.b */
/* compiled from: PG */
public final class C44546b extends C44822i {

    /* renamed from: A */
    private final int f115851A;

    /* renamed from: B */
    private final int f115852B;

    /* renamed from: C */
    private final int[] f115853C = new int[5];

    /* renamed from: a */
    public boolean f115854a;

    /* renamed from: y */
    private final int f115855y;

    /* renamed from: z */
    private final int f115856z;

    public C44546b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f115855y = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f115856z = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f115851A = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f115852B = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C44819f mo47501b(Context context) {
        return new C44545a(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C2043bi.m5577f(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C0477q qVar = this.f116955x;
        int size = View.MeasureSpec.getSize(i);
        int size2 = qVar.mo1654e().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i3 = 1;
        if (!mo48233f(this.f116934c, size2) || !this.f115854a) {
            if (size2 != 0) {
                i3 = size2;
            }
            int min = Math.min(size / i3, this.f115851A);
            int i4 = size - (size2 * min);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (getChildAt(i5).getVisibility() != 8) {
                    int[] iArr = this.f115853C;
                    iArr[i5] = min;
                    if (i4 > 0) {
                        iArr[i5] = min + 1;
                        i4--;
                    }
                } else {
                    this.f115853C[i5] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f116937f);
            int i6 = this.f115852B;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f115851A, LinearLayoutManager.INVALID_OFFSET), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f115856z * i7), Math.min(i6, this.f115851A));
            int i8 = size - min2;
            if (i7 != 0) {
                i3 = i7;
            }
            int min3 = Math.min(i8 / i3, this.f115855y);
            int i9 = i8 - (i7 * min3);
            int i10 = 0;
            while (i10 < childCount) {
                if (getChildAt(i10).getVisibility() != 8) {
                    int[] iArr2 = this.f115853C;
                    int i11 = i10 == this.f116937f ? min2 : min3;
                    iArr2[i10] = i11;
                    if (i9 > 0) {
                        iArr2[i10] = i11 + 1;
                        i9--;
                    }
                } else {
                    this.f115853C[i10] = 0;
                }
                i10++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f115853C[i13], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i12 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(i12, size3);
    }
}
