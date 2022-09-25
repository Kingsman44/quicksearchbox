package com.google.android.apps.search.googleapp.discover.p10237t;

import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.t.e */
/* compiled from: PG */
public final class C134929e {

    /* renamed from: a */
    public final Map f367372a;

    /* renamed from: b */
    public final int f367373b;

    /* renamed from: c */
    public final int f367374c;

    /* renamed from: d */
    public final int f367375d;

    /* renamed from: e */
    public final int f367376e;

    public C134929e(Map map, int i, int i2, int i3, int i4) {
        this.f367372a = map;
        this.f367373b = i;
        this.f367374c = i2;
        this.f367375d = i3;
        this.f367376e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134929e)) {
            return false;
        }
        C134929e eVar = (C134929e) obj;
        return C69664n.m101066l(this.f367372a, eVar.f367372a) && this.f367373b == eVar.f367373b && this.f367374c == eVar.f367374c && this.f367375d == eVar.f367375d && this.f367376e == eVar.f367376e;
    }

    public final int hashCode() {
        return (((((((this.f367372a.hashCode() * 31) + this.f367373b) * 31) + this.f367374c) * 31) + this.f367375d) * 31) + this.f367376e;
    }

    public final String toString() {
        Map map = this.f367372a;
        int i = this.f367373b;
        int i2 = this.f367374c;
        int i3 = this.f367375d;
        int i4 = this.f367376e;
        return "DataOperationCounts(appendCounter=" + map + ", removeCount=" + i + ", requiredCount=" + i2 + ", clearAllCount=" + i3 + ", unknownCount=" + i4 + ")";
    }
}
