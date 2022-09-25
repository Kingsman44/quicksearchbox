package com.google.common.p4522b;

import java.util.ListIterator;
import p3186j$.util.Iterator;

/* renamed from: com.google.common.b.ez */
/* compiled from: PG */
public abstract class C58436ez extends C58434ex implements ListIterator, Iterator {
    protected C58436ez() {
    }

    public void add(Object obj) {
        mo55269c().add(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ java.util.Iterator mo55144b() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract ListIterator mo55269c();

    public final boolean hasPrevious() {
        return mo55269c().hasPrevious();
    }

    public final int nextIndex() {
        return mo55269c().nextIndex();
    }

    public final Object previous() {
        return mo55269c().previous();
    }

    public final int previousIndex() {
        return mo55269c().previousIndex();
    }

    public void set(Object obj) {
        mo55269c().set(obj);
    }
}
