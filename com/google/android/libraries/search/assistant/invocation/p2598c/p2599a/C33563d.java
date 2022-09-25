package com.google.android.libraries.search.assistant.invocation.p2598c.p2599a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.c.a.d */
/* compiled from: PG */
public final class C33563d {

    /* renamed from: a */
    public final C33567h f89745a;

    /* renamed from: b */
    public final Integer f89746b;

    /* renamed from: c */
    private final Integer f89747c;

    /* renamed from: d */
    private final Integer f89748d;

    /* renamed from: e */
    private final Boolean f89749e;

    public C33563d() {
        this((C33567h) null, (Integer) null);
    }

    public C33563d(C33567h hVar, Integer num) {
        this.f89747c = null;
        this.f89748d = null;
        this.f89745a = hVar;
        this.f89749e = null;
        this.f89746b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33563d)) {
            return false;
        }
        C33563d dVar = (C33563d) obj;
        Integer num = dVar.f89747c;
        if (!C69664n.m101066l((Object) null, (Object) null)) {
            return false;
        }
        Integer num2 = dVar.f89748d;
        if (!C69664n.m101066l((Object) null, (Object) null) || !C69664n.m101066l(this.f89745a, dVar.f89745a)) {
            return false;
        }
        Boolean bool = dVar.f89749e;
        return C69664n.m101066l((Object) null, (Object) null) && C69664n.m101066l(this.f89746b, dVar.f89746b);
    }

    public final int hashCode() {
        return (this.f89745a.hashCode() * 961) + this.f89746b.hashCode();
    }

    public final String toString() {
        C33567h hVar = this.f89745a;
        Integer num = this.f89746b;
        return "AssistLayerWindowConfig(systemUiVisibilityFlags=null, windowFlags=null, touchableArea=" + hVar + ", isWindowFocusable=null, themeResourceId=" + num + ")";
    }
}
