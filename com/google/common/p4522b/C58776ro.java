package com.google.common.p4522b;

import java.util.Map;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.ro */
/* compiled from: PG */
final class C58776ro extends C58661nh {

    /* renamed from: a */
    final /* synthetic */ C58778rq f156557a;

    public C58776ro(C58778rq rqVar) {
        this.f156557a = rqVar;
    }

    /* renamed from: b */
    public final Set mo55700b() {
        return new C58775rn(this);
    }

    public final boolean containsKey(Object obj) {
        return this.f156557a.mo55948p(obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        if (this.f156557a.mo55948p(obj)) {
            return new C58773rl(this.f156557a, Objects.requireNonNull(obj));
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return (Map) this.f156557a.f156559a.remove(obj);
    }
}
