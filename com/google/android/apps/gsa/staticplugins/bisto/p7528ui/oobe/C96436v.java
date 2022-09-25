package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.C83874ah;
import com.google.android.p10712d.C142316av;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.v */
/* compiled from: PG */
public final /* synthetic */ class C96436v implements C83874ah {

    /* renamed from: a */
    public final /* synthetic */ C96439y f269783a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f269784b;

    /* renamed from: c */
    public final /* synthetic */ C142316av f269785c;

    public /* synthetic */ C96436v(C96439y yVar, C58833ax axVar, C142316av avVar) {
        this.f269783a = yVar;
        this.f269784b = axVar;
        this.f269785c = avVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C96439y yVar = this.f269783a;
        C58833ax axVar = this.f269784b;
        C142316av avVar = this.f269785c;
        C59104x c = C96439y.f269793a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AccLinkSeq");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) obj)).mo56372aa(16937)).mo56386p("Unexpected linking error");
        return C96439y.m159790d((Account) axVar.mo56107c(), yVar.mo90121e(), (String) null, avVar);
    }
}
