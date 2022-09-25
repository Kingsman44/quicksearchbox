package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.tz */
/* compiled from: PG */
public final class C60548tz extends C62934bn implements C63001dt {
    public C60548tz() {
        super(C60555uf.f164065cO);
    }

    /* renamed from: a */
    public final void mo57111a(Iterable iterable) {
        copyOnWrite();
        C60555uf ufVar = (C60555uf) this.instance;
        C60555uf ufVar2 = C60555uf.f164065cO;
        C62971cq cqVar = ufVar.f164098aE;
        if (!cqVar.mo58948c()) {
            ufVar.f164098aE = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) ufVar.f164098aE);
    }

    /* renamed from: b */
    public final void mo57112b(aeb aeb) {
        copyOnWrite();
        C60555uf ufVar = (C60555uf) this.instance;
        C60555uf ufVar2 = C60555uf.f164065cO;
        aeb.getClass();
        C62971cq cqVar = ufVar.f164242ct;
        if (!cqVar.mo58948c()) {
            ufVar.f164242ct = C62942bv.mutableCopy(cqVar);
        }
        ufVar.f164242ct.add(aeb);
    }

    /* renamed from: c */
    public final void mo57113c(C60632xb xbVar) {
        copyOnWrite();
        C60555uf ufVar = (C60555uf) this.instance;
        C60633xc xcVar = (C60633xc) xbVar.build();
        C60555uf ufVar2 = C60555uf.f164065cO;
        xcVar.getClass();
        C62971cq cqVar = ufVar.f164135ap;
        if (!cqVar.mo58948c()) {
            ufVar.f164135ap = C62942bv.mutableCopy(cqVar);
        }
        ufVar.f164135ap.add(xcVar);
    }
}
