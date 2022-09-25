package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1578m.C18984n;
import com.google.android.libraries.assistant.pcp.p1578m.C18985o;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.b.n */
/* compiled from: PG */
public final /* synthetic */ class C18543n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C53306j f52540a;

    public /* synthetic */ C18543n(C53306j jVar) {
        this.f52540a = jVar;
    }

    public final Object apply(Object obj) {
        C53306j jVar = this.f52540a;
        C18984n nVar = (C18984n) C18985o.f53347b.createBuilder();
        Collection.EL.stream((C58485gu) obj).forEach(new C18544o(nVar, jVar));
        return (C18985o) nVar.build();
    }
}
