package com.google.android.apps.search.googleapp.discover.p10249z.p10250a;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.a.l */
/* compiled from: PG */
public final class C135288l extends C135292p {

    /* renamed from: a */
    public final boolean f368531a;

    public C135288l(boolean z) {
        this.f368531a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135288l) && this.f368531a == ((C135288l) obj).f368531a;
    }

    public final int hashCode() {
        return this.f368531a ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f368531a;
        return "RequestError(isDisconnectedFromInternet=" + z + ")";
    }
}
