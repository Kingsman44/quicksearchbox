package com.google.android.libraries.geller.portable.database;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p5129p.p5131b.C65776bg;
import com.google.protos.p5129p.p5131b.C65786bq;
import java.util.Map;

/* renamed from: com.google.android.libraries.geller.portable.database.u */
/* compiled from: PG */
public final /* synthetic */ class C21973u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f60604a;

    public /* synthetic */ C21973u(Map map) {
        this.f60604a = map;
    }

    public final Object apply(Object obj) {
        Map map = this.f60604a;
        C65786bq bqVar = (C65786bq) obj;
        C58528ij ijVar = C21977y.f60610a;
        C65776bg bgVar = (C65776bg) C65786bq.f178834b.createBuilder();
        bgVar.copyOnWrite();
        ((C65786bq) bgVar.instance).mo59427a().putAll(map);
        return (C65786bq) bgVar.build();
    }
}
