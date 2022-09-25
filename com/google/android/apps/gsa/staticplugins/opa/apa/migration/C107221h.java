package com.google.android.apps.gsa.staticplugins.opa.apa.migration;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C51809dy;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.migration.h */
/* compiled from: PG */
public final /* synthetic */ class C107221h implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C129146c f298417a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f298418b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f298419c;

    public /* synthetic */ C107221h(C129146c cVar, C51809dy dyVar, AccountId accountId) {
        this.f298417a = cVar;
        this.f298418b = dyVar;
        this.f298419c = accountId;
    }

    public final Object get() {
        C129146c cVar = this.f298417a;
        C51809dy dyVar = this.f298418b;
        AccountId accountId = this.f298419c;
        C129228e a = cVar.mo108791a(dyVar);
        return new C107227m(accountId, a.f354975c, a.f354976d);
    }
}
