package com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.b.a.f */
/* compiled from: PG */
public final class C116427f extends C62934bn implements C63001dt {
    public C116427f() {
        super(C116428g.f322833d);
    }

    /* renamed from: a */
    public final void mo102697a(Iterable iterable) {
        copyOnWrite();
        C116428g gVar = (C116428g) this.instance;
        C116428g gVar2 = C116428g.f322833d;
        C62971cq cqVar = gVar.f322837c;
        if (!cqVar.mo58948c()) {
            gVar.f322837c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) gVar.f322837c);
    }
}
