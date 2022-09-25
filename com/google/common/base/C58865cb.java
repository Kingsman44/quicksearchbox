package com.google.common.base;

import java.util.Iterator;

/* renamed from: com.google.common.base.cb */
/* compiled from: PG */
final class C58865cb implements Iterable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f156666a;

    /* renamed from: b */
    final /* synthetic */ C58869cf f156667b;

    public C58865cb(C58869cf cfVar, CharSequence charSequence) {
        this.f156667b = cfVar;
        this.f156666a = charSequence;
    }

    public final Iterator iterator() {
        return this.f156667b.mo56154h(this.f156666a);
    }

    public final String toString() {
        C58827ar arVar = new C58827ar(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        arVar.mo56100g(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
