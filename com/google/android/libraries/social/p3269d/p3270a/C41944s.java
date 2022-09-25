package com.google.android.libraries.social.p3269d.p3270a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.social.d.a.s */
/* compiled from: PG */
public final class C41944s extends C62934bn implements C63001dt {
    public C41944s() {
        super(C41945t.f109486d);
    }

    /* renamed from: a */
    public final void mo44386a(Iterable iterable) {
        copyOnWrite();
        C41945t tVar = (C41945t) this.instance;
        C41945t tVar2 = C41945t.f109486d;
        C62971cq cqVar = tVar.f109489b;
        if (!cqVar.mo58948c()) {
            tVar.f109489b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) tVar.f109489b);
    }
}
