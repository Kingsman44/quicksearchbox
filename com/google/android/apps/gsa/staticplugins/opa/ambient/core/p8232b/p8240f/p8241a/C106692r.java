package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8240f.p8241a;

import com.google.common.base.C58817ah;
import p3186j$.time.LocalDateTime;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.f.a.r */
/* compiled from: PG */
public final /* synthetic */ class C106692r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106696v f297372a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f297373b;

    public /* synthetic */ C106692r(C106696v vVar, LocalDateTime localDateTime) {
        this.f297372a = vVar;
        this.f297373b = localDateTime;
    }

    public final Object apply(Object obj) {
        C106696v vVar = this.f297372a;
        LocalDateTime localDateTime = this.f297373b;
        return (Boolean) ((Optional) obj).map(new C106684j(vVar, localDateTime)).orElseGet(new C106685k(vVar, localDateTime));
    }
}
