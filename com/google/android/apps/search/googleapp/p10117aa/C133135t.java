package com.google.android.apps.search.googleapp.p10117aa;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.aa.t */
/* compiled from: PG */
public final /* synthetic */ class C133135t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f362946a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f362947b;

    public /* synthetic */ C133135t(String str, C63088z zVar) {
        this.f362946a = str;
        this.f362947b = zVar;
    }

    public final Object apply(Object obj) {
        String str = this.f362946a;
        C63088z zVar = this.f362947b;
        C133127l lVar = (C133127l) obj;
        int a = C133103au.m216064a(lVar, str);
        if (a == -1) {
            C133126k kVar = (C133126k) lVar.toBuilder();
            C133124i iVar = (C133124i) C133125j.f362919l.createBuilder();
            iVar.copyOnWrite();
            C133125j jVar = (C133125j) iVar.instance;
            zVar.getClass();
            jVar.f362921a |= 32;
            jVar.f362927g = zVar;
            iVar.copyOnWrite();
            C133125j jVar2 = (C133125j) iVar.instance;
            jVar2.f362921a |= 8;
            jVar2.f362925e = str;
            kVar.copyOnWrite();
            C133127l lVar2 = (C133127l) kVar.instance;
            C133125j jVar3 = (C133125j) iVar.build();
            jVar3.getClass();
            lVar2.mo110990a();
            lVar2.f362935b.add(0, jVar3);
            return (C133127l) kVar.build();
        }
        C133126k kVar2 = (C133126k) lVar.toBuilder();
        C133124i iVar2 = (C133124i) ((C133125j) lVar.f362935b.get(a)).toBuilder();
        iVar2.copyOnWrite();
        C133125j jVar4 = (C133125j) iVar2.instance;
        zVar.getClass();
        jVar4.f362921a |= 32;
        jVar4.f362927g = zVar;
        kVar2.mo110988d(a, iVar2);
        return (C133127l) kVar2.build();
    }
}
