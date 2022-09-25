package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Size;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p1998a.C24094b;
import com.google.android.libraries.lens.common.p1998a.C24097e;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2069am.C25293aa;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2146j.C27212a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4699e.C62195ah;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Random;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.gleam.af */
/* compiled from: PG */
public class C26447af extends C26441a {

    /* renamed from: g */
    private static final int[] f71987g = {0, 0, 1375731712, 0};

    /* renamed from: t */
    private static final Random f71988t = new Random();

    /* renamed from: A */
    private final Paint f71989A;

    /* renamed from: B */
    private final float f71990B;

    /* renamed from: C */
    private final Paint f71991C;

    /* renamed from: D */
    private final Paint[] f71992D;

    /* renamed from: E */
    private float f71993E;

    /* renamed from: F */
    private float f71994F;

    /* renamed from: G */
    private ValueAnimator f71995G;

    /* renamed from: H */
    private final OvershootInterpolator f71996H;

    /* renamed from: h */
    protected final C26553ed f71997h;

    /* renamed from: i */
    protected final Context f71998i;

    /* renamed from: j */
    protected final C26244b f71999j;

    /* renamed from: k */
    protected C58528ij f72000k;

    /* renamed from: l */
    public boolean f72001l;

    /* renamed from: m */
    public final Paint f72002m;

    /* renamed from: n */
    protected final float f72003n;

    /* renamed from: o */
    protected final Paint f72004o;

    /* renamed from: p */
    float f72005p;

    /* renamed from: q */
    boolean f72006q;

    /* renamed from: r */
    public float f72007r;

    /* renamed from: s */
    protected C26453al f72008s;

    /* renamed from: u */
    private final float[] f72009u = {0.0f, 0.9f, 0.9f, 1.0f};

    /* renamed from: v */
    private final C21370a f72010v;

    /* renamed from: w */
    private C58485gu f72011w = C58485gu.m89845m();

    /* renamed from: x */
    private long f72012x = 0;

    /* renamed from: y */
    private final long f72013y;

    /* renamed from: z */
    private final Paint f72014z;

    static {
        C58974d.m91135i("DrawableGleam");
    }

    public C26447af(Context context, C26553ed edVar, C21370a aVar, C25308ap apVar, int i, int i2, C26244b bVar) {
        super(apVar, i, i2);
        Paint paint = new Paint();
        this.f72014z = paint;
        Paint paint2 = new Paint();
        this.f72002m = paint2;
        Paint paint3 = new Paint();
        this.f71989A = paint3;
        Paint paint4 = new Paint();
        this.f71991C = paint4;
        this.f71992D = new Paint[4];
        this.f72004o = new Paint(1);
        this.f72005p = 0.0f;
        this.f71996H = new OvershootInterpolator(1.2f);
        this.f72006q = false;
        this.f72007r = 1.0f;
        this.f71998i = context;
        this.f71997h = edVar;
        this.f71999j = bVar;
        aVar.getClass();
        this.f72010v = aVar;
        this.f72013y = aVar.mo26871c();
        Resources resources = context.getResources();
        int color = resources.getColor(R.color.google_blue600);
        this.f72003n = resources.getDimension(R.dimen.gleam_radius);
        this.f71990B = resources.getDimension(R.dimen.gleam_drop_shadow_blur_size);
        paint.setColor(resources.getColor(R.color.google_white));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint2.setColor(color);
        paint2.setAlpha(0);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setAlpha(C27212a.m50467c(0.2f));
        if (((C26559ej) edVar).f72416v) {
            context.getClass();
            Resources resources2 = context.getResources();
            this.f71993E = resources2.getDimension(R.dimen.gleam_debug_corner_dot_radius);
            this.f71994F = resources2.getDimension(R.dimen.gleam_debug_label_text_size);
            paint4.setColor(resources2.getColor(R.color.gleam_debug_rectangle_color));
            paint4.setStyle(Paint.Style.STROKE);
            paint4.setStrokeJoin(Paint.Join.ROUND);
            paint4.setStrokeCap(Paint.Cap.ROUND);
            paint4.setStrokeWidth(resources2.getDimension(R.dimen.gleam_debug_rectangle_stroke_width));
            int[] intArray = resources2.getIntArray(R.array.gleam_debug_corner_colors);
            for (int i3 = 0; i3 < 4; i3++) {
                this.f71992D[i3] = new Paint();
                this.f71992D[i3].setColor(intArray[i3]);
                this.f71992D[i3].setStyle(Paint.Style.FILL);
            }
            this.f72004o.setColor(resources2.getColor(R.color.google_white));
            this.f72004o.setShadowLayer(3.0f, 2.0f, 2.0f, resources2.getColor(R.color.gleam_debug_label_shadow_color));
            this.f72004o.setTextSize(this.f71994F);
            this.f72004o.setTextAlign(Paint.Align.CENTER);
        }
    }

    /* renamed from: C */
    private final void m48774C(float f) {
        ValueAnimator valueAnimator = this.f71995G;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f71995G.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f72005p, f});
        this.f71995G = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        this.f71995G.setDuration(83);
        this.f71995G.addUpdateListener(new C26445ad(this));
        this.f71995G.start();
    }

    /* renamed from: A */
    public boolean mo31671A() {
        C25349y a = C25349y.m46667a(this.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (a == C25349y.THINKING_GLEAM) {
            return false;
        }
        C25349y a2 = C25349y.m46667a(this.f71963a.f68848i);
        if (a2 == null) {
            a2 = C25349y.UNRECOGNIZED;
        }
        return a2 != C25349y.UNKNOWN;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo31672B() {
        for (C62195ah ahVar : this.f71963a.f68862w) {
            if (ahVar.f167933a == 3) {
                C25349y a = C25349y.m46667a(this.f71963a.f68848i);
                if (a == null) {
                    a = C25349y.UNRECOGNIZED;
                }
                if (a != C25349y.OUTDOOR_GLEAM || !C26453al.m48806j(this.f71963a)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: U */
    public float mo31663U(PointF pointF) {
        C25349y yVar = C25349y.MATH_GLEAM;
        C25349y a = C25349y.m46667a(this.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (yVar.equals(a)) {
            return mo31675s(mo31677u(pointF), this.f71967e);
        }
        C26453al alVar = this.f72008s;
        if (alVar == null) {
            return mo31674r(pointF, this.f71964b);
        }
        RectF d = alVar.mo31694d();
        RectF rectF = this.f71967e;
        return Math.min(mo31675s(pointF, rectF), mo31675s(pointF, d));
    }

    /* renamed from: V */
    public C26464aw mo31664V() {
        return null;
    }

    /* renamed from: e */
    public final C26460as mo31655e() {
        C26460as asVar = new C26460as(this.f72010v);
        RectF rectF = this.f71967e;
        float pow = ((float) Math.pow(Math.abs(f71988t.nextGaussian()), 0.800000011920929d)) * 0.75f;
        float random = ((float) Math.random()) * 3.1415927f;
        double d = (double) (random + random);
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        float width = ((((float) cos) * pow) * rectF.width()) / 2.0f;
        float height = ((pow * ((float) sin)) * rectF.height()) / 2.0f;
        double a = (double) mo31651a();
        double cos2 = Math.cos(a);
        double sin2 = Math.sin(a);
        float centerX = rectF.centerX();
        double sin3 = Math.sin(a);
        double cos3 = Math.cos(a);
        asVar.f72055a.set(((((float) cos2) * width) - (((float) sin2) * height)) + centerX, (((float) sin3) * width) + (((float) cos3) * height) + rectF.centerY());
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(this.f72011w);
        e.mo55395g(asVar);
        this.f72011w = e.mo55394f();
        asVar.mo31707b(this);
        return asVar;
    }

    /* renamed from: f */
    public final C58485gu mo31656f() {
        return this.f72011w;
    }

    /* renamed from: i */
    public void mo31659i() {
        this.f72001l = true;
    }

    /* renamed from: j */
    public void mo31660j() {
        mo31657g();
        if (mo31672B()) {
            this.f72008s = new C26453al(this.f71998i, this, this.f71997h);
            HashSet f = C58758qx.m90648f(C26453al.f72021c);
            f.add(C26493by.GLEAM_LAYER);
            this.f72000k = C58758qx.m90644b(f);
        } else {
            this.f72008s = null;
            this.f72000k = C58476gl.m89803b(EnumSet.of(C26493by.GLEAM_LAYER, new C26493by[0]));
        }
        mo31666n(C25308ap.f68839y);
        C25349y a = C25349y.m46667a(this.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (a == C25349y.GLEAM || a == C25349y.OUTDOOR_GLEAM || a == C25349y.OBJECT_REGION_GLEAM || a == C25349y.MATH_GLEAM) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(this.f71996H);
            ofFloat.setDuration(500);
            ofFloat.addUpdateListener(new C26446ae(this));
            ofFloat.start();
        }
    }

    /* renamed from: k */
    public void mo31661k() {
        this.f72001l = false;
        this.f72002m.setAlpha(0);
    }

    /* renamed from: m */
    public void mo31665m(Canvas canvas, C26493by byVar) {
        float f;
        boolean z;
        float f2;
        float a;
        String e;
        Canvas canvas2 = canvas;
        C26453al alVar = this.f72008s;
        if (alVar != null) {
            if (alVar.mo31700k()) {
                if (alVar.f72043u.isRunning()) {
                    C26469ba baVar = (C26469ba) alVar.f72038p;
                    float a2 = alVar.f72044v * (1.0f / baVar.f72090a.f71997h.mo31819a());
                    C58833ax f3 = C26465ax.m48856f(baVar.f72090a);
                    C58833ax e2 = C26466ay.m48862e(baVar.f72090a);
                    C58833ax e3 = C26467az.m48867e(baVar.f72090a);
                    if (baVar.f72091b == a2) {
                        C58833ax axVar = baVar.f72099j;
                        if ((!axVar.mo56113h() && !f3.mo56113h()) || (axVar.mo56113h() && f3.mo56113h() && ((C26465ax) axVar.mo56107c()).mo31720b() == ((Float) f3.mo56107c()).floatValue())) {
                            C58833ax axVar2 = baVar.f72100k;
                            if ((!axVar2.mo56113h() && !e2.mo56113h()) || (axVar2.mo56113h() && e2.mo56113h() && ((C26466ay) axVar2.mo56107c()).mo31724b() == ((Integer) e2.mo56107c()).intValue())) {
                                C58833ax axVar3 = baVar.f72101l;
                                if ((!axVar3.mo56113h() && !e3.mo56113h()) || (axVar3.mo56113h() && e3.mo56113h() && ((C26467az) axVar3.mo56107c()).mo31727b().equals(e3.mo56107c()))) {
                                    f2 = 1.0f;
                                    z = false;
                                    a = (f2 / alVar.f72037o.mo31819a()) * alVar.f72044v;
                                    e = alVar.mo31695e();
                                    if (alVar.f72041s != a || !alVar.f72042t.equals(e) || z) {
                                        alVar.f72032j.setTextSize(alVar.f72027e);
                                        alVar.f72040r = C26453al.m48805c(f2, Math.max(alVar.f72032j.measureText(e), alVar.f72038p.f72092c), alVar.f72029g, C26453al.m48804a(alVar.f72038p, alVar.f72031i));
                                        alVar.f72032j.setTextSize(alVar.f72027e * a);
                                        float measureText = alVar.f72032j.measureText(e);
                                        alVar.f72048z = measureText;
                                        float max = Math.max(measureText, alVar.f72038p.f72093d);
                                        alVar.f72047y = max;
                                        alVar.f72039q = C26453al.m48805c(a, max, alVar.f72029g, C26453al.m48804a(alVar.f72038p, alVar.f72031i));
                                        alVar.mo31699i(alVar.f72035m, C26453al.f72019a, a);
                                        alVar.mo31699i(alVar.f72036n, C26453al.f72020b, a);
                                        alVar.f72041s = a;
                                        alVar.f72042t = e;
                                    }
                                }
                            }
                        }
                    }
                    baVar.f72098i.setTextSize(baVar.f72094e);
                    baVar.f72096g.setTextSize(baVar.f72094e);
                    C58833ax e4 = C26465ax.m48855e(f3, baVar.f72096g);
                    C58833ax axVar4 = e2;
                    C58833ax axVar5 = e4;
                    f2 = 1.0f;
                    baVar.f72092c = baVar.mo31730b(1.0f, axVar5, C26466ay.m48861d(e2, baVar.f72098i), C26467az.m48866d(e3, baVar.f72098i), baVar.f72103n);
                    baVar.f72098i.setTextSize(baVar.f72094e * a2);
                    baVar.f72096g.setTextSize(baVar.f72094e * a2);
                    baVar.f72091b = a2;
                    baVar.f72099j = C26465ax.m48855e(f3, baVar.f72096g);
                    baVar.f72100k = C26466ay.m48861d(axVar4, baVar.f72098i);
                    baVar.f72101l = C26467az.m48866d(e3, baVar.f72098i);
                    float measureText2 = baVar.f72098i.measureText("•");
                    baVar.f72102m = measureText2;
                    baVar.f72093d = baVar.mo31730b(baVar.f72091b, baVar.f72099j, baVar.f72100k, baVar.f72101l, measureText2);
                    z = true;
                    a = (f2 / alVar.f72037o.mo31819a()) * alVar.f72044v;
                    e = alVar.mo31695e();
                    alVar.f72032j.setTextSize(alVar.f72027e);
                    alVar.f72040r = C26453al.m48805c(f2, Math.max(alVar.f72032j.measureText(e), alVar.f72038p.f72092c), alVar.f72029g, C26453al.m48804a(alVar.f72038p, alVar.f72031i));
                    alVar.f72032j.setTextSize(alVar.f72027e * a);
                    float measureText3 = alVar.f72032j.measureText(e);
                    alVar.f72048z = measureText3;
                    float max2 = Math.max(measureText3, alVar.f72038p.f72093d);
                    alVar.f72047y = max2;
                    alVar.f72039q = C26453al.m48805c(a, max2, alVar.f72029g, C26453al.m48804a(alVar.f72038p, alVar.f72031i));
                    alVar.mo31699i(alVar.f72035m, C26453al.f72019a, a);
                    alVar.mo31699i(alVar.f72036n, C26453al.f72020b, a);
                    alVar.f72041s = a;
                    alVar.f72042t = e;
                }
                C26493by byVar2 = C26493by.SHADOW_LAYER;
                C25349y yVar = C25349y.UNKNOWN;
                int ordinal = byVar.ordinal();
                if (ordinal == 0) {
                    alVar.mo31697g(canvas2, alVar.f72036n, C26453al.f72020b);
                    alVar.mo31697g(canvas2, alVar.f72035m, C26453al.f72019a);
                } else if (ordinal == 3) {
                    alVar.f72034l.setColor(C27212a.m50466b(-1, (int) (((float) Color.alpha(-1)) * alVar.f72045w)));
                    alVar.f72034l.setStrokeWidth(alVar.f72028f / alVar.f72037o.mo31819a());
                    alVar.mo31698h(canvas2, alVar.f72034l, 0.0f);
                } else if (ordinal == 4) {
                    alVar.f72033k.setColor(C27212a.m50466b(-1, (int) (alVar.f72045w * 230.0f)));
                    Paint paint = alVar.f72032j;
                    int i = alVar.f72026d;
                    paint.setColor(Color.argb(C27212a.m50467c(alVar.f72045w), Color.red(i), Color.green(i), Color.blue(i)));
                    alVar.mo31696f(canvas2, alVar.f72033k, 0.0f);
                    Paint paint2 = alVar.f72032j;
                    PointF b = alVar.mo31693b();
                    if (alVar.f72038p.mo31729a() > 0) {
                        C26468b bVar = alVar.f72038p;
                        float a3 = ((b.y - (C26453al.m48804a(bVar, alVar.f72031i) * alVar.f72041s)) + (alVar.f72030h * alVar.f72041s)) - paint2.getFontMetrics().ascent;
                        canvas2.drawText(alVar.f72042t, b.x - ((alVar.f72047y - alVar.f72048z) * 0.5f), a3, paint2);
                        float f4 = a3 + paint2.getFontMetrics().descent;
                        C26468b bVar2 = alVar.f72038p;
                        float f5 = b.x - (alVar.f72047y * 0.5f);
                        int alpha = paint2.getAlpha();
                        C26469ba baVar2 = (C26469ba) bVar2;
                        baVar2.f72096g.setAlpha(alpha);
                        baVar2.f72097h.setAlpha(alpha);
                        baVar2.f72098i.setAlpha(alpha);
                        float f6 = (baVar2.f72095f * baVar2.f72091b) + f4;
                        if (baVar2.f72099j.mo56113h() || baVar2.f72100k.mo56113h()) {
                            float f7 = (f4 + (baVar2.f72095f * baVar2.f72091b)) - baVar2.f72096g.getFontMetrics().ascent;
                            if (baVar2.f72099j.mo56113h()) {
                                canvas2.drawText(((C26465ax) baVar2.f72099j.mo56107c()).mo31722d(), (((C26465ax) baVar2.f72099j.mo56107c()).mo31721c() * 0.5f) + f5, f7, baVar2.f72096g);
                                float a4 = ((C26465ax) baVar2.f72099j.mo56107c()).mo31719a();
                                PointF pointF = new PointF(((C26465ax) baVar2.f72099j.mo56107c()).mo31721c() + f5 + (baVar2.f72104o * baVar2.f72091b) + a4, f7 - (0.8f * a4));
                                Paint paint3 = baVar2.f72097h;
                                Path path = new Path();
                                float f8 = 0.32f * a4;
                                path.moveTo(pointF.x - a4, pointF.y - f8);
                                path.lineTo(pointF.x + a4, pointF.y - f8);
                                float f9 = 0.64f * a4;
                                float f10 = 0.9f * a4;
                                path.lineTo(pointF.x - f9, pointF.y + f10);
                                path.lineTo(pointF.x, pointF.y - a4);
                                path.lineTo(pointF.x + f9, pointF.y + f10);
                                path.lineTo(pointF.x - a4, pointF.y - f8);
                                path.close();
                                canvas2.drawPath(path, paint3);
                                f = ((C26465ax) baVar2.f72099j.mo56107c()).mo31721c() + (baVar2.f72104o * baVar2.f72091b) + a4 + a4 + f5;
                            } else {
                                f = f5;
                            }
                            if (baVar2.f72099j.mo56113h() && baVar2.f72100k.mo56113h()) {
                                canvas2.drawText("•", (baVar2.f72105p * baVar2.f72091b) + f + (baVar2.f72102m * 0.5f), f7, baVar2.f72098i);
                                f = f + ((baVar2.f72105p + baVar2.f72106q) * baVar2.f72091b) + baVar2.f72102m;
                            }
                            if (baVar2.f72100k.mo56113h()) {
                                canvas2.drawText(((C26466ay) baVar2.f72100k.mo56107c()).mo31725c(), f + (((C26466ay) baVar2.f72100k.mo56107c()).mo31723a() * 0.5f), f7, baVar2.f72098i);
                            }
                            f6 = (baVar2.f72107r * baVar2.f72091b) + f7 + baVar2.f72096g.getFontMetrics().descent;
                        }
                        if (baVar2.f72101l.mo56113h()) {
                            float f11 = f6 - baVar2.f72098i.getFontMetrics().ascent;
                            if (baVar2.f72101l.mo56113h()) {
                                canvas2.drawText(((C26467az) baVar2.f72101l.mo56107c()).mo31728c(), f5 + (((C26467az) baVar2.f72101l.mo56107c()).mo31726a() * 0.5f), f11, baVar2.f72098i);
                            }
                        }
                    } else {
                        String str = alVar.f72042t;
                        float f12 = b.x;
                        float f13 = b.y;
                        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
                        canvas2.drawText(str, f12, f13 - ((fontMetrics.ascent + fontMetrics.descent) * 0.5f), paint2);
                    }
                }
            }
            mo31680x(canvas2, this.f71967e);
        }
        C25349y a5 = C25349y.m46667a(this.f71963a.f68848i);
        if (a5 == null) {
            a5 = C25349y.UNRECOGNIZED;
        }
        switch (a5.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 8:
                break;
            case 4:
            case 9:
            case 10:
            case 11:
                if (!this.f72001l && mo31673q() > 0.0f) {
                    float q = this.f72003n * mo31673q();
                    PointF pointF2 = this.f71964b;
                    float q2 = (this.f71990B * mo31673q()) + q;
                    float[] fArr = this.f72009u;
                    float f14 = q / q2;
                    fArr[1] = f14;
                    fArr[2] = f14;
                    this.f71989A.setShader(new RadialGradient(this.f71964b.x, this.f71964b.y, q2, f71987g, this.f72009u, Shader.TileMode.CLAMP));
                    canvas2.drawCircle(this.f71964b.x, this.f71964b.y, q2, this.f71989A);
                    canvas2.drawCircle(pointF2.x, pointF2.y, q, this.f72014z);
                    canvas2.drawCircle(pointF2.x, pointF2.y, q * 0.7f, this.f72002m);
                    int i2 = this.f71963a.f68845f;
                    float f15 = pointF2.x;
                    float f16 = pointF2.y;
                    break;
                }
            case 5:
                C58838bb.m90884s(false, "Text gleam was instantiated as incorrect type.");
                break;
            default:
                Objects.requireNonNull(a5);
                break;
        }
        int ordinal2 = a5.ordinal();
        if (ordinal2 == 3 || ordinal2 == 4 || ordinal2 == 10 || ordinal2 == 11) {
            mo31680x(canvas2, this.f71967e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo31666n(C25308ap apVar) {
        if (this.f72012x == 0) {
            C25349y a = C25349y.m46667a(this.f71963a.f68848i);
            if (a == null) {
                a = C25349y.UNRECOGNIZED;
            }
            if (a == C25349y.PRE_GLEAM) {
                this.f72012x = this.f72010v.mo26871c();
            }
        }
        boolean z = this.f71963a.f68853n;
        boolean z2 = true;
        boolean z3 = z && !apVar.f68853n;
        if (z || !apVar.f68853n) {
            z2 = false;
        }
        if (z3) {
            mo31659i();
            this.f71997h.mo31820b();
        }
        if (z2) {
            mo31661k();
        }
    }

    /* renamed from: o */
    public boolean mo31667o(PointF pointF) {
        C25349y yVar = C25349y.MATH_GLEAM;
        C25349y a = C25349y.m46667a(this.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (!yVar.equals(a)) {
            return C24094b.m44752a(pointF, this.f71964b) <= (this.f72003n * mo31673q()) + (this.f71990B * mo31673q());
        }
        return mo31668p(pointF);
    }

    /* renamed from: p */
    public boolean mo31668p(PointF pointF) {
        RectF rectF = this.f71967e;
        PointF u = mo31677u(pointF);
        return rectF.contains(u.x, u.y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final float mo31673q() {
        return this.f72007r / this.f71997h.mo31819a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final float mo31674r(PointF pointF, PointF pointF2) {
        return C24094b.m44752a(pointF, pointF2) * this.f71997h.mo31819a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final float mo31675s(PointF pointF, RectF rectF) {
        return C24094b.m44753b(pointF, rectF) * this.f71997h.mo31819a();
    }

    /* renamed from: t */
    public final long mo31676t() {
        return this.f72010v.mo26871c() - this.f72013y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final PointF mo31677u(PointF pointF) {
        RectF rectF = this.f71967e;
        return C24097e.m44767a(rectF.centerX(), rectF.centerY(), -mo31651a(), 2, pointF);
    }

    /* renamed from: v */
    public C58528ij mo31678v() {
        return this.f72000k;
    }

    /* renamed from: w */
    public void mo31679w() {
        C58485gu guVar = this.f72011w;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C26460as asVar = (C26460as) guVar.get(i2);
            C58480gp e = C58485gu.m89837e();
            C58485gu guVar2 = this.f72011w;
            int i3 = ((C58724pq) guVar2).f156474d;
            for (int i4 = 0; i4 < i3; i4++) {
                C26460as asVar2 = (C26460as) guVar2.get(i4);
                if (asVar2 != asVar) {
                    e.mo55395g(asVar2);
                }
            }
            this.f72011w = e.mo55394f();
            asVar.mo31707b((C26441a) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo31680x(Canvas canvas, RectF rectF) {
        String str;
        if (((C26559ej) this.f71997h).f72416v) {
            canvas.save();
            PointF pointF = this.f71964b;
            canvas.rotate(mo31652b(), pointF.x, pointF.y);
            Canvas canvas2 = canvas;
            canvas2.drawRect(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f71991C);
            canvas2.drawLine(pointF.x, pointF.y, rectF.left, rectF.top, this.f71991C);
            canvas2.drawLine(pointF.x, pointF.y, rectF.right, rectF.top, this.f71991C);
            canvas2.drawLine(pointF.x, pointF.y, rectF.right, rectF.bottom, this.f71991C);
            canvas2.drawLine(pointF.x, pointF.y, rectF.left, rectF.bottom, this.f71991C);
            canvas.drawCircle(rectF.left, rectF.top, this.f71993E, this.f71992D[0]);
            canvas.drawCircle(rectF.right, rectF.top, this.f71993E, this.f71992D[1]);
            canvas.drawCircle(rectF.right, rectF.bottom, this.f71993E, this.f71992D[2]);
            canvas.drawCircle(rectF.left, rectF.bottom, this.f71993E, this.f71992D[3]);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f71963a.f68849j.isEmpty() ? "UNKNOWN" : this.f71963a.f68849j);
            sb.append(" | ");
            C25293aa aaVar = this.f71963a.f68855p;
            if (aaVar == null) {
                aaVar = C25293aa.f68800c;
            }
            if (aaVar.f68802a.isEmpty()) {
                str = "NO VISUAL OBJECT ID";
            } else {
                C25293aa aaVar2 = this.f71963a.f68855p;
                if (aaVar2 == null) {
                    aaVar2 = C25293aa.f68800c;
                }
                str = aaVar2.f68802a;
            }
            sb.append(str);
            canvas.drawText(sb.toString(), this.f71964b.x, this.f71964b.y, this.f72004o);
            canvas.restore();
        }
    }

    /* renamed from: y */
    public void mo31681y(int i, int i2) {
        this.f71966d = new Size(i, i2);
        mo31657g();
        C26453al alVar = this.f72008s;
        if (alVar != null) {
            alVar.f72046x = (int) ((((float) i) * 0.66f) / alVar.f72032j.measureText("a"));
        }
    }

    /* renamed from: z */
    public final void mo31682z(boolean z) {
        if (z != this.f72006q) {
            this.f72006q = z;
            if (z) {
                C26453al alVar = this.f72008s;
                if (alVar != null) {
                    if (alVar.f72043u.isRunning()) {
                        alVar.f72043u.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{alVar.f72044v, 1.0f});
                    ofFloat.setDuration(150);
                    ofFloat.setInterpolator(new DecelerateInterpolator());
                    ofFloat.addUpdateListener(new C26450ai(alVar));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{alVar.f72045w, 1.0f});
                    ofFloat2.setDuration(150);
                    ofFloat2.setInterpolator(new DecelerateInterpolator());
                    ofFloat2.addUpdateListener(new C26451aj(alVar));
                    alVar.f72043u.play(ofFloat).with(ofFloat2);
                    alVar.f72043u.start();
                }
                m48774C(1.0f);
                this.f71997h.mo31820b();
                return;
            }
            C26453al alVar2 = this.f72008s;
            if (alVar2 != null) {
                if (alVar2.f72043u.isRunning()) {
                    alVar2.f72043u.cancel();
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{alVar2.f72044v, 0.75f});
                ofFloat3.setDuration(150);
                ofFloat3.setInterpolator(new DecelerateInterpolator());
                ofFloat3.addUpdateListener(new C26448ag(alVar2));
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{alVar2.f72045w, 0.0f});
                ofFloat4.setDuration(150);
                ofFloat4.setInterpolator(new DecelerateInterpolator());
                ofFloat4.addUpdateListener(new C26449ah(alVar2));
                alVar2.f72043u.play(ofFloat3).with(ofFloat4);
                alVar2.f72043u.start();
            }
            m48774C(0.0f);
        }
    }
}
