package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.aq */
/* compiled from: PG */
public final class C104500aq extends C62934bn implements C63001dt {
    public C104500aq() {
        super(C104501ar.f290649d);
    }

    /* renamed from: a */
    public final void mo94230a(Iterable iterable) {
        copyOnWrite();
        C104501ar arVar = (C104501ar) this.instance;
        C104501ar arVar2 = C104501ar.f290649d;
        C62971cq cqVar = arVar.f290653c;
        if (!cqVar.mo58948c()) {
            arVar.f290653c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) arVar.f290653c);
    }
}
