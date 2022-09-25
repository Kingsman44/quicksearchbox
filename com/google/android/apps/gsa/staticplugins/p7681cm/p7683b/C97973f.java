package com.google.android.apps.gsa.staticplugins.p7681cm.p7683b;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.b.f */
/* compiled from: PG */
public final /* synthetic */ class C97973f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C97975h f273559a;

    public /* synthetic */ C97973f(C97975h hVar) {
        this.f273559a = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C97975h hVar = this.f273559a;
        AccountId accountId = (AccountId) obj;
        if (accountId == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        C22871g gVar = hVar.f273563c;
        return gVar.mo28209i(gVar.mo28209i(hVar.f273564d.mo50246c(accountId), "Preferences Summary: check if accountId is a Google account", C97968a.f273553a), "Preferences Summary: drop store if not a Google account", new C97969b(hVar, accountId));
    }
}
