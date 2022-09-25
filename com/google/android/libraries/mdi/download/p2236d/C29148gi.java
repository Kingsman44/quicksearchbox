package com.google.android.libraries.mdi.download.p2236d;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29315da;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29098l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.gi */
/* compiled from: PG */
public final class C29148gi implements C29118ff {

    /* renamed from: a */
    public final C29235jo f79038a;

    /* renamed from: b */
    public final Executor f79039b;

    /* renamed from: c */
    private final C29037d f79040c;

    /* renamed from: d */
    private final C29296lv f79041d;

    /* renamed from: e */
    private final C29235jo f79042e;

    /* renamed from: f */
    private final C29237jq f79043f;

    /* renamed from: g */
    private final Uri f79044g;

    /* renamed from: h */
    private final Uri f79045h;

    /* renamed from: i */
    private final C42813k f79046i;

    /* renamed from: j */
    private final C28787cb f79047j;

    public C29148gi(C29037d dVar, C29296lv lvVar, C29235jo joVar, C29235jo joVar2, Uri uri, Uri uri2, C29237jq jqVar, C42813k kVar, Executor executor, C28787cb cbVar) {
        this.f79040c = dVar;
        this.f79041d = lvVar;
        this.f79042e = joVar2;
        this.f79038a = joVar;
        this.f79044g = uri;
        this.f79045h = uri2;
        this.f79043f = jqVar;
        this.f79046i = kVar;
        this.f79039b = executor;
        this.f79047j = cbVar;
    }

    /* renamed from: q */
    private static C60870cx m54089q() {
        return C60856cj.m92899h(new IllegalStateException("Migration flag had unexpected state"));
    }

    /* renamed from: r */
    private final void m54090r(Uri uri) {
        if (this.f79046i.mo45894h(uri)) {
            this.f79046i.mo45892f(uri);
        }
    }

    /* renamed from: a */
    public final C60870cx mo34596a(C29334dr drVar) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34596a(drVar);
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34596a(drVar));
            C29125fm fmVar = new C29125fm(this, drVar);
            return C60922j.m93045h(n, C47810es.m84966f(fmVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34596a(drVar);
        }
    }

    /* renamed from: b */
    public final C60870cx mo34597b() {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34597b();
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34597b());
            C29120fh fhVar = new C29120fh(this);
            return C60922j.m93045h(n, C47810es.m84966f(fhVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34597b();
        }
    }

    /* renamed from: c */
    public final C60870cx mo34598c() {
        C29119fg fgVar = C29119fg.f78986a;
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34598c();
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34598c());
            C29130fr frVar = new C29130fr(this, fgVar);
            return C60922j.m93045h(n, C47810es.m84966f(frVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34598c();
        }
    }

    /* renamed from: d */
    public final C60870cx mo34599d() {
        C29141gb gbVar = C29141gb.f79024a;
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34599d();
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34599d());
            C29142gc gcVar = new C29142gc(this, gbVar);
            return C60922j.m93045h(n, C47810es.m84966f(gcVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34599d();
        }
    }

    /* renamed from: e */
    public final C60870cx mo34600e() {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34600e();
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34600e());
            C29126fn fnVar = new C29126fn(this);
            return C60922j.m93045h(n, C47810es.m84966f(fnVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34600e();
        }
    }

    /* renamed from: f */
    public final C60870cx mo34601f() {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            try {
                m54090r(this.f79044g);
                m54090r(this.f79045h);
                return C60866ct.f164955a;
            } catch (IOException e) {
                return C60856cj.m92899h(e);
            } catch (Throwable th) {
                m54090r(this.f79045h);
                throw th;
            }
        } else if (ordinal == 2) {
            try {
                m54090r(this.f79045h);
                return C60866ct.f164955a;
            } catch (IOException e2) {
                return C60856cj.m92899h(e2);
            }
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            try {
                m54090r(this.f79044g);
                return C60866ct.f164955a;
            } catch (IOException e3) {
                return C60856cj.m92899h(e3);
            }
        }
    }

    /* renamed from: g */
    public final C60870cx mo34602g(C29392ep epVar) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34602g(epVar);
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34602g(epVar));
            C29143gd gdVar = new C29143gd(this, epVar);
            return C60922j.m93045h(n, C47810es.m84966f(gdVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34602g(epVar);
        }
    }

    /* renamed from: h */
    public final C60870cx mo34603h(C29392ep epVar) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34603h(epVar);
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34603h(epVar));
            C29134fv fvVar = new C29134fv(this, epVar);
            return C60922j.m93045h(n, C47810es.m84966f(fvVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34603h(epVar);
        }
    }

    /* renamed from: i */
    public final C60870cx mo34604i(C29392ep epVar) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34604i(epVar);
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34604i(epVar));
            C29137fy fyVar = new C29137fy(this, epVar);
            return C60922j.m93045h(n, C47810es.m84966f(fyVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34604i(epVar);
        }
    }

    /* renamed from: j */
    public final C60870cx mo34605j(List list) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34605j(list);
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34605j(list));
            C29138fz fzVar = new C29138fz(this, list);
            return C60922j.m93045h(n, C47810es.m84966f(fzVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34605j(list);
        }
    }

    /* renamed from: k */
    public final C60870cx mo34606k() {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34606k();
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34606k());
            C29127fo foVar = new C29127fo(this);
            return C60922j.m93045h(n, C47810es.m84966f(foVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34606k();
        }
    }

    /* renamed from: l */
    public final C60870cx mo34607l(C29392ep epVar, C29334dr drVar) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34607l(epVar, drVar);
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34607l(epVar, drVar));
            C29121fi fiVar = new C29121fi(this, epVar, drVar);
            return C60922j.m93045h(n, C47810es.m84966f(fiVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34607l(epVar, drVar);
        }
    }

    /* renamed from: m */
    public final C60870cx mo34608m(List list) {
        C29315da daVar = C29315da.UNDEFINED;
        int ordinal = this.f79043f.mo34633a().ordinal();
        if (ordinal == 1) {
            return this.f79041d.mo34608m(list);
        }
        if (ordinal == 2) {
            C60870cx n = mo34611n(this.f79041d.mo34608m(list));
            C29144ge geVar = new C29144ge(this, list);
            return C60922j.m93045h(n, C47810es.m84966f(geVar), this.f79039b);
        } else if (ordinal != 3) {
            return m54089q();
        } else {
            return this.f79042e.mo34608m(list);
        }
    }

    /* renamed from: n */
    public final C60870cx mo34611n(C60870cx cxVar) {
        C29128fp fpVar = C29128fp.f79001a;
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(fpVar), this.f79039b);
        C29129fq fqVar = C29129fq.f79002a;
        return C60846c.m92878g(g, Exception.class, C47810es.m84963c(fqVar), this.f79039b);
    }

    /* renamed from: o */
    public final C60870cx mo34612o(C29098l lVar, C29098l lVar2, int i) {
        int m = this.f79047j.mo34433m();
        if (C29045l.m53929a((long) m)) {
            if (lVar.equals(lVar2)) {
                this.f79040c.mo34542g(1107, m);
            } else {
                this.f79040c.mo34542g(i, m);
            }
        }
        if (lVar.f78953a) {
            return C60856cj.m92900i(lVar.mo34569c());
        }
        return C60856cj.m92899h((Throwable) lVar.mo34570d());
    }

    /* renamed from: p */
    public final C60870cx mo34613p(C29098l lVar, C29098l lVar2, Comparator comparator, int i) {
        int m = this.f79047j.mo34433m();
        if (C29045l.m53929a((long) m)) {
            if (C29098l.m54001g(lVar, lVar2, comparator)) {
                this.f79040c.mo34542g(1106, m);
            } else {
                this.f79040c.mo34542g(i, m);
            }
        }
        if (lVar.f78953a) {
            List list = (List) lVar.mo34569c();
            list.getClass();
            return C60856cj.m92900i(list);
        }
        Object d = lVar.mo34570d();
        d.getClass();
        return C60856cj.m92899h((Throwable) d);
    }
}
