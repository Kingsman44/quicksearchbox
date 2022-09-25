package com.google.android.libraries.material.featurehighlight;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.material.featurehighlight.ag */
/* compiled from: PG */
final class C28516ag {

    /* renamed from: a */
    public final Rect f77449a = new Rect();

    /* renamed from: b */
    public final Rect f77450b = new Rect();

    /* renamed from: c */
    public final int f77451c;

    /* renamed from: d */
    public final C28512ac f77452d;

    /* renamed from: e */
    public boolean f77453e = false;

    /* renamed from: f */
    public int f77454f = 0;

    /* renamed from: g */
    private final int f77455g;

    /* renamed from: h */
    private final int f77456h;

    public C28516ag(C28512ac acVar) {
        this.f77452d = acVar;
        Resources resources = acVar.getResources();
        this.f77456h = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_max_width);
        this.f77455g = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_horizontal_offset);
        this.f77451c = resources.getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_text_vertical_offset);
    }

    /* renamed from: a */
    public final int mo34046a(View view, int i, int i2, int i3, int i4) {
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = i3 / 2;
        if (i4 - i <= i2 - i4) {
            i5 = (i4 - i6) + this.f77455g;
        } else {
            i5 = (i4 - i6) - this.f77455g;
        }
        if (i5 - marginLayoutParams.leftMargin < i) {
            return i + marginLayoutParams.leftMargin;
        }
        return (i5 + i3) + marginLayoutParams.rightMargin > i2 ? (i2 - i3) - marginLayoutParams.rightMargin : i5;
    }

    /* renamed from: b */
    public final void mo34047b(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, this.f77456h), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, LinearLayoutManager.INVALID_OFFSET));
    }
}
