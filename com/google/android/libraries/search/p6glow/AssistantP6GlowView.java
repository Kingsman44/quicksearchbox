package com.google.android.libraries.search.p6glow;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.content.p091b.C1874w;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4580v.C60948g;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5463a.C69502as;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69669s;
import p5462h.p5478h.C69684c;
import p5462h.p5480j.C69695c;
import p5462h.p5480j.C69699g;
import p5462h.p5481k.C69713k;

/* compiled from: PG */
public final class AssistantP6GlowView extends View {

    /* renamed from: a */
    static final /* synthetic */ C69713k[] f104753a;

    /* renamed from: A */
    private final int f104754A;

    /* renamed from: B */
    private final LinearGradient f104755B;

    /* renamed from: C */
    private Shader f104756C;

    /* renamed from: D */
    private Shader f104757D;

    /* renamed from: E */
    private Shader f104758E;

    /* renamed from: F */
    private Shader f104759F;

    /* renamed from: G */
    private Shader f104760G;

    /* renamed from: H */
    private float f104761H;

    /* renamed from: I */
    private float f104762I;

    /* renamed from: J */
    private float f104763J;

    /* renamed from: K */
    private float f104764K;

    /* renamed from: L */
    private float f104765L;

    /* renamed from: M */
    private Instant f104766M;

    /* renamed from: N */
    private final Path[] f104767N;

    /* renamed from: b */
    public final Path f104768b;

    /* renamed from: c */
    public boolean f104769c;

    /* renamed from: d */
    public Duration f104770d;

    /* renamed from: e */
    private final Paint f104771e;

    /* renamed from: f */
    private final Paint f104772f;

    /* renamed from: g */
    private final int[] f104773g;

    /* renamed from: h */
    private final C69684c f104774h;

    /* renamed from: i */
    private final C69684c f104775i;

    /* renamed from: j */
    private final C69684c f104776j;

    /* renamed from: k */
    private final C69684c f104777k;

    /* renamed from: l */
    private final C69684c f104778l;

    /* renamed from: m */
    private final C69684c f104779m;

    /* renamed from: n */
    private final C69684c f104780n;

    /* renamed from: o */
    private final C69684c f104781o;

    /* renamed from: p */
    private final C69684c f104782p;

    /* renamed from: q */
    private final C69684c f104783q;

    /* renamed from: r */
    private final C69684c f104784r;

    /* renamed from: s */
    private final float f104785s;

    /* renamed from: t */
    private final C69684c f104786t;

    /* renamed from: u */
    private PathMeasure f104787u;

    /* renamed from: v */
    private final RectF f104788v;

    /* renamed from: w */
    private final int[] f104789w;

    /* renamed from: x */
    private final int[] f104790x;

    /* renamed from: y */
    private final float[] f104791y;

    /* renamed from: z */
    private final float[] f104792z;

    static {
        Class<AssistantP6GlowView> cls = AssistantP6GlowView.class;
        C69669s sVar = new C69669s(cls, "lightThickness", "getLightThickness()F");
        int i = C69649af.f186028a;
        f104753a = new C69713k[]{sVar, new C69669s(cls, "lightOpacity", "getLightOpacity()F"), new C69669s(cls, "gradientGlowBackgroundThickness", "getGradientGlowBackgroundThickness()F"), new C69669s(cls, "gradientGlowBackgroundOpacity", "getGradientGlowBackgroundOpacity()F"), new C69669s(cls, "gradientGlowForegroundThickness", "getGradientGlowForegroundThickness()F"), new C69669s(cls, "gradientGlowForegroundOpacity", "getGradientGlowForegroundOpacity()F"), new C69669s(cls, "lineSize", "getLineSize()F"), new C69669s(cls, "endRadius", "getEndRadius()F"), new C69669s(cls, "endAngle", "getEndAngle()F"), new C69669s(cls, "kind", "getKind()Lcom/google/android/libraries/search/p6glow/AssistantP6GlowView$Kind;"), new C69669s(cls, "blurLine", "getBlurLine()Z"), new C69669s(cls, "colorWeights", "getColorWeights()[F")};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AssistantP6GlowView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AssistantP6GlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AssistantP6GlowView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssistantP6GlowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = context;
        C69664n.m101061g(context2, "context");
        this.f104771e = new Paint();
        this.f104772f = new Paint();
        Float valueOf = Float.valueOf(0.0f);
        C39893x xVar = new C39893x(valueOf, new C39843aa(this), this);
        this.f104774h = xVar;
        C39893x xVar2 = new C39893x(valueOf, C39895z.f104906a, this);
        this.f104775i = xVar2;
        C39893x xVar3 = new C39893x(valueOf, new C39890u(this), this);
        this.f104776j = xVar3;
        C39893x xVar4 = new C39893x(valueOf, new C39889t(this), this);
        this.f104777k = xVar4;
        C39893x xVar5 = new C39893x(valueOf, new C39892w(this), this);
        this.f104778l = xVar5;
        C39893x xVar6 = new C39893x(valueOf, new C39891v(this), this);
        this.f104779m = xVar6;
        this.f104780n = new C39893x(valueOf, new C39844ab(this), this);
        C39893x xVar7 = new C39893x(valueOf, new C39888s(this), this);
        this.f104781o = xVar7;
        C39893x xVar8 = new C39893x(Float.valueOf(90.0f), new C39887r(this), this);
        this.f104782p = xVar8;
        this.f104783q = new C39893x(C39883n.LINE, new C39894y(this), this);
        this.f104784r = new C39893x(false, new C39885p(this), this);
        this.f104785s = C1874w.m5104a(context.getResources(), R.dimen.assistant_glow_opacity_multiplier);
        LinearInterpolator linearInterpolator = C39845ac.f104795a;
        this.f104786t = new C39884o(C39845ac.f104800f, C39886q.f104896a, this);
        this.f104768b = new Path();
        this.f104787u = new PathMeasure();
        this.f104788v = new RectF();
        int length = mo42038o().length - 1;
        this.f104791y = new float[(length + length)];
        int length2 = mo42038o().length - 1;
        this.f104792z = new float[(length2 + length2)];
        this.f104754A = PrivateKeyType.INVALID;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, 0, 0, Shader.TileMode.CLAMP);
        this.f104755B = linearGradient;
        this.f104756C = linearGradient;
        this.f104757D = linearGradient;
        this.f104758E = linearGradient;
        this.f104759F = linearGradient;
        this.f104760G = linearGradient;
        this.f104769c = true;
        C60948g gVar = C60948g.f165068a;
        Instant now = Instant.now();
        C69664n.m101060f(now, "system().now()");
        this.f104766M = now;
        Duration ofMillis = Duration.ofMillis(8);
        C69664n.m101060f(ofMillis, "ofMillis(8)");
        this.f104770d = ofMillis;
        this.f104767N = new Path[]{new Path(), new Path(), new Path(), new Path(), new Path(), new Path()};
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C39860ar.f104825a);
        float dimension = obtainStyledAttributes.getDimension(8, 0.0f);
        C69713k[] kVarArr = f104753a;
        xVar.mo42045b(kVarArr[0], Float.valueOf(dimension));
        xVar2.mo42045b(kVarArr[1], Float.valueOf(obtainStyledAttributes.getFloat(7, 1.0f)));
        xVar3.mo42045b(kVarArr[2], Float.valueOf(obtainStyledAttributes.getDimension(3, 0.0f)));
        xVar4.mo42045b(kVarArr[3], Float.valueOf(obtainStyledAttributes.getFloat(2, 0.0f)));
        xVar5.mo42045b(kVarArr[4], Float.valueOf(obtainStyledAttributes.getDimension(5, 0.0f)));
        xVar6.mo42045b(kVarArr[5], Float.valueOf(obtainStyledAttributes.getFloat(4, 0.0f)));
        mo42037n(obtainStyledAttributes.getDimension(9, 0.0f));
        xVar7.mo42045b(kVarArr[7], Float.valueOf(obtainStyledAttributes.getDimension(1, 0.0f)));
        xVar8.mo42045b(kVarArr[8], Float.valueOf(obtainStyledAttributes.getFloat(0, 90.0f)));
        mo42036m(C39883n.values()[obtainStyledAttributes.getInt(6, 0)]);
        obtainStyledAttributes.recycle();
        Resources resources = context.getResources();
        int[] iArr = {0, resources.getColor(R.color.assistant_glow_blue, (Resources.Theme) null), resources.getColor(R.color.assistant_glow_red, (Resources.Theme) null), resources.getColor(R.color.assistant_glow_yellow, (Resources.Theme) null), resources.getColor(R.color.assistant_glow_green, (Resources.Theme) null), 0};
        this.f104773g = iArr;
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int[] iArr2 = {iArr[0], iArr[1], iArr[1], i3, i3, i4, i4, i5, i5, iArr[5]};
        this.f104789w = iArr2;
        int[] copyOf = Arrays.copyOf(iArr2, 10);
        C69664n.m101060f(copyOf, "copyOf(this, size)");
        this.f104790x = copyOf;
        C69664n.m101061g(iArr2, "<this>");
        int[] iArr3 = new int[10];
        C69664n.m101061g(iArr2, "<this>");
        C69502as a = new C69695c(0, 9).iterator();
        while (a.hasNext()) {
            int a2 = a.mo5128a();
            iArr3[9 - a2] = iArr2[a2];
        }
        this.f104771e.setStyle(Paint.Style.STROKE);
        this.f104771e.setStrokeCap(Paint.Cap.BUTT);
        this.f104771e.setAntiAlias(true);
        this.f104772f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: p */
    private final float m69248p(int i) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += mo42038o()[i2];
        }
        return f;
    }

    /* renamed from: q */
    private final float m69249q() {
        return (mo42038o()[1] + mo42038o()[2] + mo42038o()[3] + mo42038o()[4]) * mo42031h() * 0.5f;
    }

    /* renamed from: r */
    private final Shader m69250r(int i) {
        float f;
        float f2;
        float f3;
        float b;
        float p = m69248p(i);
        float f4 = this.f104765L;
        float f5 = 1.0f - f4;
        if (p < 0.5f) {
            f = p + p;
        } else {
            float f6 = 1.0f - p;
            f = f6 + f6;
        }
        float d = mo42027d() * ((f * 1.1f) + 0.6f);
        if (p < f4) {
            float b2 = (p * this.f104764K) / mo42025b();
            float sin = (-mo42025b()) * ((float) Math.sin((double) (this.f104762I - b2)));
            b = (mo42025b() * ((float) Math.cos((double) (this.f104762I - b2)))) - mo42025b();
            f3 = sin;
        } else if (p > f5) {
            float f7 = this.f104764K;
            float b3 = (f7 - (p * f7)) / mo42025b();
            float b4 = (mo42025b() * ((float) Math.sin((double) (this.f104762I - b3)))) + mo42031h();
            b = (mo42025b() * ((float) Math.cos((double) (this.f104762I - b3)))) - mo42025b();
            f3 = b4;
        } else {
            f3 = (p * this.f104764K) - this.f104763J;
            f2 = 0.0f;
            return new RadialGradient(f3, f2, d, -1, 0, Shader.TileMode.CLAMP);
        }
        f2 = b;
        return new RadialGradient(f3, f2, d, -1, 0, Shader.TileMode.CLAMP);
    }

    /* renamed from: s */
    private final SweepGradient m69251s(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr) {
        float f7;
        float f8;
        float f9;
        int[] iArr;
        float f10 = f;
        float f11 = f2;
        float f12 = f5;
        float f13 = f6;
        float[] fArr2 = fArr;
        if (f12 < 0.0f) {
            throw new IllegalStateException("Check failed.");
        } else if (f13 <= 1.0f) {
            float f14 = f3 / 360.0f;
            float f15 = f4 / 360.0f;
            if (f3 < 0.0f) {
                f15 -= f14;
                f9 = f3 + 0.0f;
                f8 = f4 + f3;
                f7 = 0.0f;
            } else {
                f8 = f4;
                f7 = f14;
                f9 = 0.0f;
            }
            if (f8 < 0.0f) {
                f7 -= f15;
                f9 += f8;
                f15 = 0.0f;
            }
            if (Math.max(f15, f7) < 1.0f) {
                if (f15 > f7) {
                    iArr = m69255w();
                    int length = fArr2.length;
                    for (int i = 0; i < length; i++) {
                        this.f104792z[i] = C69699g.m101119a(C39871bb.m69287b(fArr2[i], f12, f13, f7, f15), 0.0f, 1.0f);
                    }
                } else {
                    int i2 = 1;
                    while (i2 < 9) {
                        int i3 = i2 + 1;
                        int i4 = 5 - (i3 / 2);
                        this.f104790x[i2] = mo42038o()[i4] > 0.0f ? this.f104773g[i4] : 0;
                        i2 = i3;
                    }
                    iArr = this.f104790x;
                    int i5 = 0;
                    for (int length2 = fArr2.length; i5 < length2; length2 = length2) {
                        this.f104792z[(fArr2.length - 1) - i5] = C69699g.m101119a(C39871bb.m69287b(fArr2[i5], f12, f13, f7, f15), 0.0f, 1.0f);
                        i5++;
                    }
                }
                SweepGradient sweepGradient = new SweepGradient(f10, f11, iArr, this.f104792z);
                if (f9 != 0.0f) {
                    Matrix matrix = new Matrix();
                    matrix.setRotate(f9, f10, f11);
                    sweepGradient.setLocalMatrix(matrix);
                }
                return sweepGradient;
            }
            throw new IllegalStateException("More than 360 not supported");
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: t */
    private final void m69252t(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr) {
        paint.setShader(m69251s(f, f2, f4, f5, f6, f7, fArr));
        Canvas canvas2 = canvas;
        float f8 = f4;
        canvas2.drawArc(f - f3, f2 - f3, f + f3, f2 + f3, f8, f5 - f4, false, paint);
    }

    /* renamed from: u */
    private final void m69253u(Canvas canvas, Shader shader, float f, float f2, float f3) {
        this.f104771e.setShader(shader);
        this.f104771e.setAlpha(this.f104754A);
        canvas.save();
        float q = (m69249q() / f) * f3;
        canvas.scale(q, 1.0f);
        canvas.translate((f2 / q) - f2, 0.0f);
        canvas.drawLine(0.0f, 0.0f, mo42031h(), 0.0f, this.f104771e);
        canvas.restore();
        this.f104771e.setShader((Shader) null);
    }

    /* renamed from: v */
    private final float[] m69254v(float f) {
        float f2 = f * 0.5f;
        float min = Math.min(f2, ((1.0f - mo42038o()[0]) - mo42038o()[mo42038o().length - 1]) / 8.0f);
        int length = this.f104773g.length;
        float f3 = 0.0f;
        int i = 0;
        while (i < 6) {
            float f4 = mo42038o()[i] + f3;
            float f5 = (f3 + f4) / 2.0f;
            if (i == 0) {
                this.f104791y[0] = Math.max(f5, f4 - min);
            } else {
                int length2 = this.f104773g.length;
                if (i == 5) {
                    this.f104791y[9] = Math.min(f5, f3 + min);
                } else {
                    int i2 = i + i;
                    this.f104791y[i2 - 1] = Math.min(f5, f3 + f2);
                    this.f104791y[i2] = Math.max(f5, f4 - f2);
                }
            }
            i++;
            f3 = f4;
        }
        return this.f104791y;
    }

    /* renamed from: w */
    private final int[] m69255w() {
        int i = 1;
        while (i < 9) {
            int i2 = i + 1;
            int i3 = i2 / 2;
            this.f104790x[i] = mo42038o()[i3] > 0.0f ? this.f104773g[i3] : 0;
            i = i2;
        }
        return this.f104790x;
    }

    /* renamed from: a */
    public final float mo42024a() {
        return ((Number) this.f104782p.mo42046c(f104753a[8])).floatValue();
    }

    /* renamed from: b */
    public final float mo42025b() {
        return ((Number) this.f104781o.mo42046c(f104753a[7])).floatValue();
    }

    /* renamed from: c */
    public final float mo42026c() {
        return ((Number) this.f104777k.mo42046c(f104753a[3])).floatValue();
    }

    /* renamed from: d */
    public final float mo42027d() {
        return ((Number) this.f104776j.mo42046c(f104753a[2])).floatValue();
    }

    /* renamed from: e */
    public final float mo42028e() {
        return ((Number) this.f104778l.mo42046c(f104753a[4])).floatValue();
    }

    /* renamed from: f */
    public final float mo42029f() {
        return ((Number) this.f104775i.mo42046c(f104753a[1])).floatValue();
    }

    /* renamed from: g */
    public final float mo42030g() {
        return ((Number) this.f104774h.mo42046c(f104753a[0])).floatValue();
    }

    /* renamed from: h */
    public final float mo42031h() {
        return ((Number) this.f104780n.mo42046c(f104753a[6])).floatValue();
    }

    /* renamed from: i */
    public final C39883n mo42032i() {
        return (C39883n) this.f104783q.mo42046c(f104753a[9]);
    }

    /* renamed from: j */
    public final void mo42033j() {
        C60948g gVar = C60948g.f165068a;
        if (Instant.now().minus(this.f104770d).isAfter(this.f104766M)) {
            Instant now = Instant.now();
            C69664n.m101060f(now, "system().now()");
            this.f104766M = now;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: k */
    public final void mo42034k(boolean z) {
        this.f104784r.mo42045b(f104753a[10], Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final void mo42035l(float[] fArr) {
        C69664n.m101061g(fArr, "<set-?>");
        this.f104786t.mo42045b(f104753a[11], fArr);
    }

    /* renamed from: m */
    public final void mo42036m(C39883n nVar) {
        C69664n.m101061g(nVar, "<set-?>");
        this.f104783q.mo42045b(f104753a[9], nVar);
    }

    /* renamed from: n */
    public final void mo42037n(float f) {
        this.f104780n.mo42045b(f104753a[6], Float.valueOf(f));
    }

    /* renamed from: o */
    public final float[] mo42038o() {
        return (float[]) this.f104786t.mo42046c(f104753a[11]);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    /* JADX WARNING: type inference failed for: r0v114, types: [android.graphics.LinearGradient] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x05d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r41) {
        /*
            r40 = this;
            r11 = r40
            r12 = r41
            java.lang.String r0 = "canvas"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)
            float[] r0 = r40.mo42038o()
            int r0 = r0.length
            int[] r1 = r11.f104773g
            int r1 = r1.length
            r9 = 6
            if (r0 != r9) goto L_0x074c
            super.onDraw(r41)
            android.graphics.Path r0 = r11.f104768b
            boolean r0 = r0.isEmpty()
            r10 = 1127481344(0x43340000, float:180.0)
            r13 = 1119092736(0x42b40000, float:90.0)
            r14 = 0
            r15 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0095
            android.graphics.Path r0 = r11.f104768b
            r0.reset()
            com.google.android.libraries.search.p6glow.n r0 = r40.mo42032i()
            com.google.android.libraries.search.p6glow.n r1 = com.google.android.libraries.search.p6glow.C39883n.LINE
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0077
            if (r0 == r15) goto L_0x003a
            goto L_0x0085
        L_0x003a:
            float r0 = r40.mo42024a()
            r1 = 981668463(0x3a83126f, float:0.001)
            float r0 = p5462h.p5480j.C69699g.m101119a(r0, r1, r10)
            float r7 = r40.mo42025b()
            float r2 = -r7
            float r18 = r2 + r2
            float r6 = -r0
            android.graphics.Path r1 = r11.f104768b
            r5 = 0
            float r0 = r0 + r13
            r3 = r18
            r4 = r7
            r22 = r6
            r6 = r0
            r0 = r7
            r7 = r22
            r1.addArc(r2, r3, r4, r5, r6, r7)
            android.graphics.Path r1 = r11.f104768b
            float r2 = r40.mo42031h()
            float r17 = r2 - r0
            float r2 = r40.mo42031h()
            float r19 = r2 + r0
            r20 = 0
            r21 = 1119092736(0x42b40000, float:90.0)
            r23 = 0
            r16 = r1
            r16.arcTo(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0085
        L_0x0077:
            android.graphics.Path r0 = r11.f104768b
            r0.moveTo(r8, r8)
            android.graphics.Path r0 = r11.f104768b
            float r1 = r40.mo42031h()
            r0.lineTo(r1, r8)
        L_0x0085:
            android.graphics.Path r0 = r11.f104768b
            android.graphics.RectF r1 = r11.f104788v
            r0.computeBounds(r1, r15)
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            android.graphics.Path r1 = r11.f104768b
            r0.<init>(r1, r14)
            r11.f104787u = r0
        L_0x0095:
            int r0 = r40.getWidth()
            float r0 = (float) r0
            r16 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r16
            android.graphics.RectF r1 = r11.f104788v
            float r1 = r1.centerX()
            float r0 = r0 - r1
            com.google.android.libraries.search.p6glow.n r1 = r40.mo42032i()
            com.google.android.libraries.search.p6glow.n r2 = com.google.android.libraries.search.p6glow.C39883n.LINE
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x00c6
            if (r1 != r15) goto L_0x00c0
            int r1 = r40.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r16
            float r2 = r40.mo42025b()
            float r1 = r1 + r2
            goto L_0x00d2
        L_0x00c0:
            h.g r0 = new h.g
            r0.<init>()
            throw r0
        L_0x00c6:
            int r1 = r40.getHeight()
            float r1 = (float) r1
            float r2 = r40.mo42030g()
            float r2 = r2 / r16
            float r1 = r1 - r2
        L_0x00d2:
            r12.translate(r0, r1)
            boolean r0 = r11.f104769c
            r7 = 5
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x028a
            com.google.android.libraries.search.p6glow.n r0 = r40.mo42032i()
            com.google.android.libraries.search.p6glow.n r1 = com.google.android.libraries.search.p6glow.C39883n.LINE
            if (r0 != r1) goto L_0x016a
            float r0 = r40.mo42027d()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            float r1 = r40.mo42027d()
            float r2 = r40.mo42030g()
            float r3 = r40.mo42026c()
            float r4 = r11.f104785s
            int r5 = r11.f104754A
            r19 = 0
            float r1 = -r1
            float r1 = r1 / r16
            float r2 = r2 / r16
            float r20 = r1 + r2
            r21 = 0
            r22 = 0
            r23 = 0
            float r3 = r3 * r4
            float r1 = (float) r5
            float r3 = r3 * r1
            int r1 = (int) r3
            int r24 = android.graphics.Color.argb(r1, r5, r5, r5)
            android.graphics.Shader$TileMode r25 = android.graphics.Shader.TileMode.CLAMP
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r11.f104756C = r0
        L_0x0120:
            float r0 = r40.mo42028e()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0288
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            float r1 = r40.mo42028e()
            float r2 = r40.mo42030g()
            h.h.c r3 = r11.f104779m
            h.k.k[] r4 = f104753a
            r4 = r4[r7]
            java.lang.Object r3 = r3.mo42046c(r4)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r4 = r11.f104785s
            int r5 = r11.f104754A
            r19 = 0
            float r1 = -r1
            float r1 = r1 / r16
            float r2 = r2 / r16
            float r20 = r1 + r2
            r21 = 0
            r22 = 0
            r23 = 0
            float r3 = r3 * r4
            float r1 = (float) r5
            float r3 = r3 * r1
            int r1 = (int) r3
            int r24 = android.graphics.Color.argb(r1, r5, r5, r5)
            android.graphics.Shader$TileMode r25 = android.graphics.Shader.TileMode.CLAMP
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r11.f104757D = r0
            goto L_0x0288
        L_0x016a:
            float r0 = r40.mo42025b()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0259
            float r0 = r40.mo42027d()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0259
            float r0 = r40.mo42025b()
            float r1 = r40.mo42027d()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0251
            android.graphics.RadialGradient r0 = new android.graphics.RadialGradient
            float r1 = r40.mo42025b()
            float r21 = r40.mo42025b()
            r2 = 3
            int[] r3 = new int[r2]
            r3[r14] = r14
            r3[r15] = r14
            float r4 = r40.mo42026c()
            float r5 = r11.f104785s
            int r6 = r11.f104754A
            float r4 = r4 * r5
            float r5 = (float) r6
            float r4 = r4 * r5
            int r4 = (int) r4
            int r4 = android.graphics.Color.argb(r4, r6, r6, r6)
            r5 = 2
            r3[r5] = r4
            float[] r4 = new float[r2]
            r4[r14] = r8
            float r6 = r40.mo42025b()
            float r18 = r40.mo42027d()
            float r6 = r6 - r18
            float r18 = r40.mo42025b()
            float r6 = r6 / r18
            r4[r15] = r6
            r4[r5] = r17
            r19 = 0
            float r1 = -r1
            android.graphics.Shader$TileMode r24 = android.graphics.Shader.TileMode.CLAMP
            r18 = r0
            r20 = r1
            r22 = r3
            r23 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r11.f104758E = r0
            android.graphics.RadialGradient r0 = new android.graphics.RadialGradient
            float r26 = r40.mo42031h()
            float r1 = r40.mo42025b()
            float r28 = r40.mo42025b()
            int[] r3 = new int[r2]
            r3[r14] = r14
            r3[r15] = r14
            float r4 = r40.mo42026c()
            float r6 = r11.f104785s
            int r9 = r11.f104754A
            float r4 = r4 * r6
            float r6 = (float) r9
            float r4 = r4 * r6
            int r4 = (int) r4
            int r4 = android.graphics.Color.argb(r4, r9, r9, r9)
            r3[r5] = r4
            float[] r2 = new float[r2]
            r2[r14] = r8
            float r4 = r40.mo42025b()
            float r6 = r40.mo42027d()
            float r4 = r4 - r6
            float r6 = r40.mo42025b()
            float r4 = r4 / r6
            r2[r15] = r4
            r2[r5] = r17
            float r1 = -r1
            android.graphics.Shader$TileMode r31 = android.graphics.Shader.TileMode.CLAMP
            r25 = r0
            r27 = r1
            r29 = r3
            r30 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r11.f104759F = r0
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            float r1 = r40.mo42027d()
            float r2 = r40.mo42026c()
            float r3 = r11.f104785s
            int r4 = r11.f104754A
            r33 = 0
            r34 = 0
            r35 = 0
            float r1 = -r1
            float r2 = r2 * r3
            float r3 = (float) r4
            float r2 = r2 * r3
            int r2 = (int) r2
            int r37 = android.graphics.Color.argb(r2, r4, r4, r4)
            r38 = 0
            android.graphics.Shader$TileMode r39 = android.graphics.Shader.TileMode.CLAMP
            r32 = r0
            r36 = r1
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r11.f104760G = r0
            goto L_0x0259
        L_0x0251:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "gradientGlowBackgroundThickness has to be smaller than endRadius to render correctly."
            r0.<init>(r1)
            throw r0
        L_0x0259:
            float r0 = r40.mo42024a()
            float r0 = p5462h.p5480j.C69699g.m101119a(r0, r8, r10)
            r11.f104761H = r0
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            float r0 = (float) r0
            r11.f104762I = r0
            float r0 = r40.mo42025b()
            float r1 = r11.f104762I
            float r0 = r0 * r1
            r11.f104763J = r0
            float r1 = r40.mo42031h()
            float r2 = r11.f104763J
            float r0 = r0 + r1
            float r0 = r0 + r2
            r11.f104764K = r0
            int r1 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0285
            r2 = 0
            goto L_0x0286
        L_0x0285:
            float r2 = r2 / r0
        L_0x0286:
            r11.f104765L = r2
        L_0x0288:
            r11.f104769c = r14
        L_0x028a:
            float r0 = r40.mo42027d()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x05c6
            android.graphics.Paint r0 = r11.f104771e
            int r1 = r11.f104754A
            r0.setAlpha(r1)
            android.graphics.Paint r0 = r11.f104771e
            float r1 = r40.mo42027d()
            r0.setStrokeWidth(r1)
            com.google.android.libraries.search.p6glow.n r0 = r40.mo42032i()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0512
            if (r0 == r15) goto L_0x02b0
            goto L_0x05c6
        L_0x02b0:
            float r0 = r11.f104764K
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x05c6
            android.graphics.LinearGradient r0 = r11.f104755B
            r1 = 1
            r2 = 0
        L_0x02ba:
            if (r1 >= r7) goto L_0x03a5
            float[] r3 = r40.mo42038o()
            r3 = r3[r1]
            r4 = 953267991(0x38d1b717, float:1.0E-4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x02cb
            goto L_0x03a0
        L_0x02cb:
            android.graphics.Shader r2 = r11.m69250r(r1)
            android.graphics.ComposeShader r3 = new android.graphics.ComposeShader
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.LIGHTEN
            r3.<init>(r0, r2, r4)
            float r0 = r11.f104764K
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x02e0
            android.graphics.LinearGradient r0 = r11.f104755B
            goto L_0x0397
        L_0x02e0:
            float r0 = r11.m69248p(r1)
            float[] r2 = r40.mo42038o()
            r2 = r2[r1]
            float r2 = r2 / r16
            float r0 = r0 + r2
            float r2 = r11.f104765L
            float r4 = r17 - r2
            float[] r5 = r40.mo42038o()
            r5 = r5[r1]
            float r5 = r17 - r5
            r19 = 1057803469(0x3f0ccccd, float:0.55)
            float r5 = r5 * r19
            r19 = 1055286886(0x3ee66666, float:0.45)
            float r5 = r5 + r19
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0339
            float r2 = r11.f104764K
            float r0 = r0 * r2
            float r2 = r40.mo42025b()
            float r0 = r0 / r2
            float r2 = r40.mo42025b()
            float r2 = -r2
            float r4 = r11.f104762I
            float r4 = r4 - r0
            double r6 = (double) r4
            double r6 = java.lang.Math.sin(r6)
            float r4 = (float) r6
            float r2 = r2 * r4
            float r4 = r40.mo42025b()
            float r6 = r11.f104762I
            float r6 = r6 - r0
            double r6 = (double) r6
            double r6 = java.lang.Math.cos(r6)
            float r0 = (float) r6
            float r4 = r4 * r0
            float r0 = r40.mo42025b()
            float r4 = r4 - r0
            r22 = r2
        L_0x0336:
            r23 = r4
            goto L_0x037e
        L_0x0339:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0372
            float r2 = r11.f104764K
            float r0 = r0 * r2
            float r2 = r2 - r0
            float r0 = r40.mo42025b()
            float r2 = r2 / r0
            float r0 = r40.mo42025b()
            float r4 = r11.f104762I
            float r4 = r4 - r2
            double r6 = (double) r4
            double r6 = java.lang.Math.sin(r6)
            float r4 = (float) r6
            float r0 = r0 * r4
            float r4 = r40.mo42031h()
            float r0 = r0 + r4
            float r4 = r40.mo42025b()
            float r6 = r11.f104762I
            float r6 = r6 - r2
            double r6 = (double) r6
            double r6 = java.lang.Math.cos(r6)
            float r2 = (float) r6
            float r4 = r4 * r2
            float r2 = r40.mo42025b()
            float r4 = r4 - r2
            r22 = r0
            goto L_0x0336
        L_0x0372:
            float r2 = r11.f104764K
            float r0 = r0 * r2
            float r2 = r11.f104763J
            float r2 = r0 - r2
            r22 = r2
            r23 = 0
        L_0x037e:
            android.graphics.RadialGradient r0 = new android.graphics.RadialGradient
            float r2 = r11.f104764K
            float[] r4 = r40.mo42038o()
            r4 = r4[r1]
            float r2 = r2 * r4
            float r24 = r2 * r5
            r25 = -1
            r26 = 0
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.CLAMP
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27)
        L_0x0397:
            android.graphics.ComposeShader r2 = new android.graphics.ComposeShader
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.LIGHTEN
            r2.<init>(r3, r0, r4)
            r0 = r2
            r2 = r1
        L_0x03a0:
            int r1 = r1 + 1
            r7 = 5
            goto L_0x02ba
        L_0x03a5:
            if (r2 == 0) goto L_0x05c6
            int r2 = r2 + r15
            android.graphics.Shader r1 = r11.m69250r(r2)
            android.graphics.ComposeShader r7 = new android.graphics.ComposeShader
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.LIGHTEN
            r7.<init>(r0, r1, r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            float[] r27 = r11.m69254v(r0)
            float r0 = r11.f104763J
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x04a5
            float r0 = r11.f104761H
            r1 = 1124204544(0x43020000, float:130.0)
            float r0 = r0 + r1
            r1 = 1132920832(0x43870000, float:270.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x03cd
            r21 = 1132920832(0x43870000, float:270.0)
            goto L_0x03cf
        L_0x03cd:
            r21 = r0
        L_0x03cf:
            float r0 = r40.mo42025b()
            float r6 = -r0
            float r0 = r40.mo42025b()
            float r1 = r40.mo42027d()
            float r1 = r1 / r16
            float r0 = r0 - r1
            float r1 = r40.mo42030g()
            float r1 = r1 / r16
            float r5 = r0 + r1
            float r4 = r11.f104765L
            r1 = 0
            r22 = 1119092736(0x42b40000, float:90.0)
            r23 = 0
            r0 = r40
            r2 = r6
            r3 = r21
            r24 = r4
            r4 = r22
            r10 = r5
            r5 = r23
            r20 = r6
            r15 = 0
            r6 = r24
            r9 = r7
            r7 = r27
            android.graphics.SweepGradient r0 = r0.m69251s(r1, r2, r3, r4, r5, r6, r7)
            android.graphics.ComposeShader r1 = new android.graphics.ComposeShader
            android.graphics.Shader r2 = r11.f104758E
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.<init>(r2, r9, r3)
            android.graphics.Paint r2 = r11.f104771e
            android.graphics.ComposeShader r3 = new android.graphics.ComposeShader
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            r3.<init>(r0, r1, r4)
            r2.setShader(r3)
            float r1 = -r10
            float r2 = r20 - r10
            float r3 = r10 + r8
            float r4 = r20 + r10
            float r6 = r13 - r21
            r7 = 0
            android.graphics.Paint r10 = r11.f104771e
            r0 = r41
            r5 = r21
            r13 = 0
            r8 = r10
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Paint r0 = r11.f104771e
            r0.setShader(r15)
            r0 = 1112014848(0x42480000, float:50.0)
            float r1 = r11.f104761H
            float r0 = r0 - r1
            r8 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r1 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0443
            r10 = -1028390912(0xffffffffc2b40000, float:-90.0)
            goto L_0x0444
        L_0x0443:
            r10 = r0
        L_0x0444:
            float r20 = r40.mo42031h()
            float r0 = r40.mo42025b()
            float r7 = -r0
            float r0 = r40.mo42025b()
            float r1 = r40.mo42027d()
            float r1 = r1 / r16
            float r0 = r0 - r1
            float r1 = r40.mo42030g()
            float r1 = r1 / r16
            float r21 = r0 + r1
            float r0 = r11.f104765L
            r3 = 1119092736(0x42b40000, float:90.0)
            float r5 = r17 - r0
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r40
            r1 = r20
            r2 = r7
            r4 = r10
            r22 = r7
            r7 = r27
            android.graphics.SweepGradient r0 = r0.m69251s(r1, r2, r3, r4, r5, r6, r7)
            android.graphics.ComposeShader r1 = new android.graphics.ComposeShader
            android.graphics.Shader r2 = r11.f104759F
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.<init>(r2, r9, r3)
            android.graphics.Paint r2 = r11.f104771e
            android.graphics.ComposeShader r3 = new android.graphics.ComposeShader
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            r3.<init>(r0, r1, r4)
            r2.setShader(r3)
            float r1 = r20 - r21
            float r2 = r22 - r21
            float r3 = r20 + r21
            float r4 = r22 + r21
            r5 = 1119092736(0x42b40000, float:90.0)
            float r6 = r10 + r8
            r7 = 0
            android.graphics.Paint r8 = r11.f104771e
            r0 = r41
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Paint r0 = r11.f104771e
            r0.setShader(r15)
            goto L_0x04a8
        L_0x04a5:
            r9 = r7
            r13 = 0
            r15 = 0
        L_0x04a8:
            float r0 = r40.mo42031h()
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x05c8
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            float r1 = r11.f104763J
            float r1 = -r1
            r23 = 0
            float r2 = r40.mo42031h()
            float r3 = r11.f104763J
            float r24 = r2 + r3
            r25 = 0
            int[] r26 = r40.m69255w()
            android.graphics.Shader$TileMode r28 = android.graphics.Shader.TileMode.CLAMP
            r21 = r0
            r22 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            android.graphics.ComposeShader r1 = new android.graphics.ComposeShader
            android.graphics.Shader r2 = r11.f104760G
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.<init>(r2, r9, r3)
            android.graphics.Paint r2 = r11.f104771e
            android.graphics.ComposeShader r3 = new android.graphics.ComposeShader
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            r3.<init>(r0, r1, r4)
            r2.setShader(r3)
            r1 = 0
            float r0 = r40.mo42027d()
            float r0 = -r0
            float r0 = r0 / r16
            float r2 = r40.mo42030g()
            float r2 = r2 / r16
            float r2 = r2 + r0
            float r3 = r40.mo42031h()
            float r0 = r40.mo42027d()
            float r0 = -r0
            float r0 = r0 / r16
            float r4 = r40.mo42030g()
            float r4 = r4 / r16
            float r4 = r4 + r0
            android.graphics.Paint r5 = r11.f104771e
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            android.graphics.Paint r0 = r11.f104771e
            r0.setShader(r15)
            goto L_0x05c8
        L_0x0512:
            r13 = 0
            r15 = 0
            float r0 = r40.m69249q()
            float[] r1 = r40.mo42038o()
            r1 = r1[r14]
            float r2 = r40.mo42031h()
            float r1 = r1 * r2
            float r9 = r0 + r1
            float r0 = r40.mo42027d()
            float r10 = r0 / r16
            android.graphics.ComposeShader r1 = new android.graphics.ComposeShader
            android.graphics.RadialGradient r0 = new android.graphics.RadialGradient
            r4 = 0
            r6 = -1
            r7 = 0
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r2 = r0
            r3 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.graphics.Shader r2 = r11.f104756C
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.<init>(r0, r2, r3)
            r5 = 1067450368(0x3fa00000, float:1.25)
            r0 = r40
            r2 = r1
            r1 = r41
            r3 = r10
            r4 = r9
            r0.m69253u(r1, r2, r3, r4, r5)
            float r0 = r40.m69249q()
            float[] r1 = r40.mo42038o()
            r1 = r1[r14]
            float r2 = r40.mo42031h()
            float r1 = r1 * r2
            float r9 = r0 + r1
            float r0 = r40.mo42028e()
            float r10 = r0 / r16
            android.graphics.ComposeShader r1 = new android.graphics.ComposeShader
            android.graphics.RadialGradient r0 = new android.graphics.RadialGradient
            r4 = 0
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r2 = r0
            r3 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.graphics.Shader r2 = r11.f104757D
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.<init>(r0, r2, r3)
            r5 = 1074161254(0x40066666, float:2.1)
            r0 = r40
            r2 = r1
            r1 = r41
            r3 = r10
            r4 = r9
            r0.m69253u(r1, r2, r3, r4, r5)
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            r21 = 0
            r22 = 0
            float r23 = r40.mo42031h()
            r24 = 0
            int[] r25 = r40.m69255w()
            r1 = 1034594987(0x3daaaaab, float:0.083333336)
            float[] r26 = r11.m69254v(r1)
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.CLAMP
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            android.graphics.Paint r1 = r11.f104771e
            r1.setShader(r0)
            android.graphics.Paint r0 = r11.f104772f
            r12.saveLayer(r15, r0)
            r1 = 0
            r2 = 0
            float r3 = r40.mo42031h()
            r4 = 0
            android.graphics.Paint r5 = r11.f104771e
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            r41.restore()
            android.graphics.Paint r0 = r11.f104771e
            r0.setShader(r15)
            goto L_0x05c8
        L_0x05c6:
            r13 = 0
            r15 = 0
        L_0x05c8:
            float r0 = r40.mo42030g()
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x074b
            android.graphics.Paint r0 = r11.f104771e
            float r1 = r40.mo42030g()
            r0.setStrokeWidth(r1)
            h.h.c r0 = r11.f104784r
            h.k.k[] r1 = f104753a
            r2 = 10
            r1 = r1[r2]
            java.lang.Object r0 = r0.mo42046c(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x06ed
            com.google.android.libraries.search.p6glow.n r0 = r40.mo42032i()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x06ad
            r1 = 1
            if (r0 == r1) goto L_0x05fc
            goto L_0x074b
        L_0x05fc:
            float r0 = r40.mo42029f()
            r1 = 1034594987(0x3daaaaab, float:0.083333336)
            float[] r14 = r11.m69254v(r1)
            float r1 = r40.mo42024a()
            r2 = 1127481344(0x43340000, float:180.0)
            float r10 = p5462h.p5480j.C69699g.m101119a(r1, r13, r2)
            float r1 = r40.mo42025b()
            double r2 = (double) r10
            double r2 = java.lang.Math.toRadians(r2)
            float r2 = (float) r2
            float r9 = r1 * r2
            float r1 = r40.mo42031h()
            float r1 = r1 + r9
            float r1 = r1 + r9
            int r2 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x074b
            float r16 = r9 / r1
            android.graphics.Paint r1 = r11.f104771e
            int r2 = r11.f104754A
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = (int) r0
            r1.setAlpha(r0)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0677
            android.graphics.Paint r2 = r11.f104771e
            r3 = 0
            float r0 = r40.mo42025b()
            float r4 = -r0
            float r5 = r40.mo42025b()
            r0 = 1119092736(0x42b40000, float:90.0)
            float r6 = r10 + r0
            r7 = 1119092736(0x42b40000, float:90.0)
            r8 = 0
            r0 = r40
            r1 = r41
            r15 = r9
            r9 = r16
            r18 = r10
            r10 = r14
            r0.m69252t(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            android.graphics.Paint r2 = r11.f104771e
            float r3 = r40.mo42031h()
            float r0 = r40.mo42025b()
            float r4 = -r0
            float r5 = r40.mo42025b()
            r6 = 1119092736(0x42b40000, float:90.0)
            r0 = 1119092736(0x42b40000, float:90.0)
            float r7 = r0 - r18
            float r8 = r17 - r16
            r9 = 1065353216(0x3f800000, float:1.0)
            r0 = r40
            r0.m69252t(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0678
        L_0x0677:
            r15 = r9
        L_0x0678:
            float r0 = r40.mo42031h()
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x06a6
            android.graphics.Paint r0 = r11.f104771e
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            float r3 = -r15
            r4 = 0
            float r2 = r40.mo42031h()
            float r5 = r2 + r15
            r6 = 0
            int[] r7 = r11.f104789w
            android.graphics.Shader$TileMode r9 = android.graphics.Shader.TileMode.CLAMP
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.setShader(r1)
            r1 = 0
            r2 = 0
            float r3 = r40.mo42031h()
            android.graphics.Paint r5 = r11.f104771e
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
        L_0x06a6:
            android.graphics.Paint r0 = r11.f104771e
            r1 = 0
            r0.setShader(r1)
            return
        L_0x06ad:
            float r0 = r40.mo42029f()
            android.graphics.Paint r1 = r11.f104771e
            android.graphics.LinearGradient r10 = new android.graphics.LinearGradient
            r3 = 0
            r4 = 0
            float r5 = r40.mo42031h()
            r6 = 0
            int[] r7 = r11.f104789w
            r2 = 1034594987(0x3daaaaab, float:0.083333336)
            float[] r8 = r11.m69254v(r2)
            android.graphics.Shader$TileMode r9 = android.graphics.Shader.TileMode.CLAMP
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.setShader(r10)
            android.graphics.Paint r1 = r11.f104771e
            int r2 = r11.f104754A
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = (int) r0
            r1.setAlpha(r0)
            r1 = 0
            r2 = 0
            float r3 = r40.mo42031h()
            android.graphics.Paint r5 = r11.f104771e
            r0 = r41
            r0.drawLine(r1, r2, r3, r4, r5)
            android.graphics.Paint r0 = r11.f104771e
            r1 = 0
            r0.setShader(r1)
            return
        L_0x06ed:
            float r0 = r40.mo42029f()
            android.graphics.Path[] r1 = r11.f104767N
            int r1 = r1.length
            int[] r1 = r11.f104773g
            int r1 = r1.length
            r1 = 6
            r8 = 0
        L_0x06f9:
            if (r14 >= r1) goto L_0x0726
            android.graphics.PathMeasure r2 = r11.f104787u
            float r2 = r2.getLength()
            float[] r3 = r40.mo42038o()
            r3 = r3[r14]
            float r2 = r2 * r3
            android.graphics.Path[] r3 = r11.f104767N
            r3 = r3[r14]
            r3.reset()
            int r3 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r3 < 0) goto L_0x0721
            android.graphics.PathMeasure r3 = r11.f104787u
            float r4 = r8 + r2
            android.graphics.Path[] r5 = r11.f104767N
            r5 = r5[r14]
            r6 = 1
            r3.getSegment(r8, r4, r5, r6)
            goto L_0x0722
        L_0x0721:
            r6 = 1
        L_0x0722:
            float r8 = r8 + r2
            int r14 = r14 + 1
            goto L_0x06f9
        L_0x0726:
            r6 = 1
            r1 = 5
            r15 = 1
        L_0x0729:
            if (r15 >= r1) goto L_0x074b
            android.graphics.Paint r2 = r11.f104771e
            int[] r3 = r11.f104773g
            r3 = r3[r15]
            r2.setColor(r3)
            android.graphics.Paint r2 = r11.f104771e
            int r3 = r11.f104754A
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2.setAlpha(r3)
            android.graphics.Path[] r2 = r11.f104767N
            r2 = r2[r15]
            android.graphics.Paint r3 = r11.f104771e
            r12.drawPath(r2, r3)
            int r15 = r15 + 1
            goto L_0x0729
        L_0x074b:
            return
        L_0x074c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            goto L_0x0755
        L_0x0754:
            throw r0
        L_0x0755:
            goto L_0x0754
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p6glow.AssistantP6GlowView.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f104768b.reset();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssistantP6GlowView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C69659i iVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
