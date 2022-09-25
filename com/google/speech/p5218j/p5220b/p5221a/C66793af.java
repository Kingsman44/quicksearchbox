package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.speech.j.b.a.af */
/* compiled from: PG */
public final class C66793af extends C62934bn implements C63001dt {
    public C66793af() {
        super(C66794ag.f181640f);
    }

    /* renamed from: a */
    public final void mo59742a(Iterable iterable) {
        copyOnWrite();
        C66794ag agVar = (C66794ag) this.instance;
        C66794ag agVar2 = C66794ag.f181640f;
        C62971cq cqVar = agVar.f181645d;
        if (!cqVar.mo58948c()) {
            agVar.f181645d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) agVar.f181645d);
    }
}
