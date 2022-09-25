package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import android.accounts.AccountsException;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.g */
/* compiled from: PG */
public final /* synthetic */ class C101553g implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C101560n f283395a;

    public /* synthetic */ C101553g(C101560n nVar) {
        this.f283395a = nVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C101560n nVar = this.f283395a;
        C58833ax axVar = nVar.f283411h.f257558c;
        if (axVar.mo56113h()) {
            ((C59052c) ((C59052c) C101560n.f283404a.mo56224b()).mo56372aa(20342)).mo56386p("Impersonation config is not null.");
            return ((C92391o) axVar.mo56107c()).f257645c;
        }
        String h = nVar.f283405b.mo79674h(nVar.f283410g);
        if (h != null) {
            return h;
        }
        ((C59052c) ((C59052c) C101560n.f283404a.mo56225c()).mo56372aa(20341)).mo56389s("Account id is null. accountName %s", nVar.f283410g);
        throw new AccountsException("The Account id is null");
    }
}
