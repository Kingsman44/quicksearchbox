package com.google.android.apps.search.googleapp.p10117aa;

import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.aa.ab */
/* compiled from: PG */
public final /* synthetic */ class C133084ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Set f362847a;

    public /* synthetic */ C133084ab(Set set) {
        this.f362847a = set;
    }

    public final Object apply(Object obj) {
        Set set = this.f362847a;
        C133127l lVar = (C133127l) obj;
        C46690ah ahVar = C133103au.f362875a;
        C133126k kVar = (C133126k) lVar.toBuilder();
        kVar.copyOnWrite();
        ((C133127l) kVar.instance).f362935b = C133127l.emptyProtobufList();
        kVar.mo110985a((Iterable) Collection.EL.stream(lVar.f362935b).filter(new C133087ae(set)).collect(C58370cn.f155947b));
        return (C133127l) kVar.build();
    }
}
