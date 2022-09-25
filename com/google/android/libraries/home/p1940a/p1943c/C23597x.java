package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.x */
/* compiled from: PG */
public final class C23597x implements C23571er {

    /* renamed from: a */
    public static final C23596w f64617a = new C23596w();

    /* renamed from: b */
    public static final C23595v f64618b;

    /* renamed from: c */
    public static final C23599z f64619c = C23598y.m44038b(0, false, 6);

    /* renamed from: d */
    public static final C23593t f64620d = C23592s.m44026b();

    /* renamed from: e */
    private final C23574eu f64621e;

    /* renamed from: f */
    private final C23595v f64622f;

    /* renamed from: g */
    private final C23599z f64623g;

    /* renamed from: h */
    private final C23593t f64624h;

    /* renamed from: i */
    private final boolean f64625i;

    /* renamed from: j */
    private final boolean f64626j;

    /* renamed from: k */
    private final C23553e f64627k;

    static {
        C23595v vVar = new C23595v(0, false);
        vVar.f64616b = BuildConfig.FLAVOR;
        f64618b = vVar;
    }

    public C23597x(C23574eu euVar, C23595v vVar, C23599z zVar, C23593t tVar, boolean z, boolean z2, C23553e eVar) {
        C69664n.m101061g(euVar, "valueType");
        C69664n.m101061g(vVar, "colorRGBParameter");
        C69664n.m101061g(zVar, "colorTemperatureParameter");
        C69664n.m101061g(tVar, "colorHsvParameter");
        this.f64621e = euVar;
        this.f64622f = vVar;
        this.f64623g = zVar;
        this.f64624h = tVar;
        this.f64625i = z;
        this.f64626j = z2;
        this.f64627k = eVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return this.f64621e;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100947e(this.f64622f, this.f64623g, this.f64624h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23597x)) {
            return false;
        }
        C23597x xVar = (C23597x) obj;
        return this.f64621e == xVar.f64621e && C69664n.m101066l(this.f64622f, xVar.f64622f) && C69664n.m101066l(this.f64623g, xVar.f64623g) && C69664n.m101066l(this.f64624h, xVar.f64624h) && this.f64625i == xVar.f64625i && this.f64626j == xVar.f64626j && C69664n.m101066l(this.f64627k, xVar.f64627k);
    }

    public final int hashCode() {
        return (((((((((((this.f64621e.hashCode() * 31) + this.f64622f.hashCode()) * 31) + this.f64623g.hashCode()) * 31) + this.f64624h.hashCode()) * 31) + (this.f64625i ? 1 : 0)) * 31) + (this.f64626j ? 1 : 0)) * 31) + this.f64627k.f64463a.hashCode();
    }

    public final String toString() {
        C23574eu euVar = this.f64621e;
        C23595v vVar = this.f64622f;
        C23599z zVar = this.f64623g;
        C23593t tVar = this.f64624h;
        boolean z = this.f64625i;
        boolean z2 = this.f64626j;
        C23553e eVar = this.f64627k;
        return "HomeAutomationColorSettingTrait(valueType=" + euVar + ", colorRGBParameter=" + vVar + ", colorTemperatureParameter=" + zVar + ", colorHsvParameter=" + tVar + ", hasColorRgb=" + z + ", hasColorTemperature=" + z2 + ", colorSettingAttributes=" + eVar + ")";
    }
}
