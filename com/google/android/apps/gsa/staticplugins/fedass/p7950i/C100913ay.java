package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5228m.p5229a.C67261j;
import com.google.speech.p5228m.p5229a.C67264m;
import com.google.speech.p5228m.p5229a.C67265n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.ay */
/* compiled from: PG */
public final /* synthetic */ class C100913ay implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100918bc f281941a;

    /* renamed from: b */
    public final /* synthetic */ Optional f281942b;

    public /* synthetic */ C100913ay(C100918bc bcVar, Optional optional) {
        this.f281941a = bcVar;
        this.f281942b = optional;
    }

    public final C60870cx apply(Object obj) {
        C100918bc bcVar = this.f281941a;
        Optional optional = this.f281942b;
        Void voidR = (Void) obj;
        if (optional.isEmpty()) {
            return C60866ct.f164955a;
        }
        C67264m mVar = (C67264m) C67265n.f182842c.createBuilder();
        C67261j jVar = (C67261j) optional.get();
        mVar.copyOnWrite();
        C67265n nVar = (C67265n) mVar.instance;
        jVar.getClass();
        nVar.f182845b = jVar;
        nVar.f182844a = 1;
        return ((C84235h) bcVar.f281947b.get()).mo77721k(6003, ((C67265n) mVar.build()).toByteArray());
    }
}
