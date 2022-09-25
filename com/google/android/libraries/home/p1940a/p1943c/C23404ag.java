package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import java.util.Map;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ag */
/* compiled from: PG */
public final class C23404ag {

    /* renamed from: a */
    public final C23416as f63965a;

    /* renamed from: b */
    public final Map f63966b;

    /* renamed from: c */
    private final boolean f63967c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23404ag(com.google.android.libraries.home.p1940a.p1943c.C23416as r4, java.util.Collection r5) {
        /*
            r3 = this;
            java.lang.String r0 = "traits"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            r0 = 10
            int r0 = p5462h.p5463a.C69540x.m100804k(r5, r0)
            int r0 = p5462h.p5463a.C69505av.m100860b(r0)
            r1 = 16
            if (r0 >= r1) goto L_0x0018
            r0 = 16
        L_0x0018:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x0021:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.google.android.libraries.home.a.c.er r2 = (com.google.android.libraries.home.p1940a.p1943c.C23571er) r2
            com.google.android.libraries.home.a.c.eu r2 = r2.mo28848a()
            r1.put(r2, r0)
            goto L_0x0021
        L_0x0036:
            com.google.common.b.hd r5 = com.google.common.p4522b.C58495hd.m89898l(r1)
            java.lang.String r0 = "copyOf(traits.associateBy { it.type() })"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            r3.<init>((com.google.android.libraries.home.p1940a.p1943c.C23416as) r4, (java.util.Map) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1940a.p1943c.C23404ag.<init>(com.google.android.libraries.home.a.c.as, java.util.Collection):void");
    }

    public C23404ag(C23416as asVar, Map map) {
        C69664n.m101061g(map, "traitMap");
        this.f63965a = asVar;
        this.f63966b = map;
        this.f63967c = true;
    }

    /* renamed from: a */
    public final Optional mo28854a(C23574eu euVar, Class cls) {
        C69664n.m101061g(euVar, "type");
        C23571er erVar = (C23571er) this.f63966b.get(euVar);
        if (cls.isInstance(erVar)) {
            C23571er erVar2 = (C23571er) cls.cast(erVar);
            Optional of = erVar2 != null ? Optional.m71637of(erVar2) : null;
            if (of != null) {
                return of;
            }
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "empty()");
            return empty;
        }
        Optional empty2 = Optional.empty();
        C69664n.m101060f(empty2, "empty()");
        return empty2;
    }

    /* renamed from: b */
    public final Collection mo28855b() {
        return this.f63966b.values();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23404ag)) {
            return false;
        }
        C23404ag agVar = (C23404ag) obj;
        if (!C69664n.m101066l(this.f63965a, agVar.f63965a) || !C69664n.m101066l(this.f63966b, agVar.f63966b)) {
            return false;
        }
        boolean z = agVar.f63967c;
        return true;
    }

    public final int hashCode() {
        return (((this.f63965a.hashCode() * 31) + this.f63966b.hashCode()) * 31) + 1;
    }

    public final String toString() {
        C23416as asVar = this.f63965a;
        Map map = this.f63966b;
        return "HomeAutomationDevice(deviceStateless=" + asVar + ", traitMap=" + map + ", isStale=true)";
    }
}
