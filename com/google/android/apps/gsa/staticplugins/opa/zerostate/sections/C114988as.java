package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.as */
/* compiled from: PG */
public final class C114988as extends C114982am {

    /* renamed from: a */
    private final C58833ax f319146a;

    /* renamed from: b */
    private final C58833ax f319147b;

    /* renamed from: c */
    private final C58833ax f319148c;

    public C114988as(C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f319146a = axVar;
        this.f319147b = axVar2;
        this.f319148c = axVar3;
    }

    /* renamed from: a */
    public final C58833ax mo101778a() {
        return this.f319146a;
    }

    /* renamed from: c */
    public final C58833ax mo101779c() {
        return this.f319148c;
    }

    /* renamed from: d */
    public final C58833ax mo101780d() {
        return this.f319147b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C114982am) {
            C114982am amVar = (C114982am) obj;
            return this.f319146a.equals(amVar.mo101778a()) && this.f319147b.equals(amVar.mo101780d()) && this.f319148c.equals(amVar.mo101779c());
        }
    }

    public final int hashCode() {
        return ((((this.f319146a.hashCode() ^ 1000003) * 1000003) ^ this.f319147b.hashCode()) * 1000003) ^ this.f319148c.hashCode();
    }

    public final String toString() {
        String obj = this.f319146a.toString();
        String obj2 = this.f319147b.toString();
        String obj3 = this.f319148c.toString();
        return "AmbientTaskSectionData{agendaData=" + obj + ", weatherData=" + obj2 + ", flightStatusData=" + obj3 + "}";
    }
}
