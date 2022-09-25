package com.google.android.libraries.assistant.pcp.p1579n;

import com.google.android.libraries.assistant.pcp.p1578m.C18984n;
import com.google.android.libraries.assistant.pcp.p1578m.C18985o;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.IntStream;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.n.i */
/* compiled from: PG */
public final /* synthetic */ class C19021i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C19023k f53405a;

    /* renamed from: b */
    public final /* synthetic */ Optional f53406b;

    public /* synthetic */ C19021i(C19023k kVar, Optional optional) {
        this.f53405a = kVar;
        this.f53406b = optional;
    }

    public final Object apply(Object obj) {
        C19023k kVar = this.f53405a;
        Optional optional = this.f53406b;
        List list = (List) obj;
        C18984n nVar = (C18984n) C18985o.f53347b.createBuilder();
        Stream mapToObj = IntStream.CC.range(0, list.size()).mapToObj(new C19019g(kVar, optional, list));
        Objects.requireNonNull(nVar);
        mapToObj.forEach(new C19020h(nVar));
        return (C18985o) nVar.build();
    }
}
