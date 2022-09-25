package com.google.android.apps.gsa.nga.shared.p6363s;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.s.b */
/* compiled from: PG */
public final class C81453b {

    /* renamed from: a */
    private final C68214a f222864a;

    /* renamed from: b */
    private final Function f222865b;

    public C81453b(C68214a aVar, Function function) {
        this.f222864a = aVar;
        this.f222865b = function;
    }

    /* renamed from: a */
    public final C60870cx mo75085a() {
        Stream stream = Collection.EL.stream((Set) this.f222864a.mo27525b());
        Function function = this.f222865b;
        Objects.requireNonNull(function);
        return C118826c.m197213c(C60856cj.m92896e((Iterable) stream.map(new C81452a(function)).collect(Collectors.toList())));
    }
}
