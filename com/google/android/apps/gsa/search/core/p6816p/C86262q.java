package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89007ae;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90455b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.C90723ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.p.q */
/* compiled from: PG */
public final class C86262q implements C90723ag {

    /* renamed from: a */
    public final Object f233176a = new Object();

    /* renamed from: b */
    final /* synthetic */ C86263r f233177b;

    /* renamed from: c */
    public C86264s f233178c;

    /* renamed from: d */
    private final C89061q f233179d;

    /* renamed from: e */
    private final C89020ar f233180e;

    /* renamed from: f */
    private final C89068x f233181f;

    /* renamed from: g */
    private boolean f233182g;

    /* renamed from: h */
    private C89022at f233183h;

    /* renamed from: i */
    private C90455b f233184i;

    /* renamed from: j */
    private final AtomicBoolean f233185j = new AtomicBoolean(true);

    public C86262q(C86263r rVar, C89061q qVar, C89020ar arVar, C89068x xVar) {
        this.f233177b = rVar;
        this.f233179d = qVar;
        this.f233180e = arVar;
        this.f233181f = xVar;
    }

    /* renamed from: a */
    public final InputStream mo79589b() {
        boolean z = true;
        C58838bb.m90883r(this.f233185j.compareAndSet(true, false));
        try {
            C89021as asVar = (C89021as) C90877ak.m148472f(((C89012aj) this.f233177b.f233187b.mo27525b()).mo27496g(this.f233180e, this.f233181f, this.f233179d));
            C89022at g = asVar.mo82999g();
            C89007ae aeVar = new C89007ae(asVar.mo82997b());
            synchronized (this.f233176a) {
                C58838bb.m90883r(this.f233183h == null && this.f233184i == null);
                this.f233183h = g;
            }
            mo79961c();
            return aeVar;
        } catch (InterruptedException e) {
            throw new C90457d((Throwable) e, (int) C89885b.GWS_ASYNC_FETCHER_INTERRUPTED_VALUE);
        } catch (ExecutionException e2) {
            throw new C90457d((Throwable) e2, (int) C89885b.GWS_ASYNC_FETCHER_FAILED_VALUE);
        } catch (C89013ak e3) {
            C58976aa aaVar = C58975e.f156826a;
            synchronized (this.f233176a) {
                if (this.f233183h != null || this.f233184i != null) {
                    z = false;
                }
                C58838bb.m90883r(z);
                this.f233183h = e3.mo82984e();
                this.f233184i = e3;
                mo79961c();
                throw e3;
            }
        } catch (C90457d e4) {
            C58976aa aaVar2 = C58975e.f156826a;
            synchronized (this.f233176a) {
                if (this.f233183h != null || this.f233184i != null) {
                    z = false;
                }
                C58838bb.m90883r(z);
                this.f233184i = e4;
                mo79961c();
                throw e4;
            }
        }
    }

    /* renamed from: c */
    public final void mo79961c() {
        C86264s sVar;
        C89022at atVar;
        C90455b bVar;
        C86264s sVar2;
        synchronized (this.f233176a) {
            sVar = null;
            if (this.f233182g || (sVar2 = this.f233178c) == null || ((atVar = this.f233183h) == null && this.f233184i == null)) {
                bVar = null;
                atVar = null;
            } else {
                this.f233182g = true;
                sVar = sVar2;
                bVar = this.f233184i;
            }
        }
        if (sVar != null) {
            boolean z = false;
            if (atVar != null) {
                C89013ak akVar = bVar;
                synchronized (sVar.f233189a.f233194b) {
                    if (sVar.f233189a.f233197e == null) {
                        z = true;
                    }
                    C58838bb.m90883r(z);
                    C86267v vVar = sVar.f233189a;
                    vVar.f233197e = atVar;
                    if (akVar != null) {
                        vVar.f233198f = akVar;
                    }
                    vVar.f233196d = true;
                }
                sVar.f233189a.mo79964a();
            } else if (bVar != null) {
                synchronized (sVar.f233189a.f233194b) {
                    if (sVar.f233189a.f233197e == null) {
                        z = true;
                    }
                    C58838bb.m90883r(z);
                    C86267v vVar2 = sVar.f233189a;
                    vVar2.f233198f = bVar;
                    vVar2.f233196d = true;
                }
                sVar.f233189a.mo79964a();
            }
        }
    }
}
