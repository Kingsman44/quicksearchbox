package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agh */
/* compiled from: PG */
public final class agh extends agj implements Iterable {

    /* renamed from: a */
    private final List f20626a = new ArrayList();

    /* renamed from: a */
    public final void mo14718a(agj agj) {
        this.f20626a.add(agj);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof agh) && ((agh) obj).f20626a.equals(this.f20626a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f20626a.hashCode();
    }

    public final Iterator iterator() {
        return this.f20626a.iterator();
    }
}
