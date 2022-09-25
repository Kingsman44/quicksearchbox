package com.google.common.p4522b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.b.aq */
/* compiled from: PG */
public abstract class C58319aq extends AbstractCollection implements C58692ol {

    /* renamed from: a */
    private transient Set f155892a;

    /* renamed from: b */
    private transient Set f155893b;

    public final boolean add(Object obj) {
        mo54931lF(obj, 1);
        return true;
    }

    /* renamed from: c */
    public abstract int mo54922c();

    public final boolean contains(Object obj) {
        return mo54932lv(obj) > 0;
    }

    /* renamed from: d */
    public int mo54924d(Object obj, int i) {
        throw null;
    }

    /* renamed from: e */
    public abstract Iterator mo54925e();

    public final boolean equals(Object obj) {
        return C58700ot.m90438b(this, obj);
    }

    /* renamed from: f */
    public abstract Iterator mo54926f();

    /* renamed from: h */
    public void mo54928h(Object obj, int i) {
        throw null;
    }

    public final int hashCode() {
        return mo54975m().hashCode();
    }

    /* renamed from: i */
    public boolean mo54929i(Object obj, int i) {
        throw null;
    }

    public boolean isEmpty() {
        return mo54975m().isEmpty();
    }

    /* renamed from: j */
    public Set mo54972j() {
        return new C58317ao(this);
    }

    /* renamed from: k */
    public Set mo54973k() {
        return new C58318ap(this);
    }

    /* renamed from: l */
    public Set mo54974l() {
        Set set = this.f155892a;
        if (set != null) {
            return set;
        }
        Set j = mo54972j();
        this.f155892a = j;
        return j;
    }

    /* renamed from: lF */
    public int mo54931lF(Object obj, int i) {
        throw null;
    }

    /* renamed from: m */
    public final Set mo54975m() {
        Set set = this.f155893b;
        if (set != null) {
            return set;
        }
        Set k = mo54973k();
        this.f155893b = k;
        return k;
    }

    public final boolean remove(Object obj) {
        return mo54924d(obj, 1) > 0;
    }

    public final boolean removeAll(Collection collection) {
        if (collection instanceof C58692ol) {
            collection = ((C58692ol) collection).mo54974l();
        }
        return mo54974l().removeAll(collection);
    }

    public final String toString() {
        return mo54975m().toString();
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof C58692ol) {
            collection = ((C58692ol) collection).mo54974l();
        }
        return mo54974l().retainAll(collection);
    }

    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection instanceof C58692ol) {
            C58692ol olVar = (C58692ol) collection;
            if (olVar instanceof C58311ai) {
                C58311ai aiVar = (C58311ai) olVar;
                if (aiVar.isEmpty()) {
                    return false;
                }
                for (int a = aiVar.f155881a.mo55792a(); a >= 0; a = aiVar.f155881a.mo55796e(a)) {
                    mo54931lF(aiVar.f155881a.mo55802k(a), aiVar.f155881a.mo55794c(a));
                }
            } else if (olVar.isEmpty()) {
                return false;
            } else {
                for (C58691ok okVar : olVar.mo54975m()) {
                    mo54931lF(okVar.mo55768b(), okVar.mo55767a());
                }
            }
            return true;
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return C58570jy.m90163o(this, collection.iterator());
        }
    }
}
