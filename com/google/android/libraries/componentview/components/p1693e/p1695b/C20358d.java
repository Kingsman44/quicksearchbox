package com.google.android.libraries.componentview.components.p1693e.p1695b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.C4268a;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.google.android.libraries.componentview.components.e.b.d */
/* compiled from: PG */
public final class C20358d extends ViewPager {

    /* renamed from: i */
    public boolean f57241i = true;

    public C20358d(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f57241i) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C4268a aVar = this.f13818b;
        if (aVar != null && aVar.mo9175k() > 0 && (aVar instanceof C20357c)) {
            int i3 = 0;
            for (int i4 = 0; i4 < aVar.mo9175k(); i4++) {
                View view = (View) ((C20357c) aVar).f57240c.get(i4);
                if (view.getVisibility() == 0) {
                    view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight > i3) {
                        i3 = measuredHeight;
                    }
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f57241i) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
