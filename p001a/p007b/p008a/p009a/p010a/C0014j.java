package p001a.p007b.p008a.p009a.p010a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: a.b.a.a.a.j */
/* compiled from: PG */
public final class C0014j extends C62934bn implements C63001dt {
    public C0014j() {
        super(C0015k.f27g);
    }

    /* renamed from: a */
    public final void mo3a(String str) {
        copyOnWrite();
        C0015k kVar = (C0015k) this.instance;
        C0015k kVar2 = C0015k.f27g;
        str.getClass();
        C62971cq cqVar = kVar.f31c;
        if (!cqVar.mo58948c()) {
            kVar.f31c = C62942bv.mutableCopy(cqVar);
        }
        kVar.f31c.add(str);
    }
}
