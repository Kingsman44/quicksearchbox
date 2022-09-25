package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p098j.C2104s;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32052b;
import org.chromium.net.NetError;

/* renamed from: com.google.android.libraries.r.c.b.g */
/* compiled from: PG */
public final class C32103g extends LinearLayout {

    /* renamed from: a */
    int f86202a = 0;

    /* renamed from: b */
    private final C32052b f86203b;

    /* renamed from: c */
    private int f86204c = 8388659;

    public C32103g(Context context, C32052b bVar) {
        super(context);
        this.f86203b = bVar;
        super.setOrientation(0);
    }

    /* renamed from: a */
    protected static final C32102f m59805a() {
        return new C32102f(0, 1.0f, false);
    }

    /* renamed from: b */
    protected static final C32102f m59806b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C32102f) {
            return new C32102f((C32102f) layoutParams);
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new C32102f((LinearLayout.LayoutParams) layoutParams);
        }
        return new C32102f(layoutParams);
    }

    /* renamed from: c */
    private static final int m59807c(C32102f fVar, int i) {
        int i2 = fVar.topMargin + fVar.bottomMargin;
        if (View.MeasureSpec.getMode(i) != 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - i2), View.MeasureSpec.getMode(i));
        }
        if (fVar.height <= 0) {
            return i;
        }
        if (View.MeasureSpec.getMode(i) == 0 || View.MeasureSpec.getSize(i) > fVar.height + i2) {
            return View.MeasureSpec.makeMeasureSpec(fVar.height, 1073741824);
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C32102f;
    }

    public final int getGravity() {
        return this.f86204c;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean booleanValue = ((Boolean) this.f86203b.mo37837a()).booleanValue();
        int paddingTop = getPaddingTop();
        int i10 = i4 - i2;
        int paddingBottom = i10 - getPaddingBottom();
        int paddingBottom2 = (i10 - paddingTop) - getPaddingBottom();
        int childCount = getChildCount();
        int i11 = this.f86204c;
        int i12 = i11 & 112;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11 & 8388615, getLayoutDirection());
        int i13 = 1;
        if (absoluteGravity == 1) {
            i5 = getPaddingLeft() + (((i3 - i) - this.f86202a) / 2);
        } else if (absoluteGravity != 5) {
            i5 = getPaddingLeft();
        } else {
            i5 = ((getPaddingLeft() + i3) - i) - this.f86202a;
        }
        if (booleanValue) {
            i6 = childCount - 1;
            i13 = -1;
        } else {
            i6 = 0;
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt((i13 * i14) + i6);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int i15 = layoutParams.gravity;
                if (i15 < 0) {
                    i15 = i12;
                }
                int i16 = i15 & 112;
                if (i16 != 16) {
                    if (i16 == 48) {
                        i7 = layoutParams.topMargin + paddingTop;
                    } else if (i16 != 80) {
                        i7 = paddingTop;
                    } else {
                        i9 = paddingBottom - measuredHeight;
                        i8 = layoutParams.bottomMargin;
                    }
                    int i17 = i5 + layoutParams.leftMargin;
                    childAt.layout(i17, i7, i17 + measuredWidth, measuredHeight + i7);
                    i5 = i17 + measuredWidth + layoutParams.rightMargin;
                } else {
                    i9 = ((paddingBottom2 - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                    i8 = layoutParams.bottomMargin;
                }
                i7 = i9 - i8;
                int i172 = i5 + layoutParams.leftMargin;
                childAt.layout(i172, i7, i172 + measuredWidth, measuredHeight + i7);
                i5 = i172 + measuredWidth + layoutParams.rightMargin;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (View.MeasureSpec.getMode(i) == 0 || View.MeasureSpec.getSize(i) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            i3 = i2;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size2 - paddingTop, LinearLayoutManager.INVALID_OFFSET);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i8 = 0;
        int i9 = 0;
        float f = 0.0f;
        while (true) {
            i4 = 8;
            if (i8 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C32102f fVar = (C32102f) childAt.getLayoutParams();
                if (fVar.weight == 0.0f && ((fVar.width > 0 || fVar.width == -2) && !fVar.f86201a)) {
                    if (fVar.width == -2) {
                        childAt.measure(makeMeasureSpec, m59807c(fVar, i3));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(fVar.width, 1073741824), m59807c(fVar, i3));
                    }
                    i9 += childAt.getMeasuredWidth();
                } else if (fVar.weight > 0.0f) {
                    f += fVar.weight;
                }
                i9 += C2104s.m5790c(fVar) + C2104s.m5789b(fVar);
            }
            i8++;
        }
        int i10 = i9 + paddingLeft;
        int max = Math.max(size - i10, 0);
        int i11 = 0;
        while (i11 < getChildCount()) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != i4) {
                C32102f fVar2 = (C32102f) childAt2.getLayoutParams();
                if (fVar2.f86201a) {
                    int c = m59807c(fVar2, i3);
                    if (max == 0) {
                        i6 = size2;
                        i7 = 0;
                    } else {
                        i6 = size2;
                        if (fVar2.width == -2) {
                            childAt2.measure(makeMeasureSpec, c);
                            i7 = childAt2.getMeasuredWidth();
                        } else {
                            i7 = fVar2.width;
                        }
                    }
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(max, i7), 1073741824), c);
                    i10 += childAt2.getMeasuredWidth();
                    max = Math.max(0, max - childAt2.getMeasuredWidth());
                    i11++;
                    size2 = i6;
                    i4 = 8;
                }
            }
            i6 = size2;
            i11++;
            size2 = i6;
            i4 = 8;
        }
        int i12 = size2;
        if (f > 0.0f) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt3 = getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    C32102f fVar3 = (C32102f) childAt3.getLayoutParams();
                    if (fVar3.weight > 0.0f) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec((int) ((((float) max) * fVar3.weight) / f), 1073741824), m59807c(fVar3, i3));
                    }
                }
            }
        }
        int i14 = size - paddingLeft;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt4 = getChildAt(i15);
            if (childAt4.getVisibility() != 8) {
                C32102f fVar4 = (C32102f) childAt4.getLayoutParams();
                int c2 = i14 - C2104s.m5790c(fVar4);
                if (childAt4.getMeasuredWidth() > c2) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec(c2, 1073741824), i3);
                }
                i14 = Math.max(0, (c2 - childAt4.getMeasuredWidth()) - C2104s.m5789b(fVar4));
            }
        }
        if (mode == 1073741824) {
            i5 = i12;
        } else {
            int size3 = mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : 1073741823;
            int i16 = 0;
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt5 = getChildAt(i17);
                if (childAt5.getVisibility() != 8) {
                    C32102f fVar5 = (C32102f) childAt5.getLayoutParams();
                    i16 = Math.max(childAt5.getMeasuredHeight() + fVar5.topMargin + fVar5.bottomMargin, i16);
                }
            }
            i5 = Math.min(size3, Math.max(i16 + paddingTop, getMinimumHeight()));
        }
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt6 = getChildAt(i18);
            if (childAt6.getVisibility() != 8) {
                C32102f fVar6 = (C32102f) childAt6.getLayoutParams();
                if (fVar6.height == -1) {
                    childAt6.measure(View.MeasureSpec.makeMeasureSpec(childAt6.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
                } else if (fVar6.height == -2 && childAt6.getMinimumHeight() > childAt6.getMeasuredHeight() && childAt6.getMinimumHeight() < i5) {
                    childAt6.measure(View.MeasureSpec.makeMeasureSpec(childAt6.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt6.getMinimumHeight(), 1073741824));
                }
            }
        }
        if (getLayoutParams() != null && getLayoutParams().width == -2 && f == 0.0f) {
            size = Math.min(size, i10);
        }
        this.f86202a = paddingLeft;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt7 = getChildAt(i19);
            if (childAt7.getVisibility() != 8) {
                this.f86202a += childAt7.getMeasuredWidth();
                C32102f fVar7 = (C32102f) childAt7.getLayoutParams();
                this.f86202a += C2104s.m5790c(fVar7) + C2104s.m5789b(fVar7);
            }
        }
        setMeasuredDimension(size, i5);
    }

    public final void setGravity(int i) {
        if (this.f86204c != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f86204c = i;
            requestLayout();
        }
    }

    public final void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f86204c;
        if ((8388615 & i3) != i2) {
            this.f86204c = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public final void setOrientation(int i) {
        if (i != 0) {
            throw new IllegalArgumentException("GridRowView can only be horizontal");
        }
    }

    public final void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f86204c;
        if ((i3 & 112) != i2) {
            this.f86204c = i2 | (i3 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH);
            requestLayout();
        }
    }
}
