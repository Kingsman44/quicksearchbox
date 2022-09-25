package com.google.android.apps.gsa.staticplugins.p7681cm.p7683b;

import com.google.android.apps.gsa.staticplugins.p7681cm.p7683b.C97975h;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.b.b */
/* compiled from: PG */
public final /* synthetic */ class C97969b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97975h f273554a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f273555b;

    public /* synthetic */ C97969b(C97975h hVar, AccountId accountId) {
        this.f273554a = hVar;
        this.f273555b = accountId;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C97975h hVar = this.f273554a;
        AccountId accountId = this.f273555b;
        if (((Boolean) obj).booleanValue()) {
            return Optional.m71637of(((C97975h.C97976a) C47245e.m84045a(hVar.f273561a, C97975h.C97976a.class, accountId)).mo90860fT());
        }
        return Optional.empty();
    }
}
