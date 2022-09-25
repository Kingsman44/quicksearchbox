package p5535j.p5536a.p5545c.p5547b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: j.a.c.b.a */
/* compiled from: PG */
public final class C70970a extends C62934bn implements C63001dt {
    public C70970a() {
        super(C70971b.f189249k);
    }

    /* renamed from: a */
    public final void mo62595a(Iterable iterable) {
        copyOnWrite();
        C70971b bVar = (C70971b) this.instance;
        C70971b bVar2 = C70971b.f189249k;
        C62961ch chVar = bVar.f189261j;
        if (!chVar.mo58948c()) {
            bVar.f189261j = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) bVar.f189261j);
    }
}
