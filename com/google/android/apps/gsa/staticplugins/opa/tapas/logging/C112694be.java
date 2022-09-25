package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.p4553a.C59546dp;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.be */
/* compiled from: PG */
public final class C112694be {

    /* renamed from: a */
    public static final Map f312404a;

    /* renamed from: b */
    public final AtomicReference f312405b = new AtomicReference(Optional.empty());

    /* renamed from: c */
    public final AtomicReference f312406c = new AtomicReference(Optional.empty());

    /* renamed from: d */
    public boolean f312407d;

    /* renamed from: e */
    public final AtomicBoolean f312408e = new AtomicBoolean(true);

    /* renamed from: f */
    public final AtomicBoolean f312409f = new AtomicBoolean(false);

    /* renamed from: g */
    public final AtomicBoolean f312410g = new AtomicBoolean(false);

    /* renamed from: h */
    public final C21370a f312411h;

    /* renamed from: i */
    public long f312412i;

    /* renamed from: j */
    private Optional f312413j = Optional.empty();

    /* renamed from: k */
    private final C22871g f312414k;

    /* renamed from: l */
    private Optional f312415l = Optional.empty();

    /* renamed from: m */
    private final C22870f f312416m = new C112693bd(this);

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(10010, 86039);
        gzVar.mo55429h(20001, 86031);
        gzVar.mo55429h(10041, 86032);
        gzVar.mo55429h(20010, 86034);
        gzVar.mo55429h(15031, 86035);
        gzVar.mo55429h(10030, 86036);
        gzVar.mo55429h(10001, 86038);
        gzVar.mo55429h(20014, 97530);
        gzVar.mo55429h(10070, 97531);
        gzVar.mo55429h(10020, 97532);
        gzVar.mo55429h(20011, 97533);
        gzVar.mo55429h(20013, 97534);
        gzVar.mo55429h(10060, 97535);
        gzVar.mo55429h(10003, 97536);
        gzVar.mo55429h(10005, 97537);
        gzVar.mo55429h(10080, 99070);
        gzVar.mo55429h(10090, 100341);
        gzVar.mo55429h(20003, 102228);
        gzVar.mo55429h(10100, 117910);
        f312404a = gzVar.mo55427f(false);
    }

    public C112694be(C22871g gVar, C21370a aVar) {
        this.f312414k = gVar;
        this.f312411h = aVar;
    }

    /* renamed from: l */
    private final void m186510l(View view) {
        C60321oe i = C28285c.m52882i(view, 5, (Integer) null);
        if (this.f312408e.get() && i != null) {
            C60218r rVar = i.f163229d;
            if (rVar == null) {
                rVar = C60218r.f162925d;
            }
            this.f312413j = Optional.m71637of(rVar);
        } else if (this.f312413j.isPresent() && i != null) {
            C60320od odVar = (C60320od) i.toBuilder();
            C60218r rVar2 = (C60218r) this.f312413j.get();
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            rVar2.getClass();
            oeVar.f163229d = rVar2;
            oeVar.f163226a |= 2;
            i = (C60321oe) odVar.build();
        }
        C89949q.m146521e(i, false);
    }

    /* renamed from: m */
    private final void m186511m() {
        Optional optional = (Optional) this.f312406c.getAndSet(Optional.empty());
        if (optional.isPresent()) {
            if (!this.f312409f.get()) {
                C89949q.m146520d((C60321oe) optional.get(), this.f312412i - this.f312411h.mo26870b());
            }
            this.f312405b.set(Optional.empty());
            this.f312409f.compareAndSet(true, false);
        }
    }

    /* renamed from: a */
    public final Optional mo99650a() {
        return (Optional) this.f312405b.getAndSet(Optional.empty());
    }

    /* renamed from: b */
    public final void mo99651b(View view, int i, Optional optional) {
        C28292j a;
        mo99660k(view, i);
        if (optional.isPresent() && (a = C28295m.m52915a(view)) != null) {
            a.f76974b.mo58885m(C59546dp.f158008e, (C59546dp) optional.get());
        }
    }

    /* renamed from: c */
    public final void mo99652c(View view) {
        m186511m();
        if (C28295m.m52915a(view) != null) {
            m186510l(view);
        }
        this.f312408e.compareAndSet(true, false);
        mo99659j();
    }

    /* renamed from: d */
    public final void mo99653d(View view) {
        C60214n g;
        m186511m();
        C28292j a = C28295m.m52915a(view);
        if (a != null && (g = C28285c.m52880g(a)) != null) {
            this.f312405b.set(Optional.m71637of(C28294l.m52913c(g)));
        }
    }

    /* renamed from: e */
    public final void mo99654e(View view) {
        m186511m();
        if (C28295m.m52915a(view) != null) {
            m186510l(view);
            this.f312408e.compareAndSet(true, false);
        }
        mo99659j();
    }

    /* renamed from: f */
    public final void mo99655f() {
        m186511m();
        if (this.f312415l.isPresent()) {
            ((C60870cx) this.f312415l.get()).cancel(true);
        }
        this.f312407d = false;
        this.f312408e.compareAndSet(false, true);
    }

    /* renamed from: g */
    public final void mo99656g() {
        m186511m();
        if (this.f312415l.isPresent()) {
            ((C60870cx) this.f312415l.get()).cancel(true);
        }
    }

    /* renamed from: h */
    public final void mo99657h(ImageView imageView, int i) {
        if (i == 10019) {
            mo99660k(imageView, 85780);
        }
    }

    /* renamed from: i */
    public final void mo99658i() {
        this.f312408e.compareAndSet(false, true);
    }

    /* renamed from: j */
    public final void mo99659j() {
        if (this.f312415l.isPresent()) {
            ((C60870cx) this.f312415l.get()).cancel(true);
        }
        this.f312415l = Optional.m71637of(this.f312414k.mo28208h("Log the impression on IDLE", 30000, this.f312416m));
    }

    /* renamed from: k */
    public final void mo99660k(View view, int i) {
        if (i != -1) {
            C28292j jVar = new C28292j(i);
            jVar.mo33795i(5);
            C28295m.m52919e(view, jVar);
        }
    }
}
