package com.google.android.apps.search.googleapp.accounts.p10124b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.googleapp.accounts.p10123a.C133150a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46010bu;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.accounts.b.c */
/* compiled from: PG */
public final class C133155c {

    /* renamed from: a */
    private final C133158f f362970a;

    public C133155c(C133158f fVar) {
        this.f362970a = fVar;
    }

    /* renamed from: a */
    public final void mo110998a(Activity activity, C45987ay ayVar, C45989b bVar) {
        AccountId accountId;
        String queryParameter;
        C133158f fVar = this.f362970a;
        if (fVar.f362974b) {
            Intent intent = activity.getIntent();
            AccountId accountId2 = null;
            try {
                C58838bb.m90868c(intent.getBooleanExtra("$tiktok$account_id_owned", false));
                accountId = C45963aa.m82132b(intent);
            } catch (IllegalArgumentException unused) {
                ((C59052c) ((C59052c) C133158f.f362973a.mo56225c()).mo56372aa(40007)).mo56386p("EXTRA_TIKTOK_CREATED is missing from the intent extras");
                accountId = null;
            }
            if (accountId == null) {
                C69664n.m101061g(intent, "intent");
                Uri data = intent.getData();
                if (!(data == null || (queryParameter = data.getQueryParameter("googleapp_account_id")) == null)) {
                    try {
                        C58838bb.m90869d(!queryParameter.isEmpty(), "Invalid AccountId string");
                        accountId2 = AccountId.m82057b(Integer.parseInt(queryParameter));
                    } catch (Exception e) {
                        C59052c cVar = (C59052c) ((C59052c) C133150a.f362965a.mo56225c()).mo56382g(e);
                        cVar.mo56379ah(new C59094n(40005));
                        cVar.mo56386p("Failed to parse an AccountId");
                    }
                }
                if (accountId2 != null) {
                    ((C59052c) ((C59052c) C133158f.f362973a.mo56225c()).mo56372aa(40006)).mo56386p("Account ID is present in the intent data but not extras");
                    ((C19567d) fVar.f362975c.f102922c.mo6453a()).mo24822a(1, new Object[0]);
                    C45963aa.m82131a(intent, accountId2);
                } else {
                    ((C19567d) fVar.f362975c.f102869b.mo6453a()).mo24822a(1, new Object[0]);
                }
            }
        }
        C58485gu a = fVar.mo110999a();
        C58838bb.m90884s(activity.getIntent().hasExtra("account_id"), "Account missing");
        C58838bb.m90866a(a, "Override requirements should not be null");
        C46012bw d = C46013bx.m82200d();
        ((C46010bu) d).f120853a = a;
        bVar.mo50083f(d.mo50146a());
        bVar.mo50082e(ayVar);
    }
}
