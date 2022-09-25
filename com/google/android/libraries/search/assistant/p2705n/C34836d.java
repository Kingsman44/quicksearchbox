package com.google.android.libraries.search.assistant.p2705n;

import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;

/* renamed from: com.google.android.libraries.search.assistant.n.d */
/* compiled from: PG */
public final class C34836d extends C34819a {

    /* renamed from: a */
    public final C34834b f92406a;

    public C34836d(C34834b bVar) {
        if (bVar != null) {
            this.f92406a = bVar;
            return;
        }
        throw new NullPointerException("Null proto");
    }

    /* renamed from: d */
    public final C34834b mo39521d() {
        return this.f92406a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34819a) {
            return this.f92406a.equals(((C34819a) obj).mo39521d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f92406a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f92406a.toString();
        return "ApaErrorCode{proto=" + obj + "}";
    }
}
