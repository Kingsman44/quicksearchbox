package com.google.android.apps.search.googleapp.p10338l.p10339a;

import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.ac */
/* compiled from: PG */
public final class C136380ac {

    /* renamed from: a */
    public final Map f371297a;

    /* renamed from: b */
    public final Map f371298b;

    /* renamed from: c */
    public final Map f371299c;

    public C136380ac(Map map, Map map2, Map map3) {
        this.f371297a = map;
        this.f371298b = map2;
        this.f371299c = map3;
    }

    /* renamed from: a */
    public final C136380ac mo112957a(C136380ac acVar) {
        C69664n.m101061g(acVar, "other");
        return new C136380ac(C69505av.m100872n(this.f371297a, acVar.f371297a), C69505av.m100872n(this.f371298b, acVar.f371298b), C69505av.m100872n(this.f371299c, acVar.f371299c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136380ac)) {
            return false;
        }
        C136380ac acVar = (C136380ac) obj;
        return C69664n.m101066l(this.f371297a, acVar.f371297a) && C69664n.m101066l(this.f371298b, acVar.f371298b) && C69664n.m101066l(this.f371299c, acVar.f371299c);
    }

    public final int hashCode() {
        return (((this.f371297a.hashCode() * 31) + this.f371298b.hashCode()) * 31) + this.f371299c.hashCode();
    }

    public final String toString() {
        Map map = this.f371297a;
        Map map2 = this.f371298b;
        Map map3 = this.f371299c;
        return "StateDumpCollectables(keyValue=" + map + ", complex=" + map2 + ", complexItems=" + map3 + ")";
    }
}
