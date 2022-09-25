package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6085f;

import android.util.Pair;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.f.f */
/* compiled from: PG */
public final /* synthetic */ class C76883f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ df f212315a;

    public /* synthetic */ C76883f(df dfVar) {
        this.f212315a = dfVar;
    }

    public final Object apply(Object obj) {
        return new Pair(this.f212315a, (String) Collection.EL.stream((C58485gu) obj).collect(Collectors.joining("|")));
    }
}
