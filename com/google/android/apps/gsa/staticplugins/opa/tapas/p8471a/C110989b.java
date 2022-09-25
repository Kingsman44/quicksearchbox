package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.b */
/* compiled from: PG */
final class C110989b extends C111062l {

    /* renamed from: a */
    private final C111058h f309172a;

    /* renamed from: b */
    private final C111057g f309173b;

    /* renamed from: c */
    private final C111060j f309174c;

    /* renamed from: d */
    private final String f309175d;

    /* renamed from: e */
    private final String f309176e;

    /* renamed from: f */
    private final C58485gu f309177f;

    /* renamed from: g */
    private final C58485gu f309178g;

    /* renamed from: h */
    private final int f309179h;

    public C110989b(C111058h hVar, C111057g gVar, C111060j jVar, String str, String str2, int i, C58485gu guVar, C58485gu guVar2) {
        this.f309172a = hVar;
        this.f309173b = gVar;
        this.f309174c = jVar;
        this.f309175d = str;
        this.f309176e = str2;
        this.f309179h = i;
        this.f309177f = guVar;
        this.f309178g = guVar2;
    }

    /* renamed from: a */
    public final C111057g mo99007a() {
        return this.f309173b;
    }

    /* renamed from: b */
    public final C111058h mo99008b() {
        return this.f309172a;
    }

    /* renamed from: c */
    public final C111060j mo99009c() {
        return this.f309174c;
    }

    /* renamed from: d */
    public final C58485gu mo99010d() {
        return this.f309178g;
    }

    /* renamed from: e */
    public final C58485gu mo99011e() {
        return this.f309177f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111062l) {
            C111062l lVar = (C111062l) obj;
            return this.f309172a.equals(lVar.mo99008b()) && this.f309173b.equals(lVar.mo99007a()) && this.f309174c.equals(lVar.mo99009c()) && this.f309175d.equals(lVar.mo99013f()) && this.f309176e.equals(lVar.mo99014g()) && this.f309179h == lVar.mo99015h() && C58597ky.m90218i(this.f309177f, lVar.mo99011e()) && C58597ky.m90218i(this.f309178g, lVar.mo99010d());
        }
    }

    /* renamed from: f */
    public final String mo99013f() {
        return this.f309175d;
    }

    /* renamed from: g */
    public final String mo99014g() {
        return this.f309176e;
    }

    /* renamed from: h */
    public final int mo99015h() {
        return this.f309179h;
    }

    public final int hashCode() {
        return ((((((((((((((this.f309172a.hashCode() ^ 1000003) * 1000003) ^ this.f309173b.hashCode()) * 1000003) ^ this.f309174c.hashCode()) * 1000003) ^ this.f309175d.hashCode()) * 1000003) ^ this.f309176e.hashCode()) * 1000003) ^ this.f309179h) * 1000003) ^ this.f309177f.hashCode()) * 1000003) ^ this.f309178g.hashCode();
    }

    public final String toString() {
        String obj = this.f309172a.toString();
        String obj2 = this.f309173b.toString();
        String obj3 = this.f309174c.toString();
        String str = this.f309175d;
        String str2 = this.f309176e;
        String num = Integer.toString(this.f309179h - 1);
        String obj4 = this.f309177f.toString();
        String obj5 = this.f309178g.toString();
        return "TapasAppAction{checkEligibilityPerformer=" + obj + ", checkAvailabilityPerformer=" + obj2 + ", extractParameterMapPerformer=" + obj3 + ", packageName=" + str + ", subtitle=" + str2 + ", category=" + num + ", customizedTypeaheadPrefixes=" + obj4 + ", customizedSupportedActionTypes=" + obj5 + "}";
    }
}
