package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p4016z.C53691ap;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.z */
/* compiled from: PG */
public final /* synthetic */ class C130796z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130739ac f358029a;

    /* renamed from: b */
    public final /* synthetic */ double f358030b;

    /* renamed from: c */
    public final /* synthetic */ C53691ap f358031c;

    public /* synthetic */ C130796z(C130739ac acVar, double d, C53691ap apVar) {
        this.f358029a = acVar;
        this.f358030b = d;
        this.f358031c = apVar;
    }

    public final Object apply(Object obj) {
        return (C58485gu) ((Optional) obj).map(new C130794x(this.f358030b)).orElseGet(new C130795y(this.f358031c));
    }
}
