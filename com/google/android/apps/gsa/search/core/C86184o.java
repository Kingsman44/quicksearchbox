package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.udc.C87204ah;
import com.google.android.apps.gsa.search.core.udc.C87209e;
import com.google.android.apps.gsa.search.core.udc.C87215k;
import com.google.android.apps.gsa.shared.p7066m.C90109fg;
import com.google.android.apps.gsa.shared.p7144t.C90614e;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91270j;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91272l;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gcoreclient.p1792r.p1793a.C21635g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import dagger.C68214a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.search.core.o */
/* compiled from: PG */
public final class C86184o implements C118549h {

    /* renamed from: d */
    private static final C59071e f232879d = C59071e.m91332i("com.google.android.apps.gsa.search.core.o");

    /* renamed from: a */
    public final Context f232880a;

    /* renamed from: b */
    public final C86054o f232881b;

    /* renamed from: c */
    public final C42813k f232882c;

    /* renamed from: e */
    private final C91272l f232883e;

    /* renamed from: f */
    private final C86124t f232884f;

    /* renamed from: g */
    private final C87204ah f232885g;

    /* renamed from: h */
    private final C68214a f232886h;

    /* renamed from: i */
    private final C85653bd f232887i;

    /* renamed from: j */
    private final C22871g f232888j;

    public C86184o(Context context, C86124t tVar, C91272l lVar, C86054o oVar, C87204ah ahVar, C68214a aVar, C85653bd bdVar, C22871g gVar, C42813k kVar) {
        this.f232880a = context;
        this.f232884f = tVar;
        this.f232883e = lVar;
        this.f232881b = oVar;
        this.f232885g = ahVar;
        this.f232886h = aVar;
        this.f232887i = bdVar;
        this.f232888j = gVar;
        this.f232882c = kVar;
    }

    /* renamed from: b */
    private final boolean m138638b(Account[] accountArr) {
        if (!this.f232885g.mo80840h()) {
            return false;
        }
        for (Account a : accountArr) {
            try {
                C60917ed.m93034a(this.f232885g.mo80835a(a));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        boolean z;
        Account[] r = this.f232881b.mo79684r();
        if (r0 == 0) {
            return C118826c.f331423b;
        }
        boolean b = m138638b(r);
        if (!this.f232884f.mo79746e(C90109fg.f250573o)) {
            z = false;
        } else {
            for (Account account : r) {
                if (this.f232884f.mo79746e(C90109fg.f250563e)) {
                    ((C87215k) this.f232886h.mo27525b()).mo80843c(account);
                } else {
                    C87215k kVar = (C87215k) this.f232886h.mo27525b();
                    kVar.f235633a.mo28202b("Fetch from GmsCore for account.", new C87209e(kVar, account));
                }
            }
            this.f232888j.mo28212l("wipeFacsCacheDirectories", new C86181n(this));
            z = true;
        }
        if (!b && !z) {
            for (Account account2 : r) {
                C91272l lVar = this.f232883e;
                try {
                    lVar.mo85551e(account2, (C21635g) lVar.mo84766j(new C91270j(lVar, account2)));
                } catch (C90614e e) {
                    C59104x d = C91272l.f254733a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "LockboxApiWrapper");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11522)).mo56386p("Error getting opt-in status from GcoreLockboxApi");
                }
            }
        }
        C60870cx b2 = this.f232883e.mo85549b(this.f232881b.mo79668a());
        if (b2 != null) {
            try {
                C90877ak.m148472f(b2);
            } catch (InterruptedException e2) {
                ((C59052c) ((C59052c) ((C59052c) f232879d.mo56225c()).mo56382g(e2)).mo56372aa(7388)).mo56386p("Setting active Google Now account interrupted.");
            } catch (ExecutionException e3) {
                ((C59052c) ((C59052c) ((C59052c) f232879d.mo56225c()).mo56382g(e3)).mo56372aa(7389)).mo56386p("Setting active Google Now account has execution error.");
            }
        }
        this.f232887i.mo79169g(1);
        return C118826c.f331423b;
    }
}
