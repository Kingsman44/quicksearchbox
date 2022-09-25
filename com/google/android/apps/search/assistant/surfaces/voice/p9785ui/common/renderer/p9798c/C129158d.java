package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.p3926e.C52027hz;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.d */
/* compiled from: PG */
final class C129158d implements Function {

    /* renamed from: a */
    final /* synthetic */ C129159e f354802a;

    public C129158d(C129159e eVar) {
        this.f354802a = eVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C129228e eVar = C129228e.f354973a;
        AccountId accountId = this.f354802a.f354803a;
        C129155b bVar = new C129155b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, (C52027hz) obj);
        return C129163d.m210837a(bVar, (String) null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
