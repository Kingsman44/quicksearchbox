package com.google.android.libraries.appactions.serviceengine.impl;

import com.google.assistant.p3944g.p3948b.p3949a.C52953r;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.appactions.serviceengine.impl.x */
/* compiled from: PG */
public final /* synthetic */ class C147931x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C147906ao f399010a;

    public /* synthetic */ C147931x(C147906ao aoVar) {
        this.f399010a = aoVar;
    }

    public final Object apply(Object obj) {
        C147906ao aoVar = this.f399010a;
        Stream stream = Collection.EL.stream(((C52953r) obj).f138842a);
        Objects.requireNonNull(aoVar.f398977g);
        return (C58485gu) stream.map(new C147926s()).collect(C58370cn.f155946a);
    }
}
