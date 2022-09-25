package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a;

import android.accounts.Account;
import android.accounts.AccountsException;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.a.y */
/* compiled from: PG */
final class C97347y implements C86051l {

    /* renamed from: a */
    final /* synthetic */ String f271877a;

    /* renamed from: b */
    final /* synthetic */ C97320ae f271878b;

    public C97347y(C97320ae aeVar, String str) {
        this.f271878b = aeVar;
        this.f271877a = str;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
    }

    /* renamed from: iR */
    public final void mo79704iR(Account[] accountArr) {
        try {
            this.f271878b.f271792b.mo79686t(this.f271877a);
            this.f271878b.f271796f.mo28212l("Switch Account", new C97346x(this, this.f271877a));
            this.f271878b.f271792b.mo79681o(this);
            this.f271878b.f271810t = null;
        } catch (AccountsException e) {
            String str = this.f271877a;
            C90476a aVar = C90754k.f253829b;
            C90476a aVar2 = C90754k.f253829b;
            ((C59052c) ((C59052c) ((C59052c) C97320ae.f271780a.mo56225c()).mo56382g(e)).mo56372aa(20981)).mo56389s("Error getting account with name: %s", C90753j.m148241c(str));
            throw new IllegalArgumentException(e);
        } catch (Throwable th) {
            this.f271878b.f271792b.mo79681o(this);
            this.f271878b.f271810t = null;
            throw th;
        }
    }
}
