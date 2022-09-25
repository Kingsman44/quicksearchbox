package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.common.p1998a.C24099g;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.p1730f.C21370a;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62491dn;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.gleam.ac */
/* compiled from: PG */
final class C26444ac extends C26447af {

    /* renamed from: A */
    private final PointF f71972A = new PointF();

    /* renamed from: B */
    private final PointF f71973B = new PointF();

    /* renamed from: C */
    private final PointF f71974C = new PointF();

    /* renamed from: D */
    private final PointF f71975D = new PointF();

    /* renamed from: E */
    private final Path f71976E;

    /* renamed from: g */
    private final Paint f71977g;

    /* renamed from: t */
    private final Paint f71978t;

    /* renamed from: u */
    private final Paint f71979u;

    /* renamed from: v */
    private final Paint f71980v;

    /* renamed from: w */
    private final Paint f71981w;

    /* renamed from: x */
    private final Paint f71982x;

    /* renamed from: y */
    private final Paint f71983y;

    /* renamed from: z */
    private final float f71984z;

    public C26444ac(Context context, C26553ed edVar, C21370a aVar, C25308ap apVar, int i, int i2, C26244b bVar) {
        super(context, edVar, aVar, apVar, i, i2, bVar);
        this.f71984z = context.getResources().getDimension(R.dimen.document_gleam_rectangle_stroke_width);
        this.f71977g = m48758C(-1, Paint.Style.STROKE);
        this.f71978t = m48758C(-2004318072, Paint.Style.STROKE);
        this.f71981w = m48758C(-1, Paint.Style.STROKE);
        this.f71982x = m48758C(-2004318072, Paint.Style.STROKE);
        this.f71979u = m48758C(-1, Paint.Style.FILL);
        this.f71980v = m48758C(-2004318072, Paint.Style.FILL);
        Paint paint = new Paint(this.f72004o);
        this.f71983y = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        this.f71976E = new Path();
        m48764I();
    }

    /* renamed from: C */
    private static Paint m48758C(int i, Paint.Style style) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        paint.setStyle(style);
        return paint;
    }

    /* renamed from: D */
    private final PointF m48759D() {
        if (!m48765J()) {
            return new PointF(-3.4028235E38f, -3.4028235E38f);
        }
        return new PointF((this.f71972A.x + this.f71973B.x + this.f71974C.x + this.f71975D.x) * 0.25f, (this.f71972A.y + this.f71973B.y + this.f71974C.y + this.f71975D.y) * 0.25f);
    }

    /* renamed from: E */
    private final PointF m48760E(C62491dn dnVar, int i) {
        C62488dk dkVar = (C62488dk) dnVar.f168713b.get(i);
        return new PointF(dkVar.f168702b * ((float) this.f71966d.getWidth()), dkVar.f168703c * ((float) this.f71966d.getHeight()));
    }

    /* renamed from: F */
    private final void m48761F(Canvas canvas, PointF pointF, Paint paint) {
        canvas.drawCircle(pointF.x, pointF.y, (this.f72003n / this.f71997h.mo31819a()) / 1.5f, paint);
    }

    /* renamed from: G */
    private final void m48762G(Canvas canvas, PointF pointF, PointF pointF2, Paint paint) {
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        float strokeWidth = this.f71981w.getStrokeWidth() * 4.0f;
        float hypot = (float) Math.hypot((double) (pointF4.x - pointF3.x), (double) (pointF4.y - pointF3.y));
        float min = Math.min(hypot > 0.0f ? strokeWidth / hypot : 0.25f, 0.25f);
        float f = pointF3.x;
        float f2 = pointF4.x;
        float f3 = min * 0.5f;
        float f4 = 0.5f - f3;
        float f5 = pointF3.y;
        float f6 = pointF4.y;
        float f7 = pointF3.x;
        float f8 = pointF4.x;
        float f9 = f3 + 0.5f;
        float f10 = pointF3.y;
        canvas.drawLine(f + ((f2 - f) * f4), f5 + (f4 * (f6 - f5)), f7 + ((f8 - f7) * f9), f10 + (f9 * (pointF4.y - f10)), paint);
    }

    /* renamed from: H */
    private final void m48763H(Canvas canvas, Paint paint, Paint paint2, Paint paint3) {
        m48767L(canvas, this.f71972A, this.f71975D, this.f71973B, this.f71974C, paint);
        m48767L(canvas, this.f71972A, this.f71973B, this.f71975D, this.f71974C, paint);
        m48762G(canvas, this.f71972A, this.f71973B, paint2);
        m48762G(canvas, this.f71973B, this.f71974C, paint2);
        m48762G(canvas, this.f71974C, this.f71975D, paint2);
        m48762G(canvas, this.f71975D, this.f71972A, paint2);
        m48761F(canvas, this.f71972A, paint3);
        m48761F(canvas, this.f71973B, paint3);
        m48761F(canvas, this.f71974C, paint3);
        m48761F(canvas, this.f71975D, paint3);
    }

    /* renamed from: I */
    private final void m48764I() {
        C62231l lVar;
        if (m48765J()) {
            C25308ap apVar = this.f71963a;
            if (apVar.f68843d == 13) {
                lVar = (C62231l) apVar.f68844e;
            } else {
                lVar = C62231l.f168023e;
            }
            C62491dn dnVar = lVar.f168026b;
            if (dnVar == null) {
                dnVar = C62491dn.f168710e;
            }
            this.f71972A.set(m48760E(dnVar, 0));
            this.f71973B.set(m48760E(dnVar, 1));
            this.f71974C.set(m48760E(dnVar, 2));
            this.f71975D.set(m48760E(dnVar, 3));
            this.f71976E.reset();
            this.f71976E.moveTo(this.f71972A.x, this.f71972A.y);
            this.f71976E.lineTo(this.f71973B.x, this.f71973B.y);
            this.f71976E.lineTo(this.f71974C.x, this.f71974C.y);
            this.f71976E.lineTo(this.f71975D.x, this.f71975D.y);
            this.f71976E.lineTo(this.f71972A.x, this.f71972A.y);
        }
    }

    /* renamed from: J */
    private final boolean m48765J() {
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d != 13) {
            return false;
        }
        C62231l lVar = (C62231l) apVar.f68844e;
        if ((lVar.f168025a & 1) == 0) {
            return false;
        }
        C62491dn dnVar = lVar.f168026b;
        if (dnVar == null) {
            dnVar = C62491dn.f168710e;
        }
        if (dnVar.f168713b.size() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private final boolean m48766K(PointF pointF) {
        C62231l lVar;
        C25308ap apVar = this.f71963a;
        if (apVar.f68843d == 13) {
            lVar = (C62231l) apVar.f68844e;
        } else {
            lVar = C62231l.f168023e;
        }
        C62491dn dnVar = lVar.f168026b;
        if (dnVar == null) {
            dnVar = C62491dn.f168710e;
        }
        return C24099g.m44773b(C24095c.m44765j(dnVar, this.f71966d), pointF);
    }

    /* renamed from: L */
    private static void m48767L(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, Paint paint) {
        PointF pointF5 = pointF;
        PointF pointF6 = pointF2;
        PointF pointF7 = pointF3;
        PointF pointF8 = pointF4;
        for (int i = 0; i < 4; i++) {
            float f = ((float) i) / 3.0f;
            float f2 = pointF5.x;
            float f3 = pointF7.x;
            float f4 = pointF5.y;
            float f5 = pointF7.y;
            float f6 = pointF6.x;
            float f7 = pointF8.x;
            float f8 = pointF6.y;
            canvas.drawLine(f2 + ((f3 - f2) * f), f4 + ((f5 - f4) * f), f6 + ((f7 - f6) * f), f8 + (f * (pointF8.y - f8)), paint);
        }
    }

    /* renamed from: U */
    public final float mo31663U(PointF pointF) {
        if (!m48765J()) {
            return Float.MAX_VALUE;
        }
        return mo31674r(m48759D(), pointF);
    }

    /* renamed from: V */
    public final C26464aw mo31664V() {
        return new C26522d(this.f71976E, 1.0f);
    }

    /* renamed from: m */
    public final void mo31665m(Canvas canvas, C26493by byVar) {
        C62231l lVar;
        if (m48765J()) {
            float a = (this.f71984z * 0.5f) / this.f71997h.mo31819a();
            this.f71981w.setStrokeWidth(a * 5.0f);
            this.f71982x.setStrokeWidth(this.f71981w.getStrokeWidth());
            this.f71977g.setStrokeWidth(a);
            this.f71978t.setStrokeWidth(this.f71977g.getStrokeWidth());
            this.f71983y.setTextSize((float) ((int) (C28134w.m52424a(14.0f, this.f71998i) / this.f71997h.mo31819a())));
            float a2 = this.f71997h.mo31819a();
            float a3 = 2.0f / this.f71997h.mo31819a();
            BlurMaskFilter blurMaskFilter = new BlurMaskFilter(3.0f / a2, BlurMaskFilter.Blur.NORMAL);
            this.f71978t.setMaskFilter(blurMaskFilter);
            this.f71982x.setMaskFilter(blurMaskFilter);
            this.f71980v.setMaskFilter(blurMaskFilter);
            canvas.save();
            canvas.translate(a3, a3);
            m48763H(canvas, this.f71978t, this.f71982x, this.f71980v);
            canvas.restore();
            m48763H(canvas, this.f71977g, this.f71981w, this.f71979u);
            if (((C26559ej) this.f71997h).f72416v) {
                C25308ap apVar = this.f71963a;
                if (apVar.f68843d == 13) {
                    lVar = (C62231l) apVar.f68844e;
                } else {
                    lVar = C62231l.f168023e;
                }
                float f = lVar.f168027c;
                String format = String.format(Locale.US, "Conf: %.3f", new Object[]{Float.valueOf(f)});
                PointF D = m48759D();
                Rect rect = new Rect();
                this.f71983y.getTextBounds(format, 0, format.length(), rect);
                rect.offset(((int) D.x) - (rect.width() / 2), (int) D.y);
                int i = -((int) (5.0f / this.f71997h.mo31819a()));
                rect.inset(i, i);
                this.f71983y.setColor(1073741824);
                canvas.drawRect(rect, this.f71983y);
                this.f71983y.setColor(-5570646);
                canvas.drawText(format, D.x, D.y, this.f71983y);
            }
        }
    }

    /* renamed from: n */
    public final void mo31666n(C25308ap apVar) {
        m48764I();
    }

    /* renamed from: o */
    public final boolean mo31667o(PointF pointF) {
        return m48766K(pointF);
    }

    /* renamed from: p */
    public final boolean mo31668p(PointF pointF) {
        return m48766K(pointF);
    }
}
