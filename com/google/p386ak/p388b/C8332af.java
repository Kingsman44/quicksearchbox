package com.google.p386ak.p388b;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ak.b.af */
/* compiled from: PG */
public final class C8332af extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C8337ak f29146a;

    public C8332af(C8337ak akVar) {
        this.f29146a = akVar;
    }

    public final void clear() {
        this.f29146a.clear();
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.f29146a.mo17072b((Map.Entry) obj) != null;
    }

    public final Iterator iterator() {
        return new C8331ae(this);
    }

    public final boolean remove(Object obj) {
        C8336aj b;
        if (!(obj instanceof Map.Entry) || (b = this.f29146a.mo17072b((Map.Entry) obj)) == null) {
            return false;
        }
        this.f29146a.mo17077e(b, true);
        return true;
    }

    public final int size() {
        return this.f29146a.f29163c;
    }
}
