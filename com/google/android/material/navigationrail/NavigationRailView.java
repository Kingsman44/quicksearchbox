package com.google.android.material.navigationrail;

import android.content.Context;
import android.support.p033v7.widget.C0735ip;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.navigation.C44822i;
import com.google.android.material.navigation.NavigationBarView;

/* compiled from: PG */
public class NavigationRailView extends NavigationBarView {

    /* renamed from: f */
    public Boolean f116963f;

    /* renamed from: g */
    public Boolean f116964g;

    /* renamed from: h */
    private final int f116965h;

    /* renamed from: i */
    private View f116966i;

    public NavigationRailView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    private final boolean m79558f() {
        View view = this.f116966i;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: a */
    public final int mo47496a() {
        return 7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C44822i mo47497b(Context context) {
        return new C44833b(context);
    }

    /* renamed from: e */
    public final boolean mo48247e(Boolean bool) {
        return bool != null ? bool.booleanValue() : C2043bi.m5564ar(this);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C44833b bVar = (C44833b) this.f116865b;
        int i5 = 0;
        if (m79558f()) {
            int bottom = this.f116966i.getBottom() + this.f116965h;
            int top = bVar.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if ((bVar.f116968y.gravity & 112) == 48) {
            i5 = this.f116965h;
        }
        if (i5 > 0) {
            bVar.layout(bVar.getLeft(), bVar.getTop() + i5, bVar.getRight(), bVar.getBottom() + i5);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        }
        super.onMeasure(i, i2);
        if (m79558f()) {
            measureChild((C44833b) this.f116865b, i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f116966i.getMeasuredHeight()) - this.f116965h, LinearLayoutManager.INVALID_OFFSET));
        }
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132151798);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f116963f = null;
        this.f116964g = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin);
        this.f116965h = dimensionPixelSize;
        C0735ip b = C44733be.m79296b(getContext(), attributeSet, C44835d.f116970a, i, i2, new int[0]);
        int resourceId = b.f2596b.getResourceId(0, 0);
        if (resourceId != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(resourceId, this, false);
            View view = this.f116966i;
            if (view != null) {
                removeView(view);
            }
            this.f116966i = inflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = dimensionPixelSize;
            addView(inflate, 0, layoutParams);
        }
        int i3 = b.f2596b.getInt(2, 49);
        C44833b bVar = (C44833b) this.f116865b;
        if (bVar.f116968y.gravity != i3) {
            bVar.f116968y.gravity = i3;
            bVar.setLayoutParams(bVar.f116968y);
        }
        if (b.f2596b.hasValue(1)) {
            int dimensionPixelSize2 = b.f2596b.getDimensionPixelSize(1, -1);
            C44833b bVar2 = (C44833b) this.f116865b;
            if (bVar2.f116967a != dimensionPixelSize2) {
                bVar2.f116967a = dimensionPixelSize2;
                bVar2.requestLayout();
            }
        }
        if (b.f2596b.hasValue(4)) {
            this.f116963f = Boolean.valueOf(b.f2596b.getBoolean(4, false));
        }
        if (b.f2596b.hasValue(3)) {
            this.f116964g = Boolean.valueOf(b.f2596b.getBoolean(3, false));
        }
        b.f2596b.recycle();
        C44741bm.m79313f(this, new C44834c(this));
    }
}
