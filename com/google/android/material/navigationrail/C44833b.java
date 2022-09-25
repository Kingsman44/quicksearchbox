package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.C44819f;
import com.google.android.material.navigation.C44822i;

/* renamed from: com.google.android.material.navigationrail.b */
/* compiled from: PG */
public final class C44833b extends C44822i {

    /* renamed from: a */
    public int f116967a = -1;

    /* renamed from: y */
    public final FrameLayout.LayoutParams f116968y;

    public C44833b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f116968y = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        this.f116952u = true;
        C44819f[] fVarArr = this.f116935d;
        if (fVarArr != null) {
            for (C44819f fVar : fVarArr) {
                fVar.f116907g = true;
            }
        }
    }

    /* renamed from: h */
    private final int m79564h(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.f116967a;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    /* renamed from: i */
    private final int m79565i(int i, int i2, int i3, View view) {
        int i4;
        if (view == null) {
            i4 = m79564h(i, i2, i3);
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                i5 += m79566j(childAt, i, i4);
            }
        }
        return i5;
    }

    /* renamed from: j */
    private static final int m79566j(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C44819f mo47501b(Context context) {
        return new C44832a(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f116955x.mo1654e().size();
        if (size2 <= 1 || !mo48233f(this.f116934c, size2)) {
            i3 = m79565i(i, size, size2, (View) null);
        } else {
            View childAt = getChildAt(this.f116937f);
            if (childAt != null) {
                i4 = m79566j(childAt, i, m79564h(i, size, size2));
                size -= i4;
                size2--;
            } else {
                i4 = 0;
            }
            i3 = i4 + m79565i(i, size, size2, childAt);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(i3, i2, 0));
    }
}
