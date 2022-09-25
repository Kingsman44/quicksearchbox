package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;

/* renamed from: com.google.ak.b.a.as */
/* compiled from: PG */
final class C8290as extends C8266aa {

    /* renamed from: a */
    final /* synthetic */ Class f29032a;

    /* renamed from: b */
    final /* synthetic */ C8291at f29033b;

    public C8290as(C8291at atVar, Class cls) {
        this.f29033b = atVar;
        this.f29032a = cls;
    }

    /* renamed from: a */
    public final Object mo17029a(C8385a aVar) {
        Object a = this.f29033b.f29035b.mo17029a(aVar);
        if (a == null || this.f29032a.isInstance(a)) {
            return a;
        }
        String name = this.f29032a.getName();
        String name2 = a.getClass().getName();
        String d = aVar.mo17113d(true);
        throw new C8406v("Expected a " + name + " but was " + name2 + "; at path " + d);
    }

    /* renamed from: b */
    public final void mo17030b(C8387c cVar, Object obj) {
        this.f29033b.f29035b.mo17030b(cVar, obj);
    }
}
