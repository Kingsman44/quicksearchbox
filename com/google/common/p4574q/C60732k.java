package com.google.common.p4574q;

import com.google.common.p4522b.C58432ev;
import com.google.common.p4522b.C58439fb;
import com.google.common.p4522b.C58570jy;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.q.k */
/* compiled from: PG */
final class C60732k extends C58439fb {

    /* renamed from: a */
    Set f164736a;

    /* renamed from: b */
    Collection f164737b;

    /* renamed from: c */
    final /* synthetic */ Map f164738c;

    /* renamed from: d */
    final /* synthetic */ C60733l f164739d;

    public C60732k(C60733l lVar, Map map) {
        this.f164739d = lVar;
        this.f164738c = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Map mo5942b() {
        return this.f164738c;
    }

    public final boolean containsValue(Object obj) {
        return C58570jy.m90164p(((C58432ev) values()).iterator(), obj);
    }

    public final Set entrySet() {
        Set set = this.f164736a;
        if (set != null) {
            return set;
        }
        C60724c cVar = new C60724c(this.f164738c.entrySet());
        this.f164736a = cVar;
        return cVar;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        List g = this.f164739d.mo54902c(obj);
        if (g.isEmpty()) {
            return null;
        }
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f164738c;
    }

    public final Collection values() {
        Collection collection = this.f164737b;
        if (collection != null) {
            return collection;
        }
        C60726e eVar = new C60726e(this.f164738c.values(), entrySet());
        this.f164737b = eVar;
        return eVar;
    }
}
