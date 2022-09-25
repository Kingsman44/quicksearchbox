package com.google.android.gms.contextmanager.internal;

import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.p10717f.p10720c.C142627a;

/* renamed from: com.google.android.gms.contextmanager.internal.s */
/* compiled from: PG */
public final class C144077s extends C144080v {

    /* renamed from: a */
    private C143825n f390356a;

    /* renamed from: b */
    private C143825n f390357b;

    /* renamed from: c */
    private C143825n f390358c;

    /* renamed from: d */
    private C143825n f390359d;

    /* renamed from: e */
    private final C144071m f390360e;

    protected C144077s() {
        this.f390360e = null;
    }

    /* renamed from: h */
    private final void m234270h(Status status) {
        C144071m mVar = this.f390360e;
        if (mVar != null && status.mo119097c()) {
            C144063e eVar = mVar.f390344a;
            synchronized (eVar.f390340d) {
                eVar.f390338b = null;
                eVar.f390339c = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo119623a(Status status, DataHolder dataHolder) {
        C143825n nVar = this.f390357b;
        if (nVar == null) {
            C142627a.m231237b("ContextManagerPendingResult", "Unexpected callback to onStateResult");
            return;
        }
        nVar.mo117682i(new C144074p(dataHolder, status));
        this.f390357b = null;
        m234270h(status);
    }

    /* renamed from: b */
    public final void mo119624b(Status status, FenceStateMapImpl fenceStateMapImpl) {
        C143825n nVar = this.f390359d;
        if (nVar == null) {
            C142627a.m231237b("ContextManagerPendingResult", "Unexpected callback to onFenceQueryResult");
            return;
        }
        nVar.mo117682i(new C144076r(fenceStateMapImpl, status));
        this.f390359d = null;
        m234270h(status);
    }

    /* renamed from: c */
    public final void mo119625c(Status status, Snapshot snapshot) {
        C143825n nVar = this.f390358c;
        if (nVar == null) {
            C142627a.m231237b("ContextManagerPendingResult", "Unexpected callback to onSnapshotResult");
            return;
        }
        nVar.mo117682i(new C144075q(status, snapshot));
        this.f390358c = null;
        m234270h(status);
    }

    /* renamed from: d */
    public final void mo119626d(Status status) {
        C143825n nVar = this.f390356a;
        if (nVar == null) {
            C142627a.m231237b("ContextManagerPendingResult", "Unexpected callback to onStatusResult.");
            return;
        }
        nVar.mo117682i(status);
        this.f390356a = null;
        m234270h(status);
    }

    /* renamed from: e */
    public final void mo119627e() {
        C142627a.m231237b("ContextManagerPendingResult", "Unexpected callback to onFenceEvaluateResult");
    }

    /* renamed from: f */
    public final void mo119628f() {
        C142627a.m231237b("ContextManagerPendingResult", "Unexpected callback to onReadResult.");
    }

    /* renamed from: g */
    public final void mo119629g() {
        C142627a.m231237b("ContextManagerPendingResult", "Unexpected callback to onWriteBatchResult");
    }

    public C144077s(C143825n nVar, C143825n nVar2, C143825n nVar3, C143825n nVar4, C144071m mVar) {
        this.f390356a = nVar;
        this.f390357b = nVar2;
        this.f390358c = nVar3;
        this.f390359d = nVar4;
        this.f390360e = mVar;
    }
}
