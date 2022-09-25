package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.an */
/* compiled from: PG */
public final class C114983an extends C115061f {

    /* renamed from: a */
    private final C58833ax f319138a;

    public C114983an(C58833ax axVar) {
        this.f319138a = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo101781a() {
        return this.f319138a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C115061f) {
            return this.f319138a.equals(((C115061f) obj).mo101781a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f319138a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f319138a.toString();
        return "AmbientHeaderSectionData{contextualGreetingData=" + obj + "}";
    }
}
