package android.support.p033v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.C2125l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.widget.cu */
/* compiled from: PG */
public class C0578cu extends ListView {

    /* renamed from: a */
    public boolean f2225a;

    /* renamed from: b */
    C0577ct f2226b;

    /* renamed from: c */
    private final Rect f2227c = new Rect();

    /* renamed from: d */
    private int f2228d = 0;

    /* renamed from: e */
    private int f2229e = 0;

    /* renamed from: f */
    private int f2230f = 0;

    /* renamed from: g */
    private int f2231g = 0;

    /* renamed from: h */
    private int f2232h;

    /* renamed from: i */
    private C0575cr f2233i;

    /* renamed from: j */
    private final boolean f2234j;

    /* renamed from: k */
    private boolean f2235k;

    /* renamed from: l */
    private C2125l f2236l;

    public C0578cu(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f2234j = z;
        setCacheColorHint(0);
    }

    /* renamed from: c */
    private final void m2121c(boolean z) {
        C0575cr crVar = this.f2233i;
        if (crVar != null) {
            crVar.f2222b = z;
        }
    }

    /* renamed from: d */
    private final void m2122d() {
        Drawable selector = getSelector();
        if (selector != null && this.f2235k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0180  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2699a(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001a
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0015
            r0 = 1
            goto L_0x014b
        L_0x0015:
            r0 = 0
            goto L_0x014b
        L_0x0018:
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            r5 = 1
            goto L_0x014b
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f2235k = r4
            android.support.p033v7.widget.C0572co.m2117a(r1, r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0050
            r1.setPressed(r4)
        L_0x0050:
            r16.layoutChildren()
            int r0 = r1.f2232h
            if (r0 == r9) goto L_0x006d
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006d
            if (r0 == r10) goto L_0x006d
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006d
            r0.setPressed(r5)
        L_0x006d:
            r1.f2232h = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            android.support.p033v7.widget.C0572co.m2117a(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0089
            r10.setPressed(r4)
        L_0x0089:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0097
            if (r8 == r9) goto L_0x0094
            r12 = r8
            r13 = 1
            goto L_0x0099
        L_0x0094:
            r8 = -1
            r12 = -1
            goto L_0x0098
        L_0x0097:
            r12 = r8
        L_0x0098:
            r13 = 0
        L_0x0099:
            if (r13 == 0) goto L_0x009e
            r11.setVisible(r5, r5)
        L_0x009e:
            android.graphics.Rect r0 = r1.f2227c
            int r14 = r10.getLeft()
            int r15 = r10.getTop()
            int r5 = r10.getRight()
            int r9 = r10.getBottom()
            r0.set(r14, r15, r5, r9)
            int r5 = r0.left
            int r9 = r1.f2228d
            int r5 = r5 - r9
            r0.left = r5
            int r5 = r0.top
            int r9 = r1.f2229e
            int r5 = r5 - r9
            r0.top = r5
            int r5 = r0.right
            int r9 = r1.f2230f
            int r5 = r5 + r9
            r0.right = r5
            int r5 = r0.bottom
            int r9 = r1.f2231g
            int r5 = r5 + r9
            r0.bottom = r5
            boolean r0 = androidx.core.p094f.C1888a.m5150d()
            if (r0 == 0) goto L_0x00da
            boolean r0 = android.support.p033v7.widget.C0574cq.m2120b(r16)
            goto L_0x00e9
        L_0x00da:
            java.lang.reflect.Field r0 = android.support.p033v7.widget.C0576cs.f2223a
            if (r0 == 0) goto L_0x00e8
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00e3 }
            goto L_0x00e9
        L_0x00e3:
            r0 = move-exception
            r5 = r0
            r5.printStackTrace()
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            boolean r5 = r10.isEnabled()
            if (r5 == r0) goto L_0x0110
            r0 = r0 ^ r4
            boolean r5 = androidx.core.p094f.C1888a.m5150d()
            if (r5 == 0) goto L_0x00fa
            android.support.p033v7.widget.C0574cq.m2119a(r1, r0)
            goto L_0x010a
        L_0x00fa:
            java.lang.reflect.Field r5 = android.support.p033v7.widget.C0576cs.f2223a
            if (r5 == 0) goto L_0x010a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0106 }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r0 = move-exception
            r0.printStackTrace()
        L_0x010a:
            r5 = -1
            if (r12 == r5) goto L_0x0110
            r16.refreshDrawableState()
        L_0x0110:
            if (r13 == 0) goto L_0x012d
            android.graphics.Rect r0 = r1.f2227c
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r9 = r16.getVisibility()
            if (r9 != 0) goto L_0x0124
            r9 = 1
            goto L_0x0125
        L_0x0124:
            r9 = 0
        L_0x0125:
            r12 = 0
            r11.setVisible(r9, r12)
            androidx.core.graphics.drawable.C1929b.m5223d(r11, r5, r0)
            goto L_0x012e
        L_0x012d:
            r12 = 0
        L_0x012e:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x013a
            r5 = -1
            if (r8 == r5) goto L_0x013a
            androidx.core.graphics.drawable.C1929b.m5223d(r0, r7, r6)
        L_0x013a:
            r1.m2121c(r12)
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0149
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0149:
            r0 = 1
            r5 = 0
        L_0x014b:
            if (r0 == 0) goto L_0x014f
            if (r5 == 0) goto L_0x0168
        L_0x014f:
            r3 = 0
            r1.f2235k = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.f2232h
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x0168
            r5.setPressed(r3)
        L_0x0168:
            if (r0 == 0) goto L_0x0180
            androidx.core.widget.l r3 = r1.f2236l
            if (r3 != 0) goto L_0x0175
            androidx.core.widget.l r3 = new androidx.core.widget.l
            r3.<init>(r1)
            r1.f2236l = r3
        L_0x0175:
            androidx.core.widget.l r3 = r1.f2236l
            r3.mo5359f(r4)
            androidx.core.widget.l r3 = r1.f2236l
            r3.onTouch(r1, r2)
            goto L_0x0188
        L_0x0180:
            androidx.core.widget.l r2 = r1.f2236l
            if (r2 == 0) goto L_0x0188
            r3 = 0
            r2.mo5359f(r3)
        L_0x0188:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0578cu.mo2699a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: b */
    public final int mo2700b(int i, int i2) {
        int i3;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i4;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i5 = 0;
        int i6 = 0;
        while (i5 < count) {
            int itemViewType = adapter.getItemViewType(i5);
            int i7 = itemViewType != i6 ? itemViewType : i6;
            if (itemViewType != i6) {
                view = null;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i3);
            view.forceLayout();
            if (i5 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return i2;
            }
            i5++;
            i6 = i7;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f2227c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f2227c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        if (this.f2226b == null) {
            super.drawableStateChanged();
            m2121c(true);
            m2122d();
        }
    }

    public final boolean hasFocus() {
        return this.f2234j || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.f2234j || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.f2234j || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.f2234j && this.f2225a) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f2226b = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.f2226b == null) {
                C0577ct ctVar = new C0577ct(this);
                this.f2226b = ctVar;
                ctVar.f2224a.post(ctVar);
            }
            actionMasked = 10;
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (Build.VERSION.SDK_INT < 30 || !C0573cp.f2218a) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        C0573cp.m2118a(this, pointToPosition, childAt);
                    }
                }
                m2122d();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2232h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0577ct ctVar = this.f2226b;
        if (ctVar != null) {
            C0578cu cuVar = ctVar.f2224a;
            cuVar.f2226b = null;
            cuVar.removeCallbacks(ctVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setSelector(Drawable drawable) {
        C0575cr crVar = drawable != null ? new C0575cr(drawable) : null;
        this.f2233i = crVar;
        super.setSelector(crVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2228d = rect.left;
        this.f2229e = rect.top;
        this.f2230f = rect.right;
        this.f2231g = rect.bottom;
    }
}
