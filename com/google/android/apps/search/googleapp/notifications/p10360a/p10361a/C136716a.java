package com.google.android.apps.search.googleapp.notifications.p10360a.p10361a;

import com.google.p4283bv.p4345d.C57031j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.a.a */
/* compiled from: PG */
public final class C136716a {

    /* renamed from: a */
    public final C136719d f372137a;

    /* renamed from: b */
    public final C57031j f372138b;

    /* renamed from: c */
    public final String f372139c;

    public C136716a(C136719d dVar, C57031j jVar, String str) {
        C69664n.m101061g(dVar, "status");
        C69664n.m101061g(jVar, "response");
        C69664n.m101061g(str, "httpStatusCode");
        this.f372137a = dVar;
        this.f372138b = jVar;
        this.f372139c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136716a)) {
            return false;
        }
        C136716a aVar = (C136716a) obj;
        return this.f372137a == aVar.f372137a && C69664n.m101066l(this.f372138b, aVar.f372138b) && C69664n.m101066l(this.f372139c, aVar.f372139c);
    }

    public final int hashCode() {
        return (((this.f372137a.hashCode() * 31) + this.f372138b.hashCode()) * 31) + this.f372139c.hashCode();
    }

    public final String toString() {
        C136719d dVar = this.f372137a;
        C57031j jVar = this.f372138b;
        String str = this.f372139c;
        return "ActionUploadResponse(status=" + dVar + ", response=" + jVar + ", httpStatusCode=" + str + ")";
    }
}
