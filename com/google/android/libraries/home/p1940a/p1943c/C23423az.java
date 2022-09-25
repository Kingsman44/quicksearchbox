package com.google.android.libraries.home.p1940a.p1943c;

import java.util.Collection;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.az */
/* compiled from: PG */
public final class C23423az implements C23571er {

    /* renamed from: a */
    public static final C23422ay f64142a = new C23422ay();

    /* renamed from: b */
    private final Map f64143b;

    /* renamed from: c */
    private final C23574eu f64144c;

    /* renamed from: d */
    private final C23421ax f64145d;

    public C23423az(Map map, C23574eu euVar, C23421ax axVar) {
        C69664n.m101061g(euVar, "traitType");
        C69664n.m101061g(axVar, "dockParameter");
        this.f64143b = map;
        this.f64144c = euVar;
        this.f64145d = axVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return this.f64144c;
    }

    /* renamed from: b */
    public final /* synthetic */ Collection mo28849b() {
        return C69540x.m100944b(this.f64145d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23423az)) {
            return false;
        }
        C23423az azVar = (C23423az) obj;
        return C69664n.m101066l(this.f64143b, azVar.f64143b) && this.f64144c == azVar.f64144c && C69664n.m101066l(this.f64145d, azVar.f64145d);
    }

    public final int hashCode() {
        return (((this.f64143b.hashCode() * 31) + this.f64144c.hashCode()) * 31) + this.f64145d.hashCode();
    }

    public final String toString() {
        Map map = this.f64143b;
        C23574eu euVar = this.f64144c;
        C23421ax axVar = this.f64145d;
        return "HomeAutomationDockTrait(parameterMap=" + map + ", traitType=" + euVar + ", dockParameter=" + axVar + ")";
    }
}
