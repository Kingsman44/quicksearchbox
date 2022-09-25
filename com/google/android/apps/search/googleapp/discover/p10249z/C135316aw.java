package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.aw */
/* compiled from: PG */
public final class C135316aw {

    /* renamed from: a */
    public final int f368663a;

    /* renamed from: b */
    public final int f368664b;

    /* renamed from: c */
    public final C58485gu f368665c;

    /* renamed from: d */
    public final String f368666d;

    public C135316aw(int i, int i2, C58485gu guVar, String str) {
        C69664n.m101061g(guVar, "childrenToBind");
        this.f368663a = i;
        this.f368664b = i2;
        this.f368665c = guVar;
        this.f368666d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135316aw)) {
            return false;
        }
        C135316aw awVar = (C135316aw) obj;
        return this.f368663a == awVar.f368663a && this.f368664b == awVar.f368664b && C69664n.m101066l(this.f368665c, awVar.f368665c) && C69664n.m101066l(this.f368666d, awVar.f368666d);
    }

    public final int hashCode() {
        return (((((this.f368663a * 31) + this.f368664b) * 31) + this.f368665c.hashCode()) * 31) + this.f368666d.hashCode();
    }

    public final String toString() {
        int i = this.f368663a;
        int i2 = this.f368664b;
        C58485gu guVar = this.f368665c;
        String str = this.f368666d;
        return "StreamSubset(distanceToStart=" + i + ", distanceToEnd=" + i2 + ", childrenToBind=" + guVar + ", rootId=" + str + ")";
    }
}
