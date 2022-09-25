package com.google.speech.grammar.pumpkin;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.grammar.pumpkin.r */
/* compiled from: PG */
public final class C66526r extends C62934bn implements C63001dt {
    public C66526r() {
        super(C66527s.f180937b);
    }

    /* renamed from: a */
    public final void mo59670a(Iterable iterable) {
        copyOnWrite();
        C66527s sVar = (C66527s) this.instance;
        C66527s sVar2 = C66527s.f180937b;
        sVar.mo59672a();
        C62947c.addAll(iterable, (List) sVar.f180939a);
    }

    /* renamed from: b */
    public final void mo59671b(C66525q qVar) {
        copyOnWrite();
        C66527s sVar = (C66527s) this.instance;
        C66527s sVar2 = C66527s.f180937b;
        qVar.getClass();
        sVar.mo59672a();
        sVar.f180939a.add(qVar);
    }
}
