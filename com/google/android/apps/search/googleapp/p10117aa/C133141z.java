package com.google.android.apps.search.googleapp.p10117aa;

import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.common.base.C58817ah;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.aa.z */
/* compiled from: PG */
public final /* synthetic */ class C133141z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Set f362956a;

    public /* synthetic */ C133141z(Set set) {
        this.f362956a = set;
    }

    public final Object apply(Object obj) {
        Set set = this.f362956a;
        C46690ah ahVar = C133103au.f362875a;
        C133126k kVar = (C133126k) ((C133127l) obj).toBuilder();
        for (int i = 0; i < ((C133127l) kVar.instance).f362935b.size(); i++) {
            C133125j jVar = (C133125j) ((C133127l) kVar.instance).f362935b.get(i);
            if (set.contains(jVar.f362925e)) {
                C133124i iVar = (C133124i) C133125j.f362919l.createBuilder();
                String str = jVar.f362925e;
                iVar.copyOnWrite();
                C133125j jVar2 = (C133125j) iVar.instance;
                str.getClass();
                jVar2.f362921a |= 8;
                jVar2.f362925e = str;
                iVar.copyOnWrite();
                C133125j jVar3 = (C133125j) iVar.instance;
                jVar3.f362921a |= 256;
                jVar3.f362930j = true;
                kVar.mo110989e(i, (C133125j) iVar.build());
            }
        }
        return (C133127l) kVar.build();
    }
}
