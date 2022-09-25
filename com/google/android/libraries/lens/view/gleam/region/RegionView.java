package com.google.android.libraries.lens.view.gleam.region;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p2002e.C24107a;
import com.google.android.libraries.lens.common.p2002e.C24108b;
import com.google.android.libraries.lens.view.p2078at.C25518ax;
import com.google.android.libraries.lens.view.p2146j.C27212a;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.time.Duration;

/* compiled from: PG */
public final class RegionView extends View implements C24108b {

    /* renamed from: m */
    private static final Duration f72540m = Duration.ofMillis(250);

    /* renamed from: A */
    private RectF f72541A = new RectF();

    /* renamed from: a */
    public final float f72542a;

    /* renamed from: b */
    public final PointF f72543b = new PointF();

    /* renamed from: c */
    public boolean f72544c;

    /* renamed from: d */
    public C26629s f72545d = C26629s.NONE;

    /* renamed from: e */
    public boolean f72546e = false;

    /* renamed from: f */
    public Size f72547f = new Size(0, 0);

    /* renamed from: g */
    public C58833ax f72548g = C58836b.f156633a;

    /* renamed from: h */
    C26624n f72549h;

    /* renamed from: i */
    public float f72550i = 0.0f;

    /* renamed from: j */
    public float f72551j = 0.0f;

    /* renamed from: k */
    boolean f72552k = false;

    /* renamed from: l */
    public C26614e f72553l = C26614e.f72579a;

    /* renamed from: n */
    private final Paint f72554n;

    /* renamed from: o */
    private final Paint f72555o;

    /* renamed from: p */
    private final float f72556p;

    /* renamed from: q */
    private final float f72557q;

    /* renamed from: r */
    private final float f72558r;

    /* renamed from: s */
    private final float f72559s;

    /* renamed from: t */
    private final float f72560t;

    /* renamed from: u */
    private final RectF f72561u = new RectF();

    /* renamed from: v */
    private final PointF f72562v = new PointF();

    /* renamed from: w */
    private final GestureDetector f72563w;

    /* renamed from: x */
    private final int f72564x;

    /* renamed from: y */
    private ValueAnimator f72565y;

    /* renamed from: z */
    private ValueAnimator f72566z;

    static {
        C58974d.m91135i("RegionView");
    }

    public RegionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f72556p = resources.getDimension(R.dimen.region_handle_max_size);
        float dimension = resources.getDimension(R.dimen.region_handle_stroke_width);
        this.f72557q = dimension;
        this.f72558r = resources.getDimension(R.dimen.region_bounding_box_padding);
        this.f72559s = resources.getDimension(R.dimen.region_max_corner_radius);
        this.f72560t = resources.getDimension(R.dimen.region_corner_grab_radius);
        this.f72542a = resources.getDimension(R.dimen.region_minimal_size);
        this.f72564x = resources.getColor(R.color.region_mask_color, (Resources.Theme) null);
        Paint paint = new Paint();
        this.f72554n = paint;
        this.f72555o = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(dimension);
        this.f72563w = new GestureDetector(context, new C26628r(this));
    }

    /* renamed from: g */
    static PointF m49128g(RectF rectF, C26629s sVar) {
        C26629s sVar2 = C26629s.NONE;
        switch (sVar.ordinal()) {
            case 1:
                return new PointF(rectF.centerX(), rectF.centerY());
            case 2:
                return new PointF(rectF.left, rectF.top);
            case 3:
                return new PointF(rectF.right, rectF.top);
            case 4:
                return new PointF(rectF.right, rectF.bottom);
            case 5:
                return new PointF(rectF.left, rectF.bottom);
            case 6:
                return new PointF(rectF.left, rectF.centerY());
            case 7:
                return new PointF(rectF.centerX(), rectF.top);
            case 8:
                return new PointF(rectF.right, rectF.centerY());
            case 9:
                return new PointF(rectF.centerX(), rectF.bottom);
            default:
                return new PointF();
        }
    }

    /* renamed from: k */
    public static void m49129k(RectF rectF) {
        rectF.intersect(0.0f, 0.0f, 1.0f, 1.0f);
    }

    /* renamed from: n */
    static boolean m49130n(C26629s sVar) {
        return sVar == C26629s.TOP_EDGE || sVar == C26629s.BOTTOM_EDGE;
    }

    /* renamed from: o */
    static boolean m49131o(C26629s sVar) {
        return sVar == C26629s.RIGHT_EDGE || sVar == C26629s.LEFT_EDGE;
    }

    /* renamed from: q */
    public static C26629s[] m49132q() {
        return new C26629s[]{C26629s.TOP_LEFT_CORNER, C26629s.TOP_RIGHT_CORNER, C26629s.BOTTOM_RIGHT_CORNER, C26629s.BOTTOM_LEFT_CORNER};
    }

    /* renamed from: r */
    public static float m49133r(int i, float f, float f2, float f3, float f4) {
        return i == 1 ? f : Math.min(Math.max(f2, f3), f4);
    }

    /* renamed from: s */
    private static Rect m49134s(float f, float f2, float f3) {
        return new Rect((int) (f - f3), (int) (f2 - f3), (int) (f + f3), (int) (f2 + f3));
    }

    /* renamed from: t */
    private final void m49135t(RectF rectF) {
        RectF rectF2 = new RectF(rectF);
        if (!rectF2.intersect(0.0f, 0.0f, 1.0f, 1.0f)) {
            rectF2 = new RectF();
        }
        this.f72541A = rectF2;
        this.f72561u.left = rectF2.left * ((float) this.f72547f.getWidth());
        this.f72561u.top = this.f72541A.top * ((float) this.f72547f.getHeight());
        this.f72561u.right = this.f72541A.right * ((float) this.f72547f.getWidth());
        this.f72561u.bottom = this.f72541A.bottom * ((float) this.f72547f.getHeight());
        this.f72562v.x = this.f72561u.centerX();
        this.f72562v.y = this.f72561u.centerY();
    }

    /* renamed from: a */
    public final View mo29503a() {
        return this;
    }

    /* renamed from: b */
    public final C24107a mo29504b() {
        return C24107a.REGION;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final float mo31877c() {
        if (this.f72548g.mo56113h()) {
            return ((C25518ax) this.f72548g.mo56107c()).f69480b;
        }
        return 1.0f;
    }

    /* renamed from: d */
    public final boolean mo29505d(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 1) {
            z = this.f72546e && this.f72544c;
            mo31885l();
        } else {
            if (motionEvent.getAction() == 3) {
                mo31885l();
            }
            z = false;
        }
        if (z) {
            C47393f.m84237h(new C26616g(true), this);
        }
        this.f72563w.onTouchEvent(motionEvent);
        return this.f72546e || z;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C26624n nVar = this.f72549h;
        nVar.getClass();
        return nVar.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C26624n nVar = this.f72549h;
        nVar.getClass();
        return nVar.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final float mo31880e(Size size, float f) {
        return this.f72560t / (f * ((float) size.getWidth()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final float mo31881f(Size size, float f) {
        return this.f72560t / (f * ((float) size.getHeight()));
    }

    /* renamed from: h */
    public final RectF mo31882h() {
        return new RectF(this.f72541A);
    }

    /* renamed from: i */
    public final C26629s mo31883i(PointF pointF, boolean z) {
        RectF h = mo31882h();
        m49129k(h);
        Size size = this.f72547f;
        float c = mo31877c();
        float f = pointF.x;
        float f2 = pointF.y;
        RectF rectF = new RectF(h);
        rectF.inset(-mo31880e(size, c), -mo31881f(size, c));
        if (!rectF.contains(f, f2)) {
            return C26629s.NONE;
        }
        C26629s[] q = m49132q();
        for (int i = 0; i < 4; i++) {
            C26629s sVar = q[i];
            if (mo31891p(pointF, h, sVar, size, c)) {
                return sVar;
            }
        }
        if (z) {
            C26629s[] sVarArr = {C26629s.LEFT_EDGE, C26629s.TOP_EDGE, C26629s.RIGHT_EDGE, C26629s.BOTTOM_EDGE};
            for (int i2 = 0; i2 < 4; i2++) {
                C26629s sVar2 = sVarArr[i2];
                if (mo31891p(pointF, h, sVar2, size, c)) {
                    return sVar2;
                }
            }
        }
        return C26629s.CENTER_AREA;
    }

    /* renamed from: j */
    public final void mo31884j() {
        ValueAnimator valueAnimator = this.f72565y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f72565y.cancel();
        }
        ValueAnimator valueAnimator2 = this.f72566z;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f72566z.cancel();
        }
        this.f72550i = 0.0f;
        this.f72551j = 0.0f;
        this.f72553l = C26614e.f72579a;
        m49135t(new RectF());
        this.f72552k = false;
        invalidate();
    }

    /* renamed from: l */
    public final void mo31885l() {
        this.f72544c = false;
        this.f72545d = C26629s.NONE;
        this.f72546e = false;
        this.f72543b.set(0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo31886m(C26614e eVar) {
        this.f72553l = eVar;
        RectF a = eVar.mo31895a();
        if (eVar.mo31899e() == 2) {
            a = C26625o.m49191a(eVar.mo31895a(), this.f72547f, this.f72548g);
        }
        m49135t(a);
        if (eVar.mo31898d()) {
            this.f72550i = 0.0f;
            ValueAnimator valueAnimator = this.f72565y;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f72565y.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f72550i, 1.0f});
            this.f72565y = ofFloat;
            ofFloat.setInterpolator(new DecelerateInterpolator());
            this.f72565y.setDuration(f72540m.toMillis());
            this.f72565y.addUpdateListener(new C26626p(this));
            this.f72565y.start();
        } else {
            this.f72550i = 1.0f;
            invalidate();
        }
        if (!this.f72552k) {
            ValueAnimator valueAnimator2 = this.f72566z;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f72566z.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.f72551j, 1.0f});
            this.f72566z = ofFloat2;
            ofFloat2.setInterpolator(new DecelerateInterpolator());
            this.f72566z.setDuration(f72540m.toMillis());
            this.f72566z.addUpdateListener(new C26627q(this));
            this.f72566z.start();
            this.f72552k = true;
        }
    }

    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        if (this.f72561u.isEmpty()) {
            C2043bi.m5560an(this, C58485gu.m89845m());
            return;
        }
        RectF rectF = this.f72561u;
        float c = this.f72542a / mo31877c();
        float max = Math.max(c, rectF.width()) / 2.0f;
        float max2 = Math.max(c, rectF.height()) / 2.0f;
        RectF d = C28185a.m52686d(new RectF(rectF.centerX() - max, rectF.centerY() - max2, rectF.centerX() + max, rectF.centerY() + max2), this.f72547f, this.f72558r / mo31877c());
        if (this.f72553l.mo31896b().mo56113h()) {
            f = ((PointF) this.f72553l.mo31896b().mo56107c()).x * ((float) this.f72547f.getWidth());
        } else {
            f = this.f72561u.centerX();
        }
        if (this.f72553l.mo31896b().mo56113h()) {
            f2 = ((PointF) this.f72553l.mo31896b().mo56107c()).y * ((float) this.f72547f.getHeight());
        } else {
            f2 = this.f72561u.centerY();
        }
        float max3 = Math.max(f - d.left, 0.0f);
        float max4 = Math.max(f2 - d.top, 0.0f);
        float max5 = Math.max(d.right - f, 0.0f);
        float max6 = Math.max(d.bottom - f2, 0.0f);
        float f3 = this.f72550i;
        float f4 = f - (((max3 + 0.0f) * f3) + 0.0f);
        float f5 = f2 - (((max4 + 0.0f) * f3) + 0.0f);
        float f6 = ((max5 + 0.0f) * f3) + 0.0f + f;
        float f7 = (f3 * (max6 + 0.0f)) + 0.0f + f2;
        float min = Math.min(Math.abs(f6 - f4), Math.abs(f7 - f5));
        float min2 = (this.f72550i * (Math.min(0.33333334f * min, this.f72559s / mo31877c()) + 0.0f)) + 0.0f;
        float min3 = (this.f72550i * (Math.min(min * 0.5f, this.f72556p / mo31877c()) + 0.0f)) + 0.0f;
        float c2 = (this.f72550i * ((this.f72557q / mo31877c()) + 0.0f)) + 0.0f;
        float f8 = min2 - (0.5f * c2);
        float width = (float) this.f72547f.getWidth();
        float height = (float) this.f72547f.getHeight();
        Paint paint = this.f72555o;
        int i = this.f72564x;
        paint.setColor(C27212a.m50466b(i, (int) (((float) Color.alpha(i)) * this.f72551j)));
        Canvas canvas3 = canvas;
        canvas3.drawRect(0.0f, 0.0f, f6, f5, this.f72555o);
        float f9 = width;
        canvas3.drawRect(f6, 0.0f, f9, f7, this.f72555o);
        float f10 = height;
        canvas3.drawRect(f4, f7, f9, f10, this.f72555o);
        canvas3.drawRect(0.0f, f5, f4, f10, this.f72555o);
        Path path = new Path();
        path.moveTo(f4, f5);
        path.lineTo(f4, f5 + f8);
        float f11 = f8 + f8;
        float f12 = f5 + f11;
        float f13 = c2;
        float f14 = f5;
        float f15 = f5;
        float f16 = f4 + f11;
        float f17 = f4;
        path.arcTo(f4, f14, f16, f12, 270.0f, -90.0f, true);
        path.lineTo(f17, f15);
        path.moveTo(f6, f15);
        float f18 = f6 - f8;
        path.lineTo(f18, f15);
        Path path2 = path;
        float f19 = f6 - f11;
        float f20 = f6;
        path2.arcTo(f19, f15, f20, f12, 270.0f, 90.0f, true);
        path.lineTo(f6, f15);
        path.moveTo(f6, f7);
        path.lineTo(f18, f7);
        float f21 = f7 - f11;
        path2.arcTo(f19, f21, f20, f7, 90.0f, -90.0f, true);
        path.lineTo(f6, f7);
        path.moveTo(f17, f7);
        path.lineTo(f17 + f8, f7);
        path.arcTo(f17, f21, f16, f7, 90.0f, 90.0f, true);
        path.lineTo(f17, f7);
        canvas2.drawPath(path, this.f72555o);
        this.f72554n.setStrokeWidth(f13);
        float f22 = f13 / 2.0f;
        float f23 = f17 - f22;
        float f24 = f6 + f22;
        float f25 = f15 - f22;
        float f26 = f22 + f7;
        Path path3 = new Path();
        float f27 = f25 + min3;
        path3.moveTo(f23, f27);
        path3.lineTo(f23, f25 + min2);
        float f28 = min2 + min2;
        float f29 = f23 + f28;
        float f30 = f25 + f28;
        path3.arcTo(f23, f25, f29, f30, 180.0f, 90.0f, true);
        float f31 = f23 + min3;
        path3.lineTo(f31, f25);
        float f32 = f24 - min3;
        path3.moveTo(f32, f25);
        path3.lineTo(f24 - min2, f25);
        float f33 = f24 - f28;
        float f34 = f6;
        float f35 = f32;
        Path path4 = path3;
        float f36 = f7;
        path4.arcTo(f33, f25, f24, f30, 270.0f, 90.0f, true);
        path3.lineTo(f24, f27);
        path3.moveTo(f31, f26);
        path3.lineTo(f23 + min2, f26);
        float f37 = f26 - f28;
        float f38 = f26;
        path4.arcTo(f23, f37, f29, f38, 90.0f, 90.0f, true);
        float f39 = f26 - min3;
        path3.lineTo(f23, f39);
        path3.moveTo(f24, f39);
        path3.lineTo(f24, f26 - min2);
        path4.arcTo(f33, f37, f24, f38, 0.0f, 90.0f, true);
        path3.lineTo(f35, f26);
        canvas2.drawPath(path3, this.f72554n);
        Rect s = m49134s(f17, f15, this.f72560t);
        float f40 = f36;
        Rect s2 = m49134s(f17, f40, this.f72560t);
        float f41 = f34;
        C2043bi.m5560an(this, C58485gu.m89849q(s, s2, m49134s(f41, f15, this.f72560t), m49134s(f41, f40, this.f72560t)));
        float f42 = this.f72562v.x;
        float f43 = this.f72562v.y;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        C26624n nVar = new C26624n(this);
        this.f72549h = nVar;
        C2043bi.m5526T(this, nVar);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C26624n nVar = this.f72549h;
        nVar.getClass();
        nVar.onFocusChanged(z, i, rect);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f72547f = new Size(i, i2);
        m49135t(this.f72541A);
        C26624n nVar = this.f72549h;
        nVar.getClass();
        nVar.invalidateRoot();
        invalidate();
    }

    /* renamed from: p */
    public final boolean mo31891p(PointF pointF, RectF rectF, C26629s sVar, Size size, float f) {
        PointF g = m49128g(rectF, sVar);
        float e = mo31880e(size, f);
        float f2 = mo31881f(size, f);
        float abs = Math.abs(pointF.x - g.x);
        float abs2 = Math.abs(pointF.y - g.y);
        return m49130n(sVar) ? abs2 <= f2 : m49131o(sVar) ? abs <= e : abs <= e && abs2 <= f2;
    }
}
