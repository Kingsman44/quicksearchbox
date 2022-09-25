package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.an */
/* compiled from: PG */
public final class C121765an implements C121759ah {

    /* renamed from: a */
    public final String f337923a;

    /* renamed from: b */
    public final String f337924b;

    public C121765an(String str, String str2) {
        C69664n.m101061g(str2, "newRoute");
        this.f337923a = str;
        this.f337924b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121765an)) {
            return false;
        }
        C121765an anVar = (C121765an) obj;
        return C69664n.m101066l(this.f337923a, anVar.f337923a) && C69664n.m101066l(this.f337924b, anVar.f337924b);
    }

    public final int hashCode() {
        return (this.f337923a.hashCode() * 31) + this.f337924b.hashCode();
    }

    public final String toString() {
        String str = this.f337923a;
        String str2 = this.f337924b;
        return "AudioRouteUpdateEvent(oldRoute=" + str + ", newRoute=" + str2 + ")";
    }
}
