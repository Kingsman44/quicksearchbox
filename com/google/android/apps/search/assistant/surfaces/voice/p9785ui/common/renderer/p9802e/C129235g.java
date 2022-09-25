package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9802e;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.p3926e.C51978gd;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.e.g */
/* compiled from: PG */
public final /* synthetic */ class C129235g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129236h f354985a;

    public /* synthetic */ C129235g(C129236h hVar) {
        this.f354985a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        AccountId accountId = this.f354985a.f354987a;
        C129230b bVar = new C129230b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, (C51978gd) obj);
        C129228e eVar = C129228e.f354973a;
        return C129163d.m210837a(bVar, (String) null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
