package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134556au;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.u */
/* compiled from: PG */
final class C135201u {

    /* renamed from: a */
    public final String f368293a;

    /* renamed from: b */
    public final C134556au f368294b;

    public C135201u(String str, C134556au auVar) {
        C69664n.m101061g(str, "feedId");
        C69664n.m101061g(auVar, "sessionState");
        this.f368293a = str;
        this.f368294b = auVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135201u)) {
            return false;
        }
        C135201u uVar = (C135201u) obj;
        return C69664n.m101066l(this.f368293a, uVar.f368293a) && C69664n.m101066l(this.f368294b, uVar.f368294b);
    }

    public final int hashCode() {
        return (this.f368293a.hashCode() * 31) + this.f368294b.hashCode();
    }

    public final String toString() {
        String str = this.f368293a;
        C134556au auVar = this.f368294b;
        return "FeedTableRow(feedId=" + str + ", sessionState=" + auVar + ")";
    }
}
