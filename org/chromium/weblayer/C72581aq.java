package org.chromium.weblayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: org.chromium.weblayer.aq */
/* compiled from: PG */
public final class C72581aq implements Iterable {

    /* renamed from: a */
    public final List f193112a = new ArrayList();

    /* renamed from: b */
    public int f193113b;

    /* renamed from: c */
    private int f193114c;

    /* renamed from: a */
    public final Object mo64453a(int i) {
        return this.f193112a.get(i);
    }

    /* renamed from: b */
    public final boolean mo64454b() {
        return this.f193114c == 0;
    }

    /* renamed from: c */
    public final void mo64455c(Object obj) {
        if (obj != null && !this.f193112a.contains(obj)) {
            this.f193112a.add(obj);
            this.f193114c++;
        }
    }

    public final Iterator iterator() {
        return new C72580ap(this);
    }
}
