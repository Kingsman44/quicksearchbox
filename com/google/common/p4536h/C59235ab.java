package com.google.common.p4536h;

import com.google.common.p4522b.C58662ni;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.h.ab */
/* compiled from: PG */
class C59235ab extends C59248e {

    /* renamed from: a */
    public final C59269z f157344a;

    /* renamed from: b */
    public long f157345b;

    public C59235ab(C59246c cVar) {
        Map map;
        C59259p pVar = cVar.f157352a;
        Integer num = 10;
        int intValue = num.intValue();
        C59258o oVar = C59258o.UNORDERED;
        int ordinal = pVar.f157370a.ordinal();
        if (ordinal == 0) {
            map = C58662ni.m90351j(intValue);
        } else if (ordinal == 1 || ordinal == 2) {
            map = C58662ni.m90353l(intValue);
        } else if (ordinal != 3) {
            throw new AssertionError();
        } else {
            throw new UnsupportedOperationException("This ordering does not define a comparator.");
        }
        this.f157344a = new C59269z(map);
        this.f157345b = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo56698a() {
        return this.f157345b;
    }

    /* renamed from: c */
    public final Set mo56699c() {
        return new C59268y(this.f157344a);
    }

    /* renamed from: d */
    public final Set mo56700d(Object obj) {
        C59257n nVar = (C59257n) this.f157344a.mo56737a(obj);
        if (nVar != null) {
            return new C59252i(nVar);
        }
        obj.getClass();
        throw new IllegalArgumentException("Node " + obj + " is not an element of this graph.");
    }

    /* renamed from: e */
    public final boolean mo56701e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo56702f() {
        return true;
    }

    /* renamed from: h */
    public final Object mo56703h(Object obj, Object obj2) {
        Object obj3;
        obj.getClass();
        obj2.getClass();
        C59257n nVar = (C59257n) this.f157344a.mo56737a(obj);
        if (nVar == null || (obj3 = nVar.f157361b.get(obj2)) == C59257n.f157360a) {
            obj3 = null;
        } else if (obj3 instanceof C59256m) {
            obj3 = ((C59256m) obj3).f157359a;
        }
        if (obj3 == null) {
            return null;
        }
        return obj3;
    }
}
