package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.ady;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.s */
/* compiled from: PG */
public final /* synthetic */ class C129086s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129088u f354617a;

    /* renamed from: b */
    public final /* synthetic */ String f354618b;

    public /* synthetic */ C129086s(C129088u uVar, String str) {
        this.f354617a = uVar;
        this.f354618b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C129088u uVar = this.f354617a;
        String str = this.f354618b;
        ady ady = (ady) obj;
        AccountId accountId = uVar.f354623b;
        C129079l lVar = (C129079l) C129080m.f354595d.createBuilder();
        lVar.copyOnWrite();
        C129080m mVar = (C129080m) lVar.instance;
        ady.getClass();
        mVar.f354598b = ady;
        mVar.f354597a |= 1;
        lVar.copyOnWrite();
        C129080m mVar2 = (C129080m) lVar.instance;
        str.getClass();
        mVar2.f354597a |= 2;
        mVar2.f354599c = str;
        C129078k kVar = new C129078k();
        C68324h.m98669f(kVar);
        C47247a.m84047b(kVar, accountId);
        C47243l.m84039a(kVar, (C129080m) lVar.build());
        C129228e eVar = C129228e.f354973a;
        return C129163d.m210837a(kVar, "ActionsServiceFragment");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
