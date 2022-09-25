package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143784ce;

/* renamed from: com.google.android.gms.usonia.directory.internal.j */
/* compiled from: PG */
public final class C146274j extends C146282r implements C146210a {

    /* renamed from: a */
    static final C146264c f395120a = new C146264c(C146270f.f395116a);

    /* renamed from: b */
    private final C143784ce f395121b;

    public C146274j(C143784ce ceVar) {
        this.f395121b = ceVar;
    }

    /* renamed from: a */
    public final void mo122804a() {
        C143784ce ceVar = this.f395121b;
        ceVar.f389805a = null;
        ceVar.f389806b = null;
    }

    /* renamed from: b */
    public final void mo122839b(OnDeviceOfflineParams onDeviceOfflineParams) {
        this.f395121b.mo119235a(new C146273i(onDeviceOfflineParams));
    }

    /* renamed from: c */
    public final void mo122840c(OnDistributedStateChangeParams onDistributedStateChangeParams) {
        this.f395121b.mo119235a(new C146271g(onDistributedStateChangeParams));
    }

    /* renamed from: d */
    public final void mo122841d(OnInititialDistributedStateCompleteParams onInititialDistributedStateCompleteParams) {
        this.f395121b.mo119235a(new C146272h(onInititialDistributedStateCompleteParams));
    }
}
