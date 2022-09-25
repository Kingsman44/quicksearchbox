package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Map;
import p3186j$.util.Optional;
import p5462h.p5463a.C69497an;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.e */
/* compiled from: PG */
public final class C23553e {

    /* renamed from: a */
    public final Map f64463a;

    static {
        new C23553e(C69497an.f185919a);
    }

    public C23553e(Map map) {
        C69664n.m101061g(map, "attributeMap");
        this.f64463a = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        r2 = (com.google.android.libraries.home.p1940a.p1943c.C23526d) r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo28918a(java.lang.String r5, java.lang.Class r6) {
        /*
            r4 = this;
            java.util.Map r0 = r4.f64463a
            java.lang.Object r5 = r0.get(r5)
            com.google.android.libraries.home.a.c.d r5 = (com.google.android.libraries.home.p1940a.p1943c.C23526d) r5
            java.lang.String r0 = "empty()"
            if (r5 == 0) goto L_0x005e
            java.lang.Object r1 = r5.f64279a
            boolean r1 = r1 instanceof java.util.List
            if (r1 != 0) goto L_0x0013
            goto L_0x005e
        L_0x0013:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r5 = r5.f64279a
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0020:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0054
            java.lang.Object r2 = r5.next()
            boolean r3 = r2 instanceof com.google.android.libraries.home.p1940a.p1943c.C23526d
            if (r3 == 0) goto L_0x004c
            com.google.android.libraries.home.a.c.d r2 = (com.google.android.libraries.home.p1940a.p1943c.C23526d) r2
            java.lang.Object r3 = r2.f64279a
            if (r3 == 0) goto L_0x004c
            java.lang.Class r3 = r3.getClass()
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r6)
            if (r3 != 0) goto L_0x003f
            goto L_0x004c
        L_0x003f:
            java.lang.Object r2 = r2.f64279a
            java.lang.Object r2 = r6.cast(r2)
            p5462h.p5473f.p5475b.C69664n.m101058d(r2)
            r1.add(r2)
            goto L_0x0020
        L_0x004c:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        L_0x0054:
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r1)
            java.lang.String r6 = "of(list)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            return r5
        L_0x005e:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1940a.p1943c.C23553e.mo28918a(java.lang.String, java.lang.Class):j$.util.Optional");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r2 = (com.google.android.libraries.home.p1940a.p1943c.C23526d) r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo28919b(java.lang.String r6, java.lang.Class r7) {
        /*
            r5 = this;
            java.util.Map r0 = r5.f64463a
            java.lang.Object r6 = r0.get(r6)
            com.google.android.libraries.home.a.c.d r6 = (com.google.android.libraries.home.p1940a.p1943c.C23526d) r6
            java.lang.String r0 = "empty()"
            if (r6 == 0) goto L_0x0078
            java.lang.Object r1 = r6.f64279a
            boolean r1 = r1 instanceof java.util.Map
            if (r1 != 0) goto L_0x0013
            goto L_0x0078
        L_0x0013:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Object r6 = r6.f64279a
            java.util.Map r6 = (java.util.Map) r6
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0024:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof com.google.android.libraries.home.p1940a.p1943c.C23526d
            if (r4 != 0) goto L_0x0044
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        L_0x0044:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x0066
            com.google.android.libraries.home.a.c.d r2 = (com.google.android.libraries.home.p1940a.p1943c.C23526d) r2
            java.lang.Object r4 = r2.f64279a
            if (r4 == 0) goto L_0x0066
            java.lang.Class r4 = r4.getClass()
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r7)
            if (r4 != 0) goto L_0x0059
            goto L_0x0066
        L_0x0059:
            java.lang.Object r2 = r2.f64279a
            java.lang.Object r2 = r7.cast(r2)
            p5462h.p5473f.p5475b.C69664n.m101058d(r2)
            r1.put(r3, r2)
            goto L_0x0024
        L_0x0066:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        L_0x006e:
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r1)
            java.lang.String r7 = "of(map)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            return r6
        L_0x0078:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1940a.p1943c.C23553e.mo28919b(java.lang.String, java.lang.Class):j$.util.Optional");
    }

    /* renamed from: c */
    public final Optional mo28920c(String str, Class cls) {
        C23526d dVar = (C23526d) this.f64463a.get(str);
        if ((dVar != null ? dVar.f64279a : null) == null || !C69664n.m101066l(dVar.f64279a.getClass(), cls)) {
            Optional empty = Optional.empty();
            C69664n.m101060f(empty, "{\n      Optional.empty()\n    }");
            return empty;
        }
        Object cast = cls.cast(dVar.f64279a);
        C69664n.m101058d(cast);
        Optional of = Optional.m71637of(cast);
        C69664n.m101060f(of, "{\n      Optional.of<T>(c…buteValue.value)!!)\n    }");
        return of;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23553e) && C69664n.m101066l(this.f64463a, ((C23553e) obj).f64463a);
    }

    public final int hashCode() {
        return this.f64463a.hashCode();
    }

    public final String toString() {
        Map map = this.f64463a;
        return "HomeAutomationAttributes(attributeMap=" + map + ")";
    }
}
