package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.e.j */
/* compiled from: PG */
public final class C81567j extends C81561d {

    /* renamed from: a */
    public final C81560c f223131a;

    public C81567j(C81560c cVar) {
        if (cVar != null) {
            this.f223131a = cVar;
            return;
        }
        throw new NullPointerException("Null assistUiClient");
    }

    /* renamed from: a */
    public final C81560c mo75147a() {
        return this.f223131a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81561d) {
            return this.f223131a.equals(((C81561d) obj).mo75147a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f223131a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f223131a.toString();
        return "AssistUiClientRequest{assistUiClient=" + obj + "}";
    }
}
