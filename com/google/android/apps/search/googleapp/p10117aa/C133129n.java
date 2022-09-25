package com.google.android.apps.search.googleapp.p10117aa;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.googleapp.aa.n */
/* compiled from: PG */
public final /* synthetic */ class C133129n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133103au f362938a;

    /* renamed from: b */
    public final /* synthetic */ String f362939b;

    public /* synthetic */ C133129n(C133103au auVar, String str) {
        this.f362938a = auVar;
        this.f362939b = str;
    }

    public final Object apply(Object obj) {
        C133103au auVar = this.f362938a;
        String str = this.f362939b;
        C133127l lVar = (C133127l) obj;
        int a = C133103au.m216064a(lVar, str);
        if (a != -1) {
            C133124i iVar = (C133124i) ((C133125j) lVar.f362935b.get(a)).toBuilder();
            C63042fg i = C62953e.m95484i(auVar.f362882h.mo26870b());
            iVar.copyOnWrite();
            C133125j jVar = (C133125j) iVar.instance;
            i.getClass();
            jVar.f362929i = i;
            jVar.f362921a |= 128;
            C133126k kVar = (C133126k) lVar.toBuilder();
            kVar.mo110989e(a, (C133125j) iVar.build());
            return (C133127l) kVar.build();
        }
        throw new IllegalArgumentException("Tab with persistenceId(" + str + ") does not exist");
    }
}
