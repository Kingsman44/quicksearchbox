package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.p099a.C1981aa;
import androidx.core.p098j.p099a.C1988h;
import androidx.customview.p103b.C2150h;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.C2171a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class DrawerLayout extends ViewGroup {

    /* renamed from: a */
    static final int[] f6146a = {16842931};

    /* renamed from: g */
    public static final /* synthetic */ int f6147g = 0;

    /* renamed from: h */
    private static final int[] f6148h = {16843828};

    /* renamed from: A */
    private float f6149A;

    /* renamed from: B */
    private float f6150B;

    /* renamed from: C */
    private Drawable f6151C;

    /* renamed from: D */
    private final ArrayList f6152D;

    /* renamed from: E */
    private Rect f6153E;

    /* renamed from: F */
    private Matrix f6154F;

    /* renamed from: G */
    private final C1981aa f6155G;

    /* renamed from: b */
    public boolean f6156b;

    /* renamed from: c */
    public C2179h f6157c;

    /* renamed from: d */
    public List f6158d;

    /* renamed from: e */
    public C2082cp f6159e;

    /* renamed from: f */
    public boolean f6160f;

    /* renamed from: i */
    private float f6161i;

    /* renamed from: j */
    private final int f6162j;

    /* renamed from: k */
    private int f6163k;

    /* renamed from: l */
    private float f6164l;

    /* renamed from: m */
    private final Paint f6165m;

    /* renamed from: n */
    private final C2150h f6166n;

    /* renamed from: o */
    private final C2150h f6167o;

    /* renamed from: p */
    private final C2183l f6168p;

    /* renamed from: q */
    private final C2183l f6169q;

    /* renamed from: r */
    private int f6170r;

    /* renamed from: s */
    private boolean f6171s;

    /* renamed from: t */
    private boolean f6172t;

    /* renamed from: u */
    private OnBackInvokedCallback f6173u;

    /* renamed from: v */
    private OnBackInvokedDispatcher f6174v;

    /* renamed from: w */
    private int f6175w;

    /* renamed from: x */
    private int f6176x;

    /* renamed from: y */
    private int f6177y;

    /* renamed from: z */
    private int f6178z;

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void mo5487a(View view) {
        C2043bi.m5522P(view, C1988h.f5911i.mo5148a());
        if (m6036w(view) && mo5454e(view) != 2) {
            C2043bi.m5523Q(view, C1988h.f5911i, (CharSequence) null, this.f6155G);
        }
    }

    /* renamed from: b */
    private final void m6031b(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (z ? childAt != view : m6035u(childAt)) {
                C2043bi.m5551ae(childAt, 4);
            } else {
                C2043bi.m5551ae(childAt, 1);
            }
        }
    }

    /* renamed from: j */
    public static String m6032j(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: s */
    static final float m6033s(View view) {
        return ((C2180i) view.getLayoutParams()).f6190b;
    }

    /* renamed from: t */
    static final boolean m6034t(View view) {
        return ((C2180i) view.getLayoutParams()).f6189a == 0;
    }

    /* renamed from: u */
    static final boolean m6035u(View view) {
        int absoluteGravity = Gravity.getAbsoluteGravity(((C2180i) view.getLayoutParams()).f6189a, C2043bi.m5577f(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* renamed from: w */
    public static final boolean m6036w(View view) {
        if (m6035u(view)) {
            return (((C2180i) view.getLayoutParams()).f6192d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!m6035u(childAt)) {
                    this.f6152D.add(childAt);
                } else if (m6036w(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f6152D.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = (View) this.f6152D.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f6152D.clear();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo5460h() != null || m6035u(view)) {
            C2043bi.m5551ae(view, 4);
        } else {
            C2043bi.m5551ae(view, 1);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2180i) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C2180i) getChildAt(i).getLayoutParams()).f6190b);
        }
        this.f6164l = f;
        boolean l = this.f6166n.mo5415l();
        boolean l2 = this.f6167o.mo5415l();
        if (l || l2) {
            C2043bi.m5519M(this);
        }
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f6164l <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return false;
            }
            View childAt = getChildAt(childCount);
            if (this.f6153E == null) {
                this.f6153E = new Rect();
            }
            childAt.getHitRect(this.f6153E);
            if (this.f6153E.contains((int) x, (int) y) && !m6034t(childAt)) {
                if (!childAt.getMatrix().isIdentity()) {
                    int scrollX = getScrollX();
                    int left = childAt.getLeft();
                    int scrollY = getScrollY();
                    int top = childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation((float) (scrollX - left), (float) (scrollY - top));
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f6154F == null) {
                            this.f6154F = new Matrix();
                        }
                        matrix.invert(this.f6154F);
                        obtain.transform(this.f6154F);
                    }
                    z = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                } else {
                    float scrollX2 = (float) (getScrollX() - childAt.getLeft());
                    float scrollY2 = (float) (getScrollY() - childAt.getTop());
                    motionEvent.offsetLocation(scrollX2, scrollY2);
                    z = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX2, -scrollY2);
                }
                if (z) {
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean t = m6034t(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (t) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m6035u(childAt) && childAt.getHeight() >= height) {
                    if (mo5481r(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f6164l;
        if (f > 0.0f && t) {
            int i4 = this.f6163k;
            this.f6165m.setColor((((int) (((float) (i4 >>> 24)) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f6165m);
        }
        return drawChild;
    }

    /* renamed from: e */
    public final int mo5454e(View view) {
        int i;
        if (m6035u(view)) {
            int i2 = ((C2180i) view.getLayoutParams()).f6189a;
            int f = C2043bi.m5577f(this);
            if (i2 == 3) {
                i = this.f6175w;
                if (i == 3) {
                    i = f == 0 ? this.f6177y : this.f6178z;
                    if (i == 3) {
                        return 0;
                    }
                }
            } else if (i2 == 5) {
                i = this.f6176x;
                if (i == 3) {
                    i = f == 0 ? this.f6178z : this.f6177y;
                    if (i == 3) {
                        return 0;
                    }
                }
            } else if (i2 == 8388611) {
                i = this.f6177y;
                if (i == 3) {
                    i = f == 0 ? this.f6175w : this.f6176x;
                    if (i == 3) {
                        return 0;
                    }
                }
            } else if (i2 != 8388613) {
                return 0;
            } else {
                i = this.f6178z;
                if (i == 3) {
                    i = f == 0 ? this.f6176x : this.f6175w;
                    if (i == 3) {
                        return 0;
                    }
                }
            }
            return i;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo5455f(View view) {
        return Gravity.getAbsoluteGravity(((C2180i) view.getLayoutParams()).f6189a, C2043bi.m5577f(this));
    }

    /* renamed from: g */
    public final View mo5456g(int i) {
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C2043bi.m5577f(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo5455f(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C2180i();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2180i(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final View mo5460h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C2180i) childAt.getLayoutParams()).f6192d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final View mo5461i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m6035u(childAt)) {
                if (!m6035u(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                } else if (((C2180i) childAt.getLayoutParams()).f6190b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public final void mo5462k(View view, boolean z) {
        if (m6035u(view)) {
            C2180i iVar = (C2180i) view.getLayoutParams();
            if (this.f6172t) {
                iVar.f6190b = 0.0f;
                iVar.f6192d = 0;
            } else if (z) {
                iVar.f6192d |= 4;
                if (mo5481r(view, 3)) {
                    this.f6166n.mo5413j(view, -view.getWidth(), view.getTop());
                } else {
                    this.f6167o.mo5413j(view, getWidth(), view.getTop());
                }
            } else {
                float s = m6033s(view);
                float width = (float) view.getWidth();
                int i = ((int) (width * 0.0f)) - ((int) (width * s));
                if (!mo5481r(view, 3)) {
                    i = -i;
                }
                view.offsetLeftAndRight(i);
                mo5466o(view, 0.0f);
                mo5480q(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo5463l(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C2180i iVar = (C2180i) childAt.getLayoutParams();
            if (m6035u(childAt) && (!z || iVar.f6191c)) {
                int width = childAt.getWidth();
                if (mo5481r(childAt, 3)) {
                    z2 = this.f6166n.mo5413j(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f6167o.mo5413j(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                iVar.f6191c = false;
            }
        }
        this.f6168p.mo5496o();
        this.f6169q.mo5496o();
        if (z3) {
            invalidate();
        }
    }

    /* renamed from: m */
    public final void mo5464m(int i) {
        mo5465n(i, 3);
        mo5465n(i, 5);
    }

    /* renamed from: n */
    public final void mo5465n(int i, int i2) {
        View g;
        C2150h hVar;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, C2043bi.m5577f(this));
        if (i2 == 3) {
            this.f6175w = i;
        } else if (i2 == 5) {
            this.f6176x = i;
        } else if (i2 == 8388611) {
            this.f6177y = i;
        } else if (i2 == 8388613) {
            this.f6178z = i;
        }
        if (i != 0) {
            if (absoluteGravity == 3) {
                hVar = this.f6166n;
            } else {
                hVar = this.f6167o;
            }
            hVar.mo5406c();
        }
        if (i == 1) {
            View g2 = mo5456g(absoluteGravity);
            if (g2 != null) {
                mo5462k(g2, true);
            }
        } else if (i == 2 && (g = mo5456g(absoluteGravity)) != null) {
            mo5484v(g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo5466o(View view, float f) {
        C2180i iVar = (C2180i) view.getLayoutParams();
        if (f != iVar.f6190b) {
            iVar.f6190b = f;
            List list = this.f6158d;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C2179h) this.f6158d.get(size)).mo5489c(view);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6172t = true;
        mo5479p();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6172t = true;
        mo5479p();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6160f && this.f6151C != null) {
            C2082cp cpVar = this.f6159e;
            int d = cpVar != null ? cpVar.mo5242d() : 0;
            if (d > 0) {
                this.f6151C.setBounds(0, 0, getWidth(), d);
                this.f6151C.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r10 = r9.f6166n.mo5405a((int) r0, (int) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getActionMasked()
            androidx.customview.b.h r1 = r9.f6166n
            boolean r1 = r1.mo5412i(r10)
            androidx.customview.b.h r2 = r9.f6167o
            boolean r2 = r2.mo5412i(r10)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0075
            if (r0 == r2) goto L_0x006e
            r10 = 2
            if (r0 == r10) goto L_0x001e
            r10 = 3
            if (r0 == r10) goto L_0x006e
        L_0x001d:
            goto L_0x0073
        L_0x001e:
            androidx.customview.b.h r10 = r9.f6166n
            float[] r0 = r10.f6094c
            if (r0 != 0) goto L_0x0025
            goto L_0x001d
        L_0x0025:
            int r0 = r0.length
            r4 = 0
        L_0x0027:
            if (r4 >= r0) goto L_0x0073
            boolean r5 = r10.mo5410g(r4)
            if (r5 != 0) goto L_0x0030
            goto L_0x006b
        L_0x0030:
            float[] r5 = r10.f6094c
            if (r5 == 0) goto L_0x0064
            float[] r6 = r10.f6095d
            if (r6 == 0) goto L_0x0064
            float[] r7 = r10.f6096e
            if (r7 == 0) goto L_0x0064
            float[] r8 = r10.f6097f
            if (r8 != 0) goto L_0x0041
            goto L_0x0064
        L_0x0041:
            r7 = r7[r4]
            r5 = r5[r4]
            float r7 = r7 - r5
            r5 = r8[r4]
            r6 = r6[r4]
            float r5 = r5 - r6
            int r6 = r10.f6093b
            float r7 = r7 * r7
            float r5 = r5 * r5
            float r7 = r7 + r5
            int r6 = r6 * r6
            float r5 = (float) r6
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x006b
            androidx.drawerlayout.widget.l r10 = r9.f6168p
            r10.mo5496o()
            androidx.drawerlayout.widget.l r10 = r9.f6169q
            r10.mo5496o()
            goto L_0x0073
        L_0x0064:
            java.lang.String r5 = "ViewDragHelper"
            java.lang.String r6 = "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?"
            android.util.Log.w(r5, r6)
        L_0x006b:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x006e:
            r9.mo5463l(r2)
            r9.f6156b = r3
        L_0x0073:
            r10 = 0
            goto L_0x009d
        L_0x0075:
            float r0 = r10.getX()
            float r10 = r10.getY()
            r9.f6149A = r0
            r9.f6150B = r10
            float r4 = r9.f6164l
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x009a
            androidx.customview.b.h r4 = r9.f6166n
            int r0 = (int) r0
            int r10 = (int) r10
            android.view.View r10 = r4.mo5405a(r0, r10)
            if (r10 == 0) goto L_0x009a
            boolean r10 = m6034t(r10)
            if (r10 == 0) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            r9.f6156b = r3
        L_0x009d:
            if (r1 != 0) goto L_0x00bf
            if (r10 != 0) goto L_0x00bf
            int r10 = r9.getChildCount()
            r0 = 0
        L_0x00a6:
            if (r0 >= r10) goto L_0x00ba
            android.view.View r1 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.i r1 = (androidx.drawerlayout.widget.C2180i) r1
            boolean r1 = r1.f6191c
            if (r1 == 0) goto L_0x00b7
            goto L_0x00bf
        L_0x00b7:
            int r0 = r0 + 1
            goto L_0x00a6
        L_0x00ba:
            boolean r10 = r9.f6156b
            if (r10 != 0) goto L_0x00bf
            return r3
        L_0x00bf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (mo5461i() == null) {
                i = 4;
            } else {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View i2 = mo5461i();
        if (i2 != null && mo5454e(i2) == 0) {
            mo5463l(false);
        }
        if (i2 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        float f;
        this.f6171s = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C2180i iVar = (C2180i) childAt.getLayoutParams();
                if (m6034t(childAt)) {
                    childAt.layout(iVar.leftMargin, iVar.topMargin, iVar.leftMargin + childAt.getMeasuredWidth(), iVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo5481r(childAt, 3)) {
                        f = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (iVar.f6190b * f));
                        i5 = measuredWidth + i6;
                    } else {
                        f = (float) measuredWidth;
                        i6 = i7 - ((int) (iVar.f6190b * f));
                        i5 = i7 - i6;
                    }
                    float f2 = ((float) i5) / f;
                    float f3 = iVar.f6190b;
                    int i9 = iVar.f6189a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < iVar.topMargin) {
                            i11 = iVar.topMargin;
                        } else if (i11 + measuredHeight > i10 - iVar.bottomMargin) {
                            i11 = (i10 - iVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i6, i11, measuredWidth + i6, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i6, iVar.topMargin, measuredWidth + i6, iVar.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i6, (i12 - iVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i12 - iVar.bottomMargin);
                    }
                    if (f2 != f3) {
                        mo5466o(childAt, f2);
                    }
                    int i13 = iVar.f6190b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
        }
        C2082cp z2 = C2043bi.m5597z(this);
        if (z2 != null) {
            C1926c t = z2.f5994b.mo5237t();
            C2150h hVar = this.f6166n;
            hVar.f6099h = Math.max(hVar.f6100i, t.f5821b);
            C2150h hVar2 = this.f6167o;
            hVar2.f6099h = Math.max(hVar2.f6100i, t.f5823d);
        }
        this.f6171s = false;
        this.f6172t = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getMode(r18)
            int r2 = android.view.View.MeasureSpec.getMode(r19)
            int r3 = android.view.View.MeasureSpec.getSize(r18)
            int r4 = android.view.View.MeasureSpec.getSize(r19)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto L_0x001a
            if (r2 == r5) goto L_0x002a
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x001a:
            boolean r6 = r17.isInEditMode()
            if (r6 == 0) goto L_0x0192
            r6 = 300(0x12c, float:4.2E-43)
            if (r1 != 0) goto L_0x0026
            r3 = 300(0x12c, float:4.2E-43)
        L_0x0026:
            if (r2 != 0) goto L_0x002a
            r4 = 300(0x12c, float:4.2E-43)
        L_0x002a:
            r0.setMeasuredDimension(r3, r4)
            androidx.core.j.cp r1 = r0.f6159e
            r6 = 0
            if (r1 == 0) goto L_0x003a
            boolean r1 = androidx.core.p098j.C2043bi.m5564ar(r17)
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            int r7 = androidx.core.p098j.C2043bi.m5577f(r17)
            int r8 = r17.getChildCount()
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0046:
            if (r9 >= r8) goto L_0x0191
            android.view.View r12 = r0.getChildAt(r9)
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x0056
            goto L_0x00f8
        L_0x0056:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.drawerlayout.widget.i r13 = (androidx.drawerlayout.widget.C2180i) r13
            r14 = 3
            if (r1 == 0) goto L_0x00d7
            int r15 = r13.f6189a
            int r15 = android.view.Gravity.getAbsoluteGravity(r15, r7)
            boolean r16 = androidx.core.p098j.C2043bi.m5564ar(r12)
            r2 = 5
            if (r16 == 0) goto L_0x0097
            androidx.core.j.cp r5 = r0.f6159e
            if (r15 != r14) goto L_0x0081
            int r2 = r5.mo5240b()
            int r15 = r5.mo5242d()
            int r14 = r5.mo5239a()
            androidx.core.j.cp r5 = r5.mo5245g(r2, r15, r6, r14)
            goto L_0x0093
        L_0x0081:
            if (r15 != r2) goto L_0x0093
            int r2 = r5.mo5242d()
            int r14 = r5.mo5241c()
            int r15 = r5.mo5239a()
            androidx.core.j.cp r5 = r5.mo5245g(r6, r2, r14, r15)
        L_0x0093:
            androidx.core.p098j.C2043bi.m5596y(r12, r5)
            goto L_0x00d7
        L_0x0097:
            androidx.core.j.cp r5 = r0.f6159e
            r14 = 3
            if (r15 != r14) goto L_0x00ad
            int r2 = r5.mo5240b()
            int r14 = r5.mo5242d()
            int r15 = r5.mo5239a()
            androidx.core.j.cp r5 = r5.mo5245g(r2, r14, r6, r15)
            goto L_0x00bf
        L_0x00ad:
            if (r15 != r2) goto L_0x00bf
            int r2 = r5.mo5242d()
            int r14 = r5.mo5241c()
            int r15 = r5.mo5239a()
            androidx.core.j.cp r5 = r5.mo5245g(r6, r2, r14, r15)
        L_0x00bf:
            int r2 = r5.mo5240b()
            r13.leftMargin = r2
            int r2 = r5.mo5242d()
            r13.topMargin = r2
            int r2 = r5.mo5241c()
            r13.rightMargin = r2
            int r2 = r5.mo5239a()
            r13.bottomMargin = r2
        L_0x00d7:
            boolean r2 = m6034t(r12)
            if (r2 == 0) goto L_0x00fd
            int r2 = r13.leftMargin
            int r2 = r3 - r2
            int r5 = r13.rightMargin
            int r2 = r2 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r14 = r13.topMargin
            int r14 = r4 - r14
            int r13 = r13.bottomMargin
            int r14 = r14 - r13
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r12.measure(r2, r13)
        L_0x00f8:
            r15 = r18
            r13 = r19
            goto L_0x016a
        L_0x00fd:
            r5 = 1073741824(0x40000000, float:2.0)
            boolean r2 = m6035u(r12)
            if (r2 == 0) goto L_0x0170
            float r2 = androidx.core.p098j.C2043bi.m5533a(r12)
            float r14 = r0.f6161i
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0112
            androidx.core.p098j.C2043bi.m5548ab(r12, r14)
        L_0x0112:
            int r2 = r0.mo5455f(r12)
            r2 = r2 & 7
            r14 = 3
            if (r2 != r14) goto L_0x011d
            r14 = 1
            goto L_0x011e
        L_0x011d:
            r14 = 0
        L_0x011e:
            if (r14 == 0) goto L_0x0123
            if (r11 != 0) goto L_0x0129
            r11 = 0
        L_0x0123:
            if (r14 != 0) goto L_0x0146
            if (r10 != 0) goto L_0x0129
            r10 = 0
            goto L_0x0146
        L_0x0129:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Child drawer has absolute gravity "
            r3.<init>(r4)
            java.lang.String r2 = m6032j(r2)
            r3.append(r2)
            java.lang.String r2 = " but this DrawerLayout already has a drawer view along that edge"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0146:
            r2 = r14 ^ 1
            r10 = r10 | r2
            r11 = r11 | r14
            int r2 = r0.f6162j
            int r14 = r13.leftMargin
            int r2 = r2 + r14
            int r14 = r13.rightMargin
            int r2 = r2 + r14
            int r14 = r13.width
            r15 = r18
            int r2 = getChildMeasureSpec(r15, r2, r14)
            int r14 = r13.topMargin
            int r5 = r13.bottomMargin
            int r14 = r14 + r5
            int r5 = r13.height
            r13 = r19
            int r5 = getChildMeasureSpec(r13, r14, r5)
            r12.measure(r2, r5)
        L_0x016a:
            int r9 = r9 + 1
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x0046
        L_0x0170:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Child "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r3 = " at index "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0191:
            return
        L_0x0192:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            goto L_0x019b
        L_0x019a:
            throw r1
        L_0x019b:
            goto L_0x019a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View g;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        int i = savedState.f6179a;
        if (!(i == 0 || (g = mo5456g(i)) == null)) {
            mo5484v(g);
        }
        int i2 = savedState.f6180b;
        if (i2 != 3) {
            mo5465n(i2, 3);
        }
        int i3 = savedState.f6181e;
        if (i3 != 3) {
            mo5465n(i3, 5);
        }
        int i4 = savedState.f6182f;
        if (i4 != 3) {
            mo5465n(i4, 8388611);
        }
        int i5 = savedState.f6183g;
        if (i5 != 3) {
            mo5465n(i5, 8388613);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C2180i iVar = (C2180i) getChildAt(i).getLayoutParams();
            int i2 = iVar.f6192d;
            if (i2 == 1 || i2 == 2) {
                savedState.f6179a = iVar.f6189a;
            } else {
                i++;
            }
        }
        savedState.f6180b = this.f6175w;
        savedState.f6181e = this.f6176x;
        savedState.f6182f = this.f6177y;
        savedState.f6183g = this.f6178z;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (mo5454e(r7) != 2) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.b.h r0 = r6.f6166n
            r0.mo5408e(r7)
            androidx.customview.b.h r0 = r6.f6167o
            r0.mo5408e(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.mo5463l(r2)
            r6.f6156b = r1
            goto L_0x006e
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.b.h r3 = r6.f6166n
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo5405a(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = m6034t(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.f6149A
            float r0 = r0 - r3
            float r3 = r6.f6150B
            float r7 = r7 - r3
            androidx.customview.b.h r3 = r6.f6166n
            int r3 = r3.f6093b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.mo5460h()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.mo5454e(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r6.mo5463l(r1)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f6149A = r0
            r6.f6150B = r7
            r6.f6156b = r1
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo5479p() {
        if (Build.VERSION.SDK_INT >= 33) {
            View i = mo5461i();
            OnBackInvokedDispatcher b = C2177f.m6054b(this);
            if (i == null || b == null || mo5454e(i) != 0 || !C2043bi.m5569aw(this)) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.f6174v;
                if (onBackInvokedDispatcher != null) {
                    C2177f.m6056d(onBackInvokedDispatcher, this.f6173u);
                    this.f6174v = null;
                }
            } else if (this.f6174v == null) {
                if (this.f6173u == null) {
                    this.f6173u = C2177f.m6053a(new C2172a(this));
                }
                C2177f.m6055c(b, this.f6173u);
                this.f6174v = b;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo5480q(int i, View view) {
        int i2;
        View rootView;
        int i3 = this.f6166n.f6092a;
        int i4 = this.f6167o.f6092a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (!(i3 == 2 || i4 == 2)) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((C2180i) view.getLayoutParams()).f6190b;
            if (f == 0.0f) {
                C2180i iVar = (C2180i) view.getLayoutParams();
                if ((iVar.f6192d & 1) == 1) {
                    iVar.f6192d = 0;
                    List list = this.f6158d;
                    if (list != null) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ((C2179h) this.f6158d.get(size)).mo5487a(view);
                        }
                    }
                    m6031b(view, false);
                    mo5487a(view);
                    mo5479p();
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                C2180i iVar2 = (C2180i) view.getLayoutParams();
                if ((iVar2.f6192d & 1) == 0) {
                    iVar2.f6192d = 1;
                    List list2 = this.f6158d;
                    if (list2 != null) {
                        int size2 = list2.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            ((C2179h) this.f6158d.get(size2)).mo5488b(view);
                        }
                    }
                    m6031b(view, true);
                    mo5487a(view);
                    mo5479p();
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.f6170r) {
            this.f6170r = i2;
            List list3 = this.f6158d;
            if (list3 != null) {
                int size3 = list3.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        ((C2179h) this.f6158d.get(size3)).mo5490d();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo5481r(View view, int i) {
        return (mo5455f(view) & i) == i;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo5463l(true);
        }
    }

    public final void requestLayout() {
        if (!this.f6171s) {
            super.requestLayout();
        }
    }

    /* renamed from: v */
    public final void mo5484v(View view) {
        if (m6035u(view)) {
            C2180i iVar = (C2180i) view.getLayoutParams();
            if (this.f6172t) {
                iVar.f6190b = 1.0f;
                iVar.f6192d = 1;
                m6031b(view, true);
                mo5487a(view);
                mo5479p();
            } else {
                iVar.f6192d |= 2;
                if (mo5481r(view, 3)) {
                    this.f6166n.mo5413j(view, 0, view.getTop());
                } else {
                    this.f6167o.mo5413j(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.drawerLayoutStyle);
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2180i) {
            return new C2180i((C2180i) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C2180i((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C2180i(layoutParams);
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C2178g();
        this.f6163k = -1728053248;
        this.f6165m = new Paint();
        this.f6172t = true;
        this.f6175w = 3;
        this.f6176x = 3;
        this.f6177y = 3;
        this.f6178z = 3;
        this.f6155G = new C2173b(this);
        setDescendantFocusability(C89885b.HTTP_VALUE);
        float f = getResources().getDisplayMetrics().density;
        this.f6162j = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C2183l lVar = new C2183l(this, 3);
        this.f6168p = lVar;
        C2183l lVar2 = new C2183l(this, 5);
        this.f6169q = lVar2;
        C2150h m = C2150h.m5964m(this, lVar);
        this.f6166n = m;
        m.f6101j = 1;
        m.f6098g = f2;
        lVar.f6195b = m;
        C2150h m2 = C2150h.m5964m(this, lVar2);
        this.f6167o = m2;
        m2.f6101j = 2;
        m2.f6098g = f2;
        lVar2.f6195b = m2;
        setFocusableInTouchMode(true);
        C2043bi.m5551ae(this, 1);
        C2043bi.m5526T(this, new C2175d(this));
        setMotionEventSplittingEnabled(false);
        if (C2043bi.m5564ar(this)) {
            C2043bi.m5555ai(this, C2174c.f6186a);
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6148h);
            try {
                this.f6151C = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C2171a.f6145a, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f6161i = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f6161i = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.f6152D = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C2181j();

        /* renamed from: a */
        int f6179a = 0;

        /* renamed from: b */
        int f6180b;

        /* renamed from: e */
        int f6181e;

        /* renamed from: f */
        int f6182f;

        /* renamed from: g */
        int f6183g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6179a = parcel.readInt();
            this.f6180b = parcel.readInt();
            this.f6181e = parcel.readInt();
            this.f6182f = parcel.readInt();
            this.f6183g = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeInt(this.f6179a);
            parcel.writeInt(this.f6180b);
            parcel.writeInt(this.f6181e);
            parcel.writeInt(this.f6182f);
            parcel.writeInt(this.f6183g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
