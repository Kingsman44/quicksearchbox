package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134546ak;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.p */
/* compiled from: PG */
public final class C135359p {

    /* renamed from: a */
    public final C134546ak f368799a;

    /* renamed from: b */
    public final String f368800b;

    /* renamed from: c */
    public final C134755f f368801c;

    public C135359p(C134546ak akVar, String str, C134755f fVar) {
        C69664n.m101061g(akVar, "streamToken");
        C69664n.m101061g(str, "sessionId");
        this.f368799a = akVar;
        this.f368800b = str;
        this.f368801c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135359p)) {
            return false;
        }
        C135359p pVar = (C135359p) obj;
        return C69664n.m101066l(this.f368799a, pVar.f368799a) && C69664n.m101066l(this.f368800b, pVar.f368800b) && C69664n.m101066l(this.f368801c, pVar.f368801c);
    }

    public final int hashCode() {
        return (((this.f368799a.hashCode() * 31) + this.f368800b.hashCode()) * 31) + this.f368801c.hashCode();
    }

    public final String toString() {
        C134546ak akVar = this.f368799a;
        String str = this.f368800b;
        C134755f fVar = this.f368801c;
        return "PaginationToken(streamToken=" + akVar + ", sessionId=" + str + ", streamStorageKey=" + fVar + ")";
    }
}
