package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: com.google.common.b.ae */
/* compiled from: PG */
public abstract class C58307ae extends C58316an implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: a */
    public transient Map f155873a;

    /* renamed from: b */
    public transient int f155874b;

    protected C58307ae(Map map) {
        C58838bb.m90868c(map.isEmpty());
        this.f155873a = map;
    }

    /* renamed from: y */
    static /* synthetic */ void m89285y(C58307ae aeVar) {
        aeVar.f155874b++;
    }

    /* renamed from: z */
    static /* synthetic */ void m89286z(C58307ae aeVar) {
        aeVar.f155874b--;
    }

    /* renamed from: a */
    public abstract Collection mo54900a();

    /* renamed from: b */
    public Collection mo54901b() {
        throw null;
    }

    /* renamed from: c */
    public Collection mo54902c(Object obj) {
        Collection collection = (Collection) this.f155873a.get(obj);
        if (collection == null) {
            collection = mo54900a();
        }
        return mo54905f(obj, collection);
    }

    /* renamed from: d */
    public Collection mo54903d(Object obj) {
        Collection collection = (Collection) this.f155873a.remove(obj);
        if (collection == null) {
            return mo54901b();
        }
        Collection a = mo54900a();
        a.addAll(collection);
        this.f155874b -= collection.size();
        collection.clear();
        return mo54904e(a);
    }

    /* renamed from: e */
    public Collection mo54904e(Collection collection) {
        throw null;
    }

    /* renamed from: f */
    public Collection mo54905f(Object obj, Collection collection) {
        throw null;
    }

    /* renamed from: j */
    public final int mo54906j() {
        return this.f155874b;
    }

    /* renamed from: k */
    public final C58692ol mo54907k() {
        throw null;
    }

    /* renamed from: l */
    public final Collection mo54908l() {
        if (this instanceof C58743qi) {
            return new C58314al(this);
        }
        return new C58313ak(this);
    }

    /* renamed from: m */
    public final Collection mo54909m() {
        return new C58315am(this);
    }

    /* renamed from: n */
    public final Iterator mo54910n() {
        return new C58599l(this);
    }

    /* renamed from: o */
    public final Iterator mo54911o() {
        return new C58572k(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final List mo54912p(Object obj, List list, C58807y yVar) {
        if (list instanceof RandomAccess) {
            return new C58803u(this, obj, list, yVar);
        }
        return new C58303aa(this, obj, list, yVar);
    }

    /* renamed from: q */
    public Map mo54913q() {
        return new C58680o(this, this.f155873a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Map mo54914r() {
        Map map = this.f155873a;
        if (map instanceof NavigableMap) {
            return new C58788s(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new C58804v(this, (SortedMap) map);
        }
        return new C58680o(this, map);
    }

    /* renamed from: s */
    public Set mo54915s() {
        return new C58761r(this, this.f155873a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Set mo54916t() {
        Map map = this.f155873a;
        if (map instanceof NavigableMap) {
            return new C58802t(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new C58805w(this, (SortedMap) map);
        }
        return new C58761r(this, map);
    }

    /* renamed from: u */
    public final void mo54917u() {
        for (Collection clear : this.f155873a.values()) {
            clear.clear();
        }
        this.f155873a.clear();
        this.f155874b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo54918v(Map map) {
        this.f155873a = map;
        this.f155874b = 0;
        for (Collection collection : map.values()) {
            C58838bb.m90868c(!collection.isEmpty());
            this.f155874b += collection.size();
        }
    }

    /* renamed from: w */
    public final boolean mo54919w(Object obj) {
        return this.f155873a.containsKey(obj);
    }

    /* renamed from: x */
    public final boolean mo54920x(Object obj, Object obj2) {
        Collection collection = (Collection) this.f155873a.get(obj);
        if (collection == null) {
            Collection a = mo54900a();
            if (a.add(obj2)) {
                this.f155874b++;
                this.f155873a.put(obj, a);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f155874b++;
            return true;
        }
    }
}
