package com.google.common.p4522b;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.ex */
/* compiled from: PG */
public abstract class C58434ex extends C58443ff implements Iterator, p3186j$.util.Iterator {
    protected C58434ex() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Iterator mo55144b();

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public /* bridge */ /* synthetic */ Object mo5948hU() {
        throw null;
    }

    public final boolean hasNext() {
        return mo55144b().hasNext();
    }

    public Object next() {
        return mo55144b().next();
    }

    public void remove() {
        mo55144b().remove();
    }
}
