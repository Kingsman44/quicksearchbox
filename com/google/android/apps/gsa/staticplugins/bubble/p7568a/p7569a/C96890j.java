package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C96890j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f270873a;

    public /* synthetic */ C96890j(C58528ij ijVar) {
        this.f270873a = ijVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f270873a;
        C96874a aVar = (C96874a) ((C96882b) obj).toBuilder();
        aVar.copyOnWrite();
        ((C96882b) aVar.instance).f270859d = C96882b.emptyIntList();
        aVar.copyOnWrite();
        C96882b bVar = (C96882b) aVar.instance;
        C62961ch chVar = bVar.f270859d;
        if (!chVar.mo58948c()) {
            bVar.f270859d = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) ijVar, (List) bVar.f270859d);
        return (C96882b) aVar.build();
    }
}
