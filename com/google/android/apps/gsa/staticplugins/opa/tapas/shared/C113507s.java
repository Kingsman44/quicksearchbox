package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.s */
/* compiled from: PG */
public final /* synthetic */ class C113507s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Function f314267a;

    public /* synthetic */ C113507s(Function function) {
        this.f314267a = function;
    }

    public final C60870cx apply(Object obj) {
        Function function = this.f314267a;
        Objects.requireNonNull(function);
        return (C60870cx) ((Optional) obj).map(new C113513y(function)).map(C113514z.f314279a).orElse(C60856cj.m92900i(Optional.empty()));
    }
}
