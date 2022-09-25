package com.google.common.p4574q;

import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58374cr;
import com.google.common.p4522b.C58432ev;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4522b.C58704ox;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.q.e */
/* compiled from: PG */
final class C60726e extends C58432ev {

    /* renamed from: a */
    final Collection f164730a;

    /* renamed from: b */
    final Set f164731b;

    public C60726e(Collection collection, Set set) {
        this.f164730a = collection;
        this.f164731b = set;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Collection mo55040b() {
        return this.f164730a;
    }

    public final boolean contains(Object obj) {
        return C58570jy.m90164p(iterator(), obj);
    }

    public final boolean containsAll(Collection collection) {
        return C58374cr.m89411c(this, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f164730a;
    }

    public final Iterator iterator() {
        return new C60725d(this.f164731b.iterator());
    }

    public final boolean remove(Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (C58832aw.m90831a(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        return C58570jy.m90166r(iterator(), collection);
    }

    public final boolean retainAll(Collection collection) {
        return C58570jy.m90167s(iterator(), collection);
    }

    public final Object[] toArray() {
        return mo55252r();
    }

    public final Object[] toArray(Object[] objArr) {
        return C58704ox.m90449b(this, objArr);
    }
}
