package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.je */
/* compiled from: PG */
public final class C58550je extends C58431eu {

    /* renamed from: a */
    public final /* synthetic */ Iterable f156204a;

    public C58550je(Iterable iterable) {
        this.f156204a = iterable;
    }

    public final Iterator iterator() {
        return C58570jy.m90159k(this.f156204a);
    }

    public final String toString() {
        return String.valueOf(this.f156204a.toString()).concat(" (cycled)");
    }
}
