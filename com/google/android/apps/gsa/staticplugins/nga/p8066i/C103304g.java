package com.google.android.apps.gsa.staticplugins.nga.p8066i;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.tasks.C118473ah;
import com.google.android.apps.gsa.tasks.C118474ai;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.i.g */
/* compiled from: PG */
public final class C103304g implements C68220f {
    /* renamed from: a */
    public static C118474ai m171200a(C86124t tVar) {
        C118473ah ahVar = (C118473ah) C118474ai.f328830g.createBuilder();
        long millis = TimeUnit.DAYS.toMillis(1);
        ahVar.copyOnWrite();
        C118474ai aiVar = (C118474ai) ahVar.instance;
        boolean z = true;
        aiVar.f328832a |= 1;
        aiVar.f328833b = millis;
        if (!tVar.mo79746e(C90126fx.f251377hf) || !tVar.mo79746e(C90126fx.f251388hq)) {
            z = false;
        }
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 16;
        aiVar2.f328837f = z;
        C118474ai aiVar3 = (C118474ai) ahVar.build();
        C68225k.m98532d(aiVar3);
        return aiVar3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
