package com.google.android.libraries.search.assistant.invocation.p2587a.p2588a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.a.a.c */
/* compiled from: PG */
public final class C33485c {

    /* renamed from: a */
    public final String f89608a;

    /* renamed from: b */
    private final C33486d f89609b;

    public C33485c(C33486d dVar, String str) {
        C69664n.m101061g(dVar, "type");
        C69664n.m101061g(str, "description");
        this.f89609b = dVar;
        this.f89608a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33485c)) {
            return false;
        }
        C33485c cVar = (C33485c) obj;
        return this.f89609b == cVar.f89609b && C69664n.m101066l(this.f89608a, cVar.f89608a);
    }

    public final int hashCode() {
        return (this.f89609b.hashCode() * 31) + this.f89608a.hashCode();
    }

    public final String toString() {
        C33486d dVar = this.f89609b;
        String str = this.f89608a;
        return "Error(type=" + dVar + ", description=" + str + ")";
    }
}
