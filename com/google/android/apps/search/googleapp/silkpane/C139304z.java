package com.google.android.apps.search.googleapp.silkpane;

import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.web.base.C43264o;
import com.google.android.libraries.web.weblayer.p3448b.C44127c;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.z */
/* compiled from: PG */
public final class C139304z {

    /* renamed from: a */
    public static final C59071e f378877a = C59071e.m91332i("com.google.android.apps.search.googleapp.silkpane.z");

    /* renamed from: b */
    public final AccountId f378878b;

    /* renamed from: c */
    public final C139303y f378879c;

    /* renamed from: d */
    public final C44127c f378880d;

    /* renamed from: e */
    public final C133665d f378881e;

    /* renamed from: f */
    public final C139280b f378882f;

    /* renamed from: g */
    public final C136247a f378883g;

    /* renamed from: h */
    public final C40758l f378884h;

    public C139304z(AccountId accountId, C139303y yVar, C44127c cVar, C133665d dVar, IncognitoLifecycleObserver incognitoLifecycleObserver, C136247a aVar, C40758l lVar, C139280b bVar) {
        this.f378878b = accountId;
        this.f378879c = yVar;
        this.f378880d = cVar;
        this.f378881e = dVar;
        this.f378882f = bVar;
        this.f378884h = lVar;
        this.f378883g = aVar;
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: a */
    public final C139300v mo114885a() {
        C43264o oVar = (C43264o) this.f378879c.getChildFragmentManager().f634a.mo671c("web_coordinator_fragment");
        if (oVar == null) {
            return null;
        }
        return (C139300v) oVar.mo17754z().mo46379a();
    }
}
