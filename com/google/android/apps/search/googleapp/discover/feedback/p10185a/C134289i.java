package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.i */
/* compiled from: PG */
public final class C134289i extends C134286f {

    /* renamed from: a */
    public final List f365798a;

    /* renamed from: b */
    private final String f365799b;

    public C134289i(String str, List list) {
        this.f365799b = str;
        this.f365798a = list;
    }

    /* renamed from: b */
    public final String mo111676b() {
        return this.f365799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134289i)) {
            return false;
        }
        C134289i iVar = (C134289i) obj;
        return C69664n.m101066l(this.f365799b, iVar.f365799b) && C69664n.m101066l(this.f365798a, iVar.f365798a);
    }

    public final int hashCode() {
        return (this.f365799b.hashCode() * 31) + this.f365798a.hashCode();
    }

    public final String toString() {
        String str = this.f365799b;
        List list = this.f365798a;
        return "GroupFeature(name=" + str + ", children=" + list + ")";
    }
}
