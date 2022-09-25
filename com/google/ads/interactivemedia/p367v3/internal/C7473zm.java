package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zm */
/* compiled from: PG */
final class C7473zm implements Runnable, act {

    /* renamed from: a */
    final /* synthetic */ C7474zn f24563a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Uri f24564b;

    /* renamed from: c */
    private final ada f24565c = new ada("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: d */
    private final add f24566d;

    /* renamed from: e */
    private C7480zt f24567e;

    /* renamed from: f */
    private long f24568f;

    /* renamed from: g */
    private long f24569g;

    /* renamed from: h */
    private long f24570h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f24571i;

    /* renamed from: j */
    private boolean f24572j;

    /* renamed from: k */
    private IOException f24573k;

    public C7473zm(C7474zn znVar, Uri uri) {
        this.f24563a = znVar;
        this.f24564b = uri;
        this.f24566d = new add(znVar.f24589p.mo16804a(), uri, 4, znVar.f24579f);
    }

    /* renamed from: i */
    private final void m22659i() {
        this.f24565c.mo14471e(this.f24566d, this, this.f24563a.f24590q.mo14451a(this.f24566d.f20345c));
        this.f24563a.f24580g.mo16555d(new C7313to(this.f24566d.f20344b), this.f24566d.f20345c);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m22660j(C7480zt ztVar, C7313to toVar) {
        long j;
        C7480zt ztVar2 = this.f24567e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f24568f = elapsedRealtime;
        C7480zt q = C7474zn.m22675q(this.f24563a, ztVar2, ztVar);
        this.f24567e = q;
        if (q != ztVar2) {
            this.f24573k = null;
            this.f24569g = elapsedRealtime;
            C7474zn.m22676r(this.f24563a, this.f24564b, q);
        } else if (!q.f24631j) {
            long j2 = ztVar.f24627f;
            int size = ztVar.f24634m.size();
            C7480zt ztVar3 = this.f24567e;
            if (j2 + ((long) size) < ztVar3.f24627f) {
                this.f24573k = new aaa();
                C7474zn.m22674p(this.f24563a, this.f24564b, -9223372036854775807L);
            } else {
                double a = (double) C6821bi.m19754a(ztVar3.f24629h);
                Double.isNaN(a);
                if (((double) (elapsedRealtime - this.f24569g)) > a * 3.5d) {
                    this.f24573k = new aab();
                    long b = acj.m18242b(new acr(this.f24573k, 1));
                    C7474zn.m22674p(this.f24563a, this.f24564b, b);
                    if (b != -9223372036854775807L) {
                        m22661k(b);
                    }
                }
            }
        }
        C7480zt ztVar4 = this.f24567e;
        if (ztVar4 != ztVar2) {
            j = ztVar4.f24629h;
        } else {
            j = ztVar4.f24629h / 2;
        }
        this.f24570h = elapsedRealtime + C6821bi.m19754a(j);
        if (this.f24564b.equals(this.f24563a.f24585l) && !this.f24567e.f24631j) {
            mo16885d();
        }
    }

    /* renamed from: k */
    private final boolean m22661k(long j) {
        this.f24571i = SystemClock.elapsedRealtime() + j;
        return this.f24564b.equals(this.f24563a.f24585l) && !C7474zn.m22679u(this.f24563a);
    }

    /* renamed from: a */
    public final C7480zt mo16882a() {
        return this.f24567e;
    }

    /* renamed from: b */
    public final boolean mo16883b() {
        int i;
        if (this.f24567e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000, C6821bi.m19754a(this.f24567e.f24635n));
        C7480zt ztVar = this.f24567e;
        if (ztVar.f24631j || (i = ztVar.f24622a) == 2 || i == 1 || this.f24568f + max > elapsedRealtime) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo16884c() {
        this.f24565c.mo14474h();
    }

    /* renamed from: d */
    public final void mo16885d() {
        this.f24571i = 0;
        if (!this.f24572j && !this.f24565c.mo14472f() && !this.f24565c.mo14469c()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < this.f24570h) {
                this.f24572j = true;
                this.f24563a.f24582i.postDelayed(this, this.f24570h - elapsedRealtime);
                return;
            }
            m22659i();
        }
    }

    /* renamed from: e */
    public final void mo16886e() {
        this.f24565c.mo14468a();
        IOException iOException = this.f24573k;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void run() {
        this.f24572j = false;
        m22659i();
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ acu mo14455v(acw acw, long j, long j2, IOException iOException, int i) {
        acu acu;
        add add = (add) acw;
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        C7313to toVar = new C7313to();
        int i2 = add.f20345c;
        acr acr = new acr(iOException, i);
        long b = acj.m18242b(acr);
        boolean z = C7474zn.m22674p(this.f24563a, this.f24564b, b) || b == -9223372036854775807L;
        if (b != -9223372036854775807L) {
            z |= m22661k(b);
        }
        if (z) {
            long c = acj.m18243c(acr);
            acu = c != -9223372036854775807L ? ada.m18269b(false, c) : ada.f20339b;
        } else {
            acu = ada.f20338a;
        }
        boolean z2 = !acu.mo14458a();
        this.f24563a.f24580g.mo16564m(toVar, add.f20345c, iOException, z2);
        if (z2) {
            long j4 = add.f20343a;
        }
        return acu;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo14456w(acw acw, long j, long j2, boolean z) {
        add add = (add) acw;
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        C7313to toVar = new C7313to();
        long j4 = add.f20343a;
        this.f24563a.f24580g.mo16561j(toVar, 4);
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo14457x(acw acw, long j, long j2) {
        add add = (add) acw;
        C7481zu zuVar = (C7481zu) add.mo14478a();
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        C7313to toVar = new C7313to();
        if (zuVar instanceof C7480zt) {
            m22660j((C7480zt) zuVar, toVar);
            this.f24563a.f24580g.mo16558g(toVar, 4);
        } else {
            this.f24573k = new C6886dt("Loaded playlist has unexpected type.");
            this.f24563a.f24580g.mo16564m(toVar, 4, this.f24573k, true);
        }
        long j4 = add.f20343a;
    }
}
