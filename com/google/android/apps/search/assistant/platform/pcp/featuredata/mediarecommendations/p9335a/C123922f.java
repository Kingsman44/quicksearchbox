package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a;

import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.f */
/* compiled from: PG */
public final class C123922f implements C123923g {

    /* renamed from: a */
    private final C123918b f342283a;

    /* renamed from: b */
    private final C18913ab f342284b;

    public C123922f(C123918b bVar, C18913ab abVar) {
        C69664n.m101061g(bVar, "appHeadphoneContext");
        this.f342283a = bVar;
        this.f342284b = abVar;
    }

    /* renamed from: a */
    public final C123918b mo106181a() {
        return this.f342283a;
    }

    /* renamed from: b */
    public final C18913ab mo106185b() {
        return this.f342284b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123922f)) {
            return false;
        }
        C123922f fVar = (C123922f) obj;
        return C69664n.m101066l(this.f342283a, fVar.f342283a) && C69664n.m101066l(this.f342284b, fVar.f342284b);
    }

    public final int hashCode() {
        int hashCode = this.f342283a.hashCode() * 31;
        C18913ab abVar = this.f342284b;
        return hashCode + (abVar == null ? 0 : abVar.hashCode());
    }

    public final String toString() {
        C123918b bVar = this.f342283a;
        C18913ab abVar = this.f342284b;
        return "FromQuery(appHeadphoneContext=" + bVar + ", onDeviceMediaItems=" + abVar + ")";
    }
}
