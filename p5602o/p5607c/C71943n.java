package p5602o.p5607c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: o.c.n */
/* compiled from: PG */
public final class C71943n extends C62934bn implements C63001dt {
    public C71943n() {
        super(C71944o.f191610j);
    }

    /* renamed from: a */
    public final void mo63128a(Iterable iterable) {
        copyOnWrite();
        C71944o oVar = (C71944o) this.instance;
        C71944o oVar2 = C71944o.f191610j;
        C62971cq cqVar = oVar.f191618g;
        if (!cqVar.mo58948c()) {
            oVar.f191618g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) oVar.f191618g);
    }
}
