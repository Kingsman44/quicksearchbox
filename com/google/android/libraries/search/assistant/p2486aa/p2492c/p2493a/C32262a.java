package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a */
/* compiled from: PG */
final class C32262a {

    /* renamed from: a */
    public final C32603b f86501a;

    /* renamed from: b */
    public final C32310f f86502b;

    public C32262a(C32603b bVar, C32310f fVar) {
        C69664n.m101061g(bVar, "accessSession");
        this.f86501a = bVar;
        this.f86502b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32262a)) {
            return false;
        }
        C32262a aVar = (C32262a) obj;
        return C69664n.m101066l(this.f86501a, aVar.f86501a) && C69664n.m101066l(this.f86502b, aVar.f86502b);
    }

    public final int hashCode() {
        return (this.f86501a.hashCode() * 31) + this.f86502b.hashCode();
    }

    public final String toString() {
        C32603b bVar = this.f86501a;
        C32310f fVar = this.f86502b;
        return "AccessSessionWithCallback(accessSession=" + bVar + ", callbacks=" + fVar + ")";
    }
}
