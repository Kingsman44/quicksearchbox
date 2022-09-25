package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9871b.C130176b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.l */
/* compiled from: PG */
public final /* synthetic */ class C129323l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C129331t f355191a;

    public /* synthetic */ C129323l(C129331t tVar) {
        this.f355191a = tVar;
    }

    public final void accept(Object obj) {
        C129331t tVar = this.f355191a;
        C0154a aVar = new C0154a(tVar.f355207f);
        AccountId accountId = tVar.f355203b;
        C130176b bVar = new C130176b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, (C51992gr) obj);
        aVar.mo689v(R.id.assistant_correction_container, bVar, "CORRECTION_FRAGMENT_TAG");
        aVar.mo509f();
        tVar.mo108971d(false);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
