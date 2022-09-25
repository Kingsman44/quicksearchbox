package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.b.f */
/* compiled from: PG */
final class C58437f extends C58445fh {

    /* renamed from: a */
    final Set f156045a;

    /* renamed from: b */
    final /* synthetic */ C58464g f156046b;

    public C58437f(C58464g gVar) {
        this.f156046b = gVar;
        this.f156045a = gVar.f156090b.keySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Collection mo55040b() {
        return this.f156045a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Set mo55041c() {
        return this.f156045a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f156045a;
    }

    public final Iterator iterator() {
        return new C58639mm(((C58356c) this.f156046b.entrySet()).f155929b.mo55354g());
    }

    public final Object[] toArray() {
        return mo55252r();
    }

    public final String toString() {
        StringBuilder a = C58374cr.m89409a(size());
        a.append('[');
        boolean z = true;
        for (Object next : this) {
            if (!z) {
                a.append(", ");
            }
            z = false;
            if (next == this) {
                a.append("(this Collection)");
            } else {
                a.append(next);
            }
        }
        a.append(']');
        return a.toString();
    }

    public final Object[] toArray(Object[] objArr) {
        return C58704ox.m90449b(this, objArr);
    }
}
