package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143784ce;

/* renamed from: com.google.android.gms.usonia.directory.internal.n */
/* compiled from: PG */
public final class C146278n extends C146285u implements C146210a {

    /* renamed from: a */
    static final C146264c f395125a = new C146264c(C146275k.f395122a);

    /* renamed from: b */
    private final C143784ce f395126b;

    public C146278n(C143784ce ceVar) {
        this.f395126b = ceVar;
    }

    /* renamed from: a */
    public final void mo122804a() {
        C143784ce ceVar = this.f395126b;
        ceVar.f389805a = null;
        ceVar.f389806b = null;
    }

    /* renamed from: b */
    public final void mo122842b(OnDistributedServiceAvailableParams onDistributedServiceAvailableParams) {
        this.f395126b.mo119235a(new C146276l(onDistributedServiceAvailableParams));
    }

    /* renamed from: c */
    public final void mo122843c(OnDistributedServiceOfflineParams onDistributedServiceOfflineParams) {
        this.f395126b.mo119235a(new C146277m(onDistributedServiceOfflineParams));
    }
}
