package com.google.android.apps.search.googleapp.p10527u;

/* renamed from: com.google.android.apps.search.googleapp.u.a */
/* compiled from: PG */
public final class C139760a extends C139762c {

    /* renamed from: a */
    private final C139767h f379866a;

    public C139760a(C139767h hVar) {
        if (hVar != null) {
            this.f379866a = hVar;
            return;
        }
        throw new NullPointerException("Null navigationEventData");
    }

    /* renamed from: a */
    public final C139767h mo115221a() {
        return this.f379866a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139762c) {
            return this.f379866a.equals(((C139762c) obj).mo115221a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f379866a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f379866a.toString();
        return "NavigateToDestinationEvent{navigationEventData=" + obj + "}";
    }
}
