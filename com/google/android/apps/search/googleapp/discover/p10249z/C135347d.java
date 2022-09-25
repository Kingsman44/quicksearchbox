package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10214s.C134552aq;
import com.google.android.apps.search.googleapp.discover.p10214s.C134569bg;
import com.google.android.apps.search.googleapp.discover.p10214s.C134572bj;
import java.util.List;
import p3186j$.time.Instant;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.d */
/* compiled from: PG */
public final class C135347d {

    /* renamed from: a */
    public final String f368763a;

    /* renamed from: b */
    public final C134572bj f368764b;

    /* renamed from: c */
    public final C134552aq f368765c;

    /* renamed from: d */
    public final List f368766d;

    /* renamed from: e */
    private final boolean f368767e;

    public C135347d(String str, C134572bj bjVar, boolean z, C134552aq aqVar, List list) {
        this.f368763a = str;
        this.f368764b = bjVar;
        this.f368767e = z;
        this.f368765c = aqVar;
        this.f368766d = list;
    }

    /* renamed from: a */
    public final boolean mo112283a(Instant instant, C134569bg bgVar) {
        C69664n.m101061g(instant, "fragmentCreationTime");
        if (this.f368767e || C135348e.m219497a(this.f368765c, instant)) {
            return true;
        }
        return !this.f368766d.isEmpty() && !C69540x.m100848ad(this.f368766d, bgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135347d)) {
            return false;
        }
        C135347d dVar = (C135347d) obj;
        return C69664n.m101066l(this.f368763a, dVar.f368763a) && this.f368764b == dVar.f368764b && this.f368767e == dVar.f368767e && C69664n.m101066l(this.f368765c, dVar.f368765c) && C69664n.m101066l(this.f368766d, dVar.f368766d);
    }

    public final int hashCode() {
        return (((((((this.f368763a.hashCode() * 31) + this.f368764b.hashCode()) * 31) + (this.f368767e ? 1 : 0)) * 31) + this.f368765c.hashCode()) * 31) + this.f368766d.hashCode();
    }

    public final String toString() {
        String str = this.f368763a;
        C134572bj bjVar = this.f368764b;
        boolean z = this.f368767e;
        C134552aq aqVar = this.f368765c;
        List list = this.f368766d;
        return "ChildInfo(contentId=" + str + ", role=" + bjVar + ", tombstoned=" + z + ", expirationInfo=" + aqVar + ", surfacesRenderings=" + list + ")";
    }
}
