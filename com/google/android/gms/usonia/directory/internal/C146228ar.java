package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.ar */
/* compiled from: PG */
public final /* synthetic */ class C146228ar implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143784ce f395081a;

    /* renamed from: b */
    public final /* synthetic */ String f395082b;

    public /* synthetic */ C146228ar(C143784ce ceVar, String str) {
        this.f395081a = ceVar;
        this.f395082b = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143784ce ceVar = this.f395081a;
        String str = this.f395082b;
        C146269e eVar = (C146269e) obj;
        C146278n nVar = (C146278n) C146278n.f395125a.mo122834b(ceVar);
        if (nVar == null) {
            ((C146010af) obj2).f394698a.mo122508v(false);
            return;
        }
        UnregisterDistributedServiceAvailabilityCallbackParams unregisterDistributedServiceAvailabilityCallbackParams = new UnregisterDistributedServiceAvailabilityCallbackParams();
        unregisterDistributedServiceAvailabilityCallbackParams.f395055a = new C146240bc((C146010af) obj2);
        unregisterDistributedServiceAvailabilityCallbackParams.f395056b = str;
        unregisterDistributedServiceAvailabilityCallbackParams.f395057c = nVar;
        ((C146156b) eVar.mo119451G()).mo122721r(unregisterDistributedServiceAvailabilityCallbackParams);
    }
}
