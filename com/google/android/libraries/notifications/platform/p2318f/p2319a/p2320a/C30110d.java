package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.d */
/* compiled from: PG */
public final class C30110d extends C30112f {

    /* renamed from: a */
    public final String f81457a;

    public C30110d(String str) {
        C69664n.m101061g(str, "authToken");
        this.f81457a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30110d) && C69664n.m101066l(this.f81457a, ((C30110d) obj).f81457a);
    }

    public final int hashCode() {
        return this.f81457a.hashCode();
    }

    public final String toString() {
        String str = this.f81457a;
        return "Success(authToken=" + str + ")";
    }
}
