package com.google.android.gms.gmscompliance.p10800a.p10801a.p10804c;

import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.gms.gmscompliance.a.a.c.l */
/* compiled from: PG */
public final /* synthetic */ class C144250l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C144251m f390697a;

    public /* synthetic */ C144250l(C144251m mVar) {
        this.f390697a = mVar;
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar;
        C144251m mVar = this.f390697a;
        C58833ax axVar2 = (C58833ax) obj;
        if (axVar2.mo56113h()) {
            axVar = C144239a.m234484c((GmsDeviceComplianceResponse) axVar2.mo56107c());
        } else {
            axVar = C58836b.f156633a;
        }
        return (C60870cx) mVar.mo119784d(axVar).mo56106b(new C144242d(mVar)).mo56108d(new C144243e(mVar, axVar2));
    }
}
