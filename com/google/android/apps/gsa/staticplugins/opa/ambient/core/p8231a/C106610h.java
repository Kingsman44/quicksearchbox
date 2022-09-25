package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.content.Intent;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.h */
/* compiled from: PG */
public final /* synthetic */ class C106610h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106615m f297244a;

    /* renamed from: b */
    public final /* synthetic */ Intent f297245b;

    public /* synthetic */ C106610h(C106615m mVar, Intent intent) {
        this.f297244a = mVar;
        this.f297245b = intent;
    }

    public final Object apply(Object obj) {
        return ((Optional) obj).map(new C106609g(this.f297244a, this.f297245b));
    }
}
