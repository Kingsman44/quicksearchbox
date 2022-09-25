package com.google.android.apps.gsa.nga.engine.geniefm;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.geniefm.h */
/* compiled from: PG */
public final /* synthetic */ class C76102h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76103i f210987a;

    /* renamed from: b */
    public final /* synthetic */ Optional f210988b;

    public /* synthetic */ C76102h(C76103i iVar, Optional optional) {
        this.f210987a = iVar;
        this.f210988b = optional;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118826c cVar = (C118826c) obj;
        return (C60870cx) this.f210988b.map(new C76097c(this.f210987a)).orElseGet(C76098d.f210982a);
    }
}
