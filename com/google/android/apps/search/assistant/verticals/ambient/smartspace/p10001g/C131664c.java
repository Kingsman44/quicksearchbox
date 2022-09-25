package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p10001g;

import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.g.c */
/* compiled from: PG */
public final /* synthetic */ class C131664c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C50790cn f359746a;

    public /* synthetic */ C131664c(C50790cn cnVar) {
        this.f359746a = cnVar;
    }

    public final Object apply(Object obj) {
        C50790cn cnVar = this.f359746a;
        C63088z zVar = (C63088z) obj;
        C50729n nVar = ((C50818do) cnVar.instance).f132314k;
        if (nVar == null) {
            nVar = C50729n.f132007g;
        }
        C50728m mVar = (C50728m) nVar.toBuilder();
        mVar.copyOnWrite();
        C50729n nVar2 = (C50729n) mVar.instance;
        zVar.getClass();
        nVar2.f132009a |= 16;
        nVar2.f132013e = zVar;
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        C50729n nVar3 = (C50729n) mVar.build();
        nVar3.getClass();
        doVar.f132314k = nVar3;
        doVar.f132304a |= 512;
        return Optional.m71637of((C50818do) cnVar.build());
    }
}
