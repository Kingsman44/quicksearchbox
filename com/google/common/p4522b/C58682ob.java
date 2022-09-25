package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.ob */
/* compiled from: PG */
final class C58682ob extends C58649mw {

    /* renamed from: a */
    final /* synthetic */ C58683oc f156409a;

    public C58682ob(C58683oc ocVar) {
        this.f156409a = ocVar;
    }

    /* renamed from: a */
    public final Map mo55683a() {
        return this.f156409a;
    }

    public final Iterator iterator() {
        return C58662ni.m90352k(this.f156409a.f156410a.mo54951D(), new C58681oa(this));
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        C58683oc ocVar = this.f156409a;
        ocVar.f156410a.mo54951D().remove(((Map.Entry) Objects.requireNonNull((Map.Entry) obj)).getKey());
        return true;
    }
}
