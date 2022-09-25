package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29315da;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29098l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.hd */
/* compiled from: PG */
public final class C29170hd implements C29293ls {

    /* renamed from: a */
    public final C29037d f79094a;

    /* renamed from: b */
    public final C29298lx f79095b;

    /* renamed from: c */
    public final C29259kl f79096c;

    /* renamed from: d */
    public final Executor f79097d;

    /* renamed from: e */
    public final C28787cb f79098e;

    /* renamed from: f */
    private final C29259kl f79099f;

    /* renamed from: g */
    private final Uri f79100g;

    /* renamed from: h */
    private final Uri f79101h;

    /* renamed from: i */
    private final C29237jq f79102i;

    /* renamed from: j */
    private final C42813k f79103j;

    public C29170hd(C29037d dVar, C29298lx lxVar, C29259kl klVar, C29259kl klVar2, Uri uri, Uri uri2, C29237jq jqVar, C42813k kVar, Executor executor, C28787cb cbVar) {
        this.f79094a = dVar;
        this.f79095b = lxVar;
        this.f79096c = klVar;
        this.f79099f = klVar2;
        this.f79100g = uri;
        this.f79101h = uri2;
        this.f79102i = jqVar;
        this.f79103j = kVar;
        this.f79097d = executor;
        this.f79098e = cbVar;
    }

    /* renamed from: i */
    private static C60870cx m54114i() {
        return C60856cj.m92899h(new IllegalStateException("Migration flag had unexpected state"));
    }

    /* renamed from: j */
    private final void m54115j(Uri uri) {
        if (this.f79103j.mo45894h(uri)) {
            this.f79103j.mo45892f(uri);
        }
    }

    /* renamed from: a */
    public final C60870cx mo34616a() {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79102i.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79095b.mo34616a();
        }
        if (ordinal == 2) {
            C60870cx b = mo34617b(this.f79095b.mo34616a());
            C29152gm gmVar = new C29152gm(this);
            return C60922j.m93045h(b, C47810es.m84966f(gmVar), this.f79097d);
        } else if (ordinal != 3) {
            return m54114i();
        } else {
            return this.f79099f.mo34616a();
        }
    }

    /* renamed from: b */
    public final C60870cx mo34617b(C60870cx cxVar) {
        C29160gu guVar = C29160gu.f79076a;
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(guVar), this.f79097d);
        C29161gv gvVar = C29161gv.f79077a;
        return C60846c.m92878g(g, Exception.class, C47810es.m84963c(gvVar), this.f79097d);
    }

    /* renamed from: c */
    public final C60870cx mo34618c() {
        C29167ha haVar = C29167ha.f79088a;
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79102i.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79095b.mo34618c();
        }
        if (ordinal == 2) {
            C60870cx b = mo34617b(this.f79095b.mo34618c());
            C29168hb hbVar = new C29168hb(this, haVar);
            return C60922j.m93045h(b, C47810es.m84966f(hbVar), this.f79097d);
        } else if (ordinal != 3) {
            return m54114i();
        } else {
            return this.f79099f.mo34618c();
        }
    }

    /* renamed from: d */
    public final C60870cx mo34619d() {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79102i.mo34633a().ordinal();
        if (ordinal == 1) {
            try {
                m54115j(this.f79100g);
                m54115j(this.f79101h);
                return this.f79095b.mo34619d();
            } catch (IOException e) {
                return C60856cj.m92899h(e);
            } catch (Throwable th) {
                m54115j(this.f79101h);
                throw th;
            }
        } else if (ordinal == 2) {
            try {
                m54115j(this.f79101h);
                C60870cx d = this.f79095b.mo34619d();
                C29155gp gpVar = new C29155gp(this);
                return C60922j.m93045h(d, C47810es.m84966f(gpVar), this.f79097d);
            } catch (IOException e2) {
                return C60856cj.m92899h(e2);
            }
        } else if (ordinal != 3) {
            return m54114i();
        } else {
            try {
                m54115j(this.f79100g);
                return this.f79099f.mo34619d();
            } catch (IOException e3) {
                return C60856cj.m92899h(e3);
            }
        }
    }

    /* renamed from: e */
    public final C60870cx mo34620e(C29398ev evVar) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79102i.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79095b.mo34620e(evVar);
        }
        if (ordinal == 2) {
            C60870cx b = mo34617b(this.f79095b.mo34620e(evVar));
            C29153gn gnVar = new C29153gn(this, evVar);
            return C60922j.m93045h(b, C47810es.m84966f(gnVar), this.f79097d);
        } else if (ordinal != 3) {
            return m54114i();
        } else {
            return this.f79099f.mo34620e(evVar);
        }
    }

    /* renamed from: f */
    public final C60870cx mo34621f(C29398ev evVar) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79102i.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79095b.mo34621f(evVar);
        }
        if (ordinal == 2) {
            C60870cx b = mo34617b(this.f79095b.mo34621f(evVar));
            C29162gw gwVar = new C29162gw(this, evVar);
            return C60922j.m93045h(b, C47810es.m84966f(gwVar), this.f79097d);
        } else if (ordinal != 3) {
            return m54114i();
        } else {
            return this.f79099f.mo34621f(evVar);
        }
    }

    /* renamed from: g */
    public final C60870cx mo34622g(C29398ev evVar, C29402ez ezVar) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79102i.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79095b.mo34622g(evVar, ezVar);
        }
        if (ordinal == 2) {
            C60870cx b = mo34617b(this.f79095b.mo34622g(evVar, ezVar));
            C29169hc hcVar = new C29169hc(this, evVar, ezVar);
            return C60922j.m93045h(b, C47810es.m84966f(hcVar), this.f79097d);
        } else if (ordinal != 3) {
            return m54114i();
        } else {
            return this.f79099f.mo34622g(evVar, ezVar);
        }
    }

    /* renamed from: h */
    public final C60870cx mo34623h(C29098l lVar, C29098l lVar2, int i) {
        int m = this.f79098e.mo34433m();
        if (C29045l.m53929a((long) m)) {
            if (lVar.equals(lVar2)) {
                this.f79094a.mo34542g(1106, m);
            } else {
                this.f79094a.mo34542g(i, m);
            }
        }
        if (lVar.f78953a) {
            return C60856cj.m92900i(lVar.mo34569c());
        }
        return C60856cj.m92899h((Throwable) lVar.mo34570d());
    }
}
