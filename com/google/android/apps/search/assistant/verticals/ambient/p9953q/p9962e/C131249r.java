package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.r */
/* compiled from: PG */
public final /* synthetic */ class C131249r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131251t f358892a;

    /* renamed from: b */
    public final /* synthetic */ C50818do f358893b;

    public /* synthetic */ C131249r(C131251t tVar, C50818do doVar) {
        this.f358892a = tVar;
        this.f358893b = doVar;
    }

    public final Object apply(Object obj) {
        C131251t tVar = this.f358892a;
        C50818do doVar = this.f358893b;
        Optional optional = (Optional) obj;
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        if (optional.isPresent()) {
            C50729n nVar = doVar.f132314k;
            if (nVar == null) {
                nVar = C50729n.f132007g;
            }
            C50728m mVar = (C50728m) nVar.toBuilder();
            C63088z zVar = (C63088z) optional.get();
            mVar.copyOnWrite();
            C50729n nVar2 = (C50729n) mVar.instance;
            zVar.getClass();
            nVar2.f132009a |= 16;
            nVar2.f132013e = zVar;
            C50729n nVar3 = (C50729n) mVar.build();
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            nVar3.getClass();
            doVar2.f132314k = nVar3;
            doVar2.f132304a |= 512;
        }
        tVar.mo110132g(cnVar);
        return Optional.m71637of((C50818do) cnVar.build());
    }
}
