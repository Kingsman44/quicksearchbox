package com.google.android.apps.search.podcasts.p10550b.p10552b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97874a;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97913c;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.podcasts.b.b.v */
/* compiled from: PG */
public final /* synthetic */ class C140044v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140022ao f380613a;

    /* renamed from: b */
    public final /* synthetic */ C97918h f380614b;

    public /* synthetic */ C140044v(C140022ao aoVar, C97918h hVar) {
        this.f380613a = aoVar;
        this.f380614b = hVar;
    }

    public final C60870cx apply(Object obj) {
        C140022ao aoVar = this.f380613a;
        C97918h hVar = this.f380614b;
        C97874a aVar = (C97874a) C97914d.f273393j.createBuilder();
        aVar.copyOnWrite();
        C97914d dVar = (C97914d) aVar.instance;
        hVar.getClass();
        dVar.f273397c = hVar;
        dVar.f273395a |= 2;
        long longValue = ((Long) obj).longValue();
        aVar.copyOnWrite();
        C97914d dVar2 = (C97914d) aVar.instance;
        dVar2.f273395a |= 4;
        dVar2.f273398d = longValue;
        C97913c cVar = C97913c.DOWNLOADING;
        aVar.copyOnWrite();
        C97914d dVar3 = (C97914d) aVar.instance;
        dVar3.f273396b = cVar.f273392h;
        dVar3.f273395a |= 1;
        aVar.copyOnWrite();
        C97914d dVar4 = (C97914d) aVar.instance;
        dVar4.f273395a |= 8;
        dVar4.f273399e = 0;
        long b = aoVar.f380569l.mo26870b();
        aVar.copyOnWrite();
        C97914d dVar5 = (C97914d) aVar.instance;
        dVar5.f273395a |= 256;
        dVar5.f273403i = b;
        return aoVar.mo115399e(aVar);
    }
}
