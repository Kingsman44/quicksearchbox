package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p690i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.auto.p450a.p451a.C8902bt;
import com.google.android.apps.auto.p450a.p451a.C8903bu;
import com.google.android.apps.auto.p450a.p451a.C8908bz;
import com.google.android.apps.auto.p450a.p451a.C8910ca;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11525d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.i */
/* compiled from: PG */
public final /* synthetic */ class C11802i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11805l f37958a;

    /* renamed from: b */
    public final /* synthetic */ String f37959b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public final /* synthetic */ String f37960c;

    public /* synthetic */ C11802i(C11805l lVar, String str) {
        this.f37958a = lVar;
        this.f37960c = str;
    }

    public final C60870cx apply(Object obj) {
        C11805l lVar = this.f37958a;
        String str = this.f37959b;
        String str2 = this.f37960c;
        if (((Boolean) obj).booleanValue()) {
            C11525d dVar = lVar.f37964b;
            C8908bz bzVar = (C8908bz) C8910ca.f30917c.createBuilder();
            C8902bt btVar = (C8902bt) C8903bu.f30906d.createBuilder();
            btVar.copyOnWrite();
            C8903bu buVar = (C8903bu) btVar.instance;
            buVar.f30908a |= 2;
            buVar.f30910c = str;
            btVar.copyOnWrite();
            C8903bu buVar2 = (C8903bu) btVar.instance;
            str2.getClass();
            buVar2.f30908a |= 1;
            buVar2.f30909b = str2;
            C8903bu buVar3 = (C8903bu) btVar.build();
            bzVar.copyOnWrite();
            C8910ca caVar = (C8910ca) bzVar.instance;
            buVar3.getClass();
            caVar.f30921b = buVar3;
            caVar.f30920a = 1;
            return C60922j.m93044g(dVar.mo20028e((C8910ca) bzVar.build()), C47810es.m84963c(C11797d.f37952a), lVar.f37965c);
        }
        return C60922j.m93044g(lVar.mo20158a(), C47810es.m84963c(new C11798e(str2)), lVar.f37965c);
    }
}
