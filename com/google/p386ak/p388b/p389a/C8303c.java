package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8393i;
import com.google.p386ak.p388b.C8338al;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.ak.b.a.c */
/* compiled from: PG */
final class C8303c extends C8266aa {

    /* renamed from: a */
    private final C8266aa f29091a;

    /* renamed from: b */
    private final C8338al f29092b;

    public C8303c(C8393i iVar, Type type, C8266aa aaVar, C8338al alVar) {
        this.f29091a = new C8320t(iVar, aaVar, type);
        this.f29092b = alVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        Collection collection = (Collection) this.f29092b.mo17084a();
        aVar.mo17119j();
        while (aVar.mo17125p()) {
            collection.add(((C8320t) this.f29091a).f29135a.mo17029a(aVar));
        }
        aVar.mo17121l();
        return collection;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        Collection<Object> collection = (Collection) obj;
        if (collection == null) {
            cVar.mo17138h();
            return;
        }
        cVar.mo17131c();
        for (Object b : collection) {
            this.f29091a.mo17030b(cVar, b);
        }
        cVar.mo17134e();
    }
}
