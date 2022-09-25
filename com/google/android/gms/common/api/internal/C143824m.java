package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143718c;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* compiled from: PG */
public abstract class C143824m extends BasePendingResult implements C143825n {

    /* renamed from: b */
    public final C143718c f389885b;

    /* renamed from: c */
    public final C143841m f389886c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C143824m(C143841m mVar, C143851w wVar) {
        super(wVar);
        C143919bh.m233971n(wVar, "GoogleApiClient must not be null");
        C143919bh.m233971n(mVar, "Api must not be null");
        this.f389885b = mVar.f389917b;
        this.f389886c = mVar;
    }

    /* renamed from: j */
    private final void m233748j(RemoteException remoteException) {
        mo119276l(new Status(1, 8, remoteException.getLocalizedMessage(), (PendingIntent) null, (ConnectionResult) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo117681h(C143717b bVar);

    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo117682i(Object obj) {
        throw null;
    }

    /* renamed from: k */
    public final void mo119275k(C143717b bVar) {
        try {
            mo117681h(bVar);
        } catch (DeadObjectException e) {
            m233748j(e);
            throw e;
        } catch (RemoteException e2) {
            m233748j(e2);
        }
    }

    /* renamed from: l */
    public final void mo119276l(Status status) {
        C143919bh.m233960c(!status.mo119097c(), "Failed result must not be success");
        mo119112p(mo117683c(status));
    }
}
