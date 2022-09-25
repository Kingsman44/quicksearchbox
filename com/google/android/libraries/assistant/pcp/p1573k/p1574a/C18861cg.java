package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.assistant.p3980n.p3985c.C53018i;
import com.google.assistant.p3980n.p3985c.C53025p;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cg */
/* compiled from: PG */
public final /* synthetic */ class C18861cg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C53018i f53108a;

    public /* synthetic */ C18861cg(C53018i iVar) {
        this.f53108a = iVar;
    }

    public final void accept(Object obj) {
        C53018i iVar = this.f53108a;
        iVar.copyOnWrite();
        C53025p pVar = (C53025p) iVar.instance;
        C53025p pVar2 = C53025p.f138983b;
        pVar.mo53958a();
        C62947c.addAll((Iterable) (List) obj, (List) pVar.f138986a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
