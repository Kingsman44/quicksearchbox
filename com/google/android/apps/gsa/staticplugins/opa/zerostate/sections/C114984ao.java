package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ao */
/* compiled from: PG */
public final class C114984ao extends C115070o {

    /* renamed from: a */
    private final C58833ax f319139a;

    public C114984ao(C58833ax axVar) {
        this.f319139a = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo101785a() {
        return this.f319139a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C115070o) {
            return this.f319139a.equals(((C115070o) obj).mo101785a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f319139a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f319139a.toString();
        return "AmbientMediaSectionData{mediaData=" + obj + "}";
    }
}
