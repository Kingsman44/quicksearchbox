package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ao */
/* compiled from: PG */
public final class C125662ao extends C125693z {

    /* renamed from: a */
    public final C125666as f346332a;

    /* renamed from: b */
    public final String f346333b;

    public C125662ao(C125666as asVar, String str) {
        this.f346332a = asVar;
        this.f346333b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125662ao)) {
            return false;
        }
        C125662ao aoVar = (C125662ao) obj;
        return this.f346332a == aoVar.f346332a && C69664n.m101066l(this.f346333b, aoVar.f346333b);
    }

    public final int hashCode() {
        return (this.f346332a.hashCode() * 31) + this.f346333b.hashCode();
    }

    public final String toString() {
        C125666as asVar = this.f346332a;
        String str = this.f346333b;
        return "SetField(field=" + asVar + ", value=" + str + ")";
    }
}
