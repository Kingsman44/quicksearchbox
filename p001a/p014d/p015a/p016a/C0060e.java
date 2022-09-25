package p001a.p014d.p015a.p016a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: a.d.a.a.e */
/* compiled from: PG */
public final class C0060e extends C62934bn implements C63001dt {
    public C0060e() {
        super(C0061f.f159h);
    }

    /* renamed from: a */
    public final void mo25a(Iterable iterable) {
        copyOnWrite();
        C0061f fVar = (C0061f) this.instance;
        C0061f fVar2 = C0061f.f159h;
        C62971cq cqVar = fVar.f165e;
        if (!cqVar.mo58948c()) {
            fVar.f165e = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f165e);
    }

    /* renamed from: b */
    public final void mo26b(Iterable iterable) {
        copyOnWrite();
        C0061f fVar = (C0061f) this.instance;
        C0061f fVar2 = C0061f.f159h;
        C62971cq cqVar = fVar.f167g;
        if (!cqVar.mo58948c()) {
            fVar.f167g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) fVar.f167g);
    }
}
