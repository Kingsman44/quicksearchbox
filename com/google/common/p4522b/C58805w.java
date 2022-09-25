package com.google.common.p4522b;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.b.w */
/* compiled from: PG */
class C58805w extends C58761r implements SortedSet {

    /* renamed from: c */
    final /* synthetic */ C58307ae f156592c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58805w(C58307ae aeVar, SortedMap sortedMap) {
        super(aeVar, sortedMap);
        this.f156592c = aeVar;
    }

    /* renamed from: a */
    public SortedMap mo56024a() {
        return (SortedMap) this.f156385d;
    }

    public final Comparator comparator() {
        return mo56024a().comparator();
    }

    public final Object first() {
        return mo56024a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C58805w(this.f156592c, mo56024a().headMap(obj));
    }

    public final Object last() {
        return mo56024a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C58805w(this.f156592c, mo56024a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C58805w(this.f156592c, mo56024a().tailMap(obj));
    }
}
