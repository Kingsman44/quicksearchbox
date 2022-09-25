package com.google.android.apps.gsa.staticplugins.p7666ci.p7668b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90070dv;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.b.b */
/* compiled from: PG */
public final class C97789b implements C68220f {
    /* renamed from: a */
    public static C118474ai m162070a(C86124t tVar) {
        long a = tVar.mo79743a(C90070dv.f249751c);
        boolean e = tVar.mo79746e(C90014bt.f247309ei);
        boolean e2 = tVar.mo79746e(C90070dv.f249752d);
        boolean e3 = tVar.mo79746e(C90070dv.f249753e);
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 8;
        aiVar.f328836e = e2;
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 16;
        aiVar2.f328837f = e;
        long millis = Duration.ofHours((long) ((int) a)).toMillis();
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328832a |= 1;
        aiVar3.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar4 = (C118474ai) ahVar.instance;
        aiVar4.f328832a |= 4;
        aiVar4.f328835d = e3;
        C118474ai aiVar5 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar5);
        return aiVar5;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
