package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8393i;
import com.google.p386ak.p393c.C8383a;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.ak.b.a.t */
/* compiled from: PG */
final class C8320t extends C8266aa {

    /* renamed from: a */
    public final C8266aa f29135a;

    /* renamed from: b */
    private final C8393i f29136b;

    /* renamed from: c */
    private final Type f29137c;

    public C8320t(C8393i iVar, C8266aa aaVar, Type type) {
        this.f29136b = iVar;
        this.f29135a = aaVar;
        this.f29137c = type;
    }

    /* renamed from: a */
    public final Object mo17029a(C8385a aVar) {
        return this.f29135a.mo17029a(aVar);
    }

    /* renamed from: b */
    public final void mo17030b(C8387c cVar, Object obj) {
        C8266aa aaVar = this.f29135a;
        Type type = this.f29137c;
        Type type2 = (obj == null || (type != Object.class && !(type instanceof TypeVariable) && !(type instanceof Class))) ? type : obj.getClass();
        if (type2 != type) {
            aaVar = this.f29136b.mo17143a(new C8383a(type2));
            if (aaVar instanceof C8315o) {
                C8266aa aaVar2 = this.f29135a;
                if (!(aaVar2 instanceof C8315o)) {
                    aaVar = aaVar2;
                }
            }
        }
        aaVar.mo17030b(cVar, obj);
    }
}
