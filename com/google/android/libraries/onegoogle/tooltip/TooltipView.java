package com.google.android.libraries.onegoogle.tooltip;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30559f;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30910aj;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class TooltipView extends ViewGroup {

    /* renamed from: A */
    private final int f83657A;

    /* renamed from: B */
    private final int f83658B;

    /* renamed from: C */
    private final int f83659C;

    /* renamed from: D */
    private float f83660D;

    /* renamed from: E */
    private float f83661E;

    /* renamed from: F */
    private float f83662F;

    /* renamed from: G */
    private final int f83663G;

    /* renamed from: H */
    private final int f83664H;

    /* renamed from: I */
    private final int f83665I;

    /* renamed from: J */
    private int f83666J;

    /* renamed from: a */
    public final C31067c f83667a;

    /* renamed from: b */
    public final ViewGroup f83668b;

    /* renamed from: c */
    public final Rect f83669c = new Rect();

    /* renamed from: d */
    public final Paint f83670d;

    /* renamed from: e */
    final C31088x f83671e;

    /* renamed from: f */
    public View f83672f;

    /* renamed from: g */
    public int f83673g;

    /* renamed from: h */
    public int f83674h;

    /* renamed from: i */
    public int f83675i;

    /* renamed from: j */
    public int f83676j;

    /* renamed from: k */
    public final C31081q f83677k;

    /* renamed from: l */
    public final C30559f f83678l;

    /* renamed from: m */
    private final RectF f83679m = new RectF();

    /* renamed from: n */
    private final Path f83680n = new Path();

    /* renamed from: o */
    private final RectF f83681o = new RectF();

    /* renamed from: p */
    private final Point f83682p;

    /* renamed from: q */
    private final int[] f83683q;

    /* renamed from: r */
    private final int f83684r;

    /* renamed from: s */
    private final int f83685s;

    /* renamed from: t */
    private final int f83686t;

    /* renamed from: u */
    private final int f83687u;

    /* renamed from: v */
    private final int f83688v;

    /* renamed from: w */
    private final int f83689w;

    /* renamed from: x */
    private final int f83690x;

    /* renamed from: y */
    private final int f83691y;

    /* renamed from: z */
    private final int f83692z;

    /* compiled from: PG */
    public class ScaleAnimatable implements C31065a {

        /* renamed from: a */
        private final View f83693a;

        public ScaleAnimatable(View view) {
            this.f83693a = view;
        }

        public void setScale(float f) {
            this.f83693a.setScaleX(f);
            this.f83693a.setScaleY(f);
        }
    }

    public TooltipView(View view, C31067c cVar, int i, C30559f fVar) {
        super(view.getContext());
        Paint paint = new Paint();
        this.f83670d = paint;
        this.f83682p = new Point();
        this.f83683q = new int[2];
        this.f83666J = 5;
        this.f83673g = 0;
        this.f83674h = 0;
        this.f83660D = 1.0f;
        this.f83667a = cVar;
        this.f83665I = i;
        this.f83678l = fVar;
        Context context = getContext();
        setId(16908290);
        setWillNotDraw(false);
        Resources resources = getResources();
        this.f83684r = resources.getDimensionPixelSize(R.dimen.og_tooltip_padding);
        this.f83685s = resources.getDimensionPixelSize(R.dimen.og_tooltip_margin);
        this.f83686t = resources.getDimensionPixelSize(R.dimen.og_tooltip_anchor_margin);
        this.f83687u = resources.getDimensionPixelSize(R.dimen.og_tooltip_arrow_height);
        this.f83688v = resources.getDimensionPixelSize(R.dimen.og_tooltip_arrow_width);
        this.f83689w = Math.round(C30899a.m57684c(getContext()));
        this.f83690x = resources.getDimensionPixelSize(R.dimen.og_tooltip_min_animation_width);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.og_tooltip_shadow_radius);
        this.f83691y = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.og_tooltip_shadow_offset);
        this.f83692z = dimensionPixelSize2;
        this.f83657A = resources.getDimensionPixelSize(R.dimen.og_tooltip_arrow_tip_radius);
        this.f83658B = resources.getDimensionPixelSize(R.dimen.og_tooltip_max_width);
        this.f83659C = resources.getDimensionPixelSize(R.dimen.og_tooltip_min_space_between_arrow_and_edge);
        this.f83663G = dimensionPixelSize - dimensionPixelSize2;
        this.f83664H = dimensionPixelSize + dimensionPixelSize2;
        paint.setStyle(Paint.Style.FILL);
        float f = (float) dimensionPixelSize2;
        paint.setShadowLayer((float) dimensionPixelSize, f, f, C1878d.m5128a(context, R.color.og_tooltip_shadow));
        paint.setColor(C1878d.m5128a(context, R.color.google_blue600));
        C31088x xVar = new C31088x(this, this);
        this.f83671e = xVar;
        if (C30910aj.m57700a(context)) {
            xVar.setFocusable(true);
        }
        this.f83672f = view;
        addView(view);
        Context context2 = getContext();
        Objects.requireNonNull(xVar);
        C31081q qVar = new C31081q(context2, cVar, new C31082r(xVar));
        this.f83677k = qVar;
        qVar.setId(R.id.og_tooltip_scrim_view);
        View rootView = ((SelectedAccountDisc) cVar).f81902c.getRootView();
        if (rootView instanceof ViewGroup) {
            this.f83668b = (ViewGroup) rootView;
            return;
        }
        throw new IllegalStateException("Should not happen. Root view is not a ViewGroup");
    }

    /* renamed from: c */
    private final RectF m57966c(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = (float) (this.f83675i - this.f83673g);
        int i = this.f83676j;
        float f8 = (float) (i - this.f83674h);
        float f9 = this.f83661E;
        float f10 = (float) this.f83690x;
        float f11 = f9 - f10;
        float f12 = (f * f11) + f10;
        int i2 = this.f83666J;
        if (m57970g(i2)) {
            float measuredWidth = (((float) getMeasuredWidth()) - this.f83661E) * (f7 / ((float) getMeasuredWidth()));
            int i3 = this.f83690x;
            float f13 = (float) ((int) ((f7 - measuredWidth) - ((float) (i3 / 2))));
            float f14 = f13 / f11;
            float f15 = 0.5f - f14;
            float f16 = measuredWidth + (f13 - (f14 * (f12 - ((float) i3)))) + (((f15 + f15) * ((float) this.f83691y)) - ((float) this.f83692z));
            float f17 = this.f83661E;
            if (f7 > f17 / 2.0f) {
                f3 = Math.max((f7 + (((float) this.f83688v) / 2.0f)) + ((float) this.f83659C), f16 + f17) - this.f83661E;
            } else {
                f3 = Math.min((f7 - (((float) this.f83688v) / 2.0f)) - ((float) this.f83659C), f16);
            }
            if (this.f83666J == 2) {
                f2 = f8 + ((float) this.f83687u);
                this.f83679m.set(f3, f2, f12 + f3, this.f83662F + f2);
                return this.f83679m;
            }
            f4 = f8 - ((float) this.f83687u);
            f5 = this.f83662F;
        } else {
            if (i2 == 3) {
                f6 = (f7 - ((float) this.f83687u)) - f12;
            } else {
                f6 = f7 + ((float) this.f83687u);
            }
            float f18 = (((float) this.f83688v) * 0.5f) + ((float) this.f83659C);
            if (m57969f((float) i)) {
                f2 = f8 - f18;
                this.f83679m.set(f3, f2, f12 + f3, this.f83662F + f2);
                return this.f83679m;
            }
            f4 = f8 + f18;
            f5 = this.f83662F;
        }
        f2 = f4 - f5;
        this.f83679m.set(f3, f2, f12 + f3, this.f83662F + f2);
        return this.f83679m;
    }

    /* renamed from: d */
    private final void m57967d(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    /* renamed from: e */
    private final void m57968e(Path path, float f) {
        path.reset();
        float f2 = (float) (this.f83675i - this.f83673g);
        float f3 = (float) (this.f83676j - this.f83674h);
        float f4 = (float) this.f83688v;
        float f5 = f4 / 2.0f;
        float hypot = ((float) this.f83657A) * ((float) Math.hypot((double) this.f83687u, (double) f5));
        float f6 = (hypot + hypot) / f4;
        float degrees = (float) Math.toDegrees(Math.atan((double) (((float) this.f83687u) / f5)));
        int i = this.f83666J;
        if (i == 1) {
            path.moveTo(f2 - f5, f3 - ((float) this.f83687u));
            RectF rectF = this.f83681o;
            float f7 = (float) this.f83657A;
            float f8 = f3 - f6;
            rectF.set(f2 - f7, f8 - f7, f2 + f7, f8 + f7);
            float f9 = -degrees;
            path.arcTo(this.f83681o, degrees - 0.015197754f, f9 + f9);
            path.lineTo(f2 + f5, f3 - ((float) this.f83687u));
        } else if (i == 2) {
            path.moveTo(f2 - f5, ((float) this.f83687u) + f3);
            RectF rectF2 = this.f83681o;
            float f10 = (float) this.f83657A;
            float f11 = f6 + f3;
            rectF2.set(f2 - f10, f11 - f10, f2 + f10, f11 + f10);
            path.arcTo(this.f83681o, -90.0f - degrees, degrees + degrees);
            path.lineTo(f2 + f5, f3 + ((float) this.f83687u));
        } else if (i == 3) {
            path.moveTo(f2 - ((float) this.f83687u), f3 - f5);
            RectF rectF3 = this.f83681o;
            float f12 = f2 - f6;
            float f13 = (float) this.f83657A;
            rectF3.set(f12 - f13, f3 - f13, f12 + f13, f13 + f3);
            path.arcTo(this.f83681o, -degrees, degrees + degrees);
            path.lineTo(f2 - ((float) this.f83687u), f3 + f5);
        } else {
            path.moveTo(((float) this.f83687u) + f2, f3 - f5);
            RectF rectF4 = this.f83681o;
            float f14 = f6 + f2;
            float f15 = (float) this.f83657A;
            rectF4.set(f14 - f15, f3 - f15, f14 + f15, f15 + f3);
            float f16 = -degrees;
            path.arcTo(this.f83681o, degrees + 180.0f, f16 + f16);
            path.lineTo(f2 + ((float) this.f83687u), f3 + f5);
        }
        path.close();
        RectF c = m57966c(f);
        float f17 = (float) this.f83689w;
        path.addRoundRect(c, f17, f17, Path.Direction.CW);
    }

    /* renamed from: f */
    private final boolean m57969f(float f) {
        return f < ((float) this.f83682p.y) * 0.5f;
    }

    /* renamed from: g */
    private static boolean m57970g(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: a */
    public final Animator mo36773a() {
        C31065a aVar;
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.og_tooltip_anchor_animator);
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) this.f83667a).f81902c;
        if (accountParticleDisc instanceof C31065a) {
            aVar = (C31065a) accountParticleDisc;
        } else {
            aVar = new ScaleAnimatable(accountParticleDisc);
        }
        loadAnimator.setTarget(aVar);
        return loadAnimator;
    }

    /* renamed from: b */
    public final void mo36774b() {
        int i;
        int i2;
        m57967d(this.f83682p);
        int i3 = this.f83682p.x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i4 = this.f83666J;
        int i5 = 0;
        if (i4 == 1) {
            i = ((-measuredHeight) - this.f83686t) + this.f83664H;
        } else if (i4 == 2) {
            i = (this.f83669c.height() + this.f83686t) - this.f83663G;
        } else if (i4 == 3) {
            i5 = ((-measuredWidth) - this.f83686t) + this.f83664H;
            i = (this.f83669c.height() - measuredHeight) / 2;
        } else if (i4 == 4) {
            i5 = (this.f83669c.width() + this.f83686t) - this.f83663G;
            i = (this.f83669c.height() - measuredHeight) / 2;
        } else {
            i = 0;
        }
        if (m57970g(this.f83666J)) {
            this.f83674h = this.f83669c.top + i;
            i2 = this.f83669c.left + ((this.f83669c.width() - measuredWidth) / 2);
        } else {
            int i6 = this.f83669c.left + i5;
            float exactCenterY = this.f83669c.exactCenterY();
            float f = (((float) this.f83688v) * 0.5f) + ((float) this.f83659C);
            if (m57969f(exactCenterY)) {
                this.f83674h = Math.round((exactCenterY - f) - ((float) this.f83663G));
            } else {
                this.f83674h = Math.round(((exactCenterY + f) + ((float) this.f83664H)) - ((float) measuredHeight));
            }
            i2 = i6;
        }
        if (m57970g(this.f83666J)) {
            int i7 = this.f83685s;
            this.f83673g = Math.min((i3 - i7) - measuredWidth, Math.max(i7, i2));
            int i8 = (this.f83669c.left + this.f83669c.right) / 2;
            if (i8 > i3 / 2) {
                this.f83673g = Math.max(i8 + (((this.f83688v / 2) + this.f83659C) + this.f83664H), this.f83673g + measuredWidth) - measuredWidth;
                return;
            }
            this.f83673g = Math.min(i8 - (((this.f83688v / 2) + this.f83659C) + this.f83663G), this.f83673g);
            return;
        }
        this.f83673g = i2;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f83670d.getAlpha() != 0) {
            canvas.drawPath(this.f83680n, this.f83670d);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo36774b();
        this.f83671e.update(this.f83673g, this.f83674h, getMeasuredWidth(), getMeasuredHeight(), true);
        RectF c = m57966c(1.0f);
        this.f83672f.layout((int) c.left, (int) c.top, (int) c.right, (int) c.bottom);
        m57968e(this.f83680n, this.f83660D);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            int r10 = r9.f83666J
            r11 = 5
            r0 = 0
            r1 = 4
            r2 = 2
            r3 = 3
            r4 = 1
            if (r10 != r11) goto L_0x002d
            int r10 = r9.f83665I
            int r11 = androidx.core.p098j.C2043bi.m5577f(r9)
            int r5 = r10 + -1
            if (r10 == 0) goto L_0x002c
            if (r5 == 0) goto L_0x0028
            if (r5 == r4) goto L_0x0026
            if (r5 != r2) goto L_0x0020
            if (r11 == r4) goto L_0x001e
            r10 = 3
            goto L_0x0029
        L_0x001e:
            r10 = 4
            goto L_0x0029
        L_0x0020:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L_0x0026:
            r10 = 2
            goto L_0x0029
        L_0x0028:
            r10 = 1
        L_0x0029:
            r9.f83666J = r10
            goto L_0x002d
        L_0x002c:
            throw r0
        L_0x002d:
            int[] r10 = r9.f83683q
            android.graphics.Point r11 = r9.f83682p
            r9.m57967d(r11)
            android.graphics.Point r11 = r9.f83682p
            int r11 = r11.x
            android.graphics.Point r5 = r9.f83682p
            int r5 = r5.y
            int r6 = r9.f83666J
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x017d
            if (r7 == 0) goto L_0x007e
            if (r7 == r4) goto L_0x006b
            if (r7 == r2) goto L_0x0062
            if (r7 != r3) goto L_0x005c
            android.graphics.Rect r6 = r9.f83669c
            int r6 = r6.left
            android.graphics.Rect r7 = r9.f83669c
            int r7 = r7.width()
            int r8 = r9.f83685s
            int r11 = r11 - r6
            int r11 = r11 - r7
            int r11 = r11 - r8
            int r8 = r8 + r8
            int r5 = r5 - r8
            goto L_0x0089
        L_0x005c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x0062:
            android.graphics.Rect r11 = r9.f83669c
            int r11 = r11.left
            int r6 = r9.f83685s
            int r11 = r11 - r6
            int r6 = r6 + r6
            goto L_0x0088
        L_0x006b:
            int r6 = r9.f83685s
            int r6 = r6 + r6
            int r11 = r11 - r6
            android.graphics.Rect r6 = r9.f83669c
            int r6 = r6.top
            int r5 = r5 - r6
            android.graphics.Rect r6 = r9.f83669c
            int r6 = r6.height()
            int r5 = r5 - r6
            int r6 = r9.f83685s
            goto L_0x0088
        L_0x007e:
            int r5 = r9.f83685s
            int r5 = r5 + r5
            int r11 = r11 - r5
            android.graphics.Rect r5 = r9.f83669c
            int r5 = r5.top
            int r6 = r9.f83685s
        L_0x0088:
            int r5 = r5 - r6
        L_0x0089:
            r6 = 0
            r10[r6] = r11
            r10[r4] = r5
            int[] r10 = r9.f83683q
            r11 = r10[r6]
            r10 = r10[r4]
            int r5 = r9.f83684r
            int r5 = r5 + r5
            int r7 = r9.f83691y
            int r7 = r7 + r7
            int r11 = r11 - r5
            int r11 = r11 - r7
            int r10 = r10 - r5
            int r10 = r10 - r7
            int r5 = r9.f83666J
            boolean r7 = m57970g(r5)
            if (r7 == 0) goto L_0x00aa
            int r5 = r9.f83687u
            int r10 = r10 - r5
            goto L_0x00b1
        L_0x00aa:
            if (r5 == r3) goto L_0x00ae
            if (r5 != r1) goto L_0x00b1
        L_0x00ae:
            int r5 = r9.f83687u
            int r11 = r11 - r5
        L_0x00b1:
            int r5 = r9.f83658B
            int r5 = java.lang.Math.min(r11, r5)
            android.view.View r7 = r9.f83672f
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r6)
            r7.measure(r5, r6)
            android.view.View r5 = r9.f83672f
            int r5 = r5.getMeasuredHeight()
            if (r5 <= r10) goto L_0x00db
            android.view.View r5 = r9.f83672f
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r8)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            r5.measure(r11, r10)
        L_0x00db:
            android.view.View r10 = r9.f83672f
            int r10 = r10.getMeasuredWidth()
            int r11 = r9.f83684r
            int r11 = r11 + r11
            int r10 = r10 + r11
            float r10 = (float) r10
            r9.f83661E = r10
            android.view.View r10 = r9.f83672f
            int r10 = r10.getMeasuredHeight()
            int r11 = r9.f83684r
            int r11 = r11 + r11
            int r10 = r10 + r11
            float r10 = (float) r10
            r9.f83662F = r10
            float r11 = r9.f83661E
            int r5 = r9.f83691y
            int r5 = r5 + r5
            int r11 = (int) r11
            int r11 = r11 + r5
            int r10 = (int) r10
            int r10 = r10 + r5
            int r5 = r9.f83666J
            boolean r6 = m57970g(r5)
            if (r6 == 0) goto L_0x010a
            int r5 = r9.f83687u
            int r10 = r10 + r5
            goto L_0x0111
        L_0x010a:
            if (r5 == r3) goto L_0x010e
            if (r5 != r1) goto L_0x0111
        L_0x010e:
            int r5 = r9.f83687u
            int r11 = r11 + r5
        L_0x0111:
            float r11 = (float) r11
            r5 = 1065772646(0x3f866666, float:1.05)
            float r11 = r11 * r5
            double r6 = (double) r11
            double r6 = java.lang.Math.ceil(r6)
            int r11 = (int) r6
            float r10 = (float) r10
            float r10 = r10 * r5
            double r5 = (double) r10
            double r5 = java.lang.Math.ceil(r5)
            int r10 = (int) r5
            r9.setMeasuredDimension(r11, r10)
            android.graphics.Rect r10 = r9.f83669c
            int r10 = r10.centerX()
            android.graphics.Rect r11 = r9.f83669c
            int r11 = r11.centerY()
            int r5 = r9.f83666J
            int r6 = r5 + -1
            if (r5 == 0) goto L_0x017c
            if (r6 == 0) goto L_0x0170
            if (r6 == r4) goto L_0x0164
            if (r6 == r2) goto L_0x0158
            if (r6 == r3) goto L_0x014c
            if (r6 == r1) goto L_0x0146
            return
        L_0x0146:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x014c:
            android.graphics.Rect r10 = r9.f83669c
            int r10 = r10.right
            int r0 = r9.f83686t
            int r10 = r10 + r0
            r9.f83675i = r10
            r9.f83676j = r11
            return
        L_0x0158:
            android.graphics.Rect r10 = r9.f83669c
            int r10 = r10.left
            int r0 = r9.f83686t
            int r10 = r10 - r0
            r9.f83675i = r10
            r9.f83676j = r11
            return
        L_0x0164:
            r9.f83675i = r10
            android.graphics.Rect r10 = r9.f83669c
            int r10 = r10.bottom
            int r11 = r9.f83686t
            int r10 = r10 + r11
            r9.f83676j = r10
            return
        L_0x0170:
            r9.f83675i = r10
            android.graphics.Rect r10 = r9.f83669c
            int r10 = r10.top
            int r11 = r9.f83686t
            int r10 = r10 - r11
            r9.f83676j = r10
            return
        L_0x017c:
            throw r0
        L_0x017d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.tooltip.TooltipView.onMeasure(int, int):void");
    }

    public void setBubbleWidthScale(float f) {
        this.f83660D = f;
        m57968e(this.f83680n, f);
        invalidate();
    }

    public void setContentAlpha(float f) {
        this.f83672f.setAlpha(f);
        invalidate();
    }

    public void setTooltipAlpha(float f) {
        this.f83670d.setAlpha((int) (f * 255.0f));
        invalidate();
    }
}
