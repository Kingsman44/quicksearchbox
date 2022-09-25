package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;

/* renamed from: com.google.android.gms.wearable.internal.cu */
/* compiled from: PG */
final class C146490cu extends C146489ct {
    public C146490cu(C143825n nVar) {
        super(nVar);
    }

    /* renamed from: b */
    public final void mo123179b(GetCapabilityResponse getCapabilityResponse) {
        Status a = C146483cn.m238468a(getCapabilityResponse.f395578a);
        CapabilityInfoParcelable capabilityInfoParcelable = getCapabilityResponse.f395579b;
        mo123287H(new C146515o(a, capabilityInfoParcelable == null ? null : new C146514n(capabilityInfoParcelable)));
    }
}
