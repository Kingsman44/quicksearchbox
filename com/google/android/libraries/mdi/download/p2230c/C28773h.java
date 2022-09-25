package com.google.android.libraries.mdi.download.p2230c;

import com.google.android.libraries.mdi.download.C28786ca;

/* renamed from: com.google.android.libraries.mdi.download.c.h */
/* compiled from: PG */
public final class C28773h extends C28783r {

    /* renamed from: a */
    private final C28786ca f78227a;

    public C28773h(C28786ca caVar) {
        this.f78227a = caVar;
    }

    /* renamed from: a */
    public final C28786ca mo34405a() {
        return this.f78227a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28783r) {
            return this.f78227a.equals(((C28783r) obj).mo34405a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f78227a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f78227a.toString();
        return "InlineDownloadParams{inlineFileContent=" + obj + "}";
    }
}
