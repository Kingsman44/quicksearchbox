package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.aq */
/* compiled from: PG */
final class C114986aq extends C115080y {

    /* renamed from: a */
    public final C58833ax f319141a;

    public C114986aq(C58833ax axVar) {
        this.f319141a = axVar;
    }

    /* renamed from: a */
    public final C115079x mo101791a() {
        return new C114985ap(this);
    }

    /* renamed from: c */
    public final C58833ax mo101792c() {
        return this.f319141a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C115080y) {
            return this.f319141a.equals(((C115080y) obj).mo101792c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f319141a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f319141a);
        return "AmbientShortcutSectionData{homeControlData=" + valueOf + "}";
    }
}
