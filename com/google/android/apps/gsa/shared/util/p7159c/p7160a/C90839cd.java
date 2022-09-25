package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.logger.p7055e.p7056a.p7057a.C89899k;
import com.google.android.apps.gsa.shared.logger.p7055e.p7056a.p7057a.C89900l;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90939e;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.p1877a.C22858l;
import com.google.android.libraries.gsa.p1876k.p1877a.C22859m;
import com.google.android.libraries.gsa.p1876k.p1877a.C22861o;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60871cy;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.cd */
/* compiled from: PG */
public final class C90839cd implements C22871g {

    /* renamed from: a */
    public final C90783ab f254011a;

    /* renamed from: b */
    private final C89900l f254012b;

    public C90839cd(C90783ab abVar, C89900l lVar) {
        this.f254011a = abVar;
        this.f254012b = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo28201a(String str, C22862b bVar) {
        C90939e eVar = new C90939e(bVar.getClass(), (String) null, str);
        C22862b b = this.f254012b.mo83735b(bVar, str);
        Objects.requireNonNull(b);
        C60871cy cyVar = new C60871cy((Callable) new C90836ca(b));
        this.f254011a.mo85115a(eVar, cyVar);
        C90476a aVar = C91018d.f254254a;
        return cyVar;
    }

    /* renamed from: b */
    public final C60870cx mo28202b(String str, C22862b bVar) {
        C60870cx n = C60856cj.m92905n(new C22859m(this.f254012b.mo83734a(bVar, str)), new C90837cb(this, new C90939e(bVar.getClass(), (String) null, str)));
        C90476a aVar = C91018d.f254254a;
        return n;
    }

    /* renamed from: c */
    public final C60870cx mo28203c(String str, long j, C22862b bVar) {
        C60870cx n = C60856cj.m92905n(new C22859m(this.f254012b.mo83734a(bVar, str)), new C90834bz(this, new C90939e(bVar.getClass(), (String) null, str), j));
        C90476a aVar = C91018d.f254254a;
        return n;
    }

    /* renamed from: d */
    public final C60870cx mo28204d(String str, long j, C22862b bVar) {
        C90939e eVar = new C90939e(bVar.getClass(), (String) null, str);
        C22862b b = this.f254012b.mo83735b(bVar, str);
        Objects.requireNonNull(b);
        C60871cy cyVar = new C60871cy((Callable) new C90836ca(b));
        this.f254011a.mo85114b(eVar, cyVar, j);
        C90476a aVar = C91018d.f254254a;
        return cyVar;
    }

    /* renamed from: e */
    public final C60870cx mo28205e(C60870cx cxVar, String str, Class cls, C22864c cVar) {
        C60870cx h = C60846c.m92879h(cxVar, cls, new C90829bu(this.f254012b.mo83736c(cVar, str)), new C90830bv(this, new C90939e(cVar.getClass(), (String) null, str)));
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: f */
    public final C60870cx mo28206f(C60870cx cxVar, String str, Class cls, C22864c cVar) {
        C60870cx h = C60846c.m92879h(cxVar, cls, new C22858l(this.f254012b.mo83736c(cVar, str)), new C90831bw(this, new C90939e(cVar.getClass(), (String) null, str)));
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: g */
    public final C60870cx mo28207g(String str, C22870f fVar) {
        C90939e eVar = new C90939e(fVar.getClass(), (String) null, str);
        C60871cy cyVar = new C60871cy((Callable) new C90826br(this.f254012b.mo83738e(fVar, str)));
        this.f254011a.mo85115a(eVar, cyVar);
        C90476a aVar = C91018d.f254254a;
        return cyVar;
    }

    /* renamed from: h */
    public final C60870cx mo28208h(String str, long j, C22870f fVar) {
        C90939e eVar = new C90939e(fVar.getClass(), (String) null, str);
        C60871cy cyVar = new C60871cy((Callable) new C90838cc(this.f254012b.mo83738e(fVar, str)));
        this.f254011a.mo85114b(eVar, cyVar, j);
        C90476a aVar = C91018d.f254254a;
        return cyVar;
    }

    /* renamed from: i */
    public final C60870cx mo28209i(C60870cx cxVar, String str, C22864c cVar) {
        C60870cx h = C60922j.m93045h(cxVar, new C90827bs(this.f254012b.mo83736c(cVar, str)), new C90828bt(this, new C90939e(cVar.getClass(), (String) null, str)));
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: j */
    public final C60870cx mo28210j(C60870cx cxVar, String str, C22864c cVar) {
        C60870cx h = C60922j.m93045h(cxVar, new C22858l(this.f254012b.mo83736c(cVar, str)), new C90833by(this, new C90939e(cVar.getClass(), (String) null, str)));
        C90476a aVar = C91018d.f254254a;
        return h;
    }

    /* renamed from: k */
    public final void mo28211k(C60870cx cxVar, String str, C22868d dVar) {
        C90939e eVar = new C90939e(dVar.getClass(), (String) null, str);
        C89900l lVar = this.f254012b;
        if (lVar.f246315b.mo83751d(C89900l.f246314a)) {
            dVar = new C89899k(lVar, str, dVar);
        }
        C60856cj.m92911t(cxVar, new C22861o(dVar), new C90832bx(this, eVar));
    }

    /* renamed from: l */
    public final void mo28212l(String str, C22869e eVar) {
        C90939e eVar2 = new C90939e(eVar.getClass(), (String) null, str);
        this.f254011a.mo85115a(eVar2, new C90841cf(this.f254012b.mo83737d(eVar, str), eVar2));
    }

    /* renamed from: m */
    public final void mo28213m(String str, long j, C22869e eVar) {
        C90939e eVar2 = new C90939e(eVar.getClass(), (String) null, str);
        this.f254011a.mo85114b(eVar2, new C90841cf(this.f254012b.mo83737d(eVar, str), eVar2), j);
    }
}
