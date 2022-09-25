package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: d.b.a.a.g */
/* compiled from: PG */
public final class C68194g extends C62934bn implements C63001dt {
    public C68194g() {
        super(C68195h.f184523l);
    }

    /* renamed from: a */
    public final void mo60287a(Iterable iterable) {
        copyOnWrite();
        C68195h hVar = (C68195h) this.instance;
        C68195h hVar2 = C68195h.f184523l;
        C62971cq cqVar = hVar.f184527c;
        if (!cqVar.mo58948c()) {
            hVar.f184527c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) hVar.f184527c);
    }
}
