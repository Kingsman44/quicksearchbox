package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agm */
/* compiled from: PG */
public final class agm extends agj {

    /* renamed from: a */
    private final aic f20628a = new aic();

    /* renamed from: a */
    public final void mo14726a(String str, agj agj) {
        this.f20628a.put(str, agj);
    }

    /* renamed from: b */
    public final Set mo14727b() {
        return this.f20628a.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof agm) && ((agm) obj).f20628a.equals(this.f20628a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f20628a.hashCode();
    }
}
