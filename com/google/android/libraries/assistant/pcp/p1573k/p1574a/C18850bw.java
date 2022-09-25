package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.assistant.p3980n.p3985c.C53018i;
import com.google.assistant.p3980n.p3985c.C53025p;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bw */
/* compiled from: PG */
public final /* synthetic */ class C18850bw implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C18850bw f53092a = new C18850bw();

    private /* synthetic */ C18850bw() {
    }

    public final Object apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C59071e eVar = C18868cn.f53115a;
        if (!axVar.mo56113h()) {
            return Optional.empty();
        }
        C53018i iVar = (C53018i) C53025p.f138983b.createBuilder();
        Stream filter = Collection.EL.stream(((C118365g) axVar.mo56107c()).f328544a).filter(C18847bt.f53085a).map(C18859ce.f53106a).filter(C18860cf.f53107a);
        Objects.requireNonNull(iVar);
        filter.forEach(new C18861cg(iVar));
        return Optional.m71637of((C53025p) iVar.build());
    }
}
