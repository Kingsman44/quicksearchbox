package com.google.android.libraries.mdi.download.p2230c;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.c.b */
/* compiled from: PG */
final class C28753b extends C28775j {

    /* renamed from: a */
    private final String f78167a;

    /* renamed from: b */
    private final C58833ax f78168b;

    public C28753b(String str, C58833ax axVar) {
        this.f78167a = str;
        this.f78168b = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo34365a() {
        return this.f78168b;
    }

    /* renamed from: b */
    public final String mo34366b() {
        return this.f78167a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28775j) {
            C28775j jVar = (C28775j) obj;
            return this.f78167a.equals(jVar.mo34366b()) && this.f78168b.equals(jVar.mo34365a());
        }
    }

    public final int hashCode() {
        return ((this.f78167a.hashCode() ^ 1000003) * 1000003) ^ this.f78168b.hashCode();
    }

    public final String toString() {
        String str = this.f78167a;
        String valueOf = String.valueOf(this.f78168b);
        return "CheckContentChangeRequest{url=" + str + ", cachedETagOptional=" + valueOf + "}";
    }
}
