package com.google.android.apps.gsa.nga.engine.p6056o.p6094f;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.p6060a.C76551j;
import com.google.common.p4522b.C58370cn;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.f.c */
/* compiled from: PG */
public final class C77372c implements C68220f {
    /* renamed from: a */
    public static Set m124147a(C76551j jVar, Set set) {
        Stream stream = Collection.EL.stream(set);
        Objects.requireNonNull(jVar);
        Set set2 = (Set) stream.map(new C77370a(jVar)).collect(C58370cn.f155947b);
        C68225k.m98532d(set2);
        return set2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
