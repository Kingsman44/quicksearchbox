package com.google.common.p4522b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.az */
/* compiled from: PG */
abstract class C58328az implements C58785rx {

    /* renamed from: a */
    private transient Set f155899a;

    /* renamed from: b */
    private transient Collection f155900b;

    /* renamed from: a */
    public Object mo55009a(Object obj, Object obj2) {
        Map map = (Map) C58662ni.m90348g(mo55202t(), obj);
        if (map == null) {
            return null;
        }
        return C58662ni.m90348g(map, obj2);
    }

    /* renamed from: b */
    public Object mo55010b(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    /* renamed from: c */
    public Collection mo55011c() {
        return new C58327ay(this);
    }

    /* renamed from: d */
    public final Collection mo55012d() {
        Collection collection = this.f155900b;
        if (collection != null) {
            return collection;
        }
        Collection c = mo55011c();
        this.f155900b = c;
        return c;
    }

    /* renamed from: e */
    public abstract Iterator mo55013e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C58785rx)) {
            return false;
        }
        return mo55016g().equals(((C58785rx) obj).mo55016g());
    }

    /* renamed from: f */
    public Iterator mo55015f() {
        return new C58325aw(mo55016g().iterator());
    }

    /* renamed from: g */
    public Set mo55016g() {
        Set set = this.f155899a;
        if (set != null) {
            return set;
        }
        Set h = mo55017h();
        this.f155899a = h;
        return h;
    }

    /* renamed from: h */
    public Set mo55017h() {
        return new C58326ax(this);
    }

    public final int hashCode() {
        return mo55016g().hashCode();
    }

    /* renamed from: i */
    public void mo55019i() {
        throw null;
    }

    /* renamed from: j */
    public final void mo55020j(C58785rx rxVar) {
        for (C58784rw rwVar : rxVar.mo55016g()) {
            mo55010b(rwVar.mo55972b(), rwVar.mo55971a(), rwVar.mo55973c());
        }
    }

    /* renamed from: k */
    public boolean mo55021k(Object obj, Object obj2) {
        throw null;
    }

    /* renamed from: l */
    public boolean mo55022l(Object obj) {
        throw null;
    }

    /* renamed from: m */
    public final boolean mo55023m() {
        return mo55196n() == 0;
    }

    public final String toString() {
        return mo55202t().toString();
    }
}
