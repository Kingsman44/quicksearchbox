package com.google.android.libraries.search.assistant.p2820v.p2821a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.v.a.c */
/* compiled from: PG */
public final class C36773c extends C62934bn implements C63001dt {
    public C36773c() {
        super(C36774d.f95831g);
    }

    /* renamed from: a */
    public final void mo40391a(Iterable iterable) {
        copyOnWrite();
        C36774d dVar = (C36774d) this.instance;
        C36774d dVar2 = C36774d.f95831g;
        C62964ck ckVar = dVar.f95837e;
        if (!ckVar.mo58948c()) {
            dVar.f95837e = C62942bv.mutableCopy(ckVar);
        }
        C62947c.addAll(iterable, (List) dVar.f95837e);
    }
}
