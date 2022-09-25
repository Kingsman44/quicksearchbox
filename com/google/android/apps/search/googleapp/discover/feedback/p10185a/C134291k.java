package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.k */
/* compiled from: PG */
public final class C134291k extends C134286f {

    /* renamed from: a */
    public final List f365803a;

    /* renamed from: b */
    private final String f365804b;

    public C134291k(String str, List list) {
        this.f365804b = str;
        this.f365803a = list;
    }

    /* renamed from: b */
    public final String mo111676b() {
        return this.f365804b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134291k)) {
            return false;
        }
        C134291k kVar = (C134291k) obj;
        return C69664n.m101066l(this.f365804b, kVar.f365804b) && C69664n.m101066l(this.f365803a, kVar.f365803a);
    }

    public final int hashCode() {
        return (this.f365804b.hashCode() * 31) + this.f365803a.hashCode();
    }

    public final String toString() {
        String str = this.f365804b;
        List list = this.f365803a;
        return "ListFeature(name=" + str + ", children=" + list + ")";
    }
}
