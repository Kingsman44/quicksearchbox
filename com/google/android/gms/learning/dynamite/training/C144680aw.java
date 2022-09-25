package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.p10825e.p10826a.C144739b;
import com.google.android.gms.learning.p10825e.p10826a.C144740c;
import com.google.android.gms.learning.p10825e.p10826a.C144749l;
import com.google.android.libraries.micore.learning.training.C29725a;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.p3728as.p3729a.p3730a.C48030j;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.gms.learning.dynamite.training.aw */
/* compiled from: PG */
public final /* synthetic */ class C144680aw {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainingServiceImpl f391446a;

    /* renamed from: b */
    public final /* synthetic */ C144740c f391447b;

    public /* synthetic */ C144680aw(InAppTrainingServiceImpl inAppTrainingServiceImpl, C144740c cVar) {
        this.f391446a = inAppTrainingServiceImpl;
        this.f391447b = cVar;
    }

    /* renamed from: a */
    public final C29725a mo120150a(String str, C63070h hVar, C63088z zVar, C59628h hVar2, String str2, C48030j jVar) {
        C144739b bVar;
        InAppTrainingServiceImpl inAppTrainingServiceImpl = this.f391446a;
        C144740c cVar = this.f391447b;
        Context a = inAppTrainingServiceImpl.f391392h.mo34851a();
        C144573b bVar2 = inAppTrainingServiceImpl.f391393i;
        C144827n nVar = inAppTrainingServiceImpl.f391391g;
        String str3 = inAppTrainingServiceImpl.f391394j;
        if (bVar2.mo120000ah()) {
            bVar = cVar.mo120177a(str, hVar);
        } else {
            String str4 = str;
            C63070h hVar3 = hVar;
            bVar = null;
        }
        return new C144749l(a, bVar2, nVar, str3, str, hVar, zVar, hVar2, bVar, str2, jVar);
    }
}
