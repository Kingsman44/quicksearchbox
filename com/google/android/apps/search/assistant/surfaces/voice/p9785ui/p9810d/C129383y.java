package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.apps.tiktok.account.AccountId;
import p3186j$.util.function.BiFunction;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.y */
/* compiled from: PG */
public final class C129383y {

    /* renamed from: a */
    final /* synthetic */ BiFunction f355300a;

    public C129383y(BiFunction biFunction) {
        this.f355300a = biFunction;
    }

    /* renamed from: a */
    public final Fragment mo109012a(AccountId accountId, C126988i iVar) {
        C69664n.m101061g(accountId, "account");
        C69664n.m101061g(iVar, "errorData");
        Object apply = this.f355300a.apply(accountId, iVar);
        C69664n.m101060f(apply, "factory.apply(account, errorData)");
        return (Fragment) apply;
    }
}
