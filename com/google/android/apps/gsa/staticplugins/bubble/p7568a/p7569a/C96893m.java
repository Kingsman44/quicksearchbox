package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62947c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C96893m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f270876a;

    public /* synthetic */ C96893m(C58528ij ijVar) {
        this.f270876a = ijVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f270876a;
        C96874a aVar = (C96874a) ((C96882b) obj).toBuilder();
        aVar.copyOnWrite();
        ((C96882b) aVar.instance).f270857b = C96882b.emptyProtobufList();
        aVar.copyOnWrite();
        C96882b bVar = (C96882b) aVar.instance;
        bVar.mo90367a();
        C62947c.addAll((Iterable) ijVar, (List) bVar.f270857b);
        return (C96882b) aVar.build();
    }
}
