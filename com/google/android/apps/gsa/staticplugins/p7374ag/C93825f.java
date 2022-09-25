package com.google.android.apps.gsa.staticplugins.p7374ag;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44044g;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.f */
/* compiled from: PG */
public final /* synthetic */ class C93825f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93829j f262070a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f262071b;

    public /* synthetic */ C93825f(C93829j jVar, AccountId accountId) {
        this.f262070a = jVar;
        this.f262071b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C93829j jVar = this.f262070a;
        AccountId accountId = this.f262071b;
        C44044g gVar = (C44044g) obj;
        if (gVar != C44044g.SUCCESS) {
            ((C59052c) ((C59052c) C93829j.f262075a.mo56226d()).mo56372aa(19067)).mo56387q("Cookie refresh result: %s", gVar.f114684m);
            return C60866ct.f164955a;
        }
        if (jVar.f262083i.getString(C90507o.f253011a, (String) null) == null) {
            ((C59052c) ((C59052c) C93829j.f262075a.mo56226d()).mo56372aa(19066)).mo56386p("GOOGLE_ACCOUNT_PREF was empty for successful refresh.");
        } else {
            long b = jVar.f262078d.mo26870b();
            long a = jVar.f262077c.mo79743a(C90120fr.f250831aw);
            C86337q b2 = jVar.f262082h.mo80076b();
            b2.mo80072g("refresh_webview_cookies_at", b + (a * 86400000));
            b2.apply();
        }
        return jVar.f262081g.mo47225a(accountId);
    }
}
