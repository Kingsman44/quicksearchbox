package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import java.util.Map;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.dj */
/* compiled from: PG */
public final class C23536dj implements C23571er {

    /* renamed from: a */
    public static final C23535di f64289a = new C23535di();

    /* renamed from: b */
    private final C23553e f64290b;

    /* renamed from: c */
    private final Map f64291c;

    /* renamed from: d */
    private final C23540dn f64292d;

    /* renamed from: e */
    private final C23538dl f64293e;

    /* renamed from: f */
    private final C23534dh f64294f;

    public C23536dj(C23553e eVar, Map map, C23540dn dnVar, C23538dl dlVar, C23534dh dhVar) {
        this.f64290b = eVar;
        this.f64291c = map;
        this.f64292d = dnVar;
        this.f64293e = dlVar;
        this.f64294f = dhVar;
        Object orElse = eVar.mo28920c("openDirection", String[].class).orElse((Object[]) new String[0]);
        C69664n.m101060f(orElse, "attributes\n        .getV…    .orElse(emptyArray())");
        C69531o.m100937n((Object[]) orElse);
        Boolean bool = (Boolean) eVar.mo28920c("queryOnlyOpenClose", Boolean.class).orElse(false);
        C69664n.m101060f(bool, "parseQueryOnlyAttribute(attributes)");
        bool.booleanValue();
        Boolean bool2 = (Boolean) eVar.mo28920c("discreteOnlyOpenClose", Boolean.class).orElse(false);
        C69664n.m101060f(bool2, "parseDiscreteOnlyOpenCloseAttribute(attributes)");
        bool2.booleanValue();
        Boolean bool3 = (Boolean) eVar.mo28920c("commandOnlyOpenClose", Boolean.class).orElse(false);
        C69664n.m101060f(bool3, "parseCommandOnlyAttribute(attributes)");
        bool3.booleanValue();
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.OPEN_CLOSE;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Collection mo28849b() {
        return C69540x.m100947e(this.f64292d, this.f64293e, this.f64294f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23536dj)) {
            return false;
        }
        C23536dj djVar = (C23536dj) obj;
        return C69664n.m101066l(this.f64290b, djVar.f64290b) && C69664n.m101066l(this.f64291c, djVar.f64291c) && C69664n.m101066l(this.f64292d, djVar.f64292d) && C69664n.m101066l(this.f64293e, djVar.f64293e) && C69664n.m101066l(this.f64294f, djVar.f64294f);
    }

    public final int hashCode() {
        return (((((((this.f64290b.f64463a.hashCode() * 31) + this.f64291c.hashCode()) * 31) + this.f64292d.hashCode()) * 31) + this.f64293e.hashCode()) * 31) + this.f64294f.hashCode();
    }

    public final String toString() {
        C23553e eVar = this.f64290b;
        Map map = this.f64291c;
        C23540dn dnVar = this.f64292d;
        C23538dl dlVar = this.f64293e;
        C23534dh dhVar = this.f64294f;
        return "HomeAutomationOpenCloseTrait(attributes=" + eVar + ", parameterMap=" + map + ", openPercentParameter=" + dnVar + ", openDirectionParameter=" + dlVar + ", stateParameter=" + dhVar + ")";
    }
}
