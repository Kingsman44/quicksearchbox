package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127929h;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: j.a.c.c.a.cd */
/* compiled from: PG */
public final class C71031cd extends C62934bn implements C63001dt {
    public C71031cd() {
        super(C71032ce.f189442e);
    }

    /* renamed from: a */
    public final void mo62599a(Iterable iterable) {
        copyOnWrite();
        C71032ce ceVar = (C71032ce) this.instance;
        C62962ci ciVar = C71032ce.f189441d;
        C62961ch chVar = ceVar.f189446c;
        if (!chVar.mo58948c()) {
            ceVar.f189446c = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ceVar.f189446c.mo58916g(((C127929h) it.next()).getNumber());
        }
    }
}
