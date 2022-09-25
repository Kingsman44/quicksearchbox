package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.b */
/* compiled from: PG */
final class C130859b extends C130883x {

    /* renamed from: b */
    private final Double f358129b;

    /* renamed from: c */
    private final Double f358130c;

    /* renamed from: d */
    private final Double f358131d;

    /* renamed from: e */
    private final Double f358132e;

    /* renamed from: f */
    private final Double f358133f;

    /* renamed from: g */
    private final Double f358134g;

    /* renamed from: h */
    private final Boolean f358135h;

    /* renamed from: i */
    private final Double f358136i;

    /* renamed from: j */
    private final Double f358137j;

    public C130859b(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Boolean bool, Double d7, Double d8) {
        this.f358129b = d;
        this.f358130c = d2;
        this.f358131d = d3;
        this.f358132e = d4;
        this.f358133f = d5;
        this.f358134g = d6;
        this.f358135h = bool;
        this.f358136i = d7;
        this.f358137j = d8;
    }

    /* renamed from: a */
    public final Boolean mo109844a() {
        return this.f358135h;
    }

    /* renamed from: b */
    public final Double mo109845b() {
        return this.f358137j;
    }

    /* renamed from: c */
    public final Double mo109846c() {
        return this.f358136i;
    }

    /* renamed from: d */
    public final Double mo109847d() {
        return this.f358133f;
    }

    /* renamed from: e */
    public final Double mo109848e() {
        return this.f358129b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130883x) {
            C130883x xVar = (C130883x) obj;
            return this.f358129b.equals(xVar.mo109848e()) && this.f358130c.equals(xVar.mo109850f()) && this.f358131d.equals(xVar.mo109852h()) && this.f358132e.equals(xVar.mo109851g()) && this.f358133f.equals(xVar.mo109847d()) && this.f358134g.equals(xVar.mo109854i()) && this.f358135h.equals(xVar.mo109844a()) && this.f358136i.equals(xVar.mo109846c()) && this.f358137j.equals(xVar.mo109845b());
        }
    }

    /* renamed from: f */
    public final Double mo109850f() {
        return this.f358130c;
    }

    /* renamed from: g */
    public final Double mo109851g() {
        return this.f358132e;
    }

    /* renamed from: h */
    public final Double mo109852h() {
        return this.f358131d;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f358129b.hashCode() ^ 1000003) * 1000003) ^ this.f358130c.hashCode()) * 1000003) ^ this.f358131d.hashCode()) * 1000003) ^ this.f358132e.hashCode()) * 1000003) ^ this.f358133f.hashCode()) * 1000003) ^ this.f358134g.hashCode()) * 1000003) ^ this.f358135h.hashCode()) * 1000003) ^ this.f358136i.hashCode()) * 1000003) ^ this.f358137j.hashCode();
    }

    /* renamed from: i */
    public final Double mo109854i() {
        return this.f358134g;
    }

    public final String toString() {
        Double d = this.f358129b;
        Double d2 = this.f358130c;
        Double d3 = this.f358131d;
        Double d4 = this.f358132e;
        Double d5 = this.f358133f;
        Double d6 = this.f358134g;
        Boolean bool = this.f358135h;
        Double d7 = this.f358136i;
        Double d8 = this.f358137j;
        return "LocationInferenceOptions{maxRetrievalDistance=" + d + ", maxTriggeringDistance=" + d2 + ", polygonCutRadius=" + d3 + ", noPolygonPlaceRadius=" + d4 + ", homeRadius=" + d5 + ", workRadius=" + d6 + ", waitUntilAllSourcesRefresh=" + bool + ", cslTopRadius=" + d7 + ", cslProbabilityThreshold=" + d8 + "}";
    }
}
