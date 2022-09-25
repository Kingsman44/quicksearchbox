package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.app.Service;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.af */
/* compiled from: PG */
public abstract class C88795af extends RelativeLayout implements C88803an {

    /* renamed from: a */
    private C88805ap f240412a;

    /* renamed from: b */
    private ShapeDrawable f240413b;

    /* renamed from: c */
    private ShapeDrawable f240414c;

    /* renamed from: l */
    protected final float f240415l = getResources().getDimension(R.dimen.suggestion_container_corners);

    /* renamed from: m */
    protected int f240416m;

    /* renamed from: n */
    public Suggestion f240417n;

    /* renamed from: o */
    protected C88728ak f240418o;

    /* renamed from: p */
    protected boolean f240419p = true;

    public C88795af(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo82341a() {
        Shape hP = mo82552hP(false, false);
        ShapeDrawable shapeDrawable = new ShapeDrawable(hP);
        this.f240413b = shapeDrawable;
        shapeDrawable.getPaint().setColor(mo82583q());
        this.f240414c = new ShapeDrawable(hP);
        int hO = mo82581hO();
        this.f240414c.getPaint().setColor(hO);
        return new RippleDrawable(ColorStateList.valueOf(hO), this.f240413b, this.f240414c);
    }

    /* renamed from: c */
    public C88800ak mo82349c(int i) {
        throw new IllegalArgumentException("This suggestion view doesn't support modifying this icon");
    }

    /* renamed from: d */
    public void mo82350d(Spanned spanned, int i) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public void mo82537f(C88805ap apVar) {
        if (!apVar.equals(this.f240412a)) {
            this.f240412a = apVar;
            if (this.f240413b != null) {
                int i = apVar.f240431b;
                boolean a = apVar.mo82592a();
                boolean z = true;
                if (1 != (i & 1)) {
                    z = false;
                }
                Shape hP = mo82552hP(z, a);
                this.f240413b.setShape(hP);
                this.f240414c.setShape(hP);
            }
            mo82553hQ(apVar);
        }
    }

    /* renamed from: g */
    public int mo82544g() {
        C58976aa aaVar = C58975e.f156826a;
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public void mo82536hL() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: hO */
    public int mo82581hO() {
        return getResources().getColor(R.color.suggestion_background_pressed);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hP */
    public Shape mo82552hP(boolean z, boolean z2) {
        float f = 0.0f;
        float f2 = z ? this.f240415l : 0.0f;
        if (z2) {
            f = this.f240415l;
        }
        return new RoundRectShape(new float[]{f2, f2, f2, f2, f, f, f, f}, (RectF) null, (float[]) null);
    }

    /* renamed from: hQ */
    public void mo82553hQ(C88805ap apVar) {
    }

    /* renamed from: hR */
    public void mo82554hR(Spanned spanned) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public void mo82546i(Spanned spanned, int i) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    public void mo82548k(Drawable drawable) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: m */
    public void mo82550m() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo82582o() {
        Drawable a = mo82341a();
        if (a != null) {
            setBackground(a);
        }
        setOnClickListener(new C88793ad(this));
        if (!(getContext() instanceof Service)) {
            setOnLongClickListener(new C88794ae(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo82582o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo82583q() {
        return getResources().getColor(R.color.suggestion_background_normal);
    }

    /* renamed from: r */
    public final int mo82584r() {
        return this.f240416m;
    }

    /* renamed from: s */
    public final View mo82585s() {
        return this;
    }

    /* renamed from: t */
    public final Suggestion mo82586t() {
        return this.f240417n;
    }

    /* renamed from: u */
    public void mo82574u(Suggestion suggestion, C88728ak akVar) {
        this.f240417n = suggestion;
        this.f240418o = akVar;
        String e = akVar.mo82329e(suggestion);
        if (true == TextUtils.isEmpty(e)) {
            e = null;
        }
        setContentDescription(e);
        this.f240419p = akVar.f240013s.mo82433a(suggestion.f108915p.intValue()).f240286L;
        mo82536hL();
    }

    /* renamed from: v */
    public final void mo82587v(Spanned spanned) {
        mo82350d(spanned, 0);
    }

    /* renamed from: w */
    public final void mo82588w(Spanned spanned) {
        mo82546i(spanned, 0);
    }
}
