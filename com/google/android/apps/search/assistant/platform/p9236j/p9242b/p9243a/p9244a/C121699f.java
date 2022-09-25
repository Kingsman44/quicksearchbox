package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a;

import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.a.a.f */
/* compiled from: PG */
public final class C121699f {

    /* renamed from: a */
    public final C121700g f337650a;

    /* renamed from: b */
    public final Map f337651b;

    /* renamed from: c */
    public final boolean f337652c;

    public C121699f(C121700g gVar, Map map) {
        C69664n.m101061g(gVar, "status");
        C69664n.m101061g(map, "resources");
        this.f337650a = gVar;
        this.f337651b = map;
        C121700g gVar2 = C121700g.IMPLICIT;
        int ordinal = gVar.ordinal();
        boolean z = false;
        if (!(ordinal == 0 || ordinal == 1)) {
            z = true;
        }
        this.f337652c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121699f)) {
            return false;
        }
        C121699f fVar = (C121699f) obj;
        return this.f337650a == fVar.f337650a && C69664n.m101066l(this.f337651b, fVar.f337651b);
    }

    public final int hashCode() {
        return (this.f337650a.hashCode() * 31) + this.f337651b.hashCode();
    }

    public final String toString() {
        C121700g gVar = this.f337650a;
        Map map = this.f337651b;
        return "InvocationState(status=" + gVar + ", resources=" + map + ")";
    }
}
