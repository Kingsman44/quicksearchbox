package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.graphics.drawable.Drawable;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.a */
/* compiled from: PG */
public final class C113246a extends C113501m {

    /* renamed from: a */
    public Optional f313591a = Optional.empty();

    /* renamed from: b */
    public Optional f313592b = Optional.empty();

    /* renamed from: c */
    public Optional f313593c = Optional.empty();

    /* renamed from: d */
    public Optional f313594d = Optional.empty();

    /* renamed from: e */
    public Optional f313595e = Optional.empty();

    /* renamed from: f */
    public Optional f313596f = Optional.empty();

    /* renamed from: g */
    public Optional f313597g = Optional.empty();

    /* renamed from: h */
    public Optional f313598h = Optional.empty();

    /* renamed from: i */
    public Optional f313599i = Optional.empty();

    /* renamed from: j */
    public C58495hd f313600j;

    /* renamed from: k */
    public C58495hd f313601k;

    /* renamed from: l */
    public Optional f313602l = Optional.empty();

    public C113246a() {
    }

    /* renamed from: a */
    public final C113502n mo99919a() {
        C58495hd hdVar;
        C58495hd hdVar2 = this.f313600j;
        if (hdVar2 != null && (hdVar = this.f313601k) != null) {
            return new C113262ao(this.f313591a, this.f313592b, this.f313593c, this.f313594d, this.f313595e, this.f313596f, this.f313597g, this.f313598h, this.f313599i, hdVar2, hdVar, this.f313602l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f313600j == null) {
            sb.append(" availableFulfillmentParams");
        }
        if (this.f313601k == null) {
            sb.append(" prefilledFulfillmentParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo99920b(Drawable drawable) {
        this.f313595e = Optional.m71637of(drawable);
    }

    /* renamed from: c */
    public final void mo99921c(C58495hd hdVar) {
        if (hdVar != null) {
            this.f313600j = hdVar;
            return;
        }
        throw new NullPointerException("Null availableFulfillmentParams");
    }

    /* renamed from: d */
    public final void mo99922d(C58495hd hdVar) {
        if (hdVar != null) {
            this.f313601k = hdVar;
            return;
        }
        throw new NullPointerException("Null prefilledFulfillmentParams");
    }

    public C113246a(C113502n nVar) {
        this.f313591a = nVar.mo100043g();
        this.f313592b = nVar.mo100047j();
        this.f313593c = nVar.mo100042f();
        this.f313594d = nVar.mo100046i();
        this.f313595e = nVar.mo100039d();
        this.f313596f = nVar.mo100040e();
        this.f313597g = nVar.mo100048k();
        this.f313598h = nVar.mo100050m();
        this.f313599i = nVar.mo100049l();
        this.f313600j = nVar.mo100037b();
        this.f313601k = nVar.mo100038c();
        this.f313602l = nVar.mo100044h();
    }
}
