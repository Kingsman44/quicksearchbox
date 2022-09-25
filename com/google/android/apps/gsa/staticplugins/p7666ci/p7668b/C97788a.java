package com.google.android.apps.gsa.staticplugins.p7666ci.p7668b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.b.a */
/* compiled from: PG */
public final class C97788a implements C68220f {
    /* renamed from: a */
    public static C118474ai m162068a(C86124t tVar) {
        int a = (int) tVar.mo79743a(C90017bw.f247959bU);
        boolean z = tVar.mo79746e(C90017bw.f247889aD) || tVar.mo79746e(C90051dc.f248836ar);
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 16;
        aiVar.f328837f = z;
        long millis = Duration.ofHours((long) a).toMillis();
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 1;
        aiVar2.f328833b = millis;
        ahVar.copyOnWrite();
        C118474ai aiVar3 = (C118474ai) ahVar.instance;
        aiVar3.f328834c = 1;
        aiVar3.f328832a |= 2;
        ahVar.copyOnWrite();
        C118474ai aiVar4 = (C118474ai) ahVar.instance;
        aiVar4.f328832a |= 4;
        aiVar4.f328835d = true;
        ahVar.copyOnWrite();
        C118474ai aiVar5 = (C118474ai) ahVar.instance;
        aiVar5.f328832a |= 8;
        aiVar5.f328836e = true;
        C118474ai aiVar6 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar6);
        return aiVar6;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
