package p5535j.p5536a.p5562i.p5568b.p5569a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: j.a.i.b.a.t */
/* compiled from: PG */
public final class C71325t extends C62934bn implements C63001dt {
    public C71325t() {
        super(C71326u.f190493e);
    }

    /* renamed from: a */
    public final void mo62667a(Iterable iterable) {
        copyOnWrite();
        C71326u uVar = (C71326u) this.instance;
        C71326u uVar2 = C71326u.f190493e;
        C62971cq cqVar = uVar.f190496b;
        if (!cqVar.mo58948c()) {
            uVar.f190496b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) uVar.f190496b);
    }

    /* renamed from: b */
    public final void mo62668b(Iterable iterable) {
        copyOnWrite();
        C71326u uVar = (C71326u) this.instance;
        C71326u uVar2 = C71326u.f190493e;
        C62971cq cqVar = uVar.f190497c;
        if (!cqVar.mo58948c()) {
            uVar.f190497c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) uVar.f190497c);
    }
}
