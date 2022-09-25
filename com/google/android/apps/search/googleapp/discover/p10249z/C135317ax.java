package com.google.android.apps.search.googleapp.discover.p10249z;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.ax */
/* compiled from: PG */
public final class C135317ax {

    /* renamed from: a */
    public final List f368667a;

    /* renamed from: b */
    public final int f368668b;

    public C135317ax(List list, int i) {
        this.f368667a = list;
        this.f368668b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135317ax)) {
            return false;
        }
        C135317ax axVar = (C135317ax) obj;
        return C69664n.m101066l(this.f368667a, axVar.f368667a) && this.f368668b == axVar.f368668b;
    }

    public final int hashCode() {
        return (this.f368667a.hashCode() * 31) + this.f368668b;
    }

    public final String toString() {
        List list = this.f368667a;
        int i = this.f368668b;
        return "FilteredTreeData(nonRemovedRootChildren=" + list + ", filteredStartIndex=" + i + ")";
    }
}
