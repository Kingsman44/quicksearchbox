package com.google.android.libraries.lens.view.p2091bb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.frozenimage.C26270b;
import com.google.android.libraries.lens.view.frozenimage.C26275g;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.p2069am.C25326bg;
import com.google.android.libraries.lens.view.p2069am.C25329e;
import com.google.android.libraries.lens.view.p2069am.C25331g;
import com.google.android.libraries.lens.view.p2078at.C25518ax;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2154p.p2156b.C27543c;
import com.google.android.libraries.lens.view.textoverlay.C28072e;
import com.google.android.libraries.lens.view.textoverlay.C28079l;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4575r.C60752i;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56262bp;

/* renamed from: com.google.android.libraries.lens.view.bb.j */
/* compiled from: PG */
public final class C25696j implements C25691e {

    /* renamed from: k */
    private static final C58974d f69843k = C58974d.m91135i("ViewTransformationHandlerImpl");

    /* renamed from: a */
    public C58833ax f69844a = C58836b.f156633a;

    /* renamed from: b */
    public final ValueAnimator f69845b = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: c */
    public final Scroller f69846c;

    /* renamed from: d */
    public final int f69847d;

    /* renamed from: e */
    public final int f69848e;

    /* renamed from: f */
    public int f69849f;

    /* renamed from: g */
    public int f69850g;

    /* renamed from: h */
    ValueAnimator f69851h;

    /* renamed from: i */
    ValueAnimator f69852i;

    /* renamed from: j */
    ValueAnimator f69853j;

    /* renamed from: l */
    private final C25518ax f69854l;

    /* renamed from: m */
    private final C26244b f69855m;

    /* renamed from: n */
    private final Context f69856n;

    /* renamed from: o */
    private final C27543c f69857o;

    /* renamed from: p */
    private C28072e f69858p;

    /* renamed from: q */
    private C26505cj f69859q;

    /* renamed from: r */
    private C26270b f69860r;

    /* renamed from: s */
    private C25326bg f69861s = C25326bg.f68902l;

    /* renamed from: t */
    private C25688b f69862t = C25688b.f69827a;

    /* renamed from: u */
    private C25688b f69863u = null;

    /* renamed from: v */
    private float f69864v;

    /* renamed from: w */
    private final float f69865w;

    /* renamed from: x */
    private float f69866x;

    /* renamed from: y */
    private int f69867y = 1;

    public C25696j(C26244b bVar, Context context, C27543c cVar, C25518ax axVar) {
        this.f69855m = bVar;
        this.f69856n = context;
        this.f69857o = cVar;
        this.f69854l = axVar;
        Scroller scroller = new Scroller(context);
        this.f69846c = scroller;
        scroller.setFriction(0.04f);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        this.f69847d = i;
        this.f69848e = context.getResources().getDisplayMetrics().heightPixels;
        this.f69865w = bVar.mo31462g(C26239a.SELECTION_STATE_ENABLED) ? C28134w.m52424a(16.0f, context) / ((float) i) : 0.0f;
    }

    /* renamed from: A */
    private final float m47388A() {
        return mo30818p(new PointF(0.0f, 0.0f)).y;
    }

    /* renamed from: B */
    private final float m47389B() {
        return m47399x(this.f69861s.f68910g);
    }

    /* renamed from: C */
    private final float m47390C() {
        C25326bg bgVar = this.f69861s;
        return m47399x(bgVar.f68904a + bgVar.f68905b);
    }

    /* renamed from: D */
    private final void m47391D() {
        float f;
        if (this.f69862t.mo30795d() != 5 && m47397J()) {
            boolean z = this.f69862t.mo30795d() == 6;
            if (!z || !this.f69855m.mo31462g(C26239a.EDUCATION_SELECTION_STATE_ENABLED)) {
                if (z) {
                    C25326bg bgVar = this.f69861s;
                    if (bgVar.f68910g < bgVar.f68911h) {
                        return;
                    }
                }
                float B = m47389B();
                float C = m47390C();
                C25518ax q = mo30819q();
                RectF a = this.f69862t.mo30793a();
                if (m47395H() && this.f69844a.mo56113h()) {
                    a = ((C25518ax) this.f69844a.mo56107c()).mo30546a(a);
                }
                float f2 = 0.0f;
                if (a.top < C || a.bottom > B || z) {
                    f = ((B + C) / 2.0f) - a.centerY();
                } else {
                    f = 0.0f;
                }
                float f3 = q.f69479a.y + f;
                if (mo30819q().f69479a.y != f3) {
                    ValueAnimator valueAnimator = this.f69852i;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        this.f69852i.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{mo30819q().f69479a.y, f3});
                    this.f69852i = ofFloat;
                    ofFloat.addUpdateListener(new C25692f(this));
                    this.f69852i.setDuration(250);
                    this.f69852i.start();
                }
                C58833ax b = mo30800b();
                if (this.f69862t.mo30795d() != 1 && !this.f69862t.mo30794c() && b.mo56113h()) {
                    C25326bg bgVar2 = this.f69861s;
                    float x = m47399x(bgVar2.f68913j - bgVar2.f68914k);
                    RectF a2 = q.mo30548d(new PointF(0.0f, f)).mo30546a(this.f69862t.mo30793a());
                    if (z) {
                        f2 = this.f69865w;
                    }
                    RectF rectF = new RectF(f2, C, 1.0f - f2, B);
                    if ((!rectF.contains(a2) || z) && (B > x || !this.f69862t.equals(this.f69863u))) {
                        mo30824v(Math.min(rectF.right - rectF.left, rectF.bottom - rectF.top), (PointF) b.mo56107c());
                    }
                    this.f69863u = this.f69862t;
                }
            }
        }
    }

    /* renamed from: E */
    private final void m47392E() {
        this.f69845b.cancel();
        this.f69846c.forceFinished(true);
        this.f69849f = 0;
        this.f69850g = 0;
        ValueAnimator valueAnimator = this.f69851h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f69851h.removeAllUpdateListeners();
            this.f69851h = null;
        }
        ValueAnimator valueAnimator2 = this.f69852i;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f69852i.removeAllUpdateListeners();
            this.f69852i = null;
        }
        ValueAnimator valueAnimator3 = this.f69853j;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f69853j.removeAllUpdateListeners();
            this.f69853j.removeAllListeners();
            this.f69853j = null;
        }
    }

    /* renamed from: F */
    private final void m47393F() {
        m47392E();
        this.f69844a = C58836b.f156633a;
        this.f69866x = 0.0f;
    }

    /* renamed from: G */
    private final void m47394G() {
        this.f69863u = null;
        this.f69862t = C25688b.f69827a;
        C26270b bVar = this.f69860r;
        bVar.getClass();
        this.f69864v = true != bVar.mo31475f() ? 0.0f : 1.0f;
    }

    /* renamed from: I */
    private final boolean m47396I(float f) {
        if (!m47398K() || f > m47399x(this.f69861s.f68905b)) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private final boolean m47397J() {
        return !this.f69861s.equals(C25326bg.f68902l);
    }

    /* renamed from: K */
    private final boolean m47398K() {
        return m47395H() && m47397J();
    }

    /* renamed from: x */
    private final float m47399x(int i) {
        C25326bg bgVar = this.f69861s;
        return ((float) (i - bgVar.f68907d)) / ((float) bgVar.f68908e);
    }

    /* renamed from: y */
    private final float m47400y() {
        C25326bg bgVar = this.f69861s;
        return ((float) bgVar.f68906c) / ((float) bgVar.f68908e);
    }

    /* renamed from: z */
    private final float m47401z() {
        return mo30818p(new PointF(0.0f, 1.0f)).y;
    }

    /* renamed from: a */
    public final PointF mo30799a(PointF pointF) {
        if (!m47395H() || !this.f69844a.mo56113h()) {
            return pointF;
        }
        C25518ax axVar = (C25518ax) this.f69844a.mo56107c();
        return new PointF((((pointF.x - 8.0f) - axVar.f69479a.x) / axVar.f69480b) + 0.5f, (((pointF.y - 8.0f) - axVar.f69479a.y) / axVar.f69480b) + 0.5f);
    }

    /* renamed from: b */
    public final C58833ax mo30800b() {
        if (!m47398K()) {
            return C58836b.f156633a;
        }
        if (m47389B() <= m47390C()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(new PointF(0.5f, (m47399x(this.f69861s.f68904a) + m47399x(this.f69861s.f68910g)) * 0.5f));
    }

    /* renamed from: c */
    public final void mo30801c(PointF pointF) {
        if (m47395H()) {
            float f = 1.0f;
            if (mo30819q().f69480b == 1.0f) {
                f = 2.5f;
            }
            mo30824v(f, pointF);
        }
    }

    /* renamed from: d */
    public final void mo30802d() {
        this.f69867y = 1;
        m47392E();
    }

    /* renamed from: e */
    public final void mo30803e(C28072e eVar, C26505cj cjVar, C26270b bVar) {
        this.f69858p = eVar;
        this.f69859q = cjVar;
        this.f69860r = bVar;
        this.f69845b.removeAllUpdateListeners();
        this.f69845b.addUpdateListener(new C25694h(this));
    }

    /* renamed from: f */
    public final void mo30804f(float f, PointF pointF) {
        m47392E();
        if (m47395H()) {
            if (Float.isNaN(f)) {
                ((C58970a) ((C58970a) f69843k.mo56226d()).mo56372aa(50275)).mo56386p("Trying to scale view with scale factor NaN.");
                return;
            }
            this.f69867y = 13;
            this.f69844a = C58833ax.m90834k(mo30819q().mo30547b(f, pointF));
            mo30822t();
            mo30823u();
        }
    }

    /* renamed from: g */
    public final void mo30805g() {
        this.f69867y = 1;
    }

    /* renamed from: i */
    public final void mo30807i(C25326bg bgVar) {
        if (!m47397J()) {
            this.f69861s = bgVar;
            mo30821s();
            m47391D();
        } else if (m47398K()) {
            if (bgVar.f68912i != this.f69861s.f68912i) {
                m47393F();
                this.f69863u = null;
                mo30823u();
            }
            if (!bgVar.equals(this.f69861s)) {
                this.f69861s = bgVar;
                m47391D();
            }
        }
    }

    /* renamed from: j */
    public final void mo30808j() {
        m47393F();
        m47394G();
        if (m47397J()) {
            mo30821s();
        }
        mo30823u();
    }

    /* renamed from: k */
    public final void mo30809k() {
        m47392E();
        this.f69866x = 0.0f;
        m47394G();
        float f = mo30819q().f69480b;
        float f2 = mo30819q().f69479a.y;
        if (f != 1.0f || f2 != 0.0f) {
            ValueAnimator valueAnimator = this.f69853j;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f69853j.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f69853j = ofFloat;
            ofFloat.addUpdateListener(new C25693g(this, f2, f));
            this.f69853j.setDuration(250);
            this.f69853j.start();
        }
    }

    /* renamed from: l */
    public final void mo30810l(C25688b bVar) {
        if (!bVar.equals(this.f69862t)) {
            this.f69862t = bVar;
            m47391D();
        }
    }

    /* renamed from: m */
    public final void mo30811m() {
        float f;
        if (this.f69857o.mo33111n()) {
            if (this.f69857o.mo33112o(C56262bp.CROPPING_VIEW)) {
                f = 40.0f;
            } else {
                f = this.f69857o.mo33112o(C56262bp.PREVIEW_CROPPED_DOCUMENT) ? 20.0f : 0.0f;
            }
            Context context = this.f69856n;
            float a = C28134w.m52424a(f, context) / ((float) context.getResources().getDisplayMetrics().widthPixels);
            float f2 = 1.0f - (a + a);
            this.f69844a = C58833ax.m90834k(new C25518ax(new PointF(0.0f, 0.0f), f2, Math.min(f2, 0.5f)));
            mo30823u();
            return;
        }
        mo30808j();
    }

    /* renamed from: n */
    public final boolean mo30812n(C25331g gVar) {
        m47392E();
        if (!m47398K() || !m47396I(gVar.f68940b)) {
            return false;
        }
        this.f69867y = 22;
        float f = gVar.f68941c;
        float f2 = (float) this.f69847d;
        float f3 = gVar.f68940b;
        float f4 = (float) this.f69848e;
        this.f69846c.fling((int) (f * f2), (int) (f3 * f4), (int) (gVar.f68943e * f2), (int) (gVar.f68944f * f4), LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        if (!this.f69846c.computeScrollOffset()) {
            return true;
        }
        this.f69849f = this.f69846c.getCurrX();
        this.f69850g = this.f69846c.getCurrY();
        this.f69845b.setDuration((long) this.f69846c.getDuration());
        this.f69845b.start();
        return true;
    }

    /* renamed from: o */
    public final void mo30813o(C25329e eVar) {
        m47392E();
        if (m47395H() && m47396I(eVar.f68931b)) {
            this.f69867y = 31;
            if (m47398K()) {
                float C = m47390C();
                float B = m47389B();
                if (eVar.f68933d - eVar.f68931b < 0.0f) {
                    C = B;
                }
                float f = mo30799a(new PointF(0.5f, C)).y;
                C25687a b = C25688b.m47362b();
                RectF rectF = new RectF(0.5f, f, 0.5f, f);
                C25689c cVar = (C25689c) b;
                cVar.f69829a = rectF;
                cVar.f69830b = 5;
                mo30810l(b.mo30790c());
            }
            mo30820r(-eVar.f68934e, -eVar.f68935f);
        }
    }

    /* renamed from: p */
    public final PointF mo30818p(PointF pointF) {
        if (!m47395H() || !this.f69844a.mo56113h()) {
            return pointF;
        }
        C25518ax axVar = (C25518ax) this.f69844a.mo56107c();
        return new PointF(((pointF.x - 8.0f) * axVar.f69480b) + 0.5f + axVar.f69479a.x, ((pointF.y - 8.0f) * axVar.f69480b) + 0.5f + axVar.f69479a.y);
    }

    /* renamed from: q */
    public final C25518ax mo30819q() {
        return (C25518ax) this.f69844a.mo56109e(this.f69854l);
    }

    /* renamed from: r */
    public final void mo30820r(float f, float f2) {
        if (m47398K()) {
            float C = m47390C() + m47400y();
            float B = m47389B();
            float z = m47401z();
            float A = m47388A();
            if (f2 < 0.0f) {
                if (z >= B) {
                    f2 = Math.max(f2, -(z - B));
                }
            } else if (f2 > 0.0f) {
                if (A <= C) {
                    f2 = Math.min(f2, C - A);
                }
            }
            f2 = 0.0f;
        }
        this.f69844a = C58833ax.m90834k(mo30819q().mo30548d(new PointF(f, f2)));
        this.f69866x = Math.max(0.0f, Math.min(m47400y(), this.f69866x + f2));
        mo30822t();
        mo30823u();
    }

    /* renamed from: s */
    public final void mo30821s() {
        if (m47398K()) {
            C26270b bVar = this.f69860r;
            bVar.getClass();
            if (!bVar.mo31475f()) {
                float z = m47401z();
                float A = m47388A();
                this.f69844a = C58833ax.m90834k(mo30819q().mo30548d(new PointF(0.0f, ((m47399x(this.f69861s.f68904a) + m47399x(this.f69861s.f68913j)) / 2.0f) - ((z + A) / 2.0f))));
            }
        }
    }

    /* renamed from: t */
    public final void mo30822t() {
        if (m47398K()) {
            float A = m47388A();
            float z = m47401z();
            float C = m47390C() + this.f69866x;
            float B = m47389B();
            C25326bg bgVar = this.f69861s;
            float min = Math.min(B, m47399x(bgVar.f68912i - bgVar.f68909f));
            if (min - C > z - A) {
                this.f69844a = C58833ax.m90834k(mo30819q().mo30548d(new PointF(0.0f, this.f69864v * (((min + C) / 2.0f) - ((z + A) / 2.0f)))));
            } else if (A > C) {
                this.f69844a = C58833ax.m90834k(mo30819q().mo30548d(new PointF(0.0f, this.f69864v * (C - A))));
            } else if (z < min) {
                this.f69844a = C58833ax.m90834k(mo30819q().mo30548d(new PointF(0.0f, this.f69864v * (min - z))));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo30824v(float f, PointF pointF) {
        if (mo30819q().f69480b != f) {
            ValueAnimator valueAnimator = this.f69851h;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f69851h.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{mo30819q().f69480b, f});
            this.f69851h = ofFloat;
            ofFloat.setInterpolator(new DecelerateInterpolator());
            this.f69851h.addUpdateListener(new C25695i(this, pointF));
            this.f69851h.setDuration(250);
            this.f69851h.start();
        }
    }

    /* renamed from: w */
    public final void mo30825w() {
        C26270b bVar = this.f69860r;
        bVar.getClass();
        if (bVar.mo31475f()) {
            this.f69864v = 1.0f;
            return;
        }
        C25326bg bgVar = this.f69861s;
        this.f69864v = Math.max(C60752i.m92727a(((float) Math.max(0, bgVar.f68912i - bgVar.f68910g)) / ((float) this.f69861s.f68909f), 0.0f, 1.0f), this.f69864v);
    }

    /* renamed from: H */
    private final boolean m47395H() {
        C26270b bVar = this.f69860r;
        bVar.getClass();
        return bVar.mo31474e();
    }

    /* renamed from: h */
    public final void mo30806h() {
        int i = this.f69867y;
        if (i != 1) {
            int i2 = i - 1;
            C28442l lVar = null;
            if (i != 0) {
                if (i2 == 12) {
                    lVar = new C28440j(13).mo33894a();
                } else if (i2 == 21) {
                    lVar = C28442l.m53141g().mo33894a();
                } else if (i2 == 30) {
                    lVar = C28442l.m53138d().mo33894a();
                }
                if (lVar != null) {
                    C26270b bVar = this.f69860r;
                    bVar.getClass();
                    ((C26275g) bVar).f71414d.mo5708l(C58833ax.m90834k(lVar));
                }
                this.f69867y = 1;
                return;
            }
            throw null;
        }
    }

    /* renamed from: u */
    public final void mo30823u() {
        C26270b bVar = this.f69860r;
        bVar.getClass();
        C58833ax axVar = this.f69844a;
        C25758g gVar = ((C26275g) bVar).f71413c;
        axVar.getClass();
        gVar.mo5708l(axVar);
        C26505cj cjVar = this.f69859q;
        if (cjVar != null) {
            C58833ax axVar2 = this.f69844a;
            C25758g gVar2 = ((C26526dd) cjVar).f72310t;
            axVar2.getClass();
            gVar2.mo5708l(axVar2);
        }
        C28072e eVar = this.f69858p;
        if (eVar != null) {
            C58833ax axVar3 = this.f69844a;
            C25758g gVar3 = ((C28079l) eVar).f76417e;
            axVar3.getClass();
            gVar3.mo5708l(axVar3);
        }
    }
}
