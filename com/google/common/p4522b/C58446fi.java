package com.google.common.p4522b;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.common.b.fi */
/* compiled from: PG */
public abstract class C58446fi extends C58445fh implements SortedSet {
    protected C58446fi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Set mo55041c() {
        throw null;
    }

    public final Comparator comparator() {
        return mo55296d().comparator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract SortedSet mo55296d();

    public final Object first() {
        return mo55296d().first();
    }

    public final SortedSet headSet(Object obj) {
        return mo55296d().headSet(obj);
    }

    public final Object last() {
        return mo55296d().last();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return mo55296d().subSet(obj, obj2);
    }

    public final SortedSet tailSet(Object obj) {
        return mo55296d().tailSet(obj);
    }
}
