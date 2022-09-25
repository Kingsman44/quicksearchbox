package com.google.apps.tiktok.dataservice;

/* renamed from: com.google.apps.tiktok.dataservice.y */
/* compiled from: PG */
public final class C46885y extends C46787dd {

    /* renamed from: a */
    private final String f122327a;

    public C46885y(String str) {
        if (str != null) {
            this.f122327a = str;
            return;
        }
        throw new NullPointerException("Null stringRepresentation");
    }

    /* renamed from: a */
    public final String mo50796a() {
        return this.f122327a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46787dd) {
            return this.f122327a.equals(((C46787dd) obj).mo50796a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f122327a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f122327a;
        return "SingleStringKey{stringRepresentation=" + str + "}";
    }
}
