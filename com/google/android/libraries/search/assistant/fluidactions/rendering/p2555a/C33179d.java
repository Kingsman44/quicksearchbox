package com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.a.d */
/* compiled from: PG */
public final class C33179d {

    /* renamed from: a */
    public final Context f88738a;

    /* renamed from: b */
    public final C33182g f88739b;

    /* renamed from: c */
    public final C51941eu f88740c;

    /* renamed from: d */
    public final C32953f f88741d;

    /* renamed from: e */
    public final Fragment f88742e;

    /* renamed from: f */
    public final C32951d f88743f;

    /* renamed from: g */
    public final C33184i f88744g;

    /* renamed from: h */
    public final C32942a f88745h;

    /* renamed from: i */
    public final C33170a f88746i;

    public C33179d(Context context, C33182g gVar, C51941eu euVar, C32953f fVar, Fragment fragment, C32951d dVar, C33184i iVar, C32942a aVar, C33170a aVar2) {
        C69664n.m101061g(euVar, "formField");
        C69664n.m101061g(fVar, "freeFormCallback");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(dVar, "fluidActionsConfig");
        C69664n.m101061g(iVar, "themeConfig");
        C69664n.m101061g(aVar2, "activityResultController");
        this.f88738a = context;
        this.f88739b = gVar;
        this.f88740c = euVar;
        this.f88741d = fVar;
        this.f88742e = fragment;
        this.f88743f = dVar;
        this.f88744g = iVar;
        this.f88745h = aVar;
        this.f88746i = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33179d)) {
            return false;
        }
        C33179d dVar = (C33179d) obj;
        return C69664n.m101066l(this.f88738a, dVar.f88738a) && C69664n.m101066l(this.f88739b, dVar.f88739b) && C69664n.m101066l(this.f88740c, dVar.f88740c) && C69664n.m101066l(this.f88741d, dVar.f88741d) && C69664n.m101066l(this.f88742e, dVar.f88742e) && C69664n.m101066l(this.f88743f, dVar.f88743f) && C69664n.m101066l(this.f88744g, dVar.f88744g) && C69664n.m101066l(this.f88745h, dVar.f88745h) && C69664n.m101066l(this.f88746i, dVar.f88746i);
    }

    public final int hashCode() {
        return (((((((((((((((this.f88738a.hashCode() * 31) + this.f88739b.hashCode()) * 31) + this.f88740c.hashCode()) * 31) + this.f88741d.hashCode()) * 31) + this.f88742e.hashCode()) * 31) + this.f88743f.hashCode()) * 31) + this.f88744g.hashCode()) * 31) + this.f88745h.hashCode()) * 31) + this.f88746i.hashCode();
    }

    public final String toString() {
        Context context = this.f88738a;
        C33182g gVar = this.f88739b;
        C51941eu euVar = this.f88740c;
        C32953f fVar = this.f88741d;
        Fragment fragment = this.f88742e;
        C32951d dVar = this.f88743f;
        C33184i iVar = this.f88744g;
        C32942a aVar = this.f88745h;
        C33170a aVar2 = this.f88746i;
        return "FieldRenderingContext(context=" + context + ", showNativeFormArgsHolder=" + gVar + ", formField=" + euVar + ", freeFormCallback=" + fVar + ", fragment=" + fragment + ", fluidActionsConfig=" + dVar + ", themeConfig=" + iVar + ", clientInputAdapter=" + aVar + ", activityResultController=" + aVar2 + ")";
    }
}
