package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;

/* renamed from: com.google.protobuf.cj */
/* compiled from: PG */
public final class C62963cj extends AbstractList {

    /* renamed from: a */
    private final List f169995a;

    /* renamed from: b */
    private final C62962ci f169996b;

    public C62963cj(List list, C62962ci ciVar) {
        this.f169995a = list;
        this.f169996b = ciVar;
    }

    public final Object get(int i) {
        return this.f169996b.mo27a(this.f169995a.get(i));
    }

    public final int size() {
        return this.f169995a.size();
    }
}
