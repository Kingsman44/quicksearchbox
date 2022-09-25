package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Instant;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C131054i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C131054i f358487a = new C131054i();

    private /* synthetic */ C131054i() {
    }

    public final Object apply(Object obj) {
        return Instant.ofEpochMilli(Collection.EL.stream((C58485gu) obj).mapToLong(C131065t.f358504a).max().orElse(Instant.EPOCH.toEpochMilli()));
    }
}
