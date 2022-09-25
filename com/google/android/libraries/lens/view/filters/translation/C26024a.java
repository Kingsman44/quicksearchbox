package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27982e;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.a */
/* compiled from: PG */
final class C26024a extends C26127j {

    /* renamed from: a */
    private final C27982e f70738a;

    /* renamed from: b */
    private final long f70739b;

    public C26024a(C27982e eVar, long j) {
        if (eVar != null) {
            this.f70738a = eVar;
            this.f70739b = j;
            return;
        }
        throw new NullPointerException("Null languagePack");
    }

    /* renamed from: a */
    public final long mo31233a() {
        return this.f70739b;
    }

    /* renamed from: b */
    public final C27982e mo31234b() {
        return this.f70738a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26127j) {
            C26127j jVar = (C26127j) obj;
            return this.f70738a.equals(jVar.mo31234b()) && this.f70739b == jVar.mo31233a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f70738a.hashCode();
        long j = this.f70739b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f70738a.toString();
        long j = this.f70739b;
        return "DialogData{languagePack=" + obj + ", availableSpaceBytes=" + j + "}";
    }
}
