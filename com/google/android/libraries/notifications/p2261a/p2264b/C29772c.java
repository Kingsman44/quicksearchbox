package com.google.android.libraries.notifications.p2261a.p2264b;

import java.util.List;

/* renamed from: com.google.android.libraries.notifications.a.b.c */
/* compiled from: PG */
public final class C29772c extends C29775f {

    /* renamed from: a */
    public final List f80677a;

    public C29772c(List list) {
        this.f80677a = list;
    }

    /* renamed from: a */
    public final List mo34944a() {
        return this.f80677a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29775f) {
            return this.f80677a.equals(((C29775f) obj).mo34944a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f80677a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f80677a.toString();
        return "SetPreferencesRequest{preferenceEntries=" + obj + "}";
    }
}
