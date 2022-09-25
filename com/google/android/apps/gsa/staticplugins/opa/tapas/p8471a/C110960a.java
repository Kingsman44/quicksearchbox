package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.a */
/* compiled from: PG */
public final class C110960a extends C111056f {

    /* renamed from: a */
    public C111058h f309119a;

    /* renamed from: b */
    public C111057g f309120b;

    /* renamed from: c */
    public C111060j f309121c;

    /* renamed from: d */
    public String f309122d;

    /* renamed from: e */
    public String f309123e;

    /* renamed from: f */
    public C58485gu f309124f;

    /* renamed from: g */
    public C58485gu f309125g;

    /* renamed from: h */
    public int f309126h;

    /* renamed from: a */
    public final C111062l mo98985a() {
        C111057g gVar;
        C111060j jVar;
        String str;
        String str2;
        int i;
        C58485gu guVar;
        C58485gu guVar2;
        C111058h hVar = this.f309119a;
        if (hVar != null && (gVar = this.f309120b) != null && (jVar = this.f309121c) != null && (str = this.f309122d) != null && (str2 = this.f309123e) != null && (i = this.f309126h) != 0 && (guVar = this.f309124f) != null && (guVar2 = this.f309125g) != null) {
            return new C110989b(hVar, gVar, jVar, str, str2, i, guVar, guVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f309119a == null) {
            sb.append(" checkEligibilityPerformer");
        }
        if (this.f309120b == null) {
            sb.append(" checkAvailabilityPerformer");
        }
        if (this.f309121c == null) {
            sb.append(" extractParameterMapPerformer");
        }
        if (this.f309122d == null) {
            sb.append(" packageName");
        }
        if (this.f309123e == null) {
            sb.append(" subtitle");
        }
        if (this.f309126h == 0) {
            sb.append(" category");
        }
        if (this.f309124f == null) {
            sb.append(" customizedTypeaheadPrefixes");
        }
        if (this.f309125g == null) {
            sb.append(" customizedSupportedActionTypes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
