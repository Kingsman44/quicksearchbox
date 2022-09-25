package com.google.android.libraries.lens.view.gleam;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Trace;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2146j.C27212a;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58528ij;
import com.google.lens.p4699e.C62195ah;
import com.google.lens.p4699e.C62202ao;
import com.google.lens.p4699e.C62203ap;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.lens.view.gleam.al */
/* compiled from: PG */
public final class C26453al {

    /* renamed from: a */
    public static final C26452ak f72019a = new C26495c(0.3f, 2.0f, 0.0f);

    /* renamed from: b */
    public static final C26452ak f72020b = new C26495c(0.15f, 3.0f, 0.5f);

    /* renamed from: c */
    public static final C58528ij f72021c = C58476gl.m89803b(EnumSet.of(C26493by.SHADOW_LAYER, new C26493by[]{C26493by.GLEAM_LAYER, C26493by.LABEL_LAYER}));

    /* renamed from: A */
    private final float f72022A;

    /* renamed from: B */
    private final float f72023B;

    /* renamed from: C */
    private final C26447af f72024C;

    /* renamed from: D */
    private final Context f72025D;

    /* renamed from: d */
    public final int f72026d;

    /* renamed from: e */
    public final float f72027e;

    /* renamed from: f */
    public final float f72028f;

    /* renamed from: g */
    public final float f72029g;

    /* renamed from: h */
    public final float f72030h;

    /* renamed from: i */
    public final float[] f72031i;

    /* renamed from: j */
    public final Paint f72032j;

    /* renamed from: k */
    public final Paint f72033k;

    /* renamed from: l */
    public final Paint f72034l;

    /* renamed from: m */
    public final Paint f72035m;

    /* renamed from: n */
    public final Paint f72036n;

    /* renamed from: o */
    public final C26553ed f72037o;

    /* renamed from: p */
    public final C26468b f72038p;

    /* renamed from: q */
    public RectF f72039q = new RectF();

    /* renamed from: r */
    public RectF f72040r = new RectF();

    /* renamed from: s */
    public float f72041s = 1.0f;

    /* renamed from: t */
    public String f72042t = BuildConfig.FLAVOR;

    /* renamed from: u */
    final AnimatorSet f72043u = new AnimatorSet();

    /* renamed from: v */
    float f72044v;

    /* renamed from: w */
    float f72045w;

    /* renamed from: x */
    public int f72046x = 0;

    /* renamed from: y */
    public float f72047y = 0.0f;

    /* renamed from: z */
    public float f72048z = 0.0f;

    public C26453al(Context context, C26447af afVar, C26553ed edVar) {
        float[] fArr = new float[3];
        this.f72031i = fArr;
        Paint paint = new Paint(193);
        this.f72032j = paint;
        Paint paint2 = new Paint(1);
        this.f72033k = paint2;
        Paint paint3 = new Paint(1);
        this.f72034l = paint3;
        this.f72025D = context;
        Trace.beginSection("DrawableGleamLabel");
        this.f72024C = afVar;
        this.f72037o = edVar;
        this.f72038p = new C26469ba(afVar, context);
        Resources resources = context.getResources();
        this.f72026d = resources.getColor(R.color.google_grey800);
        this.f72023B = resources.getDimension(R.dimen.gleam_label_stem_default_height);
        float dimension = resources.getDimension(R.dimen.gleam_label_title_font_size);
        this.f72027e = dimension;
        float dimension2 = resources.getDimension(R.dimen.gleam_label_stem_stroke_width);
        this.f72028f = dimension2;
        this.f72022A = resources.getDimension(R.dimen.gleam_label_box_corner_radius);
        this.f72029g = resources.getDimension(R.dimen.gleam_label_box_horizontal_margin);
        this.f72030h = resources.getDimension(R.dimen.gleam_label_box_top_margin);
        fArr[0] = resources.getDimension(R.dimen.gleam_label_one_line_box_height) * 0.5f;
        fArr[1] = resources.getDimension(R.dimen.gleam_label_two_lines_box_height) * 0.5f;
        fArr[2] = resources.getDimension(R.dimen.gleam_label_three_lines_box_height) * 0.5f;
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create("Roboto Medium", 1));
        paint.setTextSize(dimension);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f72035m = m48807l(f72019a, dimension2, context);
        this.f72036n = m48807l(f72020b, dimension2, context);
        this.f72044v = 0.75f;
        this.f72045w = 0.0f;
        Trace.endSection();
    }

    /* renamed from: a */
    public static float m48804a(C26468b bVar, float[] fArr) {
        int a = bVar.mo31729a();
        boolean z = false;
        if (a >= 0 && a < 3) {
            z = true;
        }
        C58838bb.m90884s(z, "Label information may possibly have only 0, 1, or 2 lines.");
        return fArr[a];
    }

    /* renamed from: c */
    public static RectF m48805c(float f, float f2, float f3, float f4) {
        float f5 = f3 * f;
        float f6 = f4 * f;
        float f7 = f2 * 0.5f;
        return new RectF((-f7) - f5, -f6, f7 + f5, f6);
    }

    /* renamed from: j */
    public static boolean m48806j(C25308ap apVar) {
        C62203ap apVar2;
        for (C62195ah ahVar : apVar.f68862w) {
            if (ahVar.f167933a == 3) {
                apVar2 = (C62203ap) ahVar.f167934b;
            } else {
                apVar2 = C62203ap.f167949d;
            }
            C62202ao aoVar = apVar2.f167953c;
            if (aoVar == null) {
                aoVar = C62202ao.f167942f;
            }
            if (aoVar.f167948e) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    private static Paint m48807l(C26452ak akVar, float f, Context context) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        C26495c cVar = (C26495c) akVar;
        paint.setStrokeWidth(f + C28134w.m52424a(cVar.f72187c, context));
        paint.setMaskFilter(new BlurMaskFilter(C28134w.m52424a(cVar.f72186b, context), BlurMaskFilter.Blur.NORMAL));
        return paint;
    }

    /* renamed from: m */
    private final PointF m48808m() {
        PointF pointF = this.f72024C.f71964b;
        float f = pointF.x;
        float f2 = pointF.y;
        C26447af afVar = this.f72024C;
        return new PointF(f, f2 - (afVar.f72003n * afVar.mo31673q()));
    }

    /* renamed from: b */
    public final PointF mo31693b() {
        PointF m = m48808m();
        return new PointF(m.x, m.y - ((this.f72023B + (this.f72040r.height() * 0.5f)) * this.f72041s));
    }

    /* renamed from: d */
    public final RectF mo31694d() {
        RectF rectF = new RectF(this.f72039q);
        PointF b = mo31693b();
        rectF.offset(b.x, b.y);
        return rectF;
    }

    /* renamed from: e */
    public final String mo31695e() {
        C26447af afVar = this.f72024C;
        int i = this.f72046x;
        C25308ap apVar = afVar.f71963a;
        String str = apVar.f68849j;
        Iterator it = apVar.f68862w.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C62195ah ahVar = (C62195ah) it.next();
            if (ahVar.f167933a == 3) {
                str = ((C62203ap) ahVar.f167934b).f167952b;
                break;
            }
        }
        return (str.length() <= i || i <= 1) ? str : String.valueOf(str.substring(0, i - 1)).concat("…");
    }

    /* renamed from: f */
    public final void mo31696f(Canvas canvas, Paint paint, float f) {
        RectF d = mo31694d();
        float a = this.f72022A / this.f72037o.mo31819a();
        float f2 = -(C28134w.m52424a(f, this.f72025D) / this.f72037o.mo31819a());
        d.inset(f2, f2);
        canvas.drawRoundRect(d, a, a, paint);
    }

    /* renamed from: g */
    public final void mo31697g(Canvas canvas, Paint paint, C26452ak akVar) {
        C26495c cVar = (C26495c) akVar;
        paint.setColor(C27212a.m50466b(-12828605, (int) (cVar.f72185a * ((float) Color.alpha(-12828605)) * this.f72045w)));
        canvas.save();
        canvas.translate(C28134w.m52424a(0.0f, this.f72025D) / this.f72037o.mo31819a(), C28134w.m52424a(1.0f, this.f72025D) / this.f72037o.mo31819a());
        mo31698h(canvas, paint, cVar.f72187c);
        mo31696f(canvas, paint, cVar.f72187c);
        canvas.restore();
    }

    /* renamed from: h */
    public final void mo31698h(Canvas canvas, Paint paint, float f) {
        PointF m = m48808m();
        RectF d = mo31694d();
        float a = C28134w.m52424a(f, this.f72025D);
        float a2 = this.f72037o.mo31819a();
        PointF pointF = new PointF(m.x, d.bottom);
        PointF pointF2 = new PointF(m.x, m.y - (a / a2));
        canvas.drawLine(pointF2.x, pointF2.y, pointF.x, pointF.y, paint);
    }

    /* renamed from: i */
    public final void mo31699i(Paint paint, C26452ak akVar, float f) {
        C26495c cVar = (C26495c) akVar;
        paint.setStrokeWidth((this.f72028f + C28134w.m52424a(cVar.f72187c, this.f72025D)) * f);
        paint.setMaskFilter(new BlurMaskFilter(C28134w.m52424a(cVar.f72186b, this.f72025D) * f, BlurMaskFilter.Blur.NORMAL));
    }

    /* renamed from: k */
    public final boolean mo31700k() {
        if (mo31695e().isEmpty() || this.f72024C.f72001l) {
            return false;
        }
        C26493by byVar = C26493by.SHADOW_LAYER;
        C25349y yVar = C25349y.UNKNOWN;
        C25349y a = C25349y.m46667a(this.f72024C.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 4 || ordinal == 9) {
            return true;
        }
        return false;
    }
}
