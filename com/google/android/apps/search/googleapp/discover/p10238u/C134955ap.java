package com.google.android.apps.search.googleapp.discover.p10238u;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.ap */
/* compiled from: PG */
final class C134955ap {

    /* renamed from: a */
    public final Instant f367440a;

    /* renamed from: b */
    public final String f367441b;

    /* renamed from: c */
    public final String f367442c;

    public C134955ap(Instant instant, String str, String str2) {
        C69664n.m101061g(instant, "timestamp");
        C69664n.m101061g(str, "url");
        this.f367440a = instant;
        this.f367441b = str;
        this.f367442c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134955ap)) {
            return false;
        }
        C134955ap apVar = (C134955ap) obj;
        return C69664n.m101066l(this.f367440a, apVar.f367440a) && C69664n.m101066l(this.f367441b, apVar.f367441b) && C69664n.m101066l(this.f367442c, apVar.f367442c);
    }

    public final int hashCode() {
        return (((this.f367440a.hashCode() * 31) + this.f367441b.hashCode()) * 31) + this.f367442c.hashCode();
    }

    public final String toString() {
        Instant instant = this.f367440a;
        String str = this.f367441b;
        String str2 = this.f367442c;
        return "RequestEvent(timestamp=" + instant + ", url=" + str + ", status=" + str2 + ")";
    }
}
