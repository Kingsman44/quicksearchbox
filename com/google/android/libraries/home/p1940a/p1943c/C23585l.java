package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.l */
/* compiled from: PG */
public final class C23585l implements C23571er {

    /* renamed from: a */
    public static final C23584k f64604a = new C23584k();

    /* renamed from: b */
    public static final C23583j f64605b = new C23583j(0, false);

    /* renamed from: c */
    public final C23583j f64606c;

    public C23585l(C23583j jVar) {
        C69664n.m101061g(jVar, "brightnessParameter");
        this.f64606c = jVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return C23574eu.BRIGHTNESS;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100944b(this.f64606c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23585l) && C69664n.m101066l(this.f64606c, ((C23585l) obj).f64606c);
    }

    public final int hashCode() {
        return this.f64606c.hashCode();
    }

    public final String toString() {
        C23583j jVar = this.f64606c;
        return "HomeAutomationBrightnessTrait(brightnessParameter=" + jVar + ")";
    }
}
