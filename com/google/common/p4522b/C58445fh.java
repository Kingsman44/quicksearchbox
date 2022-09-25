package com.google.common.p4522b;

import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.b.fh */
/* compiled from: PG */
public abstract class C58445fh extends C58432ev implements Set {
    protected C58445fh() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Collection mo55040b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Set mo55041c();

    public final boolean equals(Object obj) {
        return obj == this || mo55041c().equals(obj);
    }

    public final int hashCode() {
        return mo55041c().hashCode();
    }
}
