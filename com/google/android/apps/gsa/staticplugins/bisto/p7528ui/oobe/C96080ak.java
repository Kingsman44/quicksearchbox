package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ak */
/* compiled from: PG */
public final /* synthetic */ class C96080ak implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C96082am f268999a;

    /* renamed from: b */
    public final /* synthetic */ Account f269000b;

    /* renamed from: c */
    public final /* synthetic */ String f269001c;

    /* renamed from: d */
    public final /* synthetic */ Duration f269002d;

    public /* synthetic */ C96080ak(C96082am amVar, Account account, String str, Duration duration) {
        this.f268999a = amVar;
        this.f269000b = account;
        this.f269001c = str;
        this.f269002d = duration;
    }

    public final C60870cx apply(Object obj) {
        C96082am amVar = this.f268999a;
        Account account = this.f269000b;
        String str = this.f269001c;
        Duration duration = this.f269002d;
        C59104x b = C96082am.f269003a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AuthTokenCheckerSeq");
        ((C59052c) ((C59052c) ((C59052c) b).mo56382g((Throwable) obj)).mo56372aa(16946)).mo56386p("ASSC check failed");
        amVar.f269005c.f266647b.mo57066b("ASSC-Check-Failure");
        amVar.f269004b.mo79680n();
        return amVar.mo89937b(account, str, duration);
    }
}
