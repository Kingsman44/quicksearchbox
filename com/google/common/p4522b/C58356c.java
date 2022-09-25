package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.c */
/* compiled from: PG */
final class C58356c extends C58445fh {

    /* renamed from: a */
    final Set f155928a;

    /* renamed from: b */
    final /* synthetic */ C58464g f155929b;

    public C58356c(C58464g gVar) {
        this.f155929b = gVar;
        this.f155928a = gVar.f156089a.entrySet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Collection mo55040b() {
        return this.f155928a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Set mo55041c() {
        return this.f155928a;
    }

    public final void clear() {
        this.f155929b.clear();
    }

    public final boolean contains(Object obj) {
        Set set = this.f155928a;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return set.contains(C58662ni.m90354m((Map.Entry) obj));
    }

    public final boolean containsAll(Collection collection) {
        return C58374cr.m89411c(this, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f155928a;
    }

    public final Iterator iterator() {
        return this.f155929b.mo55354g();
    }

    public final boolean remove(Object obj) {
        if (!this.f155928a.contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        this.f155929b.f156090b.f156089a.remove(entry.getValue());
        this.f155928a.remove(entry);
        return true;
    }

    public final boolean retainAll(Collection collection) {
        return C58570jy.m90167s(this.f155929b.mo55354g(), collection);
    }

    public final Object[] toArray() {
        return mo55252r();
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return C58758qx.m90655m(this, collection);
    }

    public final Object[] toArray(Object[] objArr) {
        return C58704ox.m90449b(this, objArr);
    }
}
