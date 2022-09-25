package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8512j;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.j.b */
/* compiled from: PG */
public final class C111541b extends C113409et {

    /* renamed from: a */
    public final C111543d f310238a;

    /* renamed from: b */
    private final C22871g f310239b;

    public C111541b(C111543d dVar, C22871g gVar) {
        this.f310238a = dVar;
        this.f310239b = gVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.MESSAGE;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        return this.f310239b.mo28202b("Fetch Message Suggestions", new C111540a(this, epVar));
    }
}
