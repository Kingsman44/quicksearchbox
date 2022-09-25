package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p098j.C2043bi;
import org.chromium.net.NetError;

/* renamed from: android.support.v7.widget.dm */
/* compiled from: PG */
public class C0597dm extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "android.support.v7.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public C0597dm(Context context) {
        this(context, (AttributeSet) null);
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                C0596dl dlVar = (C0596dl) virtualChildAt.getLayoutParams();
                if (dlVar.height == -1) {
                    int i4 = dlVar.width;
                    dlVar.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    dlVar.width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                C0596dl dlVar = (C0596dl) virtualChildAt.getLayoutParams();
                if (dlVar.width == -1) {
                    int i4 = dlVar.height;
                    dlVar.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    dlVar.height = i4;
                }
            }
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0596dl;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean b = C0763jq.m2570b(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View virtualChildAt = getVirtualChildAt(i5);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i5))) {
                C0596dl dlVar = (C0596dl) virtualChildAt.getLayoutParams();
                if (b) {
                    i4 = virtualChildAt.getRight() + dlVar.rightMargin;
                } else {
                    i4 = (virtualChildAt.getLeft() - dlVar.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, i4);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                C0596dl dlVar2 = (C0596dl) virtualChildAt2.getLayoutParams();
                if (b) {
                    i3 = virtualChildAt2.getLeft() - dlVar2.leftMargin;
                    i2 = this.mDividerWidth;
                } else {
                    i = virtualChildAt2.getRight() + dlVar2.rightMargin;
                    drawVerticalDivider(canvas, i);
                }
            } else if (b) {
                i = getPaddingLeft();
                drawVerticalDivider(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.mDividerWidth;
            }
            i = i3 - i2;
            drawVerticalDivider(canvas, i);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i2))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((C0596dl) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                i = virtualChildAt2.getBottom() + ((C0596dl) virtualChildAt2.getLayoutParams()).bottomMargin;
            }
            drawHorizontalDivider(canvas, i);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public C0596dl generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new C0596dl(-2, -2);
        }
        if (i == 1) {
            return new C0596dl(-1, -2);
        }
        return null;
    }

    public C0596dl generateLayoutParams(AttributeSet attributeSet) {
        return new C0596dl(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.mBaselineChildTop;
                if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                    }
                }
                return i3 + ((C0596dl) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    /* access modifiers changed from: protected */
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        do {
            i--;
            if (i < 0) {
                return false;
            }
        } while (getChildAt(i).getVisibility() == 8);
        return true;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutHorizontal(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = android.support.p033v7.widget.C0763jq.m2570b(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.mGravity
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.mBaselineAligned
            int[] r13 = r6.mMaxAscent
            int[] r14 = r6.mMaxDescent
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r2
            int r2 = androidx.core.p098j.C2043bi.m5577f(r24)
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r2)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.mTotalLength
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x0144
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.getVirtualChildAt(r2)
            if (r0 != 0) goto L_0x0082
            int r0 = r6.measureNullChild(r2)
            int r1 = r1 + r0
        L_0x0076:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
            goto L_0x0138
        L_0x0082:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0134
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            android.support.v7.widget.dl r4 = (android.support.p033v7.widget.C0596dl) r4
            if (r12 == 0) goto L_0x00aa
            r18 = r3
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00ae
            int r10 = r0.getBaseline()
            goto L_0x00af
        L_0x00aa:
            r18 = r3
            r19 = r10
        L_0x00ae:
            r10 = -1
        L_0x00af:
            int r3 = r4.gravity
            if (r3 >= 0) goto L_0x00b4
            r3 = r11
        L_0x00b4:
            r3 = r3 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r3 == r11) goto L_0x00ef
            r11 = 48
            if (r3 == r11) goto L_0x00e0
            r11 = 80
            if (r3 == r11) goto L_0x00c9
            r3 = r7
            r11 = -1
        L_0x00c6:
            r21 = 1
            goto L_0x00fd
        L_0x00c9:
            int r3 = r8 - r5
            int r11 = r4.bottomMargin
            int r3 = r3 - r11
            r11 = -1
            if (r10 == r11) goto L_0x00c6
            int r21 = r0.getMeasuredHeight()
            r22 = 2
            r23 = r14[r22]
            int r21 = r21 - r10
            int r23 = r23 - r21
            int r3 = r3 - r23
            goto L_0x00c6
        L_0x00e0:
            r11 = -1
            int r3 = r4.topMargin
            int r3 = r3 + r7
            if (r10 == r11) goto L_0x00c6
            r21 = 1
            r22 = r13[r21]
            int r22 = r22 - r10
            int r3 = r3 + r22
            goto L_0x00fd
        L_0x00ef:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00fd:
            boolean r10 = r6.hasDividerBeforeChildAt(r2)
            if (r10 == 0) goto L_0x0106
            int r10 = r6.mDividerWidth
            int r1 = r1 + r10
        L_0x0106:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.getLocationOffset(r0)
            int r22 = r10 + r1
            r25 = r0
            r0 = r24
            r1 = r25
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.getNextLocationOffset(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.getChildrenSkipCount(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0138
        L_0x0134:
            r18 = r3
            goto L_0x0076
        L_0x0138:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0597dm.layoutHorizontal(int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutVertical(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.mGravity
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r1
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 16
            if (r0 == r1) goto L_0x003b
            r1 = 80
            if (r0 == r1) goto L_0x002f
            int r0 = r17.getPaddingTop()
            goto L_0x0047
        L_0x002f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.mTotalLength
            int r0 = r0 - r1
            goto L_0x0047
        L_0x003b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.mTotalLength
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L_0x0047:
            r1 = 0
            r12 = 0
        L_0x0049:
            if (r12 >= r10) goto L_0x00c9
            android.view.View r13 = r6.getVirtualChildAt(r12)
            r14 = 1
            if (r13 != 0) goto L_0x005a
            int r1 = r6.measureNullChild(r12)
            int r0 = r0 + r1
        L_0x0057:
            r1 = 1
            goto L_0x00c7
        L_0x005a:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L_0x0057
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            android.support.v7.widget.dl r5 = (android.support.p033v7.widget.C0596dl) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L_0x0076
            r1 = r11
        L_0x0076:
            int r2 = androidx.core.p098j.C2043bi.m5577f(r17)
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L_0x008e
            r2 = 5
            if (r1 == r2) goto L_0x0089
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L_0x0099
        L_0x0089:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L_0x0098
        L_0x008e:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L_0x0098:
            int r1 = r1 - r2
        L_0x0099:
            r2 = r1
            boolean r1 = r6.hasDividerBeforeChildAt(r12)
            if (r1 == 0) goto L_0x00a3
            int r1 = r6.mDividerHeight
            int r0 = r0 + r1
        L_0x00a3:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.getLocationOffset(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.getNextLocationOffset(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.getChildrenSkipCount(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            goto L_0x0057
        L_0x00c7:
            int r12 = r12 + r1
            goto L_0x0049
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0597dm.layoutVertical(int, int, int, int):void");
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureHorizontal(int r37, int r38) {
        /*
            r36 = this;
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = 0
            r7.mTotalLength = r10
            int r11 = r36.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r37)
            int r13 = android.view.View.MeasureSpec.getMode(r38)
            int[] r0 = r7.mMaxAscent
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.mMaxDescent
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.mMaxAscent = r0
            int[] r0 = new int[r14]
            r7.mMaxDescent = r0
        L_0x0026:
            int[] r15 = r7.mMaxAscent
            int[] r6 = r7.mMaxDescent
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r4 = 1
            r15[r4] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r4] = r5
            r6[r10] = r5
            boolean r3 = r7.mBaselineAligned
            boolean r2 = r7.mUseLargestChild
            r18 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r19 = 0
            r20 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x0057:
            r26 = r6
            r4 = 8
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r11) goto L_0x01fd
            android.view.View r10 = r7.getVirtualChildAt(r1)
            if (r10 != 0) goto L_0x0077
            int r4 = r7.mTotalLength
            int r6 = r7.measureNullChild(r1)
            int r4 = r4 + r6
            r7.mTotalLength = r4
        L_0x006e:
            r33 = r2
            r34 = r3
            r27 = r12
            r6 = 1
            goto L_0x01eb
        L_0x0077:
            int r5 = r10.getVisibility()
            if (r5 != r4) goto L_0x0083
            int r4 = r7.getChildrenSkipCount(r10, r1)
            int r1 = r1 + r4
            goto L_0x006e
        L_0x0083:
            boolean r4 = r7.hasDividerBeforeChildAt(r1)
            if (r4 == 0) goto L_0x0090
            int r4 = r7.mTotalLength
            int r5 = r7.mDividerWidth
            int r4 = r4 + r5
            r7.mTotalLength = r4
        L_0x0090:
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            r5 = r4
            android.support.v7.widget.dl r5 = (android.support.p033v7.widget.C0596dl) r5
            float r4 = r5.weight
            float r22 = r22 + r4
            if (r12 != r6) goto L_0x00e3
            int r4 = r5.width
            if (r4 != 0) goto L_0x00de
            float r4 = r5.weight
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 <= 0) goto L_0x00de
            int r4 = r7.mTotalLength
            int r6 = r5.leftMargin
            r29 = r0
            int r0 = r5.rightMargin
            int r6 = r6 + r0
            int r4 = r4 + r6
            r7.mTotalLength = r4
            if (r3 == 0) goto L_0x00ce
            r0 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r10.measure(r4, r4)
            r33 = r2
            r34 = r3
            r9 = r5
            r27 = r12
            r2 = r25
            r32 = r29
            r29 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0164
        L_0x00ce:
            r33 = r2
            r34 = r3
            r9 = r5
            r27 = r12
            r32 = r29
            r4 = 1
            r29 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0168
        L_0x00de:
            r29 = r0
            r6 = 1073741824(0x40000000, float:2.0)
            goto L_0x00e6
        L_0x00e3:
            r29 = r0
            r6 = r12
        L_0x00e6:
            int r0 = r5.width
            if (r0 != 0) goto L_0x00f5
            float r0 = r5.weight
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
            r0 = -2
            r5.width = r0
            r4 = 0
            goto L_0x00f7
        L_0x00f5:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00f7:
            int r0 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0100
            int r0 = r7.mTotalLength
            r30 = r0
            goto L_0x0102
        L_0x0100:
            r30 = 0
        L_0x0102:
            r31 = 0
            r32 = r29
            r0 = r36
            r29 = r1
            r1 = r10
            r33 = r2
            r2 = r29
            r34 = r3
            r3 = r37
            r35 = r4
            r4 = r30
            r9 = r5
            r5 = r38
            r8 = r6
            r27 = r12
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r31
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = r35
            if (r0 == r12) goto L_0x012b
            r0 = 0
            r9.width = r0
        L_0x012b:
            int r0 = r10.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 != r1) goto L_0x0144
            int r2 = r7.mTotalLength
            int r3 = r9.leftMargin
            int r3 = r3 + r0
            int r4 = r9.rightMargin
            int r3 = r3 + r4
            int r4 = r7.getNextLocationOffset(r10)
            int r3 = r3 + r4
            int r2 = r2 + r3
            r7.mTotalLength = r2
            goto L_0x0159
        L_0x0144:
            int r2 = r7.mTotalLength
            int r3 = r2 + r0
            int r4 = r9.leftMargin
            int r3 = r3 + r4
            int r4 = r9.rightMargin
            int r3 = r3 + r4
            int r4 = r7.getNextLocationOffset(r10)
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r7.mTotalLength = r2
        L_0x0159:
            if (r33 == 0) goto L_0x0162
            r2 = r25
            int r25 = java.lang.Math.max(r0, r2)
            goto L_0x0166
        L_0x0162:
            r2 = r25
        L_0x0164:
            r25 = r2
        L_0x0166:
            r4 = r24
        L_0x0168:
            if (r13 == r1) goto L_0x0173
            int r0 = r9.height
            r1 = -1
            if (r0 != r1) goto L_0x0173
            r0 = 1
            r23 = 1
            goto L_0x0174
        L_0x0173:
            r0 = 0
        L_0x0174:
            int r1 = r9.topMargin
            int r2 = r9.bottomMargin
            int r1 = r1 + r2
            int r2 = r10.getMeasuredHeight()
            int r2 = r2 + r1
            int r3 = r10.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r3)
            if (r34 == 0) goto L_0x01b1
            int r3 = r10.getBaseline()
            r5 = -1
            if (r3 == r5) goto L_0x01b1
            int r5 = r9.gravity
            if (r5 >= 0) goto L_0x0196
            int r5 = r7.mGravity
            goto L_0x0198
        L_0x0196:
            int r5 = r9.gravity
        L_0x0198:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 4
            int r5 = r5 >> r6
            r6 = 1
            int r5 = r5 >> r6
            r8 = r15[r5]
            int r8 = java.lang.Math.max(r8, r3)
            r15[r5] = r8
            r8 = r26[r5]
            int r3 = r2 - r3
            int r3 = java.lang.Math.max(r8, r3)
            r26[r5] = r3
            goto L_0x01b2
        L_0x01b1:
            r6 = 1
        L_0x01b2:
            r3 = r32
            int r3 = java.lang.Math.max(r3, r2)
            if (r21 == 0) goto L_0x01c1
            int r5 = r9.height
            r8 = -1
            if (r5 != r8) goto L_0x01c1
            r5 = 1
            goto L_0x01c2
        L_0x01c1:
            r5 = 0
        L_0x01c2:
            float r8 = r9.weight
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x01d2
            if (r6 == r0) goto L_0x01cb
            r1 = r2
        L_0x01cb:
            r8 = r20
            int r20 = java.lang.Math.max(r8, r1)
            goto L_0x01df
        L_0x01d2:
            r8 = r20
            if (r6 == r0) goto L_0x01d7
            r1 = r2
        L_0x01d7:
            r0 = r19
            int r19 = java.lang.Math.max(r0, r1)
            r20 = r8
        L_0x01df:
            r0 = r29
            int r1 = r7.getChildrenSkipCount(r10, r0)
            int r1 = r1 + r0
            r0 = r3
            r24 = r4
            r21 = r5
        L_0x01eb:
            int r1 = r1 + r6
            r8 = r37
            r9 = r38
            r6 = r26
            r12 = r27
            r2 = r33
            r3 = r34
            r4 = 1
            r5 = -1
            r10 = 0
            goto L_0x0057
        L_0x01fd:
            r33 = r2
            r34 = r3
            r27 = r12
            r8 = r20
            r2 = r25
            r1 = 1073741824(0x40000000, float:2.0)
            r6 = 1
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r0
            r0 = r19
            int r5 = r7.mTotalLength
            if (r5 <= 0) goto L_0x0220
            boolean r5 = r7.hasDividerBeforeChildAt(r11)
            if (r5 == 0) goto L_0x0220
            int r5 = r7.mTotalLength
            int r9 = r7.mDividerWidth
            int r5 = r5 + r9
            r7.mTotalLength = r5
        L_0x0220:
            r5 = r15[r6]
            r9 = -1
            if (r5 != r9) goto L_0x0236
            r10 = 0
            r5 = r15[r10]
            if (r5 != r9) goto L_0x0235
            r5 = r15[r17]
            if (r5 != r9) goto L_0x0235
            r5 = r15[r16]
            if (r5 == r9) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            r1 = r3
            goto L_0x0262
        L_0x0235:
            r5 = -1
        L_0x0236:
            r9 = r15[r16]
            r10 = 0
            r1 = r15[r10]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r5, r4)
            int r1 = java.lang.Math.max(r1, r4)
            int r1 = java.lang.Math.max(r9, r1)
            r4 = r26[r16]
            r5 = r26[r10]
            r9 = r26[r6]
            r10 = r26[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r5 = java.lang.Math.max(r5, r9)
            int r4 = java.lang.Math.max(r4, r5)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r3, r1)
        L_0x0262:
            if (r33 == 0) goto L_0x02b5
            r3 = r27
            if (r3 == r12) goto L_0x026e
            if (r3 != 0) goto L_0x02b7
            r3 = 0
            r4 = 0
            r12 = 0
            goto L_0x0270
        L_0x026e:
            r12 = r3
            r4 = 0
        L_0x0270:
            r7.mTotalLength = r4
            r4 = 0
        L_0x0273:
            if (r4 >= r11) goto L_0x02b8
            android.view.View r5 = r7.getVirtualChildAt(r4)
            if (r5 != 0) goto L_0x0285
            int r5 = r7.mTotalLength
            int r9 = r7.measureNullChild(r4)
            int r5 = r5 + r9
            r7.mTotalLength = r5
            goto L_0x02b1
        L_0x0285:
            int r9 = r5.getVisibility()
            r10 = 8
            if (r9 != r10) goto L_0x0293
            int r5 = r7.getChildrenSkipCount(r5, r4)
            int r4 = r4 + r5
            goto L_0x02b1
        L_0x0293:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            android.support.v7.widget.dl r9 = (android.support.p033v7.widget.C0596dl) r9
            int r10 = r7.mTotalLength
            int r25 = r10 + r2
            int r6 = r9.leftMargin
            int r25 = r25 + r6
            int r6 = r9.rightMargin
            int r25 = r25 + r6
            int r5 = r7.getNextLocationOffset(r5)
            int r5 = r25 + r5
            int r5 = java.lang.Math.max(r10, r5)
            r7.mTotalLength = r5
        L_0x02b1:
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
            goto L_0x0273
        L_0x02b5:
            r3 = r27
        L_0x02b7:
            r12 = r3
        L_0x02b8:
            int r4 = r7.mTotalLength
            int r5 = r36.getPaddingLeft()
            int r6 = r36.getPaddingRight()
            int r5 = r5 + r6
            int r4 = r4 + r5
            r7.mTotalLength = r4
            int r5 = r36.getSuggestedMinimumWidth()
            int r4 = java.lang.Math.max(r4, r5)
            r5 = r37
            r6 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r5, r6)
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r4
            int r9 = r7.mTotalLength
            int r6 = r6 - r9
            if (r24 != 0) goto L_0x0329
            if (r6 == 0) goto L_0x02e5
            int r10 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r10 <= 0) goto L_0x02e5
            goto L_0x0329
        L_0x02e5:
            int r0 = java.lang.Math.max(r0, r8)
            if (r33 == 0) goto L_0x0321
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0321
            r10 = 0
        L_0x02f0:
            if (r10 >= r11) goto L_0x0321
            android.view.View r3 = r7.getVirtualChildAt(r10)
            if (r3 == 0) goto L_0x031e
            int r6 = r3.getVisibility()
            r8 = 8
            if (r6 != r8) goto L_0x0301
            goto L_0x031e
        L_0x0301:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            android.support.v7.widget.dl r6 = (android.support.p033v7.widget.C0596dl) r6
            float r6 = r6.weight
            int r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r6 <= 0) goto L_0x031e
            r6 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            int r12 = r3.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r6)
            r3.measure(r8, r12)
        L_0x031e:
            int r10 = r10 + 1
            goto L_0x02f0
        L_0x0321:
            r27 = r4
            r25 = r11
            r11 = r38
            goto L_0x04c5
        L_0x0329:
            float r1 = r7.mWeightSum
            int r2 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r2 > 0) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            r22 = r1
        L_0x0332:
            r1 = -1
            r15[r16] = r1
            r15[r17] = r1
            r2 = 1
            r15[r2] = r1
            r8 = 0
            r15[r8] = r1
            r26[r16] = r1
            r26[r17] = r1
            r26[r2] = r1
            r26[r8] = r1
            r7.mTotalLength = r8
            r2 = r0
            r0 = -1
            r8 = 0
        L_0x034a:
            if (r8 >= r11) goto L_0x046e
            android.view.View r10 = r7.getVirtualChildAt(r8)
            if (r10 == 0) goto L_0x045c
            int r1 = r10.getVisibility()
            r9 = 8
            if (r1 != r9) goto L_0x035c
            goto L_0x045c
        L_0x035c:
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            android.support.v7.widget.dl r1 = (android.support.p033v7.widget.C0596dl) r1
            float r9 = r1.weight
            int r24 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r24 <= 0) goto L_0x03c5
            float r5 = (float) r6
            float r5 = r5 * r9
            float r5 = r5 / r22
            int r5 = (int) r5
            float r22 = r22 - r9
            int r6 = r6 - r5
            int r9 = r36.getPaddingTop()
            int r24 = r36.getPaddingBottom()
            int r9 = r9 + r24
            r24 = r6
            int r6 = r1.topMargin
            int r9 = r9 + r6
            int r6 = r1.bottomMargin
            int r9 = r9 + r6
            int r6 = r1.height
            r27 = r4
            r25 = r11
            r4 = -1
            r11 = r38
            int r6 = getChildMeasureSpec(r11, r9, r6)
            int r9 = r1.width
            if (r9 != 0) goto L_0x03a5
            r9 = 1073741824(0x40000000, float:2.0)
            if (r12 == r9) goto L_0x0399
            goto L_0x03a7
        L_0x0399:
            if (r5 <= 0) goto L_0x039c
            goto L_0x039d
        L_0x039c:
            r5 = 0
        L_0x039d:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            r10.measure(r5, r6)
            goto L_0x03b7
        L_0x03a5:
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x03a7:
            int r28 = r10.getMeasuredWidth()
            int r5 = r28 + r5
            if (r5 >= 0) goto L_0x03b0
            r5 = 0
        L_0x03b0:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r9)
            r10.measure(r5, r6)
        L_0x03b7:
            int r5 = r10.getMeasuredState()
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 & r6
            int r14 = android.view.View.combineMeasuredStates(r14, r5)
            r6 = r24
            goto L_0x03ce
        L_0x03c5:
            r27 = r4
            r25 = r11
            r4 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r11 = r38
        L_0x03ce:
            if (r3 != r9) goto L_0x03e5
            int r5 = r7.mTotalLength
            int r9 = r10.getMeasuredWidth()
            int r4 = r1.leftMargin
            int r9 = r9 + r4
            int r4 = r1.rightMargin
            int r9 = r9 + r4
            int r4 = r7.getNextLocationOffset(r10)
            int r9 = r9 + r4
            int r5 = r5 + r9
            r7.mTotalLength = r5
            goto L_0x03fd
        L_0x03e5:
            int r4 = r7.mTotalLength
            int r5 = r10.getMeasuredWidth()
            int r5 = r5 + r4
            int r9 = r1.leftMargin
            int r5 = r5 + r9
            int r9 = r1.rightMargin
            int r5 = r5 + r9
            int r9 = r7.getNextLocationOffset(r10)
            int r5 = r5 + r9
            int r4 = java.lang.Math.max(r4, r5)
            r7.mTotalLength = r4
        L_0x03fd:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x0408
            int r4 = r1.height
            r5 = -1
            if (r4 != r5) goto L_0x0408
            r4 = 1
            goto L_0x0409
        L_0x0408:
            r4 = 0
        L_0x0409:
            int r5 = r1.topMargin
            int r9 = r1.bottomMargin
            int r5 = r5 + r9
            int r9 = r10.getMeasuredHeight()
            int r9 = r9 + r5
            int r0 = java.lang.Math.max(r0, r9)
            r24 = r0
            r0 = 1
            if (r0 == r4) goto L_0x041d
            r5 = r9
        L_0x041d:
            int r0 = java.lang.Math.max(r2, r5)
            if (r21 == 0) goto L_0x042a
            int r2 = r1.height
            r4 = -1
            if (r2 != r4) goto L_0x042b
            r2 = 1
            goto L_0x042c
        L_0x042a:
            r4 = -1
        L_0x042b:
            r2 = 0
        L_0x042c:
            if (r34 == 0) goto L_0x0455
            int r5 = r10.getBaseline()
            if (r5 == r4) goto L_0x0455
            int r4 = r1.gravity
            if (r4 >= 0) goto L_0x043b
            int r1 = r7.mGravity
            goto L_0x043d
        L_0x043b:
            int r1 = r1.gravity
        L_0x043d:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r4 = 4
            int r1 = r1 >> r4
            r10 = 1
            int r1 = r1 >> r10
            r10 = r15[r1]
            int r10 = java.lang.Math.max(r10, r5)
            r15[r1] = r10
            r10 = r26[r1]
            int r9 = r9 - r5
            int r5 = java.lang.Math.max(r10, r9)
            r26[r1] = r5
            goto L_0x0456
        L_0x0455:
            r4 = 4
        L_0x0456:
            r21 = r2
            r2 = r0
            r0 = r24
            goto L_0x0463
        L_0x045c:
            r27 = r4
            r25 = r11
            r4 = 4
            r11 = r38
        L_0x0463:
            int r8 = r8 + 1
            r5 = r37
            r11 = r25
            r4 = r27
            r1 = -1
            goto L_0x034a
        L_0x046e:
            r27 = r4
            r25 = r11
            r11 = r38
            int r1 = r7.mTotalLength
            int r3 = r36.getPaddingLeft()
            int r4 = r36.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.mTotalLength = r1
            r1 = 1
            r5 = r15[r1]
            r1 = -1
            if (r5 != r1) goto L_0x0496
            r3 = 0
            r4 = r15[r3]
            if (r4 != r1) goto L_0x0495
            r3 = r15[r17]
            if (r3 != r1) goto L_0x0495
            r3 = r15[r16]
            if (r3 == r1) goto L_0x04c3
        L_0x0495:
            r5 = -1
        L_0x0496:
            r1 = r15[r16]
            r3 = 0
            r4 = r15[r3]
            r6 = r15[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r4 = java.lang.Math.max(r4, r5)
            int r1 = java.lang.Math.max(r1, r4)
            r4 = r26[r16]
            r3 = r26[r3]
            r5 = 1
            r5 = r26[r5]
            r6 = r26[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r3 = java.lang.Math.max(r3, r5)
            int r3 = java.lang.Math.max(r4, r3)
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
        L_0x04c3:
            r1 = r0
            r0 = r2
        L_0x04c5:
            if (r21 != 0) goto L_0x04cc
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x04cc
            goto L_0x04cd
        L_0x04cc:
            r0 = r1
        L_0x04cd:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r14
            r1 = r27 | r1
            int r2 = r36.getPaddingTop()
            int r3 = r36.getPaddingBottom()
            int r2 = r2 + r3
            int r0 = r0 + r2
            int r2 = r36.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r14 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r23 == 0) goto L_0x04f6
            r0 = r37
            r1 = r25
            r7.forceUniformHeight(r1, r0)
        L_0x04f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0597dm.measureHorizontal(int, int):void");
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0317, code lost:
        if (r15.width == -1) goto L_0x031f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void measureVertical(int r29, int r30) {
        /*
            r28 = this;
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = 0
            r7.mTotalLength = r10
            int r11 = r28.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r29)
            int r13 = android.view.View.MeasureSpec.getMode(r30)
            int r14 = r7.mBaselineAlignedChildIndex
            boolean r15 = r7.mUseLargestChild
            r16 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x0029:
            r6 = 8
            if (r5 >= r11) goto L_0x018b
            r21 = r4
            android.view.View r4 = r7.getVirtualChildAt(r5)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.mTotalLength
            int r6 = r7.measureNullChild(r5)
            int r4 = r4 + r6
            r7.mTotalLength = r4
        L_0x003e:
            r25 = r11
            r23 = r13
            r4 = r21
            r10 = 1
            goto L_0x0180
        L_0x0047:
            int r10 = r4.getVisibility()
            if (r10 != r6) goto L_0x0053
            int r4 = r7.getChildrenSkipCount(r4, r5)
            int r5 = r5 + r4
            goto L_0x003e
        L_0x0053:
            boolean r6 = r7.hasDividerBeforeChildAt(r5)
            if (r6 == 0) goto L_0x0060
            int r6 = r7.mTotalLength
            int r10 = r7.mDividerHeight
            int r6 = r6 + r10
            r7.mTotalLength = r6
        L_0x0060:
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            r10 = r6
            android.support.v7.widget.dl r10 = (android.support.p033v7.widget.C0596dl) r10
            float r6 = r10.weight
            float r22 = r0 + r6
            r0 = 1073741824(0x40000000, float:2.0)
            if (r13 != r0) goto L_0x009a
            int r0 = r10.height
            if (r0 != 0) goto L_0x009a
            float r0 = r10.weight
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x009a
            int r0 = r7.mTotalLength
            int r6 = r10.topMargin
            int r6 = r6 + r0
            r23 = r1
            int r1 = r10.bottomMargin
            int r6 = r6 + r1
            int r0 = java.lang.Math.max(r0, r6)
            r7.mTotalLength = r0
            r26 = r2
            r9 = r3
            r3 = r4
            r27 = r5
            r25 = r11
            r8 = r23
            r6 = 1
            r23 = r13
            r13 = r21
            goto L_0x0108
        L_0x009a:
            r23 = r1
            int r0 = r10.height
            if (r0 != 0) goto L_0x00ab
            float r0 = r10.weight
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ab
            r0 = -2
            r10.height = r0
            r6 = 0
            goto L_0x00ad
        L_0x00ab:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00ad:
            int r0 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00b6
            int r0 = r7.mTotalLength
            r24 = r0
            goto L_0x00b8
        L_0x00b6:
            r24 = 0
        L_0x00b8:
            r25 = 0
            r0 = r28
            r8 = r23
            r1 = r4
            r26 = r2
            r2 = r5
            r9 = r3
            r3 = r29
            r23 = r13
            r13 = r21
            r21 = r4
            r4 = r25
            r27 = r5
            r5 = r30
            r25 = r11
            r11 = r6
            r6 = r24
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r0) goto L_0x00e0
            r0 = 0
            r10.height = r0
        L_0x00e0:
            int r0 = r21.getMeasuredHeight()
            int r1 = r7.mTotalLength
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r21
            int r4 = r7.getNextLocationOffset(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.mTotalLength = r1
            if (r15 == 0) goto L_0x0104
            r1 = r20
            int r20 = java.lang.Math.max(r0, r1)
            goto L_0x0106
        L_0x0104:
            r1 = r20
        L_0x0106:
            r6 = r19
        L_0x0108:
            if (r14 < 0) goto L_0x0115
            r0 = r27
            int r5 = r0 + 1
            if (r14 != r5) goto L_0x0117
            int r1 = r7.mTotalLength
            r7.mBaselineChildTop = r1
            goto L_0x0117
        L_0x0115:
            r0 = r27
        L_0x0117:
            if (r0 >= r14) goto L_0x0128
            float r1 = r10.weight
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0120
            goto L_0x0128
        L_0x0120:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0128:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0135
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x0135
            r1 = 1
            r18 = 1
            goto L_0x0136
        L_0x0135:
            r1 = 0
        L_0x0136:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            int r5 = java.lang.Math.max(r13, r4)
            int r11 = r3.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r9, r11)
            if (r17 == 0) goto L_0x0155
            int r11 = r10.width
            r13 = -1
            if (r11 != r13) goto L_0x0155
            r11 = 1
            goto L_0x0156
        L_0x0155:
            r11 = 0
        L_0x0156:
            float r10 = r10.weight
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0167
            r10 = 1
            if (r10 == r1) goto L_0x0160
            r2 = r4
        L_0x0160:
            int r1 = java.lang.Math.max(r8, r2)
            r2 = r26
            goto L_0x0172
        L_0x0167:
            r10 = 1
            if (r10 == r1) goto L_0x016b
            r2 = r4
        L_0x016b:
            r4 = r26
            int r2 = java.lang.Math.max(r4, r2)
            r1 = r8
        L_0x0172:
            int r3 = r7.getChildrenSkipCount(r3, r0)
            int r0 = r0 + r3
            r4 = r5
            r19 = r6
            r3 = r9
            r17 = r11
            r5 = r0
            r0 = r22
        L_0x0180:
            int r5 = r5 + r10
            r8 = r29
            r9 = r30
            r13 = r23
            r11 = r25
            goto L_0x0029
        L_0x018b:
            r8 = r1
            r9 = r3
            r25 = r11
            r23 = r13
            r1 = r20
            r13 = r4
            r4 = r2
            int r2 = r7.mTotalLength
            if (r2 <= 0) goto L_0x01a9
            r2 = r25
            boolean r3 = r7.hasDividerBeforeChildAt(r2)
            if (r3 == 0) goto L_0x01ab
            int r3 = r7.mTotalLength
            int r5 = r7.mDividerHeight
            int r3 = r3 + r5
            r7.mTotalLength = r3
            goto L_0x01ab
        L_0x01a9:
            r2 = r25
        L_0x01ab:
            if (r15 == 0) goto L_0x01fd
            r3 = r23
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L_0x01b6
            if (r3 != 0) goto L_0x01fb
            r3 = 0
        L_0x01b6:
            r5 = 0
            r7.mTotalLength = r5
            r5 = 0
        L_0x01ba:
            if (r5 >= r2) goto L_0x01fb
            android.view.View r10 = r7.getVirtualChildAt(r5)
            if (r10 != 0) goto L_0x01cc
            int r10 = r7.mTotalLength
            int r11 = r7.measureNullChild(r5)
            int r10 = r10 + r11
            r7.mTotalLength = r10
            goto L_0x01f6
        L_0x01cc:
            int r11 = r10.getVisibility()
            if (r11 != r6) goto L_0x01d8
            int r10 = r7.getChildrenSkipCount(r10, r5)
            int r5 = r5 + r10
            goto L_0x01f6
        L_0x01d8:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            android.support.v7.widget.dl r11 = (android.support.p033v7.widget.C0596dl) r11
            int r14 = r7.mTotalLength
            int r20 = r14 + r1
            int r6 = r11.topMargin
            int r20 = r20 + r6
            int r6 = r11.bottomMargin
            int r20 = r20 + r6
            int r6 = r7.getNextLocationOffset(r10)
            int r6 = r20 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.mTotalLength = r6
        L_0x01f6:
            r6 = 1
            int r5 = r5 + r6
            r6 = 8
            goto L_0x01ba
        L_0x01fb:
            r6 = 1
            goto L_0x0200
        L_0x01fd:
            r3 = r23
            goto L_0x01fb
        L_0x0200:
            int r5 = r7.mTotalLength
            int r10 = r28.getPaddingTop()
            int r11 = r28.getPaddingBottom()
            int r10 = r10 + r11
            int r5 = r5 + r10
            r7.mTotalLength = r5
            int r10 = r28.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r5, r10)
            r10 = r9
            r11 = 0
            r9 = r30
            int r5 = android.view.View.resolveSizeAndState(r5, r9, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r5
            int r14 = r7.mTotalLength
            int r11 = r11 - r14
            if (r19 != 0) goto L_0x0270
            if (r11 == 0) goto L_0x022e
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x022e
            goto L_0x0270
        L_0x022e:
            int r0 = java.lang.Math.max(r4, r8)
            if (r15 == 0) goto L_0x026a
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r4) goto L_0x026a
            r3 = 0
        L_0x0239:
            if (r3 >= r2) goto L_0x026a
            android.view.View r4 = r7.getVirtualChildAt(r3)
            if (r4 == 0) goto L_0x0267
            int r6 = r4.getVisibility()
            r8 = 8
            if (r6 != r8) goto L_0x024a
            goto L_0x0267
        L_0x024a:
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            android.support.v7.widget.dl r6 = (android.support.p033v7.widget.C0596dl) r6
            float r6 = r6.weight
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x0267
            int r6 = r4.getMeasuredWidth()
            r8 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r8)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r4.measure(r6, r11)
        L_0x0267:
            int r3 = r3 + 1
            goto L_0x0239
        L_0x026a:
            r11 = r29
        L_0x026c:
            r3 = r10
            r4 = r13
            goto L_0x0368
        L_0x0270:
            float r1 = r7.mWeightSum
            int r8 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x0277
            goto L_0x0278
        L_0x0277:
            r0 = r1
        L_0x0278:
            r1 = 0
            r7.mTotalLength = r1
            r8 = r4
            r4 = r0
            r0 = 0
        L_0x027e:
            if (r0 >= r2) goto L_0x0355
            android.view.View r14 = r7.getVirtualChildAt(r0)
            int r15 = r14.getVisibility()
            r1 = 8
            if (r15 != r1) goto L_0x0294
            r21 = r3
            r19 = r11
            r11 = r29
            goto L_0x034b
        L_0x0294:
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            android.support.v7.widget.dl r15 = (android.support.p033v7.widget.C0596dl) r15
            float r1 = r15.weight
            int r19 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r19 <= 0) goto L_0x02f9
            float r6 = (float) r11
            float r6 = r6 * r1
            float r6 = r6 / r4
            int r6 = (int) r6
            float r4 = r4 - r1
            int r11 = r11 - r6
            int r1 = r28.getPaddingLeft()
            int r19 = r28.getPaddingRight()
            int r1 = r1 + r19
            r19 = r4
            int r4 = r15.leftMargin
            int r1 = r1 + r4
            int r4 = r15.rightMargin
            int r1 = r1 + r4
            int r4 = r15.width
            r20 = r11
            r11 = r29
            int r1 = getChildMeasureSpec(r11, r1, r4)
            int r4 = r15.height
            if (r4 != 0) goto L_0x02d8
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r4) goto L_0x02cc
            goto L_0x02da
        L_0x02cc:
            if (r6 <= 0) goto L_0x02cf
            goto L_0x02d0
        L_0x02cf:
            r6 = 0
        L_0x02d0:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r14.measure(r1, r6)
            goto L_0x02ea
        L_0x02d8:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x02da:
            int r21 = r14.getMeasuredHeight()
            int r6 = r21 + r6
            if (r6 >= 0) goto L_0x02e3
            r6 = 0
        L_0x02e3:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r14.measure(r1, r6)
        L_0x02ea:
            int r1 = r14.getMeasuredState()
            r1 = r1 & -256(0xffffffffffffff00, float:NaN)
            int r10 = android.view.View.combineMeasuredStates(r10, r1)
            r4 = r19
            r1 = r20
            goto L_0x02fc
        L_0x02f9:
            r1 = r11
            r11 = r29
        L_0x02fc:
            int r6 = r15.leftMargin
            r19 = r1
            int r1 = r15.rightMargin
            int r6 = r6 + r1
            int r1 = r14.getMeasuredWidth()
            int r1 = r1 + r6
            int r13 = java.lang.Math.max(r13, r1)
            r20 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x031a
            int r1 = r15.width
            r21 = r3
            r3 = -1
            if (r1 != r3) goto L_0x031d
            goto L_0x031f
        L_0x031a:
            r21 = r3
            r3 = -1
        L_0x031d:
            r6 = r20
        L_0x031f:
            int r1 = java.lang.Math.max(r8, r6)
            if (r17 == 0) goto L_0x032b
            int r6 = r15.width
            if (r6 != r3) goto L_0x032b
            r6 = 1
            goto L_0x032c
        L_0x032b:
            r6 = 0
        L_0x032c:
            int r8 = r7.mTotalLength
            int r17 = r14.getMeasuredHeight()
            int r17 = r8 + r17
            int r3 = r15.topMargin
            int r17 = r17 + r3
            int r3 = r15.bottomMargin
            int r17 = r17 + r3
            int r3 = r7.getNextLocationOffset(r14)
            int r3 = r17 + r3
            int r3 = java.lang.Math.max(r8, r3)
            r7.mTotalLength = r3
            r8 = r1
            r17 = r6
        L_0x034b:
            int r0 = r0 + 1
            r11 = r19
            r3 = r21
            r1 = 0
            r6 = 1
            goto L_0x027e
        L_0x0355:
            r11 = r29
            int r0 = r7.mTotalLength
            int r1 = r28.getPaddingTop()
            int r3 = r28.getPaddingBottom()
            int r1 = r1 + r3
            int r0 = r0 + r1
            r7.mTotalLength = r0
            r0 = r8
            goto L_0x026c
        L_0x0368:
            if (r17 != 0) goto L_0x036f
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x036f
            goto L_0x0370
        L_0x036f:
            r0 = r4
        L_0x0370:
            int r1 = r28.getPaddingLeft()
            int r4 = r28.getPaddingRight()
            int r1 = r1 + r4
            int r0 = r0 + r1
            int r1 = r28.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r3)
            r7.setMeasuredDimension(r0, r5)
            if (r18 == 0) goto L_0x038e
            r7.forceUniformWidth(r2, r9)
        L_0x038e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0597dm.measureVertical(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            boolean z = false;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C0597dm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0597dm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        C0735ip f = C0735ip.m2473f(context, attributeSet, C0338a.f1079o, i, 0);
        C2043bi.m5525S(this, context, C0338a.f1079o, attributeSet, f.f2596b, i, 0);
        int i2 = f.f2596b.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = f.f2596b.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!f.f2596b.getBoolean(2, true)) {
            setBaselineAligned(false);
        }
        this.mWeightSum = f.f2596b.getFloat(4, -1.0f);
        this.mBaselineAlignedChildIndex = f.f2596b.getInt(3, -1);
        this.mUseLargestChild = f.f2596b.getBoolean(7, false);
        setDividerDrawable(f.mo3246b(5));
        this.mShowDividers = f.f2596b.getInt(8, 0);
        this.mDividerPadding = f.f2596b.getDimensionPixelSize(6, 0);
        f.f2596b.recycle();
    }

    /* access modifiers changed from: protected */
    public C0596dl generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0596dl) {
            return new C0596dl((ViewGroup.MarginLayoutParams) (C0596dl) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0596dl((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0596dl(layoutParams);
    }
}
