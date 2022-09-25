package com.google.android.apps.search.googleapp.stampviewer.p10496h;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.h.a */
/* compiled from: PG */
public final class C139415a extends C139416b {

    /* renamed from: a */
    private final String f379092a;

    public C139415a(String str) {
        this.f379092a = str;
    }

    /* renamed from: a */
    public final String mo114951a() {
        return this.f379092a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C139416b) {
            return this.f379092a.equals(((C139416b) obj).mo114951a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f379092a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f379092a;
        return "HostOverride{host=" + str + "}";
    }
}
