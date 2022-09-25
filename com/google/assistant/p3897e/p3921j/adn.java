package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.assistant.e.j.adn */
/* compiled from: PG */
public final class adn extends C62934bn implements C63001dt {
    public adn() {
        super(ado.f134898b);
    }

    /* renamed from: a */
    public final void mo53675a(int i) {
        copyOnWrite();
        ado ado = (ado) this.instance;
        ado ado2 = ado.f134898b;
        C62961ch chVar = ado.f134900a;
        if (!chVar.mo58948c()) {
            ado.f134900a = C62942bv.mutableCopy(chVar);
        }
        ado.f134900a.mo58916g(i - 1);
    }
}
