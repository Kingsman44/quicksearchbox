package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29385ei;
import com.google.android.libraries.mdi.download.C29388el;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.jd */
/* compiled from: PG */
public final /* synthetic */ class C29224jd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ List f79222a;

    public /* synthetic */ C29224jd(List list) {
        this.f79222a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f79222a;
        C29385ei eiVar = (C29385ei) ((C29388el) obj).toBuilder();
        eiVar.copyOnWrite();
        C29388el elVar = (C29388el) eiVar.instance;
        C62971cq cqVar = elVar.f79668c;
        if (!cqVar.mo58948c()) {
            elVar.f79668c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) elVar.f79668c);
        return (C29388el) eiVar.build();
    }
}
