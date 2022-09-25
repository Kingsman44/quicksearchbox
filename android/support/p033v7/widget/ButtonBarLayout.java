package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
/* compiled from: PG */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1817a;

    /* renamed from: b */
    private boolean f1818b;

    /* renamed from: c */
    private int f1819c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338a.f1075k);
        C2043bi.m5525S(this, context, C0338a.f1075k, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1817a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            m1735b(this.f1817a);
        }
    }

    /* renamed from: a */
    private final int m1734a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    private final void m1735b(boolean z) {
        if (this.f1818b == z) {
            return;
        }
        if (!z || this.f1817a) {
            this.f1818b = z;
            setOrientation(z ? 1 : 0);
            setGravity(true != z ? 80 : 8388613);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(true != z ? 4 : 8);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r1 != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            boolean r1 = r6.f1817a
            r2 = 0
            if (r1 == 0) goto L_0x0016
            int r1 = r6.f1819c
            if (r0 <= r1) goto L_0x0014
            boolean r1 = r6.f1818b
            if (r1 == 0) goto L_0x0014
            r6.m1735b(r2)
        L_0x0014:
            r6.f1819c = r0
        L_0x0016:
            boolean r1 = r6.f1818b
            r3 = 1
            if (r1 != 0) goto L_0x002b
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L_0x002b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 1
            goto L_0x002d
        L_0x002b:
            r0 = r7
            r1 = 0
        L_0x002d:
            super.onMeasure(r0, r8)
            boolean r0 = r6.f1817a
            if (r0 == 0) goto L_0x0047
            boolean r0 = r6.f1818b
            if (r0 != 0) goto L_0x0047
            int r0 = r6.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L_0x0047
            r6.m1735b(r3)
            goto L_0x0049
        L_0x0047:
            if (r1 == 0) goto L_0x004c
        L_0x0049:
            super.onMeasure(r7, r8)
        L_0x004c:
            int r0 = r6.m1734a(r2)
            if (r0 < 0) goto L_0x0095
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            int r5 = r6.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r5 = r5 + r1
            int r1 = r4.topMargin
            int r5 = r5 + r1
            int r1 = r4.bottomMargin
            int r5 = r5 + r1
            boolean r1 = r6.f1818b
            if (r1 == 0) goto L_0x008f
            int r0 = r0 + r3
            int r0 = r6.m1734a(r0)
            if (r0 < 0) goto L_0x0096
            android.view.View r0 = r6.getChildAt(r0)
            int r0 = r0.getPaddingTop()
            android.content.res.Resources r1 = r6.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r3 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            int r0 = r0 + r1
            goto L_0x0093
        L_0x008f:
            int r0 = r6.getPaddingBottom()
        L_0x0093:
            int r5 = r5 + r0
            goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            int r0 = androidx.core.p098j.C2043bi.m5579h(r6)
            if (r0 == r5) goto L_0x00a4
            r6.setMinimumHeight(r5)
            if (r8 != 0) goto L_0x00a4
            super.onMeasure(r7, r2)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
