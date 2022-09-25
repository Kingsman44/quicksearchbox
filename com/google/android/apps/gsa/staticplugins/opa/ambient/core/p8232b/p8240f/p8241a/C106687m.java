package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f.p8241a;

import com.google.common.base.C58817ah;
import p3186j$.time.LocalDateTime;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.f.a.m */
/* compiled from: PG */
public final /* synthetic */ class C106687m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106696v f297362a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f297363b;

    public /* synthetic */ C106687m(C106696v vVar, LocalDateTime localDateTime) {
        this.f297362a = vVar;
        this.f297363b = localDateTime;
    }

    public final Object apply(Object obj) {
        C106696v vVar = this.f297362a;
        LocalDateTime localDateTime = this.f297363b;
        return (Boolean) ((Optional) obj).map(new C106688n(vVar, localDateTime)).orElseGet(new C106689o(vVar, localDateTime));
    }
}
