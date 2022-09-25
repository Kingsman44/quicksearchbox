package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Instant;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C106468i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C106468i f296956a = new C106468i();

    private /* synthetic */ C106468i() {
    }

    public final Object apply(Object obj) {
        return Instant.ofEpochMilli(Collection.EL.stream((C58485gu) obj).mapToLong(C106470k.f296958a).max().orElse(Instant.EPOCH.toEpochMilli()));
    }
}
