package com.google.android.libraries.search.p2998g;

import java.util.List;

/* renamed from: com.google.android.libraries.search.g.b */
/* compiled from: PG */
final class C38386b extends C38388d {

    /* renamed from: a */
    private final List f101632a;

    public C38386b(List list) {
        this.f101632a = list;
    }

    /* renamed from: a */
    public final int mo41397a() {
        return 2;
    }

    /* renamed from: b */
    public final List mo41401b() {
        return this.f101632a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C38392h) {
            C38392h hVar = (C38392h) obj;
            if (hVar.mo41397a() != 2 || !this.f101632a.equals(hVar.mo41401b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f101632a.hashCode();
    }

    public final String toString() {
        String obj = this.f101632a.toString();
        return "DeeplinkDestination{agsaTng=" + obj + "}";
    }
}
