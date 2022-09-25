package com.google.common.p4522b;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.common.b.v */
/* compiled from: PG */
class C58804v extends C58680o implements SortedMap {

    /* renamed from: d */
    SortedSet f156590d;

    /* renamed from: e */
    final /* synthetic */ C58307ae f156591e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58804v(C58307ae aeVar, SortedMap sortedMap) {
        super(aeVar, sortedMap);
        this.f156591e = aeVar;
    }

    public final Comparator comparator() {
        return mo55983f().comparator();
    }

    /* renamed from: f */
    public SortedMap mo55983f() {
        return (SortedMap) this.f156406a;
    }

    public final Object firstKey() {
        return mo55983f().firstKey();
    }

    /* renamed from: g */
    public SortedSet mo55703e() {
        return new C58805w(this.f156591e, mo55983f());
    }

    /* renamed from: h */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f156590d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet g = mo55703e();
        this.f156590d = g;
        return g;
    }

    public SortedMap headMap(Object obj) {
        return new C58804v(this.f156591e, mo55983f().headMap(obj));
    }

    public final Object lastKey() {
        return mo55983f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C58804v(this.f156591e, mo55983f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C58804v(this.f156591e, mo55983f().tailMap(obj));
    }
}
