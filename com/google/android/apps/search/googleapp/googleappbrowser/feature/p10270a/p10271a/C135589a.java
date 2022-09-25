package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a.p10271a;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a.a */
/* compiled from: PG */
final class C135589a extends C135607c {

    /* renamed from: a */
    private final String f369328a;

    public C135589a(String str) {
        if (str != null) {
            this.f369328a = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    /* renamed from: a */
    public final String mo112396a() {
        return this.f369328a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C135607c) {
            return this.f369328a.equals(((C135607c) obj).mo112396a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f369328a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f369328a;
        return "OpenLinkInNewTabMenuItemClickedEvent{url=" + str + "}";
    }
}
