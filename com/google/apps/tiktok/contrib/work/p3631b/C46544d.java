package com.google.apps.tiktok.contrib.work.p3631b;

import android.content.Context;
import androidx.work.C4396at;
import androidx.work.C4410f;
import androidx.work.C4634o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.contrib.work.C46506a;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46585s;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.contrib.work.C46588v;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.contrib.work.b.d */
/* compiled from: PG */
public final class C46544d implements C46506a {

    /* renamed from: a */
    public final C46564v f121706a;

    /* renamed from: b */
    private final C4396at f121707b;

    /* renamed from: c */
    private final C60887da f121708c;

    /* renamed from: d */
    private final Context f121709d;

    /* renamed from: e */
    private final Executor f121710e;

    /* renamed from: com.google.apps.tiktok.contrib.work.b.d$a */
    /* compiled from: PG */
    public interface C46545a {
        /* renamed from: gP */
        C46588v mo50540gP();
    }

    public C46544d(Context context, Executor executor, C4396at atVar, C46564v vVar, C60887da daVar) {
        this.f121709d = context;
        this.f121710e = executor;
        this.f121707b = atVar;
        this.f121706a = vVar;
        this.f121708c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo50517a(AccountId accountId, String str) {
        C60870cx a = this.f121707b.mo9328b(C46528an.m82962b(accountId, str)).mo9320a();
        C46541b bVar = C46541b.f121699a;
        return mo50539d(accountId).mo50536b(C60922j.m93044g(a, C47810es.m84963c(bVar), this.f121708c), str);
    }

    /* renamed from: b */
    public final C60870cx mo50518b(AccountId accountId, C46586t tVar) {
        C46542ba.m82979e(tVar);
        C46586t f = this.f121706a.mo50550f(tVar);
        C46586t k = f.mo50591k(C58528ij.m90011K("tiktok_account_work", C46528an.m82963c(accountId)));
        if (k.mo50571g().mo56113h()) {
            C46574h hVar = new C46574h(C46528an.m82962b(accountId, ((C46585s) k.mo50571g().mo56107c()).mo50587b()), ((C46585s) k.mo50571g().mo56107c()).mo50586a());
            C46582p c = k.mo50566c();
            c.mo50563c(hVar);
            k = c.mo50561a();
        }
        C46564v vVar = this.f121706a;
        Executor executor = this.f121710e;
        C46582p j = C46586t.m83063j(C46524aj.class);
        C46570d dVar = (C46570d) j;
        dVar.f121756e = C58833ax.m90834k(C46583q.m83056d(new C46573g(3, TimeUnit.DAYS), new C46573g(1, TimeUnit.DAYS)));
        dVar.f121757f = C58833ax.m90834k(new C46574h("tiktok_wipeout_worker", C4634o.KEEP));
        C4410f fVar = new C4410f();
        fVar.f14071a = true;
        dVar.f121753b = fVar.mo9349a();
        C60870cx b = vVar.mo50546b(j.mo50561a());
        C60856cj.m92911t(b, C47810es.m84974n(C46524aj.f121668b), executor);
        C46543c cVar = new C46543c(this, accountId, f, k);
        return C60922j.m93045h(b, C47810es.m84966f(cVar), this.f121710e);
    }

    /* renamed from: c */
    public final C60870cx mo50519c(AccountId accountId) {
        return this.f121707b.mo9334h(C46528an.m82962b(accountId, "feed_sync_worker"));
    }

    /* renamed from: d */
    public final C46588v mo50539d(AccountId accountId) {
        return ((C46545a) C47245e.m84045a(this.f121709d, C46545a.class, accountId)).mo50540gP();
    }
}
