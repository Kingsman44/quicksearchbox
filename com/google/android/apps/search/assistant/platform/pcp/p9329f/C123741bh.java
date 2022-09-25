package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.assistant.p3980n.p3985c.C53019j;
import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bh */
/* compiled from: PG */
public final class C123741bh extends C62934bn implements C63001dt {
    public C123741bh() {
        super(C123742bi.f341800b);
    }

    /* renamed from: a */
    public final void mo106121a(Iterable iterable) {
        copyOnWrite();
        C123742bi biVar = (C123742bi) this.instance;
        C123742bi biVar2 = C123742bi.f341800b;
        biVar.mo106123a();
        C62947c.addAll(iterable, (List) biVar.f341802a);
    }

    /* renamed from: b */
    public final void mo106122b(C53019j jVar) {
        copyOnWrite();
        C123742bi biVar = (C123742bi) this.instance;
        C53020k kVar = (C53020k) jVar.build();
        C123742bi biVar2 = C123742bi.f341800b;
        kVar.getClass();
        biVar.mo106123a();
        biVar.f341802a.add(kVar);
    }
}
