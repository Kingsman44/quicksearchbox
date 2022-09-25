package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8285a.C107161e;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.m */
/* compiled from: PG */
public final /* synthetic */ class C107200m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C107203p f298379a;

    public /* synthetic */ C107200m(C107203p pVar) {
        this.f298379a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C107203p pVar = this.f298379a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        Instant ofEpochMilli = Instant.ofEpochMilli(pVar.f298385e.mo26870b());
        return C60922j.m93044g(pVar.f298383c.f298291a.mo46039a(new C107161e((C51715bm) axVar.mo56107c(), C62950b.m95472c(ofEpochMilli)), C60826bg.f164896a), new C107198k(axVar), C60826bg.f164896a);
    }
}
