package com.google.android.libraries.home.coreui.devicetile.p1954a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.a.h */
/* compiled from: PG */
public final class C23646h extends C23642d {

    /* renamed from: a */
    public final String f64664a;

    /* renamed from: b */
    public final float f64665b;

    /* renamed from: c */
    public final CharSequence f64666c;

    /* renamed from: d */
    private final float f64667d = 0.0f;

    /* renamed from: e */
    private final float f64668e = 100.0f;

    /* renamed from: f */
    private final float f64669f;

    public C23646h(String str, float f, CharSequence charSequence) {
        super(str, false, 14);
        this.f64664a = str;
        this.f64665b = f;
        this.f64669f = 1.0f;
        this.f64666c = charSequence;
    }

    /* renamed from: a */
    public final String mo28966a() {
        return this.f64664a;
    }

    /* renamed from: b */
    public final boolean mo28976b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23646h)) {
            return false;
        }
        C23646h hVar = (C23646h) obj;
        if (!C69664n.m101066l(this.f64664a, hVar.f64664a)) {
            return false;
        }
        Float valueOf = Float.valueOf(0.0f);
        float f = hVar.f64667d;
        if (!C69664n.m101066l(valueOf, valueOf)) {
            return false;
        }
        Float valueOf2 = Float.valueOf(100.0f);
        float f2 = hVar.f64668e;
        if (!C69664n.m101066l(valueOf2, valueOf2) || !C69664n.m101066l(Float.valueOf(this.f64665b), Float.valueOf(hVar.f64665b))) {
            return false;
        }
        Float valueOf3 = Float.valueOf(1.0f);
        float f3 = hVar.f64669f;
        return C69664n.m101066l(valueOf3, valueOf3) && C69664n.m101066l(this.f64666c, hVar.f64666c);
    }

    public final int hashCode() {
        return ((((((((((this.f64664a.hashCode() * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(100.0f)) * 31) + Float.floatToIntBits(this.f64665b)) * 31) + Float.floatToIntBits(1.0f)) * 961) + this.f64666c.hashCode()) * 31;
    }

    public final String toString() {
        String str = this.f64664a;
        float f = this.f64665b;
        CharSequence charSequence = this.f64666c;
        return "RangeTemplate(templateId=" + str + ", minValue=0.0, maxValue=100.0, currentValue=" + f + ", stepValue=1.0, isExpanded=false, formatString=" + charSequence + ", readonly=false)";
    }
}
