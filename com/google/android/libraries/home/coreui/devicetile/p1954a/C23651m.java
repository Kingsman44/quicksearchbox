package com.google.android.libraries.home.coreui.devicetile.p1954a;

import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.a.m */
/* compiled from: PG */
public final class C23651m extends C23642d {

    /* renamed from: a */
    public final String f64686a;

    /* renamed from: b */
    public final C23642d f64687b;

    /* renamed from: c */
    public final C23649k f64688c;

    /* renamed from: d */
    public final C23649k f64689d;

    /* renamed from: e */
    private final Set f64690e;

    /* renamed from: f */
    private final String f64691f = null;

    /* renamed from: g */
    private final C23650l f64692g = null;

    /* renamed from: h */
    private final boolean f64693h = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23651m(String str, C23642d dVar, C23649k kVar, C23649k kVar2, Set set) {
        super((String) null, false, 15);
        C69664n.m101061g(str, "templateId");
        C69664n.m101061g(kVar, "currentMode");
        C69664n.m101061g(kVar2, "currentActiveMode");
        C69664n.m101061g(set, "modes");
        this.f64686a = str;
        this.f64687b = dVar;
        this.f64688c = kVar;
        this.f64689d = kVar2;
        this.f64690e = set;
        if (kVar != C23649k.UNKNOWN && !set.contains(kVar)) {
            throw new IllegalArgumentException("Mode " + kVar + " not supported.");
        } else if (kVar2 != C23649k.UNKNOWN && !set.contains(kVar2)) {
            throw new IllegalArgumentException("Mode " + kVar2 + " not supported.");
        }
    }

    /* renamed from: a */
    public final String mo28966a() {
        return this.f64686a;
    }

    /* renamed from: b */
    public final boolean mo28976b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23651m)) {
            return false;
        }
        C23651m mVar = (C23651m) obj;
        if (!C69664n.m101066l(this.f64686a, mVar.f64686a) || !C69664n.m101066l(this.f64687b, mVar.f64687b) || this.f64688c != mVar.f64688c || this.f64689d != mVar.f64689d || !C69664n.m101066l(this.f64690e, mVar.f64690e)) {
            return false;
        }
        String str = mVar.f64691f;
        if (!C69664n.m101066l((Object) null, (Object) null)) {
            return false;
        }
        C23650l lVar = mVar.f64692g;
        if (!C69664n.m101066l((Object) null, (Object) null)) {
            return false;
        }
        boolean z = mVar.f64693h;
        return true;
    }

    public final int hashCode() {
        return (((((((((this.f64686a.hashCode() * 31) + this.f64687b.hashCode()) * 31) + this.f64688c.hashCode()) * 31) + this.f64689d.hashCode()) * 31) + this.f64690e.hashCode()) * 923521) + 1;
    }

    public final String toString() {
        String str = this.f64686a;
        C23642d dVar = this.f64687b;
        C23649k kVar = this.f64688c;
        C23649k kVar2 = this.f64689d;
        Set set = this.f64690e;
        return "TemperatureControlTemplate(templateId=" + str + ", template=" + dVar + ", currentMode=" + kVar + ", currentActiveMode=" + kVar2 + ", modes=" + set + ", temperatureControlText=null, temperatureControlSetPoint=null, tapToToggleSetPoints=false, readonly=true)";
    }
}
