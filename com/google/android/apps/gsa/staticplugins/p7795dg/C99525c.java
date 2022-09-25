package com.google.android.apps.gsa.staticplugins.p7795dg;

import android.accounts.Account;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.search.googleapp.search.suggest.C138078e;
import com.google.android.apps.search.googleapp.search.suggest.C138081f;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10446c.C137968a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.dg.c */
/* compiled from: PG */
public final /* synthetic */ class C99525c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C99527e f278474a;

    /* renamed from: b */
    public final /* synthetic */ Account f278475b;

    /* renamed from: c */
    public final /* synthetic */ C47633f f278476c;

    /* renamed from: d */
    public final /* synthetic */ C47633f f278477d;

    public /* synthetic */ C99525c(C99527e eVar, Account account, C47633f fVar, C47633f fVar2) {
        this.f278474a = eVar;
        this.f278475b = account;
        this.f278476c = fVar;
        this.f278477d = fVar2;
    }

    public final void run() {
        C88244um umVar;
        C99527e eVar = this.f278474a;
        Account account = this.f278475b;
        C47633f fVar = this.f278476c;
        C47633f fVar2 = this.f278477d;
        if (Objects.equals(account, eVar.f278482c.mo79668a())) {
            try {
                C58833ax axVar = (C58833ax) C60856cj.m92909r(fVar);
                C138081f fVar3 = (C138081f) C60856cj.m92909r(fVar2);
                if (axVar.mo56113h()) {
                    C138078e a = C138078e.m224410a(fVar3.f375687b);
                    if (a == null) {
                        a = C138078e.NONE;
                    }
                    if (a != C138078e.NONE) {
                        C138078e a2 = C138078e.m224410a(fVar3.f375687b);
                        if (a2 == null) {
                            a2 = C138078e.NONE;
                        }
                        if (a2 == C138078e.AADC_SETTINGS_CHANGED) {
                            umVar = C88244um.SHOW_AADC_LOCATION_SETTINGS_CHANGED_SNACKBAR;
                        } else {
                            umVar = C88244um.SHOW_LOCATION_PERMISSIONS_SNACKBAR;
                        }
                        eVar.f278480a.mo80228i(new C87684al(umVar).mo81964a());
                        ((C137968a) axVar.mo56107c()).mo114062b(fVar3);
                    }
                }
            } catch (ExecutionException e) {
                throw c$$ExternalSyntheticBackport0.m165073m("Calling Futures.getDone() on futures that have succeeded", e);
            }
        }
    }
}
