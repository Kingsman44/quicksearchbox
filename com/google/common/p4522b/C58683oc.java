package com.google.common.p4522b;

import java.util.List;
import java.util.Set;

/* renamed from: com.google.common.b.oc */
/* compiled from: PG */
final class C58683oc extends C58661nh {

    /* renamed from: a */
    public final C58671nr f156410a;

    public C58683oc(C58671nr nrVar) {
        this.f156410a = nrVar;
    }

    /* renamed from: b */
    public final Set mo55700b() {
        return new C58682ob(this);
    }

    public final void clear() {
        this.f156410a.mo54917u();
    }

    public final boolean containsKey(Object obj) {
        return this.f156410a.mo54919w(obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return new C58574kb((C58584kl) this.f156410a, obj);
        }
        return null;
    }

    public final boolean isEmpty() {
        return this.f156410a.mo54954G();
    }

    public final Set keySet() {
        return this.f156410a.mo54951D();
    }

    public final /* synthetic */ Object remove(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        C58584kl klVar = (C58584kl) this.f156410a;
        List d = klVar.mo55585d(obj);
        klVar.mo55587f(obj);
        return d;
    }

    public final int size() {
        return this.f156410a.mo54951D().size();
    }
}
