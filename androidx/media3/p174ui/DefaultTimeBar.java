package androidx.media3.p174ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: androidx.media3.ui.DefaultTimeBar */
/* compiled from: PG */
public class DefaultTimeBar extends View implements C3660x {

    /* renamed from: A */
    private final float f11584A;

    /* renamed from: B */
    private int f11585B;

    /* renamed from: C */
    private long f11586C;

    /* renamed from: D */
    private int f11587D;

    /* renamed from: E */
    private Rect f11588E;

    /* renamed from: F */
    private ValueAnimator f11589F;

    /* renamed from: G */
    private boolean f11590G;

    /* renamed from: H */
    private long f11591H;

    /* renamed from: I */
    private long f11592I;

    /* renamed from: J */
    private long f11593J;

    /* renamed from: K */
    private long f11594K;

    /* renamed from: L */
    private int f11595L;

    /* renamed from: M */
    private long[] f11596M;

    /* renamed from: N */
    private boolean[] f11597N;

    /* renamed from: a */
    public final Rect f11598a;

    /* renamed from: b */
    public float f11599b;

    /* renamed from: c */
    private final Rect f11600c;

    /* renamed from: d */
    private final Rect f11601d;

    /* renamed from: e */
    private final Rect f11602e;

    /* renamed from: f */
    private final Paint f11603f;

    /* renamed from: g */
    private final Paint f11604g;

    /* renamed from: h */
    private final Paint f11605h;

    /* renamed from: i */
    private final Paint f11606i;

    /* renamed from: j */
    private final Paint f11607j;

    /* renamed from: k */
    private final Paint f11608k;

    /* renamed from: l */
    private final Drawable f11609l;

    /* renamed from: m */
    private final int f11610m;

    /* renamed from: n */
    private final int f11611n;

    /* renamed from: o */
    private final int f11612o;

    /* renamed from: p */
    private final int f11613p;

    /* renamed from: q */
    private final int f11614q;

    /* renamed from: r */
    private final int f11615r;

    /* renamed from: s */
    private final int f11616s;

    /* renamed from: t */
    private final int f11617t;

    /* renamed from: u */
    private final int f11618u;

    /* renamed from: v */
    private final StringBuilder f11619v;

    /* renamed from: w */
    private final Formatter f11620w;

    /* renamed from: x */
    private final Runnable f11621x;

    /* renamed from: y */
    private final CopyOnWriteArraySet f11622y;

    /* renamed from: z */
    private final Point f11623z;

    public DefaultTimeBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: h */
    private final long m10487h() {
        long j = this.f11586C;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.f11592I;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return j2 / ((long) this.f11585B);
    }

    /* renamed from: i */
    private final long m10488i() {
        if (this.f11600c.width() <= 0 || this.f11592I == -9223372036854775807L) {
            return 0;
        }
        return (((long) this.f11602e.width()) * this.f11592I) / ((long) this.f11600c.width());
    }

    /* renamed from: j */
    private final String m10489j() {
        return C2612ak.m6935R(this.f11619v, this.f11620w, this.f11593J);
    }

    /* renamed from: k */
    private final void m10490k(float f) {
        this.f11602e.right = C2612ak.m6981f((int) f, this.f11600c.left, this.f11600c.right);
    }

    /* renamed from: l */
    private final void m10491l(long j) {
        this.f11591H = j;
        this.f11590G = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f11622y.iterator();
        while (it.hasNext()) {
            ((C3659w) it.next()).mo7685H(j);
        }
    }

    /* renamed from: m */
    private final void m10492m() {
        long j;
        this.f11601d.set(this.f11600c);
        this.f11602e.set(this.f11600c);
        if (this.f11590G) {
            j = this.f11591H;
        } else {
            j = this.f11593J;
        }
        if (this.f11592I > 0) {
            int width = this.f11600c.width();
            long j2 = ((long) width) * this.f11594K;
            this.f11601d.right = Math.min(this.f11600c.left + ((int) (j2 / this.f11592I)), this.f11600c.right);
            long width2 = ((long) this.f11600c.width()) * j;
            this.f11602e.right = Math.min(this.f11600c.left + ((int) (width2 / this.f11592I)), this.f11600c.right);
        } else {
            this.f11601d.right = this.f11600c.left;
            this.f11602e.right = this.f11600c.left;
        }
        invalidate(this.f11598a);
    }

    /* renamed from: n */
    private final void m10493n() {
        Drawable drawable = this.f11609l;
        if (drawable != null && drawable.isStateful() && this.f11609l.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: o */
    private final void m10494o(long j) {
        if (this.f11591H != j) {
            this.f11591H = j;
            Iterator it = this.f11622y.iterator();
            while (it.hasNext()) {
                ((C3659w) it.next()).mo7684G(j);
            }
        }
    }

    /* renamed from: p */
    private final boolean m10495p(long j) {
        long j2;
        long j3 = this.f11592I;
        if (j3 <= 0) {
            return false;
        }
        if (this.f11590G) {
            j2 = this.f11591H;
        } else {
            j2 = this.f11593J;
        }
        long j4 = j2;
        long s = C2612ak.m6994s(j4 + j, 0, j3);
        if (s == j4) {
            return false;
        }
        if (!this.f11590G) {
            m10491l(s);
        } else {
            m10494o(s);
        }
        m10492m();
        return true;
    }

    /* renamed from: q */
    private static boolean m10496q(Drawable drawable, int i) {
        int i2 = C2612ak.f7249a;
        return drawable.setLayoutDirection(i);
    }

    /* renamed from: a */
    public final long mo7643a() {
        int width = (int) (((float) this.f11600c.width()) / this.f11584A);
        if (width == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f11592I;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / ((long) width);
    }

    /* renamed from: c */
    public final void mo7645c(long[] jArr, boolean[] zArr, int i) {
        boolean z = true;
        if (i != 0 && (jArr == null || zArr == null)) {
            z = false;
        }
        C2601a.m6830b(z);
        this.f11595L = i;
        this.f11596M = jArr;
        this.f11597N = zArr;
        m10492m();
    }

    /* renamed from: d */
    public final void mo7646d(long j) {
        if (this.f11594K != j) {
            this.f11594K = j;
            m10492m();
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m10493n();
    }

    /* renamed from: e */
    public final void mo7648e(long j) {
        if (this.f11592I != j) {
            this.f11592I = j;
            if (this.f11590G && j == -9223372036854775807L) {
                mo7650g(true);
            }
            m10492m();
        }
    }

    /* renamed from: f */
    public final void mo7649f(long j) {
        if (this.f11593J != j) {
            this.f11593J = j;
            setContentDescription(m10489j());
            m10492m();
        }
    }

    /* renamed from: g */
    public final void mo7650g(boolean z) {
        removeCallbacks(this.f11621x);
        this.f11590G = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f11622y.iterator();
        while (it.hasNext()) {
            ((C3659w) it.next()).mo7686I(this.f11591H, z);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f11609l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onDraw(Canvas canvas) {
        int i;
        Paint paint;
        Canvas canvas2 = canvas;
        canvas.save();
        int height = this.f11600c.height();
        int centerY = this.f11600c.centerY() - (height / 2);
        int i2 = centerY + height;
        if (this.f11592I <= 0) {
            canvas.drawRect((float) this.f11600c.left, (float) centerY, (float) this.f11600c.right, (float) i2, this.f11605h);
        } else {
            int i3 = this.f11601d.left;
            int i4 = this.f11601d.right;
            int max = Math.max(Math.max(this.f11600c.left, i4), this.f11602e.right);
            if (max < this.f11600c.right) {
                canvas.drawRect((float) max, (float) centerY, (float) this.f11600c.right, (float) i2, this.f11605h);
            }
            int max2 = Math.max(i3, this.f11602e.right);
            if (i4 > max2) {
                canvas.drawRect((float) max2, (float) centerY, (float) i4, (float) i2, this.f11604g);
            }
            if (this.f11602e.width() > 0) {
                canvas.drawRect((float) this.f11602e.left, (float) centerY, (float) this.f11602e.right, (float) i2, this.f11603f);
            }
            if (this.f11595L != 0) {
                long[] jArr = this.f11596M;
                jArr.getClass();
                long[] jArr2 = jArr;
                boolean[] zArr = this.f11597N;
                zArr.getClass();
                boolean[] zArr2 = zArr;
                int i5 = this.f11613p / 2;
                for (int i6 = 0; i6 < this.f11595L; i6++) {
                    int min = this.f11600c.left + Math.min(this.f11600c.width() - this.f11613p, Math.max(0, ((int) ((((long) this.f11600c.width()) * C2612ak.m6994s(jArr2[i6], 0, this.f11592I)) / this.f11592I)) - i5));
                    if (zArr2[i6]) {
                        paint = this.f11607j;
                    } else {
                        paint = this.f11606i;
                    }
                    canvas.drawRect((float) min, (float) centerY, (float) (min + this.f11613p), (float) i2, paint);
                }
            }
        }
        if (this.f11592I > 0) {
            int f = C2612ak.m6981f(this.f11602e.right, this.f11602e.left, this.f11600c.right);
            int centerY2 = this.f11602e.centerY();
            Drawable drawable = this.f11609l;
            if (drawable == null) {
                if (this.f11590G || isFocused()) {
                    i = this.f11616s;
                } else {
                    i = isEnabled() ? this.f11614q : this.f11615r;
                }
                canvas2.drawCircle((float) f, (float) centerY2, (float) ((int) ((((float) i) * this.f11599b) / 2.0f)), this.f11608k);
            } else {
                int intrinsicWidth = ((int) (((float) drawable.getIntrinsicWidth()) * this.f11599b)) / 2;
                int intrinsicHeight = ((int) (((float) this.f11609l.getIntrinsicHeight()) * this.f11599b)) / 2;
                this.f11609l.setBounds(f - intrinsicWidth, centerY2 - intrinsicHeight, f + intrinsicWidth, centerY2 + intrinsicHeight);
                this.f11609l.draw(canvas2);
            }
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f11590G && !z) {
            mo7650g(false);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(m10489j());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(m10489j());
        if (this.f11592I > 0) {
            int i = C2612ak.f7249a;
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (m10495p(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f11621x);
        postDelayed(r4.f11621x, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.m10487h()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.m10495p(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f11621x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f11621x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f11590G
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.mo7650g(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p174ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.f11617t;
        if (this.f11612o == 1) {
            i6 = (i8 - getPaddingBottom()) - this.f11611n;
            int paddingBottom = getPaddingBottom();
            int i10 = this.f11610m;
            i5 = ((i8 - paddingBottom) - i10) - Math.max(i9 - (i10 / 2), 0);
        } else {
            i6 = (i8 - this.f11611n) / 2;
            i5 = (i8 - this.f11610m) / 2;
        }
        this.f11598a.set(paddingLeft, i6, paddingRight, this.f11611n + i6);
        this.f11600c.set(this.f11598a.left + i9, i5, this.f11598a.right - i9, this.f11610m + i5);
        int i11 = C2612ak.f7249a;
        Rect rect = this.f11588E;
        if (!(rect != null && rect.width() == i7 && this.f11588E.height() == i8)) {
            Rect rect2 = new Rect(0, 0, i7, i8);
            this.f11588E = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
        m10492m();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f11611n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f11611n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m10493n();
    }

    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f11609l;
        if (drawable != null && m10496q(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r3 != 3) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x0088
            long r2 = r7.f11592I
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            goto L_0x0088
        L_0x0011:
            android.graphics.Point r0 = r7.f11623z
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.f11623z
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x006b
            r5 = 3
            if (r3 == r4) goto L_0x005c
            r6 = 2
            if (r3 == r6) goto L_0x0036
            if (r3 == r5) goto L_0x005c
            goto L_0x0088
        L_0x0036:
            boolean r8 = r7.f11590G
            if (r8 == 0) goto L_0x0088
            int r8 = r7.f11618u
            if (r0 >= r8) goto L_0x0048
            int r8 = r7.f11587D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m10490k(r8)
            goto L_0x004e
        L_0x0048:
            r7.f11587D = r2
            float r8 = (float) r2
            r7.m10490k(r8)
        L_0x004e:
            long r0 = r7.m10488i()
            r7.m10494o(r0)
            r7.m10492m()
            r7.invalidate()
            return r4
        L_0x005c:
            boolean r0 = r7.f11590G
            if (r0 == 0) goto L_0x0088
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0067
            r1 = 1
        L_0x0067:
            r7.mo7650g(r1)
            return r4
        L_0x006b:
            float r8 = (float) r2
            android.graphics.Rect r2 = r7.f11598a
            int r3 = (int) r8
            float r0 = (float) r0
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L_0x0088
            r7.m10490k(r8)
            long r0 = r7.m10488i()
            r7.m10491l(r0)
            r7.m10492m()
            r7.invalidate()
            return r4
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p174ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f11592I <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m10495p(-m10487h())) {
                mo7650g(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (m10495p(m10487h())) {
                mo7650g(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f11590G && !z) {
            mo7650g(true);
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo7644b(C3659w wVar) {
        wVar.getClass();
        this.f11622y.add(wVar);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        AttributeSet attributeSet3 = attributeSet2;
        this.f11598a = new Rect();
        this.f11600c = new Rect();
        this.f11601d = new Rect();
        this.f11602e = new Rect();
        Paint paint = new Paint();
        this.f11603f = paint;
        Paint paint2 = new Paint();
        this.f11604g = paint2;
        Paint paint3 = new Paint();
        this.f11605h = paint3;
        Paint paint4 = new Paint();
        this.f11606i = paint4;
        Paint paint5 = new Paint();
        this.f11607j = paint5;
        Paint paint6 = new Paint();
        this.f11608k = paint6;
        paint6.setAntiAlias(true);
        this.f11622y = new CopyOnWriteArraySet();
        this.f11623z = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f11584A = f;
        this.f11618u = (int) ((-50.0f * f) + 0.5f);
        int i3 = (int) ((4.0f * f) + 0.5f);
        int i4 = (int) ((26.0f * f) + 0.5f);
        int i5 = (int) ((12.0f * f) + 0.5f);
        int i6 = (int) ((0.0f * f) + 0.5f);
        int i7 = (int) ((f * 16.0f) + 0.5f);
        if (attributeSet3 != null) {
            Paint paint7 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, C3653q.f11750b, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f11609l = drawable;
                if (drawable != null) {
                    int i8 = C2612ak.f7249a;
                    m10496q(drawable, getLayoutDirection());
                    i4 = Math.max(drawable.getMinimumHeight(), i4);
                }
                this.f11610m = obtainStyledAttributes.getDimensionPixelSize(3, i3);
                this.f11611n = obtainStyledAttributes.getDimensionPixelSize(12, i4);
                this.f11612o = obtainStyledAttributes.getInt(2, 0);
                this.f11613p = obtainStyledAttributes.getDimensionPixelSize(1, i3);
                this.f11614q = obtainStyledAttributes.getDimensionPixelSize(11, i5);
                this.f11615r = obtainStyledAttributes.getDimensionPixelSize(8, i6);
                this.f11616s = obtainStyledAttributes.getDimensionPixelSize(9, i7);
                int i9 = obtainStyledAttributes.getInt(6, -1);
                int i10 = obtainStyledAttributes.getInt(7, -1);
                int i11 = obtainStyledAttributes.getInt(4, -855638017);
                int i12 = obtainStyledAttributes.getInt(13, 872415231);
                int i13 = obtainStyledAttributes.getInt(0, -1291845888);
                int i14 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i9);
                paint6.setColor(i10);
                paint2.setColor(i11);
                paint3.setColor(i12);
                paint4.setColor(i13);
                paint7.setColor(i14);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f11610m = i3;
            this.f11611n = i4;
            this.f11612o = 0;
            this.f11613p = i3;
            this.f11614q = i5;
            this.f11615r = i6;
            this.f11616s = i7;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f11609l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f11619v = sb;
        this.f11620w = new Formatter(sb, Locale.getDefault());
        this.f11621x = new C3639c(this);
        Drawable drawable2 = this.f11609l;
        if (drawable2 != null) {
            this.f11617t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f11617t = (Math.max(this.f11615r, Math.max(this.f11614q, this.f11616s)) + 1) / 2;
        }
        this.f11599b = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f11589F = valueAnimator;
        valueAnimator.addUpdateListener(new C3640d(this));
        this.f11592I = -9223372036854775807L;
        this.f11586C = -9223372036854775807L;
        this.f11585B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
