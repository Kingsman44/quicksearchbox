package com.google.android.libraries.mdi.download;

import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.mdi.download.by */
/* compiled from: PG */
public final class C28747by extends C28748bz {

    /* renamed from: a */
    private final C63088z f78163a;

    public C28747by(C63088z zVar) {
        this.f78163a = zVar;
    }

    /* renamed from: a */
    public final C63088z mo34358a() {
        return this.f78163a;
    }

    /* renamed from: b */
    public final int mo34359b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C28786ca) {
            C28786ca caVar = (C28786ca) obj;
            if (caVar.mo34359b() != 1 || !this.f78163a.equals(caVar.mo34358a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f78163a.hashCode();
    }
}
