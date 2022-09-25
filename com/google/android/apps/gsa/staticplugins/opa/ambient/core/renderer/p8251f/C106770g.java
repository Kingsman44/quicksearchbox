package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8251f;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.f.g */
/* compiled from: PG */
public final class C106770g {

    /* renamed from: a */
    public final C60888db f297543a;

    /* renamed from: b */
    private final C83783a f297544b;

    /* renamed from: c */
    private C60870cx f297545c;

    public C106770g(C83783a aVar, C60888db dbVar, C83564a aVar2) {
        this.f297544b = aVar;
        this.f297543a = dbVar;
        aVar2.mo76900a("PayloadRendHlp");
    }

    /* renamed from: a */
    public final synchronized C60870cx mo95646a() {
        if (this.f297545c == null) {
            this.f297545c = this.f297544b.mo77105d();
        }
        return this.f297545c;
    }
}
