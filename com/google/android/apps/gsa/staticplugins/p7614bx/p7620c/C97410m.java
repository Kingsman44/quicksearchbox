package com.google.android.apps.gsa.staticplugins.p7614bx.p7620c;

import android.accounts.Account;
import android.accounts.AccountsException;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7158b.C90753j;
import com.google.android.apps.gsa.shared.util.p7158b.C90754k;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.c.m */
/* compiled from: PG */
final class C97410m implements C86051l {

    /* renamed from: a */
    final /* synthetic */ String f272001a;

    /* renamed from: b */
    final /* synthetic */ C97411n f272002b;

    public C97410m(C97411n nVar, String str) {
        this.f272002b = nVar;
        this.f272001a = str;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
    }

    /* renamed from: iR */
    public final void mo79704iR(Account[] accountArr) {
        try {
            this.f272002b.f272006d.mo79686t(this.f272001a);
            this.f272002b.f272008f.mo28212l("Switch Account", new C97409l(this, this.f272001a));
            this.f272002b.f272006d.mo79681o(this);
        } catch (AccountsException e) {
            String str = this.f272001a;
            C90476a aVar = C90754k.f253829b;
            C90476a aVar2 = C90754k.f253829b;
            ((C59052c) ((C59052c) ((C59052c) C97411n.f272003a.mo56225c()).mo56382g(e)).mo56372aa(21014)).mo56389s("Error getting account with name: %s", C90753j.m148241c(str));
            throw new IllegalArgumentException(e);
        } catch (Throwable th) {
            this.f272002b.f272006d.mo79681o(this);
            throw th;
        }
    }
}
