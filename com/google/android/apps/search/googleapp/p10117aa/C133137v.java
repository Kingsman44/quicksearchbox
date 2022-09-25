package com.google.android.apps.search.googleapp.p10117aa;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.aa.v */
/* compiled from: PG */
public final /* synthetic */ class C133137v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f362949a;

    public /* synthetic */ C133137v(String str) {
        this.f362949a = str;
    }

    public final Object apply(Object obj) {
        C133127l lVar = (C133127l) obj;
        int a = C133103au.m216064a(lVar, this.f362949a);
        if (a == -1) {
            return lVar;
        }
        C133126k kVar = (C133126k) lVar.toBuilder();
        C133124i iVar = (C133124i) ((C133125j) lVar.f362935b.get(a)).toBuilder();
        iVar.copyOnWrite();
        C133125j jVar = (C133125j) iVar.instance;
        jVar.f362921a &= -33;
        jVar.f362927g = C133125j.f362919l.f362927g;
        kVar.mo110988d(a, iVar);
        return (C133127l) kVar.build();
    }
}
