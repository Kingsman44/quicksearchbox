package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.common.util.concurrent.C60866ct;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.ac */
/* compiled from: PG */
public final /* synthetic */ class C130196ac implements Function {

    /* renamed from: a */
    public final /* synthetic */ C130197ad f356951a;

    public /* synthetic */ C130196ac(C130197ad adVar) {
        this.f356951a = adVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130197ad adVar = this.f356951a;
        C51971fx fxVar = (C51971fx) obj;
        C130219n nVar = adVar.f356954b;
        C130215j jVar = (C130215j) C130216k.f356979c.createBuilder();
        jVar.copyOnWrite();
        C130216k kVar = (C130216k) jVar.instance;
        fxVar.getClass();
        kVar.f356982b = fxVar;
        kVar.f356981a |= 1;
        nVar.f356988d = (C130216k) jVar.build();
        nVar.f356986b.mo50787a(C60866ct.f164955a, C130219n.f356985a);
        AccountId accountId = adVar.f356953a;
        C130201ah ahVar = new C130201ah();
        C68324h.m98669f(ahVar);
        C47247a.m84047b(ahVar, accountId);
        C129228e eVar = C129228e.f354973a;
        return C129163d.m210837a(ahVar, "web_content_root_fragment");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
