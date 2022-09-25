package androidx.p180o.p181a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;

@Deprecated
/* renamed from: androidx.o.a.b */
/* compiled from: PG */
public final class C3908b extends FrameLayout {

    /* renamed from: a */
    private final C3911e f12511a = new C3911e(this);

    public C3908b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C3907a generateLayoutParams(AttributeSet attributeSet) {
        return new C3907a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3909c a;
        super.onLayout(z, i, i2, i3, i4);
        C3911e eVar = this.f12511a;
        int childCount = eVar.f12524a.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = eVar.f12524a.getChildAt(i5).getLayoutParams();
            if ((layoutParams instanceof C3907a) && (a = ((C3907a) layoutParams).mo8140a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    a.mo8148b(marginLayoutParams);
                    marginLayoutParams.leftMargin = a.f12521j.leftMargin;
                    marginLayoutParams.topMargin = a.f12521j.topMargin;
                    marginLayoutParams.rightMargin = a.f12521j.rightMargin;
                    marginLayoutParams.bottomMargin = a.f12521j.bottomMargin;
                    C2104s.m5794g(marginLayoutParams, C2104s.m5790c(a.f12521j));
                    C2104s.m5793f(marginLayoutParams, C2104s.m5789b(a.f12521j));
                } else {
                    a.mo8148b(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C3909c a;
        C3909c a2;
        C3911e eVar = this.f12511a;
        int size = (View.MeasureSpec.getSize(i) - eVar.f12524a.getPaddingLeft()) - eVar.f12524a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - eVar.f12524a.getPaddingTop()) - eVar.f12524a.getPaddingBottom();
        int childCount = eVar.f12524a.getChildCount();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= childCount) {
                break;
            }
            View childAt = eVar.f12524a.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C3907a) && (a2 = ((C3907a) layoutParams).mo8140a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    a2.mo8147a(marginLayoutParams, size, size2);
                    a2.f12521j.leftMargin = marginLayoutParams.leftMargin;
                    a2.f12521j.topMargin = marginLayoutParams.topMargin;
                    a2.f12521j.rightMargin = marginLayoutParams.rightMargin;
                    a2.f12521j.bottomMargin = marginLayoutParams.bottomMargin;
                    C2104s.m5794g(a2.f12521j, C2104s.m5790c(marginLayoutParams));
                    C2104s.m5793f(a2.f12521j, C2104s.m5789b(marginLayoutParams));
                    float f = a2.f12514c;
                    if (f >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(((float) size) * f);
                    }
                    float f2 = a2.f12515d;
                    if (f2 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(((float) size2) * f2);
                    }
                    float f3 = a2.f12516e;
                    if (f3 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(((float) size) * f3);
                    }
                    float f4 = a2.f12517f;
                    if (f4 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(((float) size2) * f4);
                    }
                    float f5 = a2.f12518g;
                    if (f5 >= 0.0f) {
                        C2104s.m5794g(marginLayoutParams, Math.round(((float) size) * f5));
                    } else {
                        z = false;
                    }
                    float f6 = a2.f12519h;
                    if (f6 >= 0.0f) {
                        C2104s.m5793f(marginLayoutParams, Math.round(((float) size) * f6));
                    } else if (!z) {
                    }
                    if (childAt != null) {
                        C2104s.m5791d(marginLayoutParams, C2043bi.m5577f(childAt));
                    }
                } else {
                    a2.mo8147a(layoutParams, size, size2);
                }
            }
            i3++;
        }
        super.onMeasure(i, i2);
        C3911e eVar2 = this.f12511a;
        int childCount2 = eVar2.f12524a.getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = eVar2.f12524a.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if ((layoutParams2 instanceof C3907a) && (a = ((C3907a) layoutParams2).mo8140a()) != null) {
                if ((childAt2.getMeasuredWidthAndState() & -16777216) == 16777216 && a.f12512a >= 0.0f && a.f12521j.width == -2) {
                    layoutParams2.width = -2;
                    z2 = true;
                }
                if ((childAt2.getMeasuredHeightAndState() & -16777216) == 16777216 && a.f12513b >= 0.0f && a.f12521j.height == -2) {
                    layoutParams2.height = -2;
                    z2 = true;
                }
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }
}
