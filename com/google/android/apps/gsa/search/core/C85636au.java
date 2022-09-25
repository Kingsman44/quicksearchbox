package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import android.accounts.AccountsException;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.p7159c.C90890ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.au */
/* compiled from: PG */
final class C85636au extends C90890ax {

    /* renamed from: a */
    final /* synthetic */ Account f231460a;

    /* renamed from: b */
    final /* synthetic */ C85637av f231461b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85636au(C85637av avVar, Account account) {
        super("Set account");
        this.f231461b = avVar;
        this.f231460a = account;
    }

    /* renamed from: a */
    public final Boolean call() {
        try {
            ((C86054o) this.f231461b.f231463b.mo27525b()).mo79686t(this.f231460a.name);
            return true;
        } catch (AccountsException e) {
            C59104x d = C85637av.f231462a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NowOptInHelper");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7406)).mo56386p("Account not available on device.");
            return false;
        }
    }
}
