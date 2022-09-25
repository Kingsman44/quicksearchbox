package com.google.android.libraries.assistant.auto.jumpboost.p649a.p656f.p657a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.f.a.a */
/* compiled from: PG */
public final class C11439a {

    /* renamed from: a */
    private final C86124t f37221a;

    /* renamed from: b */
    private final boolean f37222b;

    /* renamed from: c */
    private final Optional f37223c;

    public C11439a(C86124t tVar, boolean z, Optional optional) {
        this.f37221a = tVar;
        this.f37222b = z;
        this.f37223c = optional;
    }

    /* renamed from: a */
    public final boolean mo19977a(int i) {
        if (i - 1 != 1) {
            return ((Boolean) this.f37223c.orElse(Boolean.valueOf(this.f37221a.mo79746e(C90086ek.f250285aJ)))).booleanValue();
        }
        return ((Boolean) this.f37223c.orElse(Boolean.valueOf(this.f37222b))).booleanValue();
    }
}
