package com.google.android.apps.gsa.search.core.state;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.state.dz */
/* compiled from: PG */
public final class C87000dz implements Iterable {

    /* renamed from: a */
    public final List f234985a = new ArrayList();

    /* renamed from: b */
    public int f234986b = 0;

    /* renamed from: a */
    public final Object mo80628a(int i) {
        return this.f234985a.get(i);
    }

    /* renamed from: b */
    public final void mo80629b(Object obj) {
        if (obj != null && !this.f234985a.contains(obj)) {
            this.f234985a.add(obj);
        }
    }

    /* renamed from: c */
    public final boolean mo80630c(Object obj) {
        return this.f234985a.contains(obj);
    }

    public final Iterator iterator() {
        return new C86999dy(this);
    }
}
