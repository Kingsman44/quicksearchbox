package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.l */
/* compiled from: PG */
public final /* synthetic */ class C110552l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110559s f308208a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f308209b;

    public /* synthetic */ C110552l(C110559s sVar, SettableFuture settableFuture) {
        this.f308208a = sVar;
        this.f308209b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110559s sVar = this.f308208a;
        SettableFuture settableFuture = this.f308209b;
        ((C58970a) ((C58970a) ((C58970a) sVar.f308227f.mo56225c()).mo56382g((Exception) obj)).mo56372aa(26554)).mo56386p("Failed to read calendar1 events from OpaStore.");
        settableFuture.mo57356n(C58836b.f156633a);
    }
}
