package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a;

import android.content.ComponentName;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.assistant.p3886c.p3887a.C50672h;
import com.google.assistant.p3994s.p3995a.C53306j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.b */
/* compiled from: PG */
public final class C123918b {

    /* renamed from: a */
    public final ComponentName f342275a;

    /* renamed from: b */
    public final C123919c f342276b;

    /* renamed from: c */
    private final C50672h f342277c;

    public C123918b(ComponentName componentName, C50672h hVar) {
        C106531e eVar;
        C53306j jVar;
        C69664n.m101061g(componentName, "componentName");
        this.f342275a = componentName;
        this.f342277c = hVar;
        if (hVar != null) {
            eVar = C106531e.m177306a(hVar.f131819b);
            if (eVar == null) {
                eVar = C106531e.UNKNOWN;
            }
        } else {
            eVar = null;
        }
        if (eVar != null && C123917a.f342274a[eVar.ordinal()] == 1) {
            jVar = C53306j.MORRIS;
        } else {
            jVar = C53306j.AMBIENT_ASSISTANT;
        }
        this.f342276b = new C123919c(componentName, jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123918b)) {
            return false;
        }
        C123918b bVar = (C123918b) obj;
        return C69664n.m101066l(this.f342275a, bVar.f342275a) && C69664n.m101066l(this.f342277c, bVar.f342277c);
    }

    public final int hashCode() {
        int hashCode = this.f342275a.hashCode() * 31;
        C50672h hVar = this.f342277c;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public final String toString() {
        ComponentName componentName = this.f342275a;
        C50672h hVar = this.f342277c;
        return "AppHeadphoneContext(componentName=" + componentName + ", headphoneContext=" + hVar + ")";
    }
}
