package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29553bf;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.h */
/* compiled from: PG */
public final class C96789h implements C29553bf {

    /* renamed from: a */
    private final C68214a f270701a;

    /* renamed from: b */
    private final Executor f270702b;

    public C96789h(C68214a aVar, C90851k kVar) {
        this.f270701a = aVar;
        this.f270702b = kVar.mo85210c("[APA] ApaGddOAuthTokenProvider");
    }

    /* renamed from: a */
    public final C60870cx mo33118a(Account account) {
        C60870cx f = ((C86054o) this.f270701a.mo27525b()).mo79672f("oauth2:https://www.googleapis.com/auth/webhistory", account, false, new C91032p());
        C96788g gVar = C96788g.f270700a;
        return C60922j.m93045h(f, C47810es.m84966f(gVar), this.f270702b);
    }
}
