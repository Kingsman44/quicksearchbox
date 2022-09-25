package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.b.b */
/* compiled from: PG */
public final class C121494b extends C121502j {

    /* renamed from: a */
    public final C121501i f337167a;

    /* renamed from: b */
    public final String f337168b;

    /* renamed from: c */
    public final C58485gu f337169c;

    public C121494b(C121501i iVar, String str, C58485gu guVar) {
        this.f337167a = iVar;
        this.f337168b = str;
        this.f337169c = guVar;
    }

    /* renamed from: a */
    public final C121501i mo105197a() {
        return this.f337167a;
    }

    /* renamed from: b */
    public final C58485gu mo105198b() {
        return this.f337169c;
    }

    /* renamed from: c */
    public final String mo105199c() {
        return this.f337168b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121502j) {
            C121502j jVar = (C121502j) obj;
            return this.f337167a.equals(jVar.mo105197a()) && this.f337168b.equals(jVar.mo105199c()) && C58597ky.m90218i(this.f337169c, jVar.mo105198b());
        }
    }

    public final int hashCode() {
        return ((((this.f337167a.hashCode() ^ 1000003) * 1000003) ^ this.f337168b.hashCode()) * 1000003) ^ this.f337169c.hashCode();
    }

    public final String toString() {
        String obj = this.f337167a.toString();
        String str = this.f337168b;
        String obj2 = this.f337169c.toString();
        return "Metadata{label=" + obj + ", deviceModel=" + str + ", context=" + obj2 + "}";
    }
}
