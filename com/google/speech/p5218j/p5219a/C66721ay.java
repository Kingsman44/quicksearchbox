package com.google.speech.p5218j.p5219a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.speech.j.a.ay */
/* compiled from: PG */
public final class C66721ay extends C62936bp implements C62938br {
    public C66721ay() {
        super(C66722az.f181493f);
    }

    /* renamed from: a */
    public final void mo59716a(Iterable iterable) {
        copyOnWrite();
        C66722az azVar = (C66722az) this.instance;
        C66722az azVar2 = C66722az.f181493f;
        C62971cq cqVar = azVar.f181498d;
        if (!cqVar.mo58948c()) {
            azVar.f181498d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) azVar.f181498d);
    }

    /* renamed from: b */
    public final void mo59717b(C66698ab abVar) {
        copyOnWrite();
        C66722az azVar = (C66722az) this.instance;
        C66707ak akVar = (C66707ak) abVar.build();
        C66722az azVar2 = C66722az.f181493f;
        akVar.getClass();
        azVar.mo59719a();
        azVar.f181496b.add(akVar);
    }

    /* renamed from: c */
    public final void mo59718c(C66707ak akVar) {
        copyOnWrite();
        C66722az azVar = (C66722az) this.instance;
        C66722az azVar2 = C66722az.f181493f;
        akVar.getClass();
        azVar.mo59719a();
        azVar.f181496b.add(akVar);
    }
}
