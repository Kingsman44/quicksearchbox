package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.aju;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.h */
/* compiled from: PG */
public final /* synthetic */ class C129283h implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129284i f355095a;

    public /* synthetic */ C129283h(C129284i iVar) {
        this.f355095a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        AccountId accountId = this.f355095a.f355097a;
        C129277b bVar = new C129277b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, (aju) obj);
        C129228e eVar = C129228e.f354973a;
        return C129163d.m210837a(bVar, (String) null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
