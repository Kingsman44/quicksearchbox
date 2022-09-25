package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9416c;

import com.google.android.p10712d.C142328bg;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.c.f */
/* compiled from: PG */
public final class C124863f {

    /* renamed from: a */
    public final AccountId f344496a;

    /* renamed from: b */
    public final C124865h f344497b;

    /* renamed from: c */
    public final C124862e f344498c;

    public C124863f(AccountId accountId, C124865h hVar, C124862e eVar) {
        this.f344496a = accountId;
        this.f344497b = hVar;
        this.f344498c = eVar;
    }

    /* renamed from: a */
    public static C124862e m204684a(AccountId accountId, C142328bg bgVar) {
        C124864g gVar = (C124864g) C124865h.f344499d.createBuilder();
        gVar.copyOnWrite();
        C124865h hVar = (C124865h) gVar.instance;
        bgVar.getClass();
        hVar.f344503c = bgVar;
        hVar.f344501a |= 1;
        C124862e eVar = new C124862e();
        C68324h.m98669f(eVar);
        C47247a.m84047b(eVar, accountId);
        C47243l.m84039a(eVar, (C124865h) gVar.build());
        return eVar;
    }
}
