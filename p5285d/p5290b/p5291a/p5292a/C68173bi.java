package p5285d.p5290b.p5291a.p5292a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: d.b.a.a.bi */
/* compiled from: PG */
public final class C68173bi extends C62934bn implements C63001dt {
    public C68173bi() {
        super(C68174bj.f184478c);
    }

    /* renamed from: a */
    public final void mo60282a(Iterable iterable) {
        copyOnWrite();
        C68174bj bjVar = (C68174bj) this.instance;
        C68174bj bjVar2 = C68174bj.f184478c;
        C62971cq cqVar = bjVar.f184480a;
        if (!cqVar.mo58948c()) {
            bjVar.f184480a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bjVar.f184480a);
    }
}
