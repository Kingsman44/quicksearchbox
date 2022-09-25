package com.google.android.apps.search.googleapp.discover.p10249z;

import java.util.List;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.az */
/* compiled from: PG */
public final class C135319az {

    /* renamed from: a */
    public final List f368670a;

    /* renamed from: b */
    public final Map f368671b;

    /* renamed from: c */
    public final C135295ab f368672c;

    /* renamed from: d */
    public final int f368673d;

    /* renamed from: e */
    public final int f368674e;

    public C135319az(List list, Map map, C135295ab abVar, int i, int i2) {
        C69664n.m101061g(list, "children");
        C69664n.m101061g(map, "requiredContent");
        this.f368670a = list;
        this.f368671b = map;
        this.f368672c = abVar;
        this.f368673d = i;
        this.f368674e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135319az)) {
            return false;
        }
        C135319az azVar = (C135319az) obj;
        return C69664n.m101066l(this.f368670a, azVar.f368670a) && C69664n.m101066l(this.f368671b, azVar.f368671b) && C69664n.m101066l(this.f368672c, azVar.f368672c) && this.f368673d == azVar.f368673d && this.f368674e == azVar.f368674e;
    }

    public final int hashCode() {
        return (((((((this.f368670a.hashCode() * 31) + this.f368671b.hashCode()) * 31) + this.f368672c.hashCode()) * 31) + this.f368673d) * 31) + this.f368674e;
    }

    public final String toString() {
        List list = this.f368670a;
        Map map = this.f368671b;
        C135295ab abVar = this.f368672c;
        int i = this.f368673d;
        int i2 = this.f368674e;
        return "StreamSubtree(children=" + list + ", requiredContent=" + map + ", sessionMetadata=" + abVar + ", distanceToStart=" + i + ", distanceToEnd=" + i2 + ")";
    }
}
