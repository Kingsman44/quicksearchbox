package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.android.setupdesign.p3556e.C45304a;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.ad */
/* compiled from: PG */
public final /* synthetic */ class C110454ad implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ SuwActivity f307937a;

    public /* synthetic */ C110454ad(SuwActivity suwActivity) {
        this.f307937a = suwActivity;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        SuwActivity suwActivity = this.f307937a;
        if (((Boolean) obj).booleanValue()) {
            Intent intent = suwActivity.getIntent();
            intent.getClass();
            if (!suwActivity.f307879h.mo79746e(C90062dn.f249216o)) {
                if (intent.getBooleanExtra("materialTheme", false)) {
                    ((C59052c) ((C59052c) SuwActivity.f307872a.mo56225c()).mo56372aa(26401)).mo56386p("material theme is not supported.");
                }
                if (suwActivity.f307873b.mo79668a() == null) {
                    ((C59052c) ((C59052c) SuwActivity.f307872a.mo56225c()).mo56372aa(26406)).mo56386p("Cannot check privacy opt-ins with no signed in account even after refresh.");
                    suwActivity.mo98670b(1);
                    suwActivity.finish();
                } else if (suwActivity.f307879h.mo79746e(C90014bt.f247176cH)) {
                    suwActivity.f307885n = suwActivity.f307881j.a(suwActivity.f307877f.c(), false);
                    Account a = suwActivity.f307873b.mo79668a();
                    a.getClass();
                    acu acu = (acu) acv.f128920X.createBuilder();
                    acu.copyOnWrite();
                    acv acv = (acv) acu.instance;
                    acv.f128945a |= 268435456;
                    acv.f128968x = true;
                    new C90873ag(((l) suwActivity.f307876e.mo27525b()).j(a, (acv) acu.build(), (C50144me) null, 5, TimeUnit.SECONDS, suwActivity.getClass().getSimpleName()), suwActivity.f307882k, "SyncAssistantLanguageToLocal", new C110452ab(suwActivity, a)).mo85223a(new C110453ac(suwActivity));
                } else {
                    suwActivity.mo98671d();
                }
            } else {
                boolean booleanExtra = intent.getBooleanExtra("hardwareButtonTraining", false);
                boolean booleanExtra2 = intent.getBooleanExtra("hotword", true);
                Intent intent2 = new Intent("com.google.android.apps.search.assistant.SUW_WRAPPED");
                intent2.putExtra("intent_extra_tng_suw_enabled_from_agsa_c", true);
                intent2.putExtra("hardwareButtonTraining", booleanExtra);
                intent2.putExtra("hotword", booleanExtra2);
                C45250g.m80605a(intent, intent2);
                C45304a.m80751g(suwActivity, intent2, 16);
                suwActivity.overridePendingTransition(17432576, 17432577);
            }
        } else {
            suwActivity.mo98670b(1);
        }
    }
}
