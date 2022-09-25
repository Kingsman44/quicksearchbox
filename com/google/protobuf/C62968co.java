package com.google.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.protobuf.co */
/* compiled from: PG */
final class C62968co extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C62970cp f170003a;

    /* renamed from: b */
    private final Set f170004b;

    public C62968co(C62970cp cpVar, Set set) {
        this.f170003a = cpVar;
        this.f170004b = set;
    }

    public final Iterator iterator() {
        return new C62967cn(this.f170003a, this.f170004b.iterator());
    }

    public final int size() {
        return this.f170004b.size();
    }
}
