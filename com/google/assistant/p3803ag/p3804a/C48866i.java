package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.ag.a.i */
/* compiled from: PG */
public final class C48866i extends C62934bn implements C63001dt {
    public C48866i() {
        super(C48867j.f126463c);
    }

    /* renamed from: a */
    public final void mo53184a(C48864g gVar) {
        copyOnWrite();
        C48867j jVar = (C48867j) this.instance;
        C48867j jVar2 = C48867j.f126463c;
        gVar.getClass();
        C62961ch chVar = jVar.f126465a;
        if (!chVar.mo58948c()) {
            jVar.f126465a = C62942bv.mutableCopy(chVar);
        }
        jVar.f126465a.mo58916g(gVar.f126454k);
    }

    /* renamed from: b */
    public final void mo53185b(int i) {
        copyOnWrite();
        C48867j jVar = (C48867j) this.instance;
        C48867j jVar2 = C48867j.f126463c;
        C62961ch chVar = jVar.f126466b;
        if (!chVar.mo58948c()) {
            jVar.f126466b = C62942bv.mutableCopy(chVar);
        }
        jVar.f126466b.mo58916g(i - 1);
    }
}
