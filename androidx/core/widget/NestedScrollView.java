package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.p098j.C2008ab;
import androidx.core.p098j.C2009ac;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2110y;
import androidx.core.p098j.C2111z;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class NestedScrollView extends FrameLayout implements C2008ab, C2110y {

    /* renamed from: e */
    private static final float f6024e = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: f */
    private static final C2127n f6025f = new C2127n();

    /* renamed from: g */
    private static final int[] f6026g = {16843130};

    /* renamed from: A */
    private int f6027A;

    /* renamed from: B */
    private SavedState f6028B;

    /* renamed from: C */
    private final C2009ac f6029C;

    /* renamed from: D */
    private float f6030D;

    /* renamed from: a */
    public EdgeEffect f6031a;

    /* renamed from: b */
    public EdgeEffect f6032b;

    /* renamed from: c */
    public final C2111z f6033c;

    /* renamed from: d */
    public C2129p f6034d;

    /* renamed from: h */
    private final float f6035h;

    /* renamed from: i */
    private long f6036i;

    /* renamed from: j */
    private final Rect f6037j;

    /* renamed from: k */
    private OverScroller f6038k;

    /* renamed from: l */
    private int f6039l;

    /* renamed from: m */
    private boolean f6040m;

    /* renamed from: n */
    private boolean f6041n;

    /* renamed from: o */
    private View f6042o;

    /* renamed from: p */
    private boolean f6043p;

    /* renamed from: q */
    private VelocityTracker f6044q;

    /* renamed from: r */
    private boolean f6045r;

    /* renamed from: s */
    private boolean f6046s;

    /* renamed from: t */
    private int f6047t;

    /* renamed from: u */
    private int f6048u;

    /* renamed from: v */
    private int f6049v;

    /* renamed from: w */
    private int f6050w;

    /* renamed from: x */
    private final int[] f6051x;

    /* renamed from: y */
    private final int[] f6052y;

    /* renamed from: z */
    private int f6053z;

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private final boolean m5829A() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && mo5308fF() > 0;
        }
        return true;
    }

    /* renamed from: B */
    private final boolean m5830B(View view) {
        return !m5832D(view, 0, getHeight());
    }

    /* renamed from: C */
    private static boolean m5831C(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m5831C((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    private final boolean m5832D(View view, int i, int i2) {
        view.getDrawingRect(this.f6037j);
        offsetDescendantRectToMyCoords(view, this.f6037j);
        return this.f6037j.bottom + i >= getScrollY() && this.f6037j.top - i <= getScrollY() + i2;
    }

    /* renamed from: E */
    private final boolean m5833E(int i, int i2, int i3) {
        boolean z;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z3 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = i4 != 33 ? bottom > view.getBottom() : top < view.getTop();
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            m5839r(i4 == 33 ? i5 - scrollY : i6 - i7);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z;
    }

    /* renamed from: F */
    private final boolean m5834F(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float a = C2123j.m5886a(edgeEffect);
        int height = getHeight();
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / (this.f6035h * 0.015f)));
        double d = (double) f6024e;
        double d2 = (double) (this.f6035h * 0.015f);
        Double.isNaN(d);
        Double.isNaN(d);
        double exp = Math.exp((d / (-1.0d + d)) * log);
        Double.isNaN(d2);
        if (((float) (d2 * exp)) < a * ((float) height)) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private final boolean m5835G(MotionEvent motionEvent) {
        boolean z;
        if (C2123j.m5886a(this.f6031a) != 0.0f) {
            C2123j.m5887b(this.f6031a, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (C2123j.m5886a(this.f6032b) == 0.0f) {
            return z;
        }
        C2123j.m5887b(this.f6032b, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: H */
    private final void m5836H(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f6036i > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight();
                int i3 = layoutParams.topMargin;
                int i4 = layoutParams.bottomMargin;
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int scrollY = getScrollY();
                this.f6038k.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i3) + i4) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, 250);
                m5845y(z);
            } else {
                if (!this.f6038k.isFinished()) {
                    m5838q();
                }
                scrollBy(i, i2);
            }
            this.f6036i = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: p */
    private static int m5837p(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: q */
    private final void m5838q() {
        this.f6038k.abortAnimation();
        this.f6033c.mo5280b(1);
    }

    /* renamed from: r */
    private final void m5839r(int i) {
        if (i == 0) {
            return;
        }
        if (this.f6046s) {
            m5836H(0, i, false);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: s */
    private final void m5840s() {
        this.f6043p = false;
        m5844x();
        this.f6033c.mo5280b(0);
        this.f6031a.onRelease();
        this.f6032b.onRelease();
    }

    /* renamed from: u */
    private final void m5841u() {
        if (this.f6044q == null) {
            this.f6044q = VelocityTracker.obtain();
        }
    }

    /* renamed from: v */
    private final void m5842v(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f6033c.mo5284f(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: w */
    private final void m5843w(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6050w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f6039l = (int) motionEvent.getY(i);
            this.f6050w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f6044q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: x */
    private final void m5844x() {
        VelocityTracker velocityTracker = this.f6044q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6044q = null;
        }
    }

    /* renamed from: z */
    private final void m5846z(View view) {
        view.getDrawingRect(this.f6037j);
        offsetDescendantRectToMyCoords(view, this.f6037j);
        int fE = mo5307fE(this.f6037j);
        if (fE != 0) {
            scrollBy(0, fE);
        }
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: c */
    public void mo5293c(int i) {
        if (getChildCount() > 0) {
            this.f6038k.fling(getScrollX(), getScrollY(), 0, i, 0, 0, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, 0, 0);
            m5845y(true);
        }
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r15 = this;
            android.widget.OverScroller r0 = r15.f6038k
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r15.f6038k
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r15.f6038k
            int r0 = r0.getCurrY()
            int r1 = r15.f6027A
            int r1 = r0 - r1
            int r2 = r15.getHeight()
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            r5 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x004b
            android.widget.EdgeEffect r6 = r15.f6031a
            float r6 = androidx.core.widget.C2123j.m5886a(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x004b
            int r4 = -r2
            float r4 = (float) r4
            float r4 = r4 / r5
            android.widget.EdgeEffect r6 = r15.f6031a
            int r7 = -r1
            float r7 = (float) r7
            float r7 = r7 * r5
            float r2 = (float) r2
            float r7 = r7 / r2
            float r2 = androidx.core.widget.C2123j.m5887b(r6, r7, r3)
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)
            if (r2 == r1) goto L_0x0049
            android.widget.EdgeEffect r3 = r15.f6031a
            r3.finish()
        L_0x0049:
            int r1 = r1 - r2
            goto L_0x0072
        L_0x004b:
            if (r1 >= 0) goto L_0x0072
            android.widget.EdgeEffect r6 = r15.f6032b
            float r6 = androidx.core.widget.C2123j.m5886a(r6)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            float r2 = (float) r2
            float r4 = r2 / r5
            android.widget.EdgeEffect r6 = r15.f6032b
            float r7 = (float) r1
            float r7 = r7 * r5
            float r7 = r7 / r2
            float r2 = androidx.core.widget.C2123j.m5887b(r6, r7, r3)
            float r4 = r4 * r2
            int r2 = java.lang.Math.round(r4)
            if (r2 == r1) goto L_0x0049
            android.widget.EdgeEffect r3 = r15.f6032b
            r3.finish()
            goto L_0x0049
        L_0x0072:
            r15.f6027A = r0
            int[] r5 = r15.f6052y
            r0 = 1
            r8 = 0
            r5[r0] = r8
            androidx.core.j.z r2 = r15.f6033c
            r3 = 0
            r6 = 0
            r7 = 1
            r4 = r1
            r2.mo5283e(r3, r4, r5, r6, r7)
            int[] r2 = r15.f6052y
            r2 = r2[r0]
            int r1 = r1 - r2
            int r2 = r15.mo5308fF()
            if (r1 == 0) goto L_0x00b1
            int r3 = r15.getScrollY()
            int r4 = r15.getScrollX()
            r15.mo5321n(r1, r4, r3, r2)
            int r4 = r15.getScrollY()
            int r10 = r4 - r3
            int r1 = r1 - r10
            int[] r14 = r15.f6052y
            r14[r0] = r8
            int[] r12 = r15.f6051x
            r13 = 1
            r9 = r15
            r11 = r1
            r9.mo5309fG(r10, r11, r12, r13, r14)
            int[] r3 = r15.f6052y
            r3 = r3[r0]
            int r1 = r1 - r3
        L_0x00b1:
            if (r1 == 0) goto L_0x00eb
            int r3 = r15.getOverScrollMode()
            if (r3 == 0) goto L_0x00bd
            if (r3 != r0) goto L_0x00e8
            if (r2 <= 0) goto L_0x00e8
        L_0x00bd:
            if (r1 >= 0) goto L_0x00d4
            android.widget.EdgeEffect r1 = r15.f6031a
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00e8
            android.widget.EdgeEffect r1 = r15.f6031a
            android.widget.OverScroller r2 = r15.f6038k
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
            goto L_0x00e8
        L_0x00d4:
            android.widget.EdgeEffect r1 = r15.f6032b
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x00e8
            android.widget.EdgeEffect r1 = r15.f6032b
            android.widget.OverScroller r2 = r15.f6038k
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r1.onAbsorb(r2)
        L_0x00e8:
            r15.m5838q()
        L_0x00eb:
            android.widget.OverScroller r1 = r15.f6038k
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x00f7
            androidx.core.p098j.C2043bi.m5519M(r15)
            return
        L_0x00f7:
            androidx.core.j.z r1 = r15.f6033c
            r1.mo5280b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY <= max ? bottom : bottom + (scrollY - max);
    }

    /* renamed from: d */
    public void mo1848d(View view, int i, int i2, int[] iArr, int i3) {
        this.f6033c.mo5283e(i, i2, iArr, (int[]) null, i3);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo5317k(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f6033c.mo5281c(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f6033c.mo5282d(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f6033c.mo5283e(i, i2, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f6033c.mo5284f(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f6031a.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C2128o.m5899a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (C2128o.m5899a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f6031a.setSize(width, height);
            if (this.f6031a.draw(canvas)) {
                C2043bi.m5519M(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f6032b.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(mo5308fF(), scrollY) + height2;
            if (C2128o.m5899a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft();
            }
            if (C2128o.m5899a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f6032b.setSize(width2, height2);
            if (this.f6032b.draw(canvas)) {
                C2043bi.m5519M(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public final void mo1850e(View view, int i, int i2, int i3, int i4, int i5) {
        m5842v(i4, i5, (int[]) null);
    }

    /* renamed from: f */
    public final void mo1851f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m5842v(i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: fE */
    public int mo5307fE(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = -(i4 - rect.bottom);
            } else {
                i = -(scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fF */
    public final int mo5308fF() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: fG */
    public void mo5309fG(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.f6033c.mo5284f(0, i, 0, i2, iArr, i3, iArr2);
    }

    /* renamed from: g */
    public final void mo1852g(View view, View view2, int i, int i2) {
        this.f6029C.mo5172a(i, i2);
        this.f6033c.mo5286h(2, i2);
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final int getNestedScrollAxes() {
        C2009ac acVar = this.f6029C;
        return acVar.f5928b | acVar.f5927a;
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void mo1857h(View view, int i) {
        this.f6029C.mo5173b(i);
        this.f6033c.mo5280b(i);
    }

    public final boolean hasNestedScrollingParent() {
        return this.f6033c.mo5285g(0);
    }

    /* renamed from: i */
    public final void mo5314i(boolean z) {
        if (z != this.f6045r) {
            this.f6045r = z;
            requestLayout();
        }
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f6033c.f6017a;
    }

    /* renamed from: j */
    public final boolean mo5316j(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int height = (int) (((float) getHeight()) * 0.5f);
        if (findNextFocus == null || !m5832D(findNextFocus, height, getHeight())) {
            if (i == 33 && getScrollY() < height) {
                height = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                height = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), height);
            }
            if (height == 0) {
                return false;
            }
            if (i != 130) {
                height = -height;
            }
            m5839r(height);
        } else {
            findNextFocus.getDrawingRect(this.f6037j);
            offsetDescendantRectToMyCoords(findNextFocus, this.f6037j);
            m5839r(mo5307fE(this.f6037j));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m5830B(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(C89885b.S3REQUEST_VALUE);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: k */
    public final boolean mo5317k(KeyEvent keyEvent) {
        this.f6037j.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                int i = 33;
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            return false;
                        }
                        if (true != keyEvent.isShiftPressed()) {
                            i = 130;
                        }
                        int height = getHeight();
                        if (i == 130) {
                            this.f6037j.top = getScrollY() + height;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                View childAt2 = getChildAt(childCount - 1);
                                int bottom = childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin + getPaddingBottom();
                                if (this.f6037j.top + height > bottom) {
                                    this.f6037j.top = bottom - height;
                                }
                            }
                        } else {
                            this.f6037j.top = getScrollY() - height;
                            if (this.f6037j.top < 0) {
                                this.f6037j.top = 0;
                            }
                        }
                        Rect rect = this.f6037j;
                        rect.bottom = rect.top + height;
                        m5833E(i, this.f6037j.top, this.f6037j.bottom);
                        return false;
                    } else if (!keyEvent.isAltPressed()) {
                        return mo5316j(130);
                    } else {
                        return mo5318l(130);
                    }
                } else if (!keyEvent.isAltPressed()) {
                    return mo5316j(33);
                } else {
                    return mo5318l(33);
                }
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
    }

    /* renamed from: l */
    public final boolean mo5318l(int i) {
        int childCount;
        int height = getHeight();
        this.f6037j.top = 0;
        this.f6037j.bottom = height;
        if (i == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f6037j.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect = this.f6037j;
            rect.top = rect.bottom - height;
        }
        return m5833E(i, this.f6037j.top, this.f6037j.bottom);
    }

    /* access modifiers changed from: protected */
    public final void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo5321n(int i, int i2, int i3, int i4) {
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        boolean z2 = i2 > 0 || i2 < 0;
        if (i5 > i4) {
            z = true;
        } else if (i5 < 0) {
            z = true;
            i4 = 0;
        } else {
            i4 = i5;
            z = false;
        }
        if (z && !this.f6033c.mo5285g(1)) {
            this.f6038k.springBack(0, i4, 0, 0, 0, mo5308fF());
        }
        onOverScrolled(0, i4, z2, z);
        return z2 || z;
    }

    /* renamed from: o */
    public final void mo5322o(int i, boolean z) {
        m5836H(-getScrollX(), i - getScrollY(), z);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6041n = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L_0x00ce
            boolean r0 = r8.f6043p
            if (r0 != 0) goto L_0x00ce
            r0 = 2
            boolean r0 = androidx.core.p098j.C2109x.m5816a(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = androidx.core.p098j.C2109x.m5816a(r9, r0)
            if (r0 == 0) goto L_0x002b
            r0 = 26
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00ce
            float r3 = r8.f6030D
            r4 = 1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.Context r3 = r8.getContext()
            android.content.res.Resources$Theme r5 = r3.getTheme()
            r6 = 16842829(0x101004d, float:2.3693774E-38)
            boolean r5 = r5.resolveAttribute(r6, r1, r4)
            if (r5 == 0) goto L_0x005c
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r1.getDimension(r3)
            r8.f6030D = r3
            goto L_0x0064
        L_0x005c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected theme to define listPreferredItemHeight."
            r9.<init>(r0)
            throw r9
        L_0x0064:
            int r1 = r8.mo5308fF()
            int r5 = r8.getScrollY()
            float r0 = r0 * r3
            int r0 = (int) r0
            int r0 = r5 - r0
            r3 = 1056964608(0x3f000000, float:0.5)
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r0 >= 0) goto L_0x009a
            boolean r1 = r8.m5829A()
            if (r1 == 0) goto L_0x00c2
            boolean r9 = androidx.core.p098j.C2109x.m5816a(r9, r6)
            if (r9 != 0) goto L_0x00c2
            android.widget.EdgeEffect r9 = r8.f6031a
            float r0 = (float) r0
            float r0 = -r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.C2123j.m5887b(r9, r0, r3)
            android.widget.EdgeEffect r9 = r8.f6031a
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L_0x00c3
        L_0x009a:
            if (r0 <= r1) goto L_0x00c1
            boolean r7 = r8.m5829A()
            if (r7 == 0) goto L_0x00be
            boolean r9 = androidx.core.p098j.C2109x.m5816a(r9, r6)
            if (r9 != 0) goto L_0x00be
            android.widget.EdgeEffect r9 = r8.f6032b
            int r0 = r0 - r1
            float r0 = (float) r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.C2123j.m5887b(r9, r0, r3)
            android.widget.EdgeEffect r9 = r8.f6032b
            r9.onRelease()
            r8.invalidate()
            r2 = 1
        L_0x00be:
            r9 = r2
            r2 = r1
            goto L_0x00c3
        L_0x00c1:
            r2 = r0
        L_0x00c2:
            r9 = 0
        L_0x00c3:
            if (r2 == r5) goto L_0x00cd
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r2)
            return r4
        L_0x00cd:
            return r9
        L_0x00ce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2) {
            if (this.f6043p) {
                return true;
            }
            action = 2;
        }
        int i = action & PrivateKeyType.INVALID;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f6050w;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f6039l) > this.f6047t) {
                                C2009ac acVar = this.f6029C;
                                if ((2 & (acVar.f5928b | acVar.f5927a)) == 0) {
                                    this.f6043p = true;
                                    this.f6039l = y;
                                    m5841u();
                                    this.f6044q.addMovement(motionEvent);
                                    this.f6053z = 0;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m5843w(motionEvent);
                    }
                }
            }
            this.f6043p = false;
            this.f6050w = -1;
            m5844x();
            if (this.f6038k.springBack(getScrollX(), getScrollY(), 0, 0, 0, mo5308fF())) {
                C2043bi.m5519M(this);
            }
            this.f6033c.mo5280b(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.f6039l = y2;
                    this.f6050w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker = this.f6044q;
                    if (velocityTracker == null) {
                        this.f6044q = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    this.f6044q.addMovement(motionEvent);
                    this.f6038k.computeScrollOffset();
                    if (!m5835G(motionEvent) && this.f6038k.isFinished()) {
                        z = false;
                    }
                    this.f6043p = z;
                    this.f6033c.mo5286h(2, 0);
                }
            }
            if (!m5835G(motionEvent) && this.f6038k.isFinished()) {
                z = false;
            }
            this.f6043p = z;
            m5844x();
        }
        return this.f6043p;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f6040m = false;
        View view = this.f6042o;
        if (view != null && m5831C(view, this)) {
            m5846z(this.f6042o);
        }
        this.f6042o = null;
        if (!this.f6041n) {
            if (this.f6028B != null) {
                scrollTo(getScrollX(), this.f6028B.f6054a);
                this.f6028B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int p = m5837p(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, i5);
            if (p != scrollY) {
                scrollTo(getScrollX(), p);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f6041n = true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6045r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo5293c((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.f6033c.mo5282d(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1848d(view, i, i2, iArr, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m5842v(i4, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo1852g(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m5830B(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6028B = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6054a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C2129p pVar = this.f6034d;
        if (pVar != null) {
            pVar.mo4777a(this, i, i2, i4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m5832D(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f6037j);
            offsetDescendantRectToMyCoords(findFocus, this.f6037j);
            m5839r(mo5307fE(this.f6037j));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1884t(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        mo1857h(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r19.m5841u()
            int r0 = r20.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L_0x0011
            r6.f6053z = r1
            r0 = 0
        L_0x0011:
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r20)
            int r2 = r6.f6053z
            float r2 = (float) r2
            r3 = 0
            r8.offsetLocation(r3, r2)
            r2 = 2
            r9 = 1
            if (r0 == 0) goto L_0x02af
            r4 = -1
            if (r0 == r9) goto L_0x022b
            if (r0 == r2) goto L_0x0080
            r1 = 3
            if (r0 == r1) goto L_0x0055
            r1 = 5
            if (r0 == r1) goto L_0x0042
            r1 = 6
            if (r0 == r1) goto L_0x0030
            goto L_0x02e0
        L_0x0030:
            r19.m5843w(r20)
            int r0 = r6.f6050w
            int r0 = r7.findPointerIndex(r0)
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            r6.f6039l = r0
            goto L_0x02e0
        L_0x0042:
            int r0 = r20.getActionIndex()
            float r1 = r7.getY(r0)
            int r1 = (int) r1
            r6.f6039l = r1
            int r0 = r7.getPointerId(r0)
            r6.f6050w = r0
            goto L_0x02e0
        L_0x0055:
            boolean r0 = r6.f6043p
            if (r0 == 0) goto L_0x0079
            int r0 = r19.getChildCount()
            if (r0 <= 0) goto L_0x0079
            android.widget.OverScroller r10 = r6.f6038k
            int r11 = r19.getScrollX()
            int r12 = r19.getScrollY()
            r13 = 0
            r14 = 0
            r15 = 0
            int r16 = r19.mo5308fF()
            boolean r0 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0079
            androidx.core.p098j.C2043bi.m5519M(r19)
        L_0x0079:
            r6.f6050w = r4
            r19.m5840s()
            goto L_0x02e0
        L_0x0080:
            int r0 = r6.f6050w
            int r10 = r7.findPointerIndex(r0)
            if (r10 != r4) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r0.<init>(r1)
            int r1 = r6.f6050w
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r1 = "NestedScrollView"
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            goto L_0x02e0
        L_0x00a4:
            float r0 = r7.getY(r10)
            int r0 = (int) r0
            int r2 = r6.f6039l
            int r2 = r2 - r0
            float r4 = r7.getX(r10)
            int r5 = r19.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            float r5 = (float) r2
            int r11 = r19.getHeight()
            float r11 = (float) r11
            float r5 = r5 / r11
            android.widget.EdgeEffect r11 = r6.f6031a
            float r11 = androidx.core.widget.C2123j.m5886a(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x00e2
            android.widget.EdgeEffect r11 = r6.f6031a
            float r5 = -r5
            float r4 = androidx.core.widget.C2123j.m5887b(r11, r5, r4)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r6.f6031a
            float r5 = androidx.core.widget.C2123j.m5886a(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x00e0
            android.widget.EdgeEffect r3 = r6.f6031a
            r3.onRelease()
        L_0x00e0:
            r3 = r4
            goto L_0x0104
        L_0x00e2:
            android.widget.EdgeEffect r11 = r6.f6032b
            float r11 = androidx.core.widget.C2123j.m5886a(r11)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x0104
            android.widget.EdgeEffect r11 = r6.f6032b
            float r4 = r12 - r4
            float r4 = androidx.core.widget.C2123j.m5887b(r11, r5, r4)
            android.widget.EdgeEffect r5 = r6.f6032b
            float r5 = androidx.core.widget.C2123j.m5886a(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x00e0
            android.widget.EdgeEffect r3 = r6.f6032b
            r3.onRelease()
            goto L_0x00e0
        L_0x0104:
            int r4 = r19.getHeight()
            float r4 = (float) r4
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            if (r3 == 0) goto L_0x0114
            r19.invalidate()
        L_0x0114:
            int r2 = r2 - r3
            boolean r3 = r6.f6043p
            if (r3 != 0) goto L_0x0135
            int r3 = java.lang.Math.abs(r2)
            int r4 = r6.f6047t
            if (r3 <= r4) goto L_0x0135
            android.view.ViewParent r3 = r19.getParent()
            if (r3 == 0) goto L_0x012a
            r3.requestDisallowInterceptTouchEvent(r9)
        L_0x012a:
            r6.f6043p = r9
            if (r2 <= 0) goto L_0x0132
            int r3 = r6.f6047t
            int r2 = r2 - r3
            goto L_0x0135
        L_0x0132:
            int r3 = r6.f6047t
            int r2 = r2 + r3
        L_0x0135:
            boolean r3 = r6.f6043p
            if (r3 == 0) goto L_0x02e0
            int[] r3 = r6.f6052y
            int[] r4 = r6.f6051x
            androidx.core.j.z r13 = r6.f6033c
            r14 = 0
            r18 = 0
            r15 = r2
            r16 = r3
            r17 = r4
            boolean r3 = r13.mo5283e(r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x015b
            int[] r3 = r6.f6052y
            r3 = r3[r9]
            int r2 = r2 - r3
            int r3 = r6.f6053z
            int[] r4 = r6.f6051x
            r4 = r4[r9]
            int r3 = r3 + r4
            r6.f6053z = r3
        L_0x015b:
            r11 = r2
            int[] r2 = r6.f6051x
            r2 = r2[r9]
            int r0 = r0 - r2
            r6.f6039l = r0
            int r13 = r19.getScrollY()
            int r14 = r19.mo5308fF()
            int r0 = r19.getOverScrollMode()
            if (r0 == 0) goto L_0x0178
            if (r0 != r9) goto L_0x0176
            if (r14 <= 0) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            r15 = 0
            goto L_0x0179
        L_0x0178:
            r15 = 1
        L_0x0179:
            int r0 = r19.getScrollY()
            boolean r0 = r6.mo5321n(r11, r1, r0, r14)
            if (r0 == 0) goto L_0x018e
            androidx.core.j.z r0 = r6.f6033c
            boolean r0 = r0.mo5285g(r1)
            if (r0 != 0) goto L_0x018e
            r16 = 1
            goto L_0x0190
        L_0x018e:
            r16 = 0
        L_0x0190:
            int r0 = r19.getScrollY()
            int r2 = r0 - r13
            int[] r5 = r6.f6052y
            r5[r9] = r1
            int r3 = r11 - r2
            int[] r4 = r6.f6051x
            r17 = 0
            r0 = r19
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r17
            r0.mo5309fG(r1, r2, r3, r4, r5)
            int r0 = r6.f6039l
            int[] r1 = r6.f6051x
            r1 = r1[r9]
            int r0 = r0 - r1
            r6.f6039l = r0
            int r0 = r6.f6053z
            int r0 = r0 + r1
            r6.f6053z = r0
            if (r15 == 0) goto L_0x0222
            int[] r0 = r6.f6052y
            r0 = r0[r9]
            int r11 = r11 - r0
            int r13 = r13 + r11
            if (r13 >= 0) goto L_0x01e7
            android.widget.EdgeEffect r0 = r6.f6031a
            int r1 = -r11
            float r1 = (float) r1
            int r2 = r19.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r7.getX(r10)
            int r3 = r19.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C2123j.m5887b(r0, r1, r2)
            android.widget.EdgeEffect r0 = r6.f6032b
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x020d
            android.widget.EdgeEffect r0 = r6.f6032b
            r0.onRelease()
            goto L_0x020d
        L_0x01e7:
            if (r13 <= r14) goto L_0x020d
            android.widget.EdgeEffect r0 = r6.f6032b
            float r1 = (float) r11
            int r2 = r19.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = r7.getX(r10)
            int r3 = r19.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r12 = r12 - r2
            androidx.core.widget.C2123j.m5887b(r0, r1, r12)
            android.widget.EdgeEffect r0 = r6.f6031a
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x020d
            android.widget.EdgeEffect r0 = r6.f6031a
            r0.onRelease()
        L_0x020d:
            android.widget.EdgeEffect r0 = r6.f6031a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x021d
            android.widget.EdgeEffect r0 = r6.f6032b
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0222
        L_0x021d:
            androidx.core.p098j.C2043bi.m5519M(r19)
            goto L_0x02e0
        L_0x0222:
            if (r16 == 0) goto L_0x02e0
            android.view.VelocityTracker r0 = r6.f6044q
            r0.clear()
            goto L_0x02e0
        L_0x022b:
            android.view.VelocityTracker r0 = r6.f6044q
            int r1 = r6.f6049v
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            int r1 = r6.f6050w
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r2 = r6.f6048u
            if (r1 < r2) goto L_0x028f
            android.widget.EdgeEffect r1 = r6.f6031a
            float r1 = androidx.core.widget.C2123j.m5886a(r1)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0261
            android.widget.EdgeEffect r1 = r6.f6031a
            boolean r1 = r6.m5834F(r1, r0)
            if (r1 == 0) goto L_0x025c
            android.widget.EdgeEffect r1 = r6.f6031a
            r1.onAbsorb(r0)
            goto L_0x02a9
        L_0x025c:
            int r0 = -r0
            r6.mo5293c(r0)
            goto L_0x02a9
        L_0x0261:
            android.widget.EdgeEffect r1 = r6.f6032b
            float r1 = androidx.core.widget.C2123j.m5886a(r1)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x027e
            int r0 = -r0
            android.widget.EdgeEffect r1 = r6.f6032b
            boolean r1 = r6.m5834F(r1, r0)
            if (r1 == 0) goto L_0x027a
            android.widget.EdgeEffect r1 = r6.f6032b
            r1.onAbsorb(r0)
            goto L_0x02a9
        L_0x027a:
            r6.mo5293c(r0)
            goto L_0x02a9
        L_0x027e:
            int r0 = -r0
            float r1 = (float) r0
            androidx.core.j.z r2 = r6.f6033c
            boolean r2 = r2.mo5282d(r3, r1)
            if (r2 != 0) goto L_0x02a9
            r6.dispatchNestedFling(r3, r1, r9)
            r6.mo5293c(r0)
            goto L_0x02a9
        L_0x028f:
            android.widget.OverScroller r10 = r6.f6038k
            int r11 = r19.getScrollX()
            int r12 = r19.getScrollY()
            r13 = 0
            r14 = 0
            r15 = 0
            int r16 = r19.mo5308fF()
            boolean r0 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x02a9
            androidx.core.p098j.C2043bi.m5519M(r19)
        L_0x02a9:
            r6.f6050w = r4
            r19.m5840s()
            goto L_0x02e0
        L_0x02af:
            int r0 = r19.getChildCount()
            if (r0 != 0) goto L_0x02b6
            return r1
        L_0x02b6:
            boolean r0 = r6.f6043p
            if (r0 == 0) goto L_0x02c3
            android.view.ViewParent r0 = r19.getParent()
            if (r0 == 0) goto L_0x02c3
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x02c3:
            android.widget.OverScroller r0 = r6.f6038k
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x02ce
            r19.m5838q()
        L_0x02ce:
            float r0 = r20.getY()
            int r0 = (int) r0
            r6.f6039l = r0
            int r0 = r7.getPointerId(r1)
            r6.f6050w = r0
            androidx.core.j.z r0 = r6.f6033c
            r0.mo5286h(r2, r1)
        L_0x02e0:
            android.view.VelocityTracker r0 = r6.f6044q
            if (r0 == 0) goto L_0x02e7
            r0.addMovement(r8)
        L_0x02e7:
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f6040m) {
            m5846z(view2);
        } else {
            this.f6042o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int fE = mo5307fE(rect);
        boolean z2 = fE != 0;
        if (z2) {
            if (z) {
                scrollBy(0, fE);
            } else {
                m5836H(0, fE, false);
            }
        }
        return z2;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m5844x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.f6040m = true;
        super.requestLayout();
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int p = m5837p(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int p2 = m5837p(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (p != getScrollX() || p2 != getScrollY()) {
                super.scrollTo(p, p2);
            }
        }
    }

    public final void setNestedScrollingEnabled(boolean z) {
        this.f6033c.mo5279a(z);
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return this.f6033c.mo5286h(i, 0);
    }

    public final void stopNestedScroll() {
        this.f6033c.mo5280b(0);
    }

    /* renamed from: t */
    public final boolean mo1884t(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* compiled from: PG */
    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C2130q();

        /* renamed from: a */
        public int f6054a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f6054a = parcel.readInt();
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f6054a + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6054a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nestedScrollViewStyle);
    }

    /* renamed from: y */
    private final void m5845y(boolean z) {
        if (z) {
            this.f6033c.mo5286h(2, 1);
        } else {
            this.f6033c.mo5280b(1);
        }
        this.f6027A = getScrollY();
        C2043bi.m5519M(this);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6037j = new Rect();
        this.f6040m = true;
        this.f6041n = false;
        this.f6042o = null;
        this.f6043p = false;
        this.f6046s = true;
        this.f6050w = -1;
        this.f6051x = new int[2];
        this.f6052y = new int[2];
        this.f6031a = C2123j.m5888c(context, attributeSet);
        this.f6032b = C2123j.m5888c(context, attributeSet);
        this.f6035h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f6038k = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(C89885b.HTTP_VALUE);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6047t = viewConfiguration.getScaledTouchSlop();
        this.f6048u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6049v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6026g, i, 0);
        mo5314i(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f6029C = new C2009ac();
        C2111z zVar = new C2111z(this);
        this.f6033c = zVar;
        zVar.mo5279a(true);
        C2043bi.m5526T(this, f6025f);
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
