package com.google.android.apps.gsa.shared.bisto.p7029b;

/* renamed from: com.google.android.apps.gsa.shared.bisto.b.e */
/* compiled from: PG */
final class C89634e extends C89639j {

    /* renamed from: a */
    public final String f242712a;

    public C89634e(String str) {
        if (str != null) {
            this.f242712a = str;
            return;
        }
        throw new NullPointerException("Null fileExtension");
    }

    /* renamed from: a */
    public final String mo83513a() {
        return this.f242712a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89639j) {
            return this.f242712a.equals(((C89639j) obj).mo83513a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f242712a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f242712a;
        return "FileMetadata{fileExtension=" + str + "}";
    }
}
