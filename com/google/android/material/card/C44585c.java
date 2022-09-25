package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.cardview.widget.C1587b;
import androidx.cardview.widget.C1588c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3513j.C44767a;
import com.google.android.material.p3515l.C44773d;
import com.google.android.material.p3515l.C44774e;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44783n;
import com.google.android.material.p3515l.C44784o;
import com.google.android.material.p3515l.C44785p;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.material.card.c */
/* compiled from: PG */
public final class C44585c {

    /* renamed from: u */
    private static final double f116035u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public final MaterialCardView f116036a;

    /* renamed from: b */
    public final Rect f116037b = new Rect();

    /* renamed from: c */
    public final C44779j f116038c;

    /* renamed from: d */
    public final C44779j f116039d;

    /* renamed from: e */
    public int f116040e;

    /* renamed from: f */
    public int f116041f;

    /* renamed from: g */
    public int f116042g;

    /* renamed from: h */
    public int f116043h;

    /* renamed from: i */
    public Drawable f116044i;

    /* renamed from: j */
    public Drawable f116045j;

    /* renamed from: k */
    public ColorStateList f116046k;

    /* renamed from: l */
    public ColorStateList f116047l;

    /* renamed from: m */
    public C44785p f116048m;

    /* renamed from: n */
    public ColorStateList f116049n;

    /* renamed from: o */
    public Drawable f116050o;

    /* renamed from: p */
    public LayerDrawable f116051p;

    /* renamed from: q */
    public C44779j f116052q;

    /* renamed from: r */
    public boolean f116053r = false;

    /* renamed from: s */
    public boolean f116054s;

    /* renamed from: t */
    public float f116055t = 0.0f;

    /* renamed from: v */
    private C44779j f116056v;

    /* renamed from: w */
    private ValueAnimator f116057w;

    /* renamed from: x */
    private final TimeInterpolator f116058x;

    /* renamed from: y */
    private final int f116059y;

    public C44585c(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.f116036a = materialCardView;
        C44779j jVar = new C44779j(materialCardView.getContext(), attributeSet, i, 2132151752);
        this.f116038c = jVar;
        jVar.mo48121S(materialCardView.getContext());
        jVar.mo48132ad();
        C44784o oVar = new C44784o(jVar.f116741C.f116718a);
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C44586d.f116060a, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            oVar.mo48146e(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f116039d = new C44779j();
        mo47631f(new C44785p(oVar));
        this.f116058x = C44688a.m79217a(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, C44497b.f115650a);
        this.f116059y = C44693c.m79225a(materialCardView.getContext(), R.attr.motionDurationShort4, 300);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: o */
    private final float m78906o() {
        float q = m78908q(this.f116048m.f116780b, this.f116038c.mo48115L());
        C44773d dVar = this.f116048m.f116781c;
        C44779j jVar = this.f116038c;
        float max = Math.max(q, m78908q(dVar, jVar.f116741C.f116718a.f116785g.mo48107a(jVar.mo48117N())));
        C44773d dVar2 = this.f116048m.f116782d;
        C44779j jVar2 = this.f116038c;
        float q2 = m78908q(dVar2, jVar2.f116741C.f116718a.f116786h.mo48107a(jVar2.mo48117N()));
        C44773d dVar3 = this.f116048m.f116783e;
        C44779j jVar3 = this.f116038c;
        return Math.max(max, Math.max(q2, m78908q(dVar3, jVar3.f116741C.f116718a.f116787i.mo48107a(jVar3.mo48117N()))));
    }

    /* renamed from: p */
    private final boolean m78907p() {
        return this.f116038c.mo48131ac();
    }

    /* renamed from: q */
    private static final float m78908q(C44773d dVar, float f) {
        if (dVar instanceof C44783n) {
            double d = (double) f;
            Double.isNaN(d);
            return (float) ((1.0d - f116035u) * d);
        } else if (dVar instanceof C44774e) {
            return f / 2.0f;
        } else {
            return 0.0f;
        }
    }

    /* renamed from: a */
    public final float mo47626a() {
        return this.f116036a.mo4477ii() + (mo47639n() ? m78906o() : 0.0f);
    }

    /* renamed from: b */
    public final float mo47627b() {
        return (this.f116036a.mo4477ii() * 1.5f) + (mo47639n() ? m78906o() : 0.0f);
    }

    /* renamed from: c */
    public final Drawable mo47628c() {
        if (this.f116050o == null) {
            int i = C44767a.f116704a;
            this.f116056v = new C44779j(this.f116048m);
            this.f116050o = new RippleDrawable(this.f116046k, (Drawable) null, this.f116056v);
        }
        if (this.f116051p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f116050o, this.f116039d, this.f116045j});
            this.f116051p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f116051p;
    }

    /* renamed from: d */
    public final Drawable mo47629d(Drawable drawable) {
        int i;
        int i2;
        if (this.f116036a.f4341a) {
            i = (int) Math.ceil((double) mo47627b());
            i2 = (int) Math.ceil((double) mo47626a());
        } else {
            i2 = 0;
            i = 0;
        }
        return new C44584b(drawable, i2, i, i2, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo47631f(C44785p pVar) {
        this.f116048m = pVar;
        this.f116038c.mo47555l(pVar);
        this.f116038c.mo48131ac();
        this.f116039d.mo47555l(pVar);
        C44779j jVar = this.f116056v;
        if (jVar != null) {
            jVar.mo47555l(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo47632g() {
        float f;
        float f2 = 0.0f;
        if (mo47638m() || mo47639n()) {
            f = m78906o();
        } else {
            f = 0.0f;
        }
        MaterialCardView materialCardView = this.f116036a;
        if (materialCardView.f4342b && materialCardView.f4341a) {
            double d = 1.0d - f116035u;
            double d2 = (double) ((C1588c) materialCardView.f4345f.f4346a).f4348a;
            Double.isNaN(d2);
            f2 = (float) (d * d2);
        }
        int i = (int) (f - f2);
        materialCardView.f4343c.set(this.f116037b.left + i, this.f116037b.top + i, this.f116037b.right + i, this.f116037b.bottom + i);
        C1587b.m4205a(materialCardView.f4345f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo47633h() {
        this.f116038c.mo48123U(this.f116036a.f4345f.f4347b.getElevation());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo47634i() {
        if (!this.f116053r) {
            this.f116036a.mo47609j(mo47629d(this.f116038c));
        }
        this.f116036a.setForeground(mo47629d(this.f116044i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo47635j() {
        C44779j jVar = this.f116039d;
        int i = this.f116043h;
        ColorStateList colorStateList = this.f116049n;
        jVar.mo48129aa((float) i);
        jVar.mo48128Z(colorStateList);
    }

    /* renamed from: k */
    public final boolean mo47636k() {
        return (this.f116042g & 80) == 80;
    }

    /* renamed from: l */
    public final boolean mo47637l() {
        return (this.f116042g & 8388613) == 8388613;
    }

    /* renamed from: m */
    public final boolean mo47638m() {
        return this.f116036a.f4342b && !m78907p();
    }

    /* renamed from: n */
    public final boolean mo47639n() {
        return this.f116036a.f4342b && m78907p() && this.f116036a.f4341a;
    }

    /* renamed from: e */
    public final void mo47630e(boolean z, boolean z2) {
        float f;
        Drawable drawable = this.f116045j;
        if (drawable != null) {
            float f2 = 0.0f;
            int i = 0;
            if (z2) {
                if (true == z) {
                    f2 = 1.0f;
                }
                if (z) {
                    f = 1.0f - this.f116055t;
                } else {
                    f = this.f116055t;
                }
                ValueAnimator valueAnimator = this.f116057w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f116057w = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f116055t, f2});
                this.f116057w = ofFloat;
                ofFloat.addUpdateListener(new C44583a(this));
                this.f116057w.setInterpolator(this.f116058x);
                this.f116057w.setDuration((long) (((float) this.f116059y) * f));
                this.f116057w.start();
                return;
            }
            if (true == z) {
                i = PrivateKeyType.INVALID;
            }
            drawable.setAlpha(i);
            if (true == z) {
                f2 = 1.0f;
            }
            this.f116055t = f2;
        }
    }
}
