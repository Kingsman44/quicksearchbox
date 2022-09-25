package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.aw */
/* compiled from: PG */
public final class C80667aw extends C80718ct {

    /* renamed from: a */
    private String f221480a;

    /* renamed from: b */
    private Optional f221481b = Optional.empty();

    /* renamed from: a */
    public final C80719cu mo74508a() {
        String str = this.f221480a;
        if (str != null) {
            return new C80668ax(str, this.f221481b);
        }
        throw new IllegalStateException("Missing required properties: disclosureLabel");
    }

    /* renamed from: b */
    public final void mo74509b(Optional optional) {
        if (optional != null) {
            this.f221481b = optional;
            return;
        }
        throw new NullPointerException("Null disclosureAction");
    }

    /* renamed from: c */
    public final void mo74510c(String str) {
        if (str != null) {
            this.f221480a = str;
            return;
        }
        throw new NullPointerException("Null disclosureLabel");
    }
}
