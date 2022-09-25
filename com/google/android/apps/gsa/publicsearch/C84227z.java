package com.google.android.apps.gsa.publicsearch;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.publicsearch.z */
/* compiled from: PG */
final class C84227z implements C87682aj {

    /* renamed from: a */
    private final C84212l f229227a;

    public C84227z(C84212l lVar) {
        this.f229227a = lVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        SystemParcelableWrapper systemParcelableWrapper = null;
        Parcelable b = serviceEventData.mo81913d(Parcelable.class) ? serviceEventData.mo81912b(Parcelable.class) : null;
        if (b != null && SystemParcelableWrapper.m134237a(b)) {
            systemParcelableWrapper = new SystemParcelableWrapper(b);
        }
        try {
            this.f229227a.mo29491e(serviceEventData.f236959a.toByteArray(), systemParcelableWrapper);
        } catch (RemoteException e) {
            C59104x d = C84200aa.f229194a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PublicSession");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7110)).mo56386p("RemoteException: ");
        }
    }
}
