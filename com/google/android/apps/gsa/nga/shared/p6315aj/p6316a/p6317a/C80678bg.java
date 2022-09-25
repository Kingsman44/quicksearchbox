package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bg */
/* compiled from: PG */
public final class C80678bg extends C80751dz {

    /* renamed from: a */
    private final String f221510a;

    public C80678bg(String str) {
        if (str != null) {
            this.f221510a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final String mo74553a() {
        return this.f221510a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80751dz) {
            return this.f221510a.equals(((C80751dz) obj).mo74553a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f221510a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f221510a;
        return "LegalNotice{text=" + str + "}";
    }
}
