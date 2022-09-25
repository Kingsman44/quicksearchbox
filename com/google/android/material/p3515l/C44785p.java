package com.google.android.material.p3515l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: com.google.android.material.l.p */
/* compiled from: PG */
public final class C44785p {

    /* renamed from: a */
    public static final C44772c f116779a = new C44782m(0.5f);

    /* renamed from: b */
    public final C44773d f116780b;

    /* renamed from: c */
    public final C44773d f116781c;

    /* renamed from: d */
    public final C44773d f116782d;

    /* renamed from: e */
    public final C44773d f116783e;

    /* renamed from: f */
    public final C44772c f116784f;

    /* renamed from: g */
    public final C44772c f116785g;

    /* renamed from: h */
    public final C44772c f116786h;

    /* renamed from: i */
    public final C44772c f116787i;

    /* renamed from: j */
    final C44775f f116788j;

    /* renamed from: k */
    final C44775f f116789k;

    /* renamed from: l */
    final C44775f f116790l;

    /* renamed from: m */
    final C44775f f116791m;

    public C44785p() {
        this.f116780b = new C44783n();
        this.f116781c = new C44783n();
        this.f116782d = new C44783n();
        this.f116783e = new C44783n();
        this.f116784f = new C44769a(0.0f);
        this.f116785g = new C44769a(0.0f);
        this.f116786h = new C44769a(0.0f);
        this.f116787i = new C44769a(0.0f);
        this.f116788j = new C44775f();
        this.f116789k = new C44775f();
        this.f116790l = new C44775f();
        this.f116791m = new C44775f();
    }

    public C44785p(C44784o oVar) {
        this.f116780b = oVar.f116767a;
        this.f116781c = oVar.f116768b;
        this.f116782d = oVar.f116769c;
        this.f116783e = oVar.f116770d;
        this.f116784f = oVar.f116771e;
        this.f116785g = oVar.f116772f;
        this.f116786h = oVar.f116773g;
        this.f116787i = oVar.f116774h;
        this.f116788j = oVar.f116775i;
        this.f116789k = oVar.f116776j;
        this.f116790l = oVar.f116777k;
        this.f116791m = oVar.f116778l;
    }

    /* renamed from: a */
    public static C44784o m79426a(Context context, AttributeSet attributeSet, int i, int i2, C44772c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44781l.f116763a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m79430g(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: d */
    public static C44784o m79427d(Context context, int i, int i2) {
        return m79430g(context, i, i2, new C44769a(0.0f));
    }

    /* renamed from: e */
    public static C44784o m79428e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m79426a(context, attributeSet, i, i2, new C44769a(0.0f));
    }

    /* renamed from: f */
    private static C44772c m79429f(TypedArray typedArray, int i, C44772c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        if (peekValue.type == 5) {
            return new C44769a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new C44782m(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: g */
    private static C44784o m79430g(Context context, int i, int i2, C44772c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C44781l.f116764b);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            C44772c f = m79429f(obtainStyledAttributes, 5, cVar);
            C44772c f2 = m79429f(obtainStyledAttributes, 8, f);
            C44772c f3 = m79429f(obtainStyledAttributes, 9, f);
            C44772c f4 = m79429f(obtainStyledAttributes, 7, f);
            C44772c f5 = m79429f(obtainStyledAttributes, 6, f);
            C44784o oVar = new C44784o();
            C44773d a = C44780k.m79410a(i4);
            oVar.f116767a = a;
            C44784o.m79416j(a);
            oVar.f116771e = f2;
            C44773d a2 = C44780k.m79410a(i5);
            oVar.f116768b = a2;
            C44784o.m79416j(a2);
            oVar.f116772f = f3;
            C44773d a3 = C44780k.m79410a(i6);
            oVar.f116769c = a3;
            C44784o.m79416j(a3);
            oVar.f116773g = f4;
            C44773d a4 = C44780k.m79410a(i7);
            oVar.f116770d = a4;
            C44784o.m79416j(a4);
            oVar.f116774h = f5;
            return oVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public final C44785p mo48151b(float f) {
        C44784o oVar = new C44784o(this);
        oVar.mo48146e(f);
        return new C44785p(oVar);
    }

    /* renamed from: c */
    public final boolean mo48152c(RectF rectF) {
        boolean z = this.f116791m.getClass().equals(C44775f.class) && this.f116789k.getClass().equals(C44775f.class) && this.f116788j.getClass().equals(C44775f.class) && this.f116790l.getClass().equals(C44775f.class);
        float a = this.f116784f.mo48107a(rectF);
        return z && ((this.f116785g.mo48107a(rectF) > a ? 1 : (this.f116785g.mo48107a(rectF) == a ? 0 : -1)) == 0 && (this.f116787i.mo48107a(rectF) > a ? 1 : (this.f116787i.mo48107a(rectF) == a ? 0 : -1)) == 0 && (this.f116786h.mo48107a(rectF) > a ? 1 : (this.f116786h.mo48107a(rectF) == a ? 0 : -1)) == 0) && ((this.f116781c instanceof C44783n) && (this.f116780b instanceof C44783n) && (this.f116782d instanceof C44783n) && (this.f116783e instanceof C44783n));
    }
}
