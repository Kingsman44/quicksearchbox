package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.v;
import com.google.android.apps.gsa.nga.engine.annotators.C74989bu;
import com.google.android.apps.gsa.nga.engine.annotators.ab;
import com.google.android.apps.gsa.nga.engine.annotators.ak;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.ab */
/* compiled from: PG */
public final /* synthetic */ class C77916ab implements Function {

    /* renamed from: a */
    public final /* synthetic */ C77920af f214644a;

    /* renamed from: b */
    public final /* synthetic */ Optional f214645b;

    public /* synthetic */ C77916ab(C77920af afVar, Optional optional) {
        this.f214644a = afVar;
        this.f214645b = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional;
        C77920af afVar = this.f214644a;
        Optional optional2 = this.f214645b;
        v vVar = (v) obj;
        ak akVar = afVar.f214650a;
        String str = vVar.a;
        C74989bu buVar = (C74989bu) optional2.map(C77946z.f214688a).orElse(ab.a);
        Optional.empty();
        long j = vVar.b;
        if (j > 0) {
            optional = Optional.m71637of(Instant.ofEpochMilli(j));
        } else {
            optional = Optional.empty();
        }
        return C60922j.m93044g(akVar.d(str, buVar, optional), new C77915aa(vVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
