package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.apps.c.a.a.a.a.ao */
/* compiled from: PG */
public final class C45635ao extends C62934bn implements C63001dt {
    public C45635ao() {
        super(C45638ar.f120061c);
    }

    /* renamed from: a */
    public final void mo49725a(Iterable iterable) {
        copyOnWrite();
        C45638ar arVar = (C45638ar) this.instance;
        C45638ar arVar2 = C45638ar.f120061c;
        C62964ck ckVar = arVar.f120063a;
        if (!ckVar.mo58948c()) {
            arVar.f120063a = C62942bv.mutableCopy(ckVar);
        }
        C62947c.addAll(iterable, (List) arVar.f120063a);
    }

    /* renamed from: b */
    public final void mo49726b(C45677w wVar) {
        copyOnWrite();
        C45638ar arVar = (C45638ar) this.instance;
        C45678x xVar = (C45678x) wVar.build();
        C45638ar arVar2 = C45638ar.f120061c;
        xVar.getClass();
        arVar.mo49729a();
        arVar.f120064b.add(xVar);
    }

    /* renamed from: c */
    public final void mo49727c(C45678x xVar) {
        copyOnWrite();
        C45638ar arVar = (C45638ar) this.instance;
        C45638ar arVar2 = C45638ar.f120061c;
        xVar.getClass();
        arVar.mo49729a();
        arVar.f120064b.add(xVar);
    }
}
