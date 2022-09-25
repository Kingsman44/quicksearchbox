package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.p8516a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf;
import com.google.assistant.p3781ad.p3789d.C48578al;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.a.c */
/* compiled from: PG */
public final class C111570c implements C111571d {

    /* renamed from: a */
    private final C111573f f310292a;

    public C111570c(C111573f fVar) {
        this.f310292a = fVar;
    }

    /* renamed from: a */
    public final Optional mo99174a(C48578al alVar) {
        Stream stream = Collection.EL.stream(C113148bf.m187154a(alVar).values());
        C111573f fVar = this.f310292a;
        Objects.requireNonNull(fVar);
        return stream.filter(new C111568a(fVar)).map(C111569b.f310291a).findFirst();
    }
}
