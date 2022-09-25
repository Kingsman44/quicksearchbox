package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p690i;

import com.google.android.apps.auto.p450a.p451a.C8904bv;
import com.google.android.apps.auto.p450a.p451a.C8905bw;
import com.google.android.apps.auto.p450a.p451a.C8908bz;
import com.google.android.apps.auto.p450a.p451a.C8910ca;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11525d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.g */
/* compiled from: PG */
public final /* synthetic */ class C11800g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11805l f37955a;

    /* renamed from: b */
    public final /* synthetic */ String f37956b;

    public /* synthetic */ C11800g(C11805l lVar, String str) {
        this.f37955a = lVar;
        this.f37956b = str;
    }

    public final C60870cx apply(Object obj) {
        C11805l lVar = this.f37955a;
        String str = this.f37956b;
        if (((Boolean) obj).booleanValue()) {
            C11525d dVar = lVar.f37964b;
            C8908bz bzVar = (C8908bz) C8910ca.f30917c.createBuilder();
            C8904bv bvVar = (C8904bv) C8905bw.f30911c.createBuilder();
            bvVar.copyOnWrite();
            C8905bw bwVar = (C8905bw) bvVar.instance;
            str.getClass();
            bwVar.f30913a |= 1;
            bwVar.f30914b = str;
            C8905bw bwVar2 = (C8905bw) bvVar.build();
            bzVar.copyOnWrite();
            C8910ca caVar = (C8910ca) bzVar.instance;
            bwVar2.getClass();
            caVar.f30921b = bwVar2;
            caVar.f30920a = 2;
            return C60922j.m93044g(dVar.mo20028e((C8910ca) bzVar.build()), C47810es.m84963c(C11804k.f37962a), lVar.f37965c);
        }
        return C60922j.m93044g(lVar.mo20158a(), C47810es.m84963c(new C11794a(str)), lVar.f37965c);
    }
}
