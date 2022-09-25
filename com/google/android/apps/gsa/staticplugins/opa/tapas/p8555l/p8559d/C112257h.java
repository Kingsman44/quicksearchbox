package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8559d;

import com.google.assistant.p3781ad.p3787c.p3788a.C48485ad;
import com.google.assistant.p3781ad.p3787c.p3788a.C48486ae;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.h */
/* compiled from: PG */
public final /* synthetic */ class C112257h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C48485ad f311559a;

    public /* synthetic */ C112257h(C48485ad adVar) {
        this.f311559a = adVar;
    }

    public final Object apply(Object obj) {
        C48485ad adVar = this.f311559a;
        List list = (List) obj;
        int i = C112267r.f311582f;
        adVar.copyOnWrite();
        C48486ae aeVar = (C48486ae) adVar.instance;
        C48486ae aeVar2 = C48486ae.f125248d;
        C62971cq cqVar = aeVar.f125252c;
        if (!cqVar.mo58948c()) {
            aeVar.f125252c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) aeVar.f125252c);
        return (C48486ae) adVar.build();
    }
}
