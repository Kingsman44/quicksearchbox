package com.google.android.apps.search.fedora.p10104h.p10105a;

import com.google.android.apps.search.fedora.p10096d.C132741a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5228m.p5229a.C67261j;
import com.google.speech.p5228m.p5229a.C67264m;
import com.google.speech.p5228m.p5229a.C67265n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.h.a.l */
/* compiled from: PG */
public final /* synthetic */ class C132886l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132890p f362521a;

    /* renamed from: b */
    public final /* synthetic */ Optional f362522b;

    public /* synthetic */ C132886l(C132890p pVar, Optional optional) {
        this.f362521a = pVar;
        this.f362522b = optional;
    }

    public final C60870cx apply(Object obj) {
        C132890p pVar = this.f362521a;
        Optional optional = this.f362522b;
        Void voidR = (Void) obj;
        if (optional.isEmpty()) {
            return C60866ct.f164955a;
        }
        C132741a aVar = pVar.f362528d;
        C67264m mVar = (C67264m) C67265n.f182842c.createBuilder();
        C67261j jVar = (C67261j) optional.get();
        mVar.copyOnWrite();
        C67265n nVar = (C67265n) mVar.instance;
        jVar.getClass();
        nVar.f182845b = jVar;
        nVar.f182844a = 1;
        return aVar.mo110900a(1, 6003, ((C67265n) mVar.build()).toByteArray());
    }
}
