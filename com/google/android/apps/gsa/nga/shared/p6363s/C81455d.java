package com.google.android.apps.gsa.nga.shared.p6363s;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.BiFunction;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.shared.s.d */
/* compiled from: PG */
public final class C81455d {

    /* renamed from: a */
    public final BiFunction f222868a;

    /* renamed from: b */
    private final C68214a f222869b;

    public C81455d(C68214a aVar, BiFunction biFunction) {
        this.f222869b = aVar;
        this.f222868a = biFunction;
    }

    /* renamed from: a */
    public final C60870cx mo75086a(Object obj) {
        return C118826c.m197213c(C60856cj.m92896e((Iterable) Collection.EL.stream((Set) this.f222869b.mo27525b()).map(new C81454c(this, obj)).collect(Collectors.toList())));
    }
}
