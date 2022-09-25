package com.google.android.apps.search.googleapp.p10117aa;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.aa.o */
/* compiled from: PG */
public final /* synthetic */ class C133130o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f362940a;

    public /* synthetic */ C133130o(String str) {
        this.f362940a = str;
    }

    public final Object apply(Object obj) {
        C133127l lVar = (C133127l) obj;
        int a = C133103au.m216064a(lVar, this.f362940a);
        if (a == -1) {
            return lVar;
        }
        C133125j jVar = (C133125j) lVar.f362935b.get(a);
        C133126k kVar = (C133126k) lVar.toBuilder();
        if ((jVar.f362921a & 4) != 0) {
            C133124i iVar = (C133124i) jVar.toBuilder();
            iVar.copyOnWrite();
            C133125j jVar2 = (C133125j) iVar.instance;
            jVar2.f362921a &= -65;
            jVar2.f362928h = false;
            String str = jVar.f362924d;
            iVar.copyOnWrite();
            C133125j jVar3 = (C133125j) iVar.instance;
            str.getClass();
            jVar3.f362921a |= 1;
            jVar3.f362922b = str;
            kVar.mo110988d(a, iVar);
        } else {
            kVar.mo110987c(a);
        }
        return (C133127l) kVar.build();
    }
}
