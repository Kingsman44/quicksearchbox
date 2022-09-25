package android.support.p033v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.AlertDialogLayout */
/* compiled from: PG */
public class AlertDialogLayout extends C0597dm {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static int m1726a(View view) {
        int h = C2043bi.m5579h(view);
        if (h > 0) {
            return h;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m1726a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r2
            r2 = r2 & 112(0x70, float:1.57E-43)
            r4 = 16
            if (r2 == r4) goto L_0x0039
            r4 = 80
            if (r2 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r2 = r9.getPaddingTop()
            int r2 = r2 + r14
            int r2 = r2 - r12
            int r12 = r2 - r0
            goto L_0x0043
        L_0x0039:
            int r2 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r2 + r14
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = 0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00ae
            android.view.View r2 = r9.getChildAt(r0)
            if (r2 == 0) goto L_0x00ab
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00ab
            int r4 = r2.getMeasuredWidth()
            int r5 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            android.support.v7.widget.dl r6 = (android.support.p033v7.widget.C0596dl) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L_0x0073
            r7 = r3
        L_0x0073:
            int r8 = androidx.core.p098j.C2043bi.m5577f(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008c
            r8 = 5
            if (r7 == r8) goto L_0x0087
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0097
        L_0x0087:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
            goto L_0x0096
        L_0x008c:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
        L_0x0096:
            int r7 = r7 - r8
        L_0x0097:
            boolean r8 = r9.hasDividerBeforeChildAt(r0)
            if (r8 == 0) goto L_0x009e
            int r12 = r12 + r14
        L_0x009e:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r2.layout(r7, r12, r4, r8)
            int r2 = r6.bottomMargin
            int r5 = r5 + r2
            int r12 = r12 + r5
        L_0x00ab:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i8, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i8, 0);
            i5 = m1726a(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                i7 = 0;
            } else {
                i7 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
            }
            view3.measure(i8, i7);
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i10 = size - paddingTop;
        if (view2 != null) {
            int i11 = paddingTop - i5;
            int min = Math.min(i10, i4);
            if (min > 0) {
                i10 -= min;
                i5 += min;
            }
            view2.measure(i8, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingTop = i11 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i10 > 0) {
            view3.measure(i8, View.MeasureSpec.makeMeasureSpec(i10 + i6, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                i12 = Math.max(i12, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i12 + getPaddingLeft() + getPaddingRight(), i8, i3), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    C0596dl dlVar = (C0596dl) childAt3.getLayoutParams();
                    if (dlVar.width == -1) {
                        int i15 = dlVar.height;
                        dlVar.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        dlVar.height = i15;
                    }
                }
            }
        }
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
