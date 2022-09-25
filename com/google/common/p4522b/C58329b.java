package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Map;

/* renamed from: com.google.common.b.b */
/* compiled from: PG */
final class C58329b extends C58440fc {

    /* renamed from: a */
    final /* synthetic */ C58464g f155901a;

    /* renamed from: b */
    private final Map.Entry f155902b;

    public C58329b(C58464g gVar, Map.Entry entry) {
        this.f155901a = gVar;
        this.f155902b = entry;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map.Entry mo55025b() {
        return this.f155902b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f155902b;
    }

    public final Object setValue(Object obj) {
        this.f155901a.mo55082d(obj);
        C58838bb.m90884s(this.f155901a.entrySet().contains(this), "entry no longer in map");
        if (C58832aw.m90831a(obj, getValue())) {
            return obj;
        }
        C58838bb.m90873h(!this.f155901a.f156090b.containsKey(obj), "value already present: %s", obj);
        Object value = this.f155902b.setValue(obj);
        C58838bb.m90884s(C58832aw.m90831a(obj, this.f155901a.get(getKey())), "entry no longer in map");
        this.f155901a.mo55357k(getKey(), true, value, obj);
        return value;
    }
}
