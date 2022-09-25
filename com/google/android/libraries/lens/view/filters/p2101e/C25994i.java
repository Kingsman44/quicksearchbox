package com.google.android.libraries.lens.view.filters.p2101e;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.filters.e.i */
/* compiled from: PG */
public final class C25994i {

    /* renamed from: a */
    public final C58485gu f70648a;

    /* renamed from: b */
    public C25980d f70649b = C25980d.AUTO_FILTER;

    public C25994i(C58485gu guVar) {
        this.f70648a = guVar;
    }

    /* renamed from: a */
    public final int mo31208a(C25980d dVar) {
        for (int i = 0; i < this.f70648a.size(); i++) {
            if (((C25981e) this.f70648a.get(i)).mo31185d().equals(dVar)) {
                return i;
            }
        }
        throw new IllegalArgumentException(String.format("Index requested for unknown filter type: %s", new Object[]{dVar.name()}));
    }

    /* renamed from: b */
    public final C25981e mo31209b(int i) {
        return (C25981e) this.f70648a.get(i);
    }
}
