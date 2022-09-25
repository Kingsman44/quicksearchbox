package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.oi */
/* compiled from: PG */
class C58689oi extends C58441fd implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58671nr f156413a;

    /* renamed from: b */
    transient Collection f156414b;

    /* renamed from: c */
    transient Set f156415c;

    /* renamed from: d */
    transient Collection f156416d;

    /* renamed from: e */
    transient Map f156417e;

    public C58689oi(C58671nr nrVar) {
        this.f156413a = nrVar;
    }

    /* renamed from: A */
    public final Collection mo54948A() {
        Collection collection;
        Collection collection2 = this.f156414b;
        if (collection2 != null) {
            return collection2;
        }
        Collection A = this.f156413a.mo54948A();
        if (A instanceof Set) {
            collection = new C58659nf(Collections.unmodifiableSet((Set) A));
        } else {
            collection = new C58658ne(Collections.unmodifiableCollection(A));
        }
        this.f156414b = collection;
        return collection;
    }

    /* renamed from: B */
    public final Collection mo54949B() {
        Collection collection = this.f156416d;
        if (collection != null) {
            return collection;
        }
        Collection unmodifiableCollection = Collections.unmodifiableCollection(this.f156413a.mo54949B());
        this.f156416d = unmodifiableCollection;
        return unmodifiableCollection;
    }

    /* renamed from: C */
    public final Map mo54950C() {
        Map map = this.f156417e;
        if (map != null) {
            return map;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new C58657nd(this.f156413a.mo54950C(), C58662ni.m90346e(new C58688oh())));
        this.f156417e = unmodifiableMap;
        return unmodifiableMap;
    }

    /* renamed from: D */
    public final Set mo54951D() {
        Set set = this.f156415c;
        if (set != null) {
            return set;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(this.f156413a.mo54951D());
        this.f156415c = unmodifiableSet;
        return unmodifiableSet;
    }

    /* renamed from: H */
    public final boolean mo54955H(C58671nr nrVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: I */
    public final boolean mo54956I(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: J */
    public final void mo54957J(Object obj, Iterable iterable) {
        throw null;
    }

    /* renamed from: c */
    public Collection mo54902c(Object obj) {
        return C58690oj.m90414a(((C58438fa) this.f156413a).mo54902c(obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C58671nr mo5948hU() {
        return this.f156413a;
    }

    /* renamed from: u */
    public final void mo54917u() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: x */
    public final boolean mo54920x(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
