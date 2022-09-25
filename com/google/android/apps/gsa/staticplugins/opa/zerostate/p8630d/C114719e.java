package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8630d;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C115085w;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import com.google.android.apps.search.assistant.surfaces.p9418c.C125010a;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.d.e */
/* compiled from: PG */
public final class C114719e implements C68220f {
    /* renamed from: a */
    public static C118474ai m190164a(C86124t tVar, C115085w wVar, Optional optional) {
        int a = (int) tVar.mo79743a(C90014bt.f247825ol);
        boolean z = false;
        if (((C58833ax) wVar.f319477a.mo27525b()).mo56113h() && ((C109029a) ((C58833ax) wVar.f319477a.mo27525b()).mo56107c()).mo97399d() && tVar.mo79746e(C90014bt.f247279eE)) {
            z = true;
        }
        long j = (long) a;
        long millis = TimeUnit.HOURS.toMillis(j);
        if (optional.isPresent()) {
            Duration.ofHours(j);
            millis = ((C125010a) optional.get()).mo106778a().toMillis();
        }
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        aiVar.f328832a |= 16;
        aiVar.f328837f = z;
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
        C118474ai aiVar5 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar5);
        return aiVar5;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
