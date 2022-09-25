package com.google.android.libraries.search.p2476a.p2479c.p2481b;

import androidx.work.C4381ae;
import androidx.work.C4410f;
import androidx.work.C4634o;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.account.data.C46155ag;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.a.c.b.f */
/* compiled from: PG */
public final class C32181f implements C46575i {

    /* renamed from: a */
    public static final C58974d f86382a = C58974d.m91134h("InvalidateAccountsWorker");

    /* renamed from: b */
    private final C60887da f86383b;

    /* renamed from: c */
    private final C46155ag f86384c;

    public C32181f(C46155ag agVar, C60887da daVar) {
        this.f86383b = daVar;
        this.f86384c = agVar;
    }

    /* renamed from: a */
    static C46586t m59974a() {
        C46582p j = C46586t.m83063j(C32181f.class);
        C46570d dVar = (C46570d) j;
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(12, TimeUnit.HOURS)));
        dVar.f121757f = C58833ax.m90834k(new C46574h("invalidate_accounts_worker", C4634o.KEEP));
        C4410f fVar = new C4410f();
        fVar.f14071a = true;
        fVar.f14072b = true;
        fVar.mo9351c(C4381ae.UNMETERED);
        dVar.f121753b = fVar.mo9349a();
        return j.mo50561a();
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C46155ag agVar = this.f86384c;
        C60870cx a = agVar.mo50224a();
        agVar.mo50226c(a);
        return C47633f.m84733g(a).mo51515h(C32179d.f86380a, this.f86383b).mo51513e(Throwable.class, C32180e.f86381a, this.f86383b);
    }
}
