package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.u */
/* compiled from: PG */
public final /* synthetic */ class C129260u implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129261v f355045a;

    public /* synthetic */ C129260u(C129261v vVar) {
        this.f355045a = vVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52003hb hbVar = (C52003hb) obj;
        AccountId accountId = this.f355045a.f355047a;
        C129245h hVar = (C129245h) C129246i.f355015d.createBuilder();
        hVar.copyOnWrite();
        C129246i iVar = (C129246i) hVar.instance;
        hbVar.getClass();
        iVar.f355018b = hbVar;
        iVar.f355017a |= 1;
        C129248k kVar = new C129248k();
        C68324h.m98669f(kVar);
        C47247a.m84047b(kVar, accountId);
        C47243l.m84039a(kVar, (C129246i) hVar.build());
        C129228e eVar = C129228e.f354973a;
        return C129163d.m210837a(kVar, (String) null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
