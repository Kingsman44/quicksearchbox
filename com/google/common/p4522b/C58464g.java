package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.g */
/* compiled from: PG */
public class C58464g extends C58439fb implements Serializable, C58334be {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public transient Map f156089a;

    /* renamed from: b */
    public transient C58464g f156090b;

    /* renamed from: c */
    private transient Set f156091c;

    /* renamed from: d */
    private transient Set f156092d;

    /* renamed from: e */
    private transient Set f156093e;

    public C58464g(Map map, C58464g gVar) {
        this.f156089a = map;
        this.f156090b = gVar;
    }

    public C58464g(Map map, Map map2) {
        mo55356j(map, map2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo5942b() {
        return this.f156089a;
    }

    /* renamed from: c */
    public Object mo55081c(Object obj) {
        throw null;
    }

    public final void clear() {
        this.f156089a.clear();
        this.f156090b.f156089a.clear();
    }

    public final boolean containsValue(Object obj) {
        return this.f156090b.containsKey(obj);
    }

    /* renamed from: d */
    public Object mo55082d(Object obj) {
        return obj;
    }

    /* renamed from: e */
    public final C58334be mo55027e() {
        return this.f156090b;
    }

    public final Set entrySet() {
        Set set = this.f156093e;
        if (set != null) {
            return set;
        }
        C58356c cVar = new C58356c(this);
        this.f156093e = cVar;
        return cVar;
    }

    /* renamed from: f */
    public final Object mo55353f(Object obj) {
        Object remove = this.f156089a.remove(obj);
        mo55355i(remove);
        return remove;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Iterator mo55354g() {
        return new C58302a(this, this.f156089a.entrySet().iterator());
    }

    /* renamed from: h */
    public final Set mo55028h() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f156089a;
    }

    /* renamed from: i */
    public final void mo55355i(Object obj) {
        this.f156090b.f156089a.remove(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo55356j(Map map, Map map2) {
        boolean z = true;
        C58838bb.m90883r(this.f156089a == null);
        C58838bb.m90883r(this.f156090b == null);
        C58838bb.m90868c(map.isEmpty());
        C58838bb.m90868c(map2.isEmpty());
        if (map == map2) {
            z = false;
        }
        C58838bb.m90868c(z);
        this.f156089a = map;
        this.f156090b = new C58383d(map2, this);
    }

    /* renamed from: k */
    public final void mo55357k(Object obj, boolean z, Object obj2, Object obj3) {
        if (z) {
            mo55355i(obj2);
        }
        this.f156090b.f156089a.put(obj3, obj);
    }

    public final Set keySet() {
        Set set = this.f156091c;
        if (set != null) {
            return set;
        }
        C58410e eVar = new C58410e(this);
        this.f156091c = eVar;
        return eVar;
    }

    public final Object put(Object obj, Object obj2) {
        mo55081c(obj);
        mo55082d(obj2);
        boolean containsKey = containsKey(obj);
        if (containsKey && C58832aw.m90831a(obj2, get(obj))) {
            return obj2;
        }
        C58838bb.m90873h(!this.f156090b.containsKey(obj2), "value already present: %s", obj2);
        Object put = this.f156089a.put(obj, obj2);
        mo55357k(obj, containsKey, put, obj2);
        return put;
    }

    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return mo55353f(obj);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        Set set = this.f156092d;
        if (set != null) {
            return set;
        }
        C58437f fVar = new C58437f(this);
        this.f156092d = fVar;
        return fVar;
    }
}
