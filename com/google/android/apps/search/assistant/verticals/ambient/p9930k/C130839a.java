package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a */
/* compiled from: PG */
public final class C130839a extends C130882w {

    /* renamed from: a */
    public Double f358086a;

    /* renamed from: b */
    public Double f358087b;

    /* renamed from: c */
    public Double f358088c;

    /* renamed from: d */
    public Double f358089d;

    /* renamed from: e */
    public Double f358090e;

    /* renamed from: f */
    public Double f358091f;

    /* renamed from: g */
    public Boolean f358092g;

    /* renamed from: h */
    public Double f358093h;

    /* renamed from: i */
    public Double f358094i;

    /* renamed from: a */
    public final C130883x mo109836a() {
        if (this.f358086a != null && this.f358087b != null && this.f358088c != null && this.f358089d != null && this.f358090e != null && this.f358091f != null && this.f358092g != null && this.f358093h != null && this.f358094i != null) {
            return new C130859b(this.f358086a, this.f358087b, this.f358088c, this.f358089d, this.f358090e, this.f358091f, this.f358092g, this.f358093h, this.f358094i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f358086a == null) {
            sb.append(" maxRetrievalDistance");
        }
        if (this.f358087b == null) {
            sb.append(" maxTriggeringDistance");
        }
        if (this.f358088c == null) {
            sb.append(" polygonCutRadius");
        }
        if (this.f358089d == null) {
            sb.append(" noPolygonPlaceRadius");
        }
        if (this.f358090e == null) {
            sb.append(" homeRadius");
        }
        if (this.f358091f == null) {
            sb.append(" workRadius");
        }
        if (this.f358092g == null) {
            sb.append(" waitUntilAllSourcesRefresh");
        }
        if (this.f358093h == null) {
            sb.append(" cslTopRadius");
        }
        if (this.f358094i == null) {
            sb.append(" cslProbabilityThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
