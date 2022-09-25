package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.android.apps.gsa.p8839t.p8845f.C118362d;
import com.google.android.apps.gsa.p8839t.p8845f.C118363e;
import com.google.android.apps.gsa.p8839t.p8845f.C118364f;
import com.google.android.apps.gsa.p8839t.p8845f.C118365g;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bu */
/* compiled from: PG */
public final /* synthetic */ class C18848bu implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C18848bu f53086a = new C18848bu();

    private /* synthetic */ C18848bu() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        C59071e eVar = C18868cn.f53115a;
        if (!optional.isPresent()) {
            return C58836b.f156633a;
        }
        C118364f fVar = (C118364f) C118365g.f328542b.createBuilder();
        C118362d dVar = (C118362d) C118363e.f328532h.createBuilder();
        C123730ax axVar = (C123730ax) optional.get();
        dVar.copyOnWrite();
        C118363e eVar2 = (C118363e) dVar.instance;
        axVar.getClass();
        eVar2.f328536c = axVar;
        eVar2.f328535b = 5;
        fVar.mo103680b(dVar);
        return C58833ax.m90834k((C118365g) fVar.build());
    }
}
