package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47274n;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.DesugarArrays;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.h */
/* compiled from: PG */
public final class C130136h {

    /* renamed from: a */
    public final C130130b f356800a;

    /* renamed from: b */
    public final C47274n f356801b;

    /* renamed from: c */
    public final C58495hd f356802c;

    /* renamed from: d */
    public C130145q f356803d;

    /* renamed from: e */
    private final AccountId f356804e;

    public C130136h(C130130b bVar, AccountId accountId, C47274n nVar) {
        this.f356800a = bVar;
        this.f356804e = accountId;
        this.f356801b = nVar;
        this.f356802c = (C58495hd) DesugarArrays.stream((T[]) C130127c.values()).collect(C58370cn.m89403c(C130131c.f356795a, new C130132d(nVar), C130133e.f356797a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo109524a(C130127c cVar, Function function) {
        View view = (View) this.f356802c.get(cVar);
        if (view != null) {
            C0154a aVar = new C0154a(this.f356800a.getChildFragmentManager());
            aVar.mo511h(view.getId(), (Fragment) function.apply(this.f356804e), (String) null, 1);
            aVar.mo509f();
        }
    }
}
