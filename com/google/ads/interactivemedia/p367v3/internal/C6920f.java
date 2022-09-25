package com.google.ads.interactivemedia.p367v3.internal;

import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.f */
/* compiled from: PG */
public final class C6920f {

    /* renamed from: a */
    private final C7109m f22078a;

    /* renamed from: b */
    private final C7109m f22079b;

    /* renamed from: c */
    private final C7028j f22080c;

    /* renamed from: d */
    private final C7082l f22081d;

    private C6920f(C7028j jVar, C7082l lVar, C7109m mVar, C7109m mVar2) {
        this.f22080c = jVar;
        this.f22081d = lVar;
        this.f22078a = mVar;
        if (mVar2 == null) {
            this.f22079b = C7109m.NONE;
        } else {
            this.f22079b = mVar2;
        }
    }

    /* renamed from: b */
    public static C6920f m20358b(C7028j jVar, C7082l lVar, C7109m mVar, C7109m mVar2) {
        C7009ih.m20724b(jVar, "CreativeType is null");
        C7009ih.m20724b(lVar, "ImpressionType is null");
        C7009ih.m20724b(mVar, "Impression owner is null");
        if (mVar == C7109m.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (jVar == C7028j.DEFINED_BY_JAVASCRIPT && mVar == C7109m.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (lVar != C7082l.DEFINED_BY_JAVASCRIPT || mVar != C7109m.NATIVE) {
            return new C6920f(jVar, lVar, mVar, mVar2);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public final JSONObject mo15861a() {
        JSONObject jSONObject = new JSONObject();
        C6789ah.m18702d(jSONObject, "impressionOwner", this.f22078a);
        if (this.f22080c == null || this.f22081d == null) {
            C6789ah.m18702d(jSONObject, "videoEventsOwner", this.f22079b);
        } else {
            C6789ah.m18702d(jSONObject, "mediaEventsOwner", this.f22079b);
            C6789ah.m18702d(jSONObject, "creativeType", this.f22080c);
            C6789ah.m18702d(jSONObject, "impressionType", this.f22081d);
        }
        C6789ah.m18702d(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
