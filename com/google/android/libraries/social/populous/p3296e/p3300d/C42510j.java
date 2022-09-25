package com.google.android.libraries.social.populous.p3296e.p3300d;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.C42261an;
import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42301c;
import com.google.android.libraries.social.populous.core.C42351l;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42550o;
import com.google.android.libraries.social.populous.p3296e.C42554s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57877c;
import java.util.concurrent.TimeUnit;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69308p;

/* renamed from: com.google.android.libraries.social.populous.e.d.j */
/* compiled from: PG */
public final class C42510j implements C42554s {

    /* renamed from: a */
    public final ClientConfigInternal f111474a;

    /* renamed from: b */
    public final C42352m f111475b;

    /* renamed from: c */
    public final ClientVersion f111476c;

    /* renamed from: d */
    public final C42591z f111477d;

    /* renamed from: e */
    public final C58872ci f111478e;

    /* renamed from: f */
    public final C58833ax f111479f;

    /* renamed from: g */
    public final C42211b f111480g;

    /* renamed from: h */
    private final C60887da f111481h;

    /* renamed from: i */
    private final Object f111482i = new Object();

    /* renamed from: j */
    private final Object f111483j = new Object();

    /* renamed from: k */
    private C60870cx f111484k = null;

    /* renamed from: l */
    private C60870cx f111485l = null;

    public C42510j(C60887da daVar, ClientConfigInternal clientConfigInternal, C42211b bVar, C42352m mVar, ClientVersion clientVersion, C42591z zVar, C58833ax axVar) {
        this.f111481h = daVar;
        this.f111474a = clientConfigInternal;
        this.f111480g = bVar;
        this.f111475b = mVar;
        this.f111476c = clientVersion;
        this.f111477d = zVar;
        this.f111479f = axVar;
        C58872ci b = zVar.mo45632b();
        b.mo56160e();
        this.f111478e = b;
    }

    /* renamed from: e */
    public static C57877c m74940e(ClientConfigInternal clientConfigInternal) {
        return (C57877c) clientConfigInternal.f110723i.mo56109e(clientConfigInternal.f110722h);
    }

    /* renamed from: a */
    public final C60870cx mo45370a(C42549n nVar) {
        if (!nVar.f111609f.f110738x || nVar.f111605b.isEmpty() || (C69308p.m100584c() && this.f111475b.f111091c != C42351l.SUCCESS_LOGGED_IN)) {
            C42550o oVar = new C42550o();
            oVar.f111623b = C58485gu.m89842j(C58485gu.m89845m());
            oVar.f111626e = 18;
            oVar.f111627f = 2;
            C42261an d = AutocompletionCallbackMetadata.m74298d();
            C42301c cVar = (C42301c) d;
            cVar.f110930a = 5;
            cVar.f110932c = 2;
            cVar.f110931b = 3;
            oVar.f111625d = d.mo45216a();
            return C60856cj.m92900i(oVar.mo45556a());
        }
        C58872ci b = this.f111477d.mo45632b();
        C60870cx n = C60856cj.m92905n(new C42501a(this, nVar), this.f111481h);
        C60856cj.m92911t(n, new C42507g(this, nVar, this.f111477d.mo45632b()), C60826bg.f164896a);
        synchronized (this.f111482i) {
            C60870cx cxVar = this.f111484k;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            this.f111484k = n;
        }
        C60870cx h = C60922j.m93045h(n, new C42502b(this), this.f111481h);
        C60856cj.m92911t(h, new C42509i(this, b, nVar, h), C60826bg.f164896a);
        return h;
    }

    /* renamed from: b */
    public final C60870cx mo45371b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo45372c(C42266as asVar) {
        C60870cx cxVar;
        if (((ClientConfigInternal) asVar).f110730p) {
            if (!this.f111474a.f110738x || (C69308p.m100584c() && this.f111475b.f111091c != C42351l.SUCCESS_LOGGED_IN)) {
                cxVar = C60866ct.f164955a;
            } else {
                synchronized (this.f111483j) {
                    C58872ci ciVar = this.f111478e;
                    if (!ciVar.f156708a || ciVar.mo56158a(TimeUnit.MILLISECONDS) >= C69308p.f185454a.mo6453a().mo60992c()) {
                        C60870cx cxVar2 = this.f111485l;
                        if (cxVar2 == null || cxVar2.isDone()) {
                            C60870cx n = C60856cj.m92905n(new C42503c(this), this.f111481h);
                            C60856cj.m92911t(n, new C42508h(this, this.f111477d.mo45632b()), C60826bg.f164896a);
                            this.f111485l = C60922j.m93044g(n, new C42504d(this), C60826bg.f164896a);
                        }
                        cxVar = this.f111485l;
                    } else {
                        cxVar = C60866ct.f164955a;
                    }
                }
            }
            C60856cj.m92911t(cxVar, new C42506f(this), C60826bg.f164896a);
        }
    }

    /* renamed from: d */
    public final int mo45373d() {
        return 2;
    }
}
