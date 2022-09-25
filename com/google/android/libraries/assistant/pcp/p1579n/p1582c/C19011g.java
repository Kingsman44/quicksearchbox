package com.google.android.libraries.assistant.pcp.p1579n.p1582c;

import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3980n.p3985c.C53018i;
import com.google.assistant.p3980n.p3985c.C53019j;
import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.assistant.p3980n.p3985c.C53021l;
import com.google.assistant.p3980n.p3985c.C53024o;
import com.google.assistant.p3980n.p3985c.C53025p;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.n.c.g */
/* compiled from: PG */
public final /* synthetic */ class C19011g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C19015k f53384a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f53385b;

    public /* synthetic */ C19011g(C19015k kVar, C53306j jVar) {
        this.f53384a = kVar;
        this.f53385b = jVar;
    }

    public final Object apply(Object obj) {
        Queue queue;
        Queue queue2;
        C19015k kVar = this.f53384a;
        C53306j jVar = this.f53385b;
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        Optional optional2 = (Optional) list.get(1);
        Optional optional3 = (Optional) list.get(2);
        if (optional2 == null) {
            queue = new ArrayDeque();
        } else {
            queue = C19015k.m36444d(optional2);
        }
        if (optional3 == null) {
            queue2 = new ArrayDeque();
        } else {
            queue2 = C19015k.m36444d(optional3);
        }
        if (optional == null) {
            optional = Optional.empty();
        }
        C53019j jVar2 = (C53019j) C53020k.f138970d.createBuilder();
        C58485gu guVar = C19015k.f53389a;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C19014j jVar3 = (C19014j) guVar.get(i2);
            C52567wn wnVar = C52567wn.UNKNOWN;
            int ordinal = jVar3.mo24249b().ordinal();
            if (ordinal == 9) {
                C19015k.m36445e(jVar2, jVar3.mo24248a(), queue2);
            } else if (ordinal == 10) {
                C19015k.m36445e(jVar2, jVar3.mo24248a(), queue);
            } else if (ordinal == 21) {
                optional.ifPresent(new C19013i(kVar, jVar2, jVar));
            }
        }
        C53021l lVar = (C53021l) C53024o.f138977d.createBuilder();
        lVar.copyOnWrite();
        C53024o oVar = (C53024o) lVar.instance;
        oVar.f138981c = 2;
        oVar.f138979a |= 4;
        jVar2.copyOnWrite();
        C53020k kVar2 = (C53020k) jVar2.instance;
        C53024o oVar2 = (C53024o) lVar.build();
        oVar2.getClass();
        kVar2.f138973b = oVar2;
        kVar2.f138972a |= 1;
        C53020k kVar3 = (C53020k) jVar2.build();
        C53018i iVar = (C53018i) C53025p.f138983b.createBuilder();
        iVar.copyOnWrite();
        C53025p pVar = (C53025p) iVar.instance;
        kVar3.getClass();
        pVar.mo53958a();
        pVar.f138986a.add(kVar3);
        return Optional.m71637of((C53025p) iVar.build());
    }
}
