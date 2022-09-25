package com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c;

import com.google.p4283bv.p4287b.p4342b.C56943g;
import java.util.Locale;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.c.a */
/* compiled from: PG */
public final class C40510a {

    /* renamed from: a */
    private final C56943g f106289a;

    /* renamed from: b */
    private final Locale f106290b;

    /* renamed from: c */
    private final Map f106291c;

    public C40510a() {
        this((byte[]) null);
    }

    public C40510a(C56943g gVar, Locale locale, Map map) {
        C69664n.m101061g(gVar, "xBlendAddress");
        C69664n.m101061g(locale, "locale");
        C69664n.m101061g(map, "queryParams");
        this.f106289a = gVar;
        this.f106290b = locale;
        this.f106291c = map;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C40510a(byte[] r3) {
        /*
            r2 = this;
            com.google.bv.b.b.g r3 = com.google.p4283bv.p4287b.p4342b.C56943g.f151982f
            java.lang.String r0 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = "getDefault()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            h.a.an r1 = p5462h.p5463a.C69497an.f185919a
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c.C40510a.<init>(byte[]):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40510a)) {
            return false;
        }
        C40510a aVar = (C40510a) obj;
        return C69664n.m101066l(this.f106289a, aVar.f106289a) && C69664n.m101066l(this.f106290b, aVar.f106290b) && C69664n.m101066l(this.f106291c, aVar.f106291c);
    }

    public final int hashCode() {
        return (((this.f106289a.hashCode() * 31) + this.f106290b.hashCode()) * 31) + this.f106291c.hashCode();
    }

    public final String toString() {
        C56943g gVar = this.f106289a;
        Locale locale = this.f106290b;
        Map map = this.f106291c;
        return "CacheAddress(xBlendAddress=" + gVar + ", locale=" + locale + ", queryParams=" + map + ")";
    }
}
