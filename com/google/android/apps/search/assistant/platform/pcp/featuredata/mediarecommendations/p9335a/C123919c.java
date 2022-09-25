package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a;

import android.content.ComponentName;
import com.google.assistant.p3994s.p3995a.C53306j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.c */
/* compiled from: PG */
public final class C123919c {

    /* renamed from: a */
    public final ComponentName f342278a;

    /* renamed from: b */
    public final C53306j f342279b;

    public C123919c(ComponentName componentName, C53306j jVar) {
        C69664n.m101061g(componentName, "componentName");
        C69664n.m101061g(jVar, "clientType");
        this.f342278a = componentName;
        this.f342279b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123919c)) {
            return false;
        }
        C123919c cVar = (C123919c) obj;
        return C69664n.m101066l(this.f342278a, cVar.f342278a) && this.f342279b == cVar.f342279b;
    }

    public final int hashCode() {
        return (this.f342278a.hashCode() * 31) + this.f342279b.hashCode();
    }

    public final String toString() {
        ComponentName componentName = this.f342278a;
        C53306j jVar = this.f342279b;
        return "MbsQueryParam(componentName=" + componentName + ", clientType=" + jVar + ")";
    }
}
