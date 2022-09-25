package com.google.common.p4536h;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: com.google.common.h.y */
/* compiled from: PG */
final class C59268y extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C59269z f157381a;

    public C59268y(C59269z zVar) {
        this.f157381a = zVar;
    }

    public final boolean contains(Object obj) {
        C59269z zVar = this.f157381a;
        return zVar.mo56738b(obj) != null || zVar.f157382a.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C59267x(this, this.f157381a.f157382a.entrySet().iterator());
    }

    public final int size() {
        return this.f157381a.f157382a.size();
    }
}
