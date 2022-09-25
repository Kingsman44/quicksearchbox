package com.google.android.apps.search.googleapp.p10257g.p10258a;

import com.google.p337aa.C6617d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.a.a */
/* compiled from: PG */
public final class C135384a {

    /* renamed from: a */
    public final C6617d f368861a;

    /* renamed from: b */
    public final long f368862b;

    public C135384a(C6617d dVar, long j) {
        C69664n.m101061g(dVar, "doodle");
        this.f368861a = dVar;
        this.f368862b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135384a)) {
            return false;
        }
        C135384a aVar = (C135384a) obj;
        return C69664n.m101066l(this.f368861a, aVar.f368861a) && this.f368862b == aVar.f368862b;
    }

    public final int hashCode() {
        int hashCode = this.f368861a.hashCode();
        long j = this.f368862b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        C6617d dVar = this.f368861a;
        long j = this.f368862b;
        return "DoodleWithTimestamp(doodle=" + dVar + ", timestamp=" + j + ")";
    }
}
