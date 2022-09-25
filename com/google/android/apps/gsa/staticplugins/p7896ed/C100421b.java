package com.google.android.apps.gsa.staticplugins.p7896ed;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.search.googleapp.discover.p10173aa.C134020am;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.concurrent.C46459k;

/* renamed from: com.google.android.apps.gsa.staticplugins.ed.b */
/* compiled from: PG */
public final class C100421b implements C86051l {

    /* renamed from: a */
    public final Context f280756a;

    /* renamed from: b */
    private final C86034c f280757b;

    /* renamed from: c */
    private final C22871g f280758c;

    /* renamed from: d */
    private final C84486a f280759d;

    /* renamed from: com.google.android.apps.gsa.staticplugins.ed.b$a */
    /* compiled from: PG */
    public interface C100422a {
        /* renamed from: cc */
        C134020am mo91911cc();
    }

    public C100421b(Context context, C86034c cVar, C22871g gVar, C84486a aVar) {
        this.f280756a = context;
        this.f280757b = cVar;
        this.f280758c = gVar;
        this.f280759d = aVar;
    }

    /* renamed from: c */
    private final void m166464c() {
        if (!this.f280759d.mo78205l()) {
            return;
        }
        if (this.f280759d.mo78206m() || this.f280759d.mo78203j()) {
            C46459k.m82829b(this.f280758c.mo28210j(this.f280757b.mo79697b(), "TngDiscoverAccountChanged", new C100419a(this)), "Failed when starting background refresh on account change", new Object[0]);
        }
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        m166464c();
    }

    /* renamed from: iR */
    public final void mo79704iR(Account[] accountArr) {
        m166464c();
    }
}
