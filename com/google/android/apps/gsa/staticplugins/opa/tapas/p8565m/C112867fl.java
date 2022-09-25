package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.fl */
/* compiled from: PG */
public final /* synthetic */ class C112867fl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f312825a;

    /* renamed from: b */
    public final /* synthetic */ C113341cl f312826b;

    public /* synthetic */ C112867fl(String str, C113341cl clVar) {
        this.f312825a = str;
        this.f312826b = clVar;
    }

    public final Object apply(Object obj) {
        return ((Optional) obj).filter(new C112865fj(this.f312825a)).map(new C112866fk(this.f312826b));
    }
}
