package com.google.android.libraries.appactions.serviceengine.api;

import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.serviceengine.api.d */
/* compiled from: PG */
public final class C147871d extends C147880m {

    /* renamed from: a */
    public Optional f398905a = Optional.empty();

    /* renamed from: b */
    public Optional f398906b = Optional.empty();

    /* renamed from: c */
    public Optional f398907c = Optional.empty();

    /* renamed from: d */
    public Optional f398908d = Optional.empty();

    /* renamed from: e */
    public Optional f398909e = Optional.empty();

    /* renamed from: h */
    private Optional f398910h = Optional.empty();

    /* renamed from: i */
    private final Optional f398911i = Optional.empty();

    /* renamed from: j */
    private C58495hd f398912j;

    /* renamed from: k */
    private final Optional f398913k = Optional.empty();

    /* renamed from: l */
    private C58495hd f398914l;

    /* renamed from: a */
    public final C147881n mo124542a() {
        if (this.f398912j != null && this.f398914l != null) {
            return new C147872e(this.f398905a, this.f398910h, this.f398906b, this.f398907c, this.f398908d, this.f398909e, this.f398911i, this.f398912j, this.f398913k, this.f398914l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f398912j == null) {
            sb.append(" urlParams");
        }
        if (this.f398914l == null) {
            sb.append(" biiParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo124543b(C58495hd hdVar) {
        this.f398914l = hdVar;
    }

    /* renamed from: c */
    public final void mo124544c() {
        this.f398910h = Optional.m71637of("com.instacart.client");
    }

    /* renamed from: d */
    public final void mo124545d(C58495hd hdVar) {
        this.f398912j = hdVar;
    }
}
