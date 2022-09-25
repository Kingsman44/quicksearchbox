package com.google.android.libraries.appactions.serviceengine.api;

import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.serviceengine.api.b */
/* compiled from: PG */
public final class C147869b extends C147876i {

    /* renamed from: a */
    public Optional f398897a = Optional.empty();

    /* renamed from: b */
    public Optional f398898b = Optional.empty();

    /* renamed from: d */
    private final Optional f398899d = Optional.empty();

    /* renamed from: e */
    private C58495hd f398900e;

    /* renamed from: a */
    public final C147877j mo124533a() {
        if (this.f398900e != null) {
            return new C147870c(this.f398897a, this.f398898b, this.f398899d, this.f398900e);
        }
        throw new IllegalStateException("Missing required properties: biiParams");
    }

    /* renamed from: b */
    public final void mo124534b(C58495hd hdVar) {
        this.f398900e = hdVar;
    }
}
