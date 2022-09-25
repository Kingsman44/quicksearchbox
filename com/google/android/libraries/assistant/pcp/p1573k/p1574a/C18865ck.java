package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.android.apps.gsa.p8839t.p8845f.C118362d;
import com.google.android.apps.gsa.p8839t.p8845f.C118363e;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123741bh;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.ck */
/* compiled from: PG */
public final /* synthetic */ class C18865ck implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118364f f53112a;

    public /* synthetic */ C18865ck(C118364f fVar) {
        this.f53112a = fVar;
    }

    public final void accept(Object obj) {
        C118364f fVar = this.f53112a;
        C59071e eVar = C18868cn.f53115a;
        C118362d dVar = (C118362d) C118363e.f328532h.createBuilder();
        C123741bh bhVar = (C123741bh) C123742bi.f341800b.createBuilder();
        bhVar.mo106121a((List) obj);
        dVar.copyOnWrite();
        C118363e eVar2 = (C118363e) dVar.instance;
        C123742bi biVar = (C123742bi) bhVar.build();
        biVar.getClass();
        eVar2.f328536c = biVar;
        eVar2.f328535b = 6;
        fVar.mo103681c((C118363e) dVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
