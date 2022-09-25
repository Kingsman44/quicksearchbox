package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.an */
/* compiled from: PG */
abstract class C58316an implements C58671nr {

    /* renamed from: a */
    private transient Collection f155885a;

    /* renamed from: b */
    private transient Set f155886b;

    /* renamed from: c */
    public transient C58692ol f155887c;

    /* renamed from: d */
    private transient Collection f155888d;

    /* renamed from: e */
    private transient Map f155889e;

    /* renamed from: A */
    public Collection mo54948A() {
        Collection collection = this.f155885a;
        if (collection != null) {
            return collection;
        }
        Collection l = mo54908l();
        this.f155885a = l;
        return l;
    }

    /* renamed from: B */
    public Collection mo54949B() {
        Collection collection = this.f155888d;
        if (collection != null) {
            return collection;
        }
        Collection m = mo54909m();
        this.f155888d = m;
        return m;
    }

    /* renamed from: C */
    public Map mo54950C() {
        Map map = this.f155889e;
        if (map != null) {
            return map;
        }
        Map q = mo54913q();
        this.f155889e = q;
        return q;
    }

    /* renamed from: D */
    public Set mo54951D() {
        Set set = this.f155886b;
        if (set != null) {
            return set;
        }
        Set s = mo54915s();
        this.f155886b = s;
        return s;
    }

    /* renamed from: E */
    public final boolean mo54952E(Object obj, Object obj2) {
        Collection collection = (Collection) mo54950C().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: F */
    public boolean mo54953F(Object obj) {
        for (Collection contains : mo54950C().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public boolean mo54954G() {
        return mo54906j() == 0;
    }

    /* renamed from: H */
    public boolean mo54955H(C58671nr nrVar) {
        boolean z = false;
        for (Map.Entry entry : nrVar.mo54948A()) {
            z |= mo54920x(entry.getKey(), entry.getValue());
        }
        return z;
    }

    /* renamed from: I */
    public boolean mo54956I(Object obj, Object obj2) {
        Collection collection = (Collection) mo54950C().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C58671nr)) {
            return false;
        }
        return mo54950C().equals(((C58671nr) obj).mo54950C());
    }

    public final int hashCode() {
        return mo54950C().hashCode();
    }

    /* renamed from: k */
    public abstract C58692ol mo54907k();

    /* renamed from: l */
    public abstract Collection mo54908l();

    /* renamed from: m */
    public abstract Collection mo54909m();

    /* renamed from: n */
    public abstract Iterator mo54910n();

    /* renamed from: o */
    public Iterator mo54911o() {
        throw null;
    }

    /* renamed from: q */
    public abstract Map mo54913q();

    /* renamed from: s */
    public abstract Set mo54915s();

    public final String toString() {
        return mo54950C().toString();
    }

    /* renamed from: x */
    public boolean mo54920x(Object obj, Object obj2) {
        throw null;
    }

    /* renamed from: J */
    public void mo54957J(Object obj, Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (!collection.isEmpty()) {
                mo54902c(obj).addAll(collection);
                return;
            }
            return;
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            C58570jy.m90163o(mo54902c(obj), it);
        }
    }
}
