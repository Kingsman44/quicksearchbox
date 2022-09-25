package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.a */
/* compiled from: PG */
final class C106846a extends C107016e {

    /* renamed from: a */
    public C58485gu f297720a;

    /* renamed from: b */
    private Optional f297721b = Optional.empty();

    /* renamed from: c */
    private Optional f297722c = Optional.empty();

    /* renamed from: a */
    public final C107017f mo95685a() {
        C58485gu guVar = this.f297720a;
        if (guVar != null) {
            return new C106859b(this.f297721b, guVar, this.f297722c);
        }
        throw new IllegalStateException("Missing required properties: smartspaceCards");
    }

    /* renamed from: b */
    public final void mo95686b(Optional optional) {
        if (optional != null) {
            this.f297721b = optional;
            return;
        }
        throw new NullPointerException("Null smartspaceChip");
    }

    /* renamed from: c */
    public final void mo95687c(Optional optional) {
        if (optional != null) {
            this.f297722c = optional;
            return;
        }
        throw new NullPointerException("Null smartspaceUpdate");
    }
}
