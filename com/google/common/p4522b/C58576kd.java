package com.google.common.p4522b;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.b.kd */
/* compiled from: PG */
final class C58576kd extends C58755qu {

    /* renamed from: a */
    final /* synthetic */ C58584kl f156246a;

    public C58576kd(C58584kl klVar) {
        this.f156246a = klVar;
    }

    public final boolean contains(Object obj) {
        return this.f156246a.mo54919w(obj);
    }

    public final Iterator iterator() {
        return new C58579kg(this.f156246a);
    }

    public final boolean remove(Object obj) {
        C58584kl klVar = this.f156246a;
        List d = klVar.mo55585d(obj);
        klVar.mo55587f(obj);
        return !d.isEmpty();
    }

    public final int size() {
        return this.f156246a.f156277d.size();
    }
}
