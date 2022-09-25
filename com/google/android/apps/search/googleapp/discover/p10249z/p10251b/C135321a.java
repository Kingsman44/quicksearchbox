package com.google.android.apps.search.googleapp.discover.p10249z.p10251b;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.b.a */
/* compiled from: PG */
public final class C135321a {

    /* renamed from: a */
    public final String f368675a;

    /* renamed from: b */
    public final C57696b f368676b;

    public C135321a(String str, C57696b bVar) {
        C69664n.m101061g(str, "contentId");
        C69664n.m101061g(bVar, "clientLoggingProperties");
        this.f368675a = str;
        this.f368676b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135321a)) {
            return false;
        }
        C135321a aVar = (C135321a) obj;
        return C69664n.m101066l(this.f368675a, aVar.f368675a) && C69664n.m101066l(this.f368676b, aVar.f368676b);
    }

    public final int hashCode() {
        return (this.f368675a.hashCode() * 31) + this.f368676b.hashCode();
    }

    public final String toString() {
        String str = this.f368675a;
        C57696b bVar = this.f368676b;
        return "FeatureExpiration(contentId=" + str + ", clientLoggingProperties=" + bVar + ")";
    }
}
