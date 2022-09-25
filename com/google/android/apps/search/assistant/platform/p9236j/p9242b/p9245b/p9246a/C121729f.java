package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9246a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.a.f */
/* compiled from: PG */
public final class C121729f implements C121728e {

    /* renamed from: a */
    private final String f337775a;

    /* renamed from: b */
    private final C121731h f337776b;

    public C121729f(String str, C121731h hVar) {
        C69664n.m101061g(str, "resource");
        C69664n.m101061g(hVar, "interaction");
        this.f337775a = str;
        this.f337776b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121729f)) {
            return false;
        }
        C121729f fVar = (C121729f) obj;
        return C69664n.m101066l(this.f337775a, fVar.f337775a) && this.f337776b == fVar.f337776b;
    }

    public final int hashCode() {
        return (this.f337775a.hashCode() * 31) + this.f337776b.hashCode();
    }

    public final String toString() {
        String str = this.f337775a;
        C121731h hVar = this.f337776b;
        return str + ": " + hVar;
    }
}
