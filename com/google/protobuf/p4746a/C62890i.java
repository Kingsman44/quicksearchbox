package com.google.protobuf.p4746a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Set;
import p3186j$.util.Spliterator;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.p5476a.C69640a;

/* renamed from: com.google.protobuf.a.i */
/* compiled from: PG */
public final class C62890i extends C62886e implements Set, p3186j$.util.Set, C69640a {

    /* renamed from: a */
    private final Set f169790a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62890i(Set set) {
        super(set);
        C69664n.m101061g(set, "delegate");
        this.f169790a = set;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return super.contains((Map.Entry) obj);
    }

    public final Iterator iterator() {
        return new C62889h(this.f169790a.iterator());
    }

    public final /* synthetic */ Spliterator spliterator() {
        return Set.CC.$default$spliterator(this);
    }
}
