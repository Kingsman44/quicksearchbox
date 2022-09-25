package com.google.android.apps.search.googleapp.tabs.manager;

import com.google.android.apps.search.googleapp.p10117aa.C133125j;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.a */
/* compiled from: PG */
public final class C139713a {

    /* renamed from: a */
    public final C133125j f379754a;

    /* renamed from: b */
    public final boolean f379755b;

    /* renamed from: c */
    public final String f379756c;

    /* renamed from: d */
    public final String f379757d;

    /* renamed from: e */
    public final C63088z f379758e;

    /* renamed from: f */
    public final C63088z f379759f;

    /* renamed from: g */
    public final boolean f379760g;

    public C139713a(C133125j jVar, boolean z) {
        C69664n.m101061g(jVar, "tab");
        this.f379754a = jVar;
        this.f379755b = z;
        String str = jVar.f362922b;
        C69664n.m101060f(str, "tab.title");
        this.f379756c = str;
        String str2 = jVar.f362925e;
        C69664n.m101060f(str2, "tab.persistenceId");
        this.f379757d = str2;
        C63088z zVar = jVar.f362926f;
        C69664n.m101060f(zVar, "tab.screenshot");
        this.f379758e = zVar;
        C63088z zVar2 = jVar.f362927g;
        C69664n.m101060f(zVar2, "tab.favicon");
        this.f379759f = zVar2;
        this.f379760g = jVar.f362928h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C139713a)) {
            return false;
        }
        C139713a aVar = (C139713a) obj;
        return C69664n.m101066l(this.f379754a, aVar.f379754a) && this.f379755b == aVar.f379755b;
    }

    public final int hashCode() {
        return (this.f379754a.hashCode() * 31) + (this.f379755b ? 1 : 0);
    }

    public final String toString() {
        C133125j jVar = this.f379754a;
        boolean z = this.f379755b;
        return "DisplayTab(tab=" + jVar + ", isLastOpenedTab=" + z + ")";
    }
}
