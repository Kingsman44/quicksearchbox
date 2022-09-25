package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34174at;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.d.a */
/* compiled from: PG */
final class C34436a {

    /* renamed from: a */
    public final C34120b f91507a;

    /* renamed from: b */
    public final C34174at f91508b;

    /* renamed from: c */
    public final C34049bl f91509c;

    public C34436a(C34120b bVar, C34174at atVar, C34049bl blVar) {
        C69664n.m101061g(bVar, "details");
        C69664n.m101061g(atVar, "routing");
        C69664n.m101061g(blVar, "sourceState");
        this.f91507a = bVar;
        this.f91508b = atVar;
        this.f91509c = blVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34436a)) {
            return false;
        }
        C34436a aVar = (C34436a) obj;
        return C69664n.m101066l(this.f91507a, aVar.f91507a) && C69664n.m101066l(this.f91508b, aVar.f91508b) && C69664n.m101066l(this.f91509c, aVar.f91509c);
    }

    public final int hashCode() {
        return (((this.f91507a.hashCode() * 31) + this.f91508b.hashCode()) * 31) + this.f91509c.hashCode();
    }

    public final String toString() {
        C34120b bVar = this.f91507a;
        C34174at atVar = this.f91508b;
        C34049bl blVar = this.f91509c;
        return "PlatformConfigurationData(details=" + bVar + ", routing=" + atVar + ", sourceState=" + blVar + ")";
    }
}
