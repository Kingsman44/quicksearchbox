package com.google.android.apps.search.googleapp.googleappbrowser.p10260a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.a.c */
/* compiled from: PG */
public final class C135457c {

    /* renamed from: a */
    private final AccountId f369039a;

    /* renamed from: b */
    private final Context f369040b;

    public C135457c(AccountId accountId, Context context) {
        this.f369039a = accountId;
        this.f369040b = context;
    }

    /* renamed from: a */
    public static Intent m219645a(AccountId accountId, Intent intent, C135462h hVar, boolean z) {
        if (!z) {
            return m219646c(intent, accountId, hVar, "com.google.android.googlequicksearchbox");
        }
        C45963aa.m82131a(intent, accountId);
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.GOOGLE_APP_BROWSER);
        l.mo112772g(Optional.m71637of(hVar.f369065e));
        C135459e eVar = (C135459e) hVar.toBuilder();
        eVar.copyOnWrite();
        C135462h hVar2 = (C135462h) eVar.instance;
        hVar2.f369061a |= 1024;
        hVar2.f369072l = true;
        eVar.copyOnWrite();
        C135462h hVar3 = (C135462h) eVar.instance;
        hVar3.f369061a |= 128;
        hVar3.f369069i = true;
        Uri data = intent.getData();
        data.getClass();
        String uri = data.toString();
        eVar.copyOnWrite();
        C135462h hVar4 = (C135462h) eVar.instance;
        uri.getClass();
        hVar4.f369061a = 1 | hVar4.f369061a;
        hVar4.f369062b = uri;
        l.mo112770e(Optional.m71637of((C135462h) eVar.build()));
        C136127h.m221196a(intent, l.mo112766a());
        return intent;
    }

    /* renamed from: c */
    public static Intent m219646c(Intent intent, AccountId accountId, C135462h hVar, String str) {
        Intent intent2 = new Intent(intent);
        intent2.addFlags(67108864);
        intent2.setClassName(str, "com.google.android.apps.search.googleapp.googleappbrowser.GoogleAppBrowserActivity");
        C135458d.m219649b(hVar, intent2);
        C45963aa.m82131a(intent2, accountId);
        return intent2;
    }

    /* renamed from: b */
    public final Intent mo112350b(Uri uri, C135459e eVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (uri != null) {
            intent.setData(uri);
        }
        AccountId accountId = this.f369039a;
        String packageName = this.f369040b.getPackageName();
        C135462h hVar = (C135462h) eVar.build();
        if (packageName == null) {
            packageName = "com.google.android.googlequicksearchbox";
        }
        return m219646c(intent, accountId, hVar, packageName);
    }
}
