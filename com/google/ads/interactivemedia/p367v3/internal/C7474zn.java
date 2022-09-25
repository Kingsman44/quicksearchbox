package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zn */
/* compiled from: PG */
public final class C7474zn implements aad, act {

    /* renamed from: a */
    public static final C7485zy f24574a = C7472zl.f24562a;

    /* renamed from: b */
    private final C7484zx f24575b;

    /* renamed from: c */
    private final HashMap f24576c = new HashMap();

    /* renamed from: d */
    private final List f24577d = new ArrayList();

    /* renamed from: e */
    private final double f24578e = 3.5d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public adc f24579f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C7332ug f24580g;

    /* renamed from: h */
    private ada f24581h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f24582i;

    /* renamed from: j */
    private aac f24583j;

    /* renamed from: k */
    private C7478zr f24584k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Uri f24585l;

    /* renamed from: m */
    private C7480zt f24586m;

    /* renamed from: n */
    private boolean f24587n;

    /* renamed from: o */
    private long f24588o = -9223372036854775807L;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C7440yg f24589p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final acj f24590q;

    public C7474zn(C7440yg ygVar, acj acj, C7484zx zxVar) {
        this.f24589p = ygVar;
        this.f24575b = zxVar;
        this.f24590q = acj;
    }

    /* renamed from: A */
    private static C7479zs m22670A(C7480zt ztVar, C7480zt ztVar2) {
        int i = (int) (ztVar2.f24627f - ztVar.f24627f);
        List list = ztVar.f24634m;
        if (i < list.size()) {
            return (C7479zs) list.get(i);
        }
        return null;
    }

    /* renamed from: p */
    static /* synthetic */ boolean m22674p(C7474zn znVar, Uri uri, long j) {
        int size = znVar.f24577d.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !((C7486zz) znVar.f24577d.get(i)).mo16832s(uri, j);
        }
        return z;
    }

    /* renamed from: q */
    static /* synthetic */ C7480zt m22675q(C7474zn znVar, C7480zt ztVar, C7480zt ztVar2) {
        long j;
        int i;
        C7479zs A;
        int size;
        int size2;
        C7474zn znVar2 = znVar;
        C7480zt ztVar3 = ztVar;
        C7480zt ztVar4 = ztVar2;
        if (ztVar3 != null) {
            long j2 = ztVar4.f24627f;
            long j3 = ztVar3.f24627f;
            if (j2 <= j3 && (j2 < j3 || ((size = ztVar4.f24634m.size()) <= (size2 = ztVar3.f24634m.size()) && (size != size2 || !ztVar4.f24631j || ztVar3.f24631j)))) {
                if (!ztVar4.f24631j || ztVar3.f24631j) {
                    return ztVar3;
                }
                return new C7480zt(ztVar3.f24622a, ztVar3.f24637p, ztVar3.f24638q, ztVar3.f24623b, ztVar3.f24624c, ztVar3.f24625d, ztVar3.f24626e, ztVar3.f24627f, ztVar3.f24628g, ztVar3.f24629h, ztVar3.f24630i, ztVar3.f24639r, true, ztVar3.f24632k, ztVar3.f24633l, ztVar3.f24634m, ztVar3.f24636o, (byte[]) null, (byte[]) null, (byte[]) null);
            }
        }
        if (ztVar4.f24632k) {
            j = ztVar4.f24624c;
        } else {
            C7480zt ztVar5 = znVar2.f24586m;
            j = ztVar5 != null ? ztVar5.f24624c : 0;
            if (ztVar3 != null) {
                int size3 = ztVar3.f24634m.size();
                C7479zs A2 = m22670A(ztVar, ztVar2);
                if (A2 != null) {
                    j = ztVar3.f24624c + A2.f24615e;
                } else if (((long) size3) == ztVar4.f24627f - ztVar3.f24627f) {
                    j = ztVar.mo16889b();
                }
            }
        }
        long j4 = j;
        if (ztVar4.f24625d) {
            i = ztVar4.f24626e;
        } else {
            C7480zt ztVar6 = znVar2.f24586m;
            i = ztVar6 != null ? ztVar6.f24626e : 0;
            if (!(ztVar3 == null || (A = m22670A(ztVar, ztVar2)) == null)) {
                i = (ztVar3.f24626e + A.f24614d) - ((C7479zs) ztVar4.f24634m.get(0)).f24614d;
            }
        }
        return new C7480zt(ztVar4.f24622a, ztVar4.f24637p, ztVar4.f24638q, ztVar4.f24623b, j4, true, i, ztVar4.f24627f, ztVar4.f24628g, ztVar4.f24629h, ztVar4.f24630i, ztVar4.f24639r, ztVar4.f24631j, ztVar4.f24632k, ztVar4.f24633l, ztVar4.f24634m, ztVar4.f24636o, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* renamed from: r */
    static /* synthetic */ void m22676r(C7474zn znVar, Uri uri, C7480zt ztVar) {
        if (uri.equals(znVar.f24585l)) {
            if (znVar.f24586m == null) {
                znVar.f24587n = !ztVar.f24631j;
                znVar.f24588o = ztVar.f24624c;
            }
            znVar.f24586m = ztVar;
            znVar.f24583j.mo14303y(ztVar);
        }
        int size = znVar.f24577d.size();
        for (int i = 0; i < size; i++) {
            ((C7486zz) znVar.f24577d.get(i)).mo16831r();
        }
    }

    /* renamed from: s */
    static /* synthetic */ double m22677s(C7474zn znVar) {
        return 3.5d;
    }

    /* renamed from: u */
    static /* synthetic */ boolean m22679u(C7474zn znVar) {
        List list = znVar.f24584k.f24604c;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C7473zm zmVar = (C7473zm) znVar.f24576c.get(((C7477zq) list.get(i)).f24596a);
            if (elapsedRealtime > zmVar.f24571i) {
                znVar.f24585l = zmVar.f24564b;
                zmVar.mo16885d();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo14304a(Uri uri, C7332ug ugVar, aac aac) {
        this.f24582i = aeu.m18541k();
        this.f24580g = ugVar;
        this.f24583j = aac;
        add add = new add(this.f24589p.mo16804a(), uri, 4, this.f24575b.mo16880a());
        ary.m19464q(this.f24581h == null);
        ada ada = new ada("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f24581h = ada;
        ada.mo14471e(add, this, this.f24590q.mo14451a(add.f20345c));
        ugVar.mo16555d(new C7313to(add.f20344b), add.f20345c);
    }

    /* renamed from: b */
    public final void mo14305b() {
        this.f24585l = null;
        this.f24586m = null;
        this.f24584k = null;
        this.f24588o = -9223372036854775807L;
        this.f24581h.mo14474h();
        this.f24581h = null;
        for (C7473zm c : this.f24576c.values()) {
            c.mo16884c();
        }
        this.f24582i.removeCallbacksAndMessages((Object) null);
        this.f24582i = null;
        this.f24576c.clear();
    }

    /* renamed from: c */
    public final void mo14306c(C7486zz zzVar) {
        this.f24577d.add(zzVar);
    }

    /* renamed from: d */
    public final void mo14307d(C7486zz zzVar) {
        this.f24577d.remove(zzVar);
    }

    /* renamed from: e */
    public final C7478zr mo14308e() {
        return this.f24584k;
    }

    /* renamed from: f */
    public final C7480zt mo14309f(Uri uri, boolean z) {
        C7480zt a = ((C7473zm) this.f24576c.get(uri)).mo16882a();
        if (a != null && z && !uri.equals(this.f24585l)) {
            List list = this.f24584k.f24604c;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(((C7477zq) list.get(i)).f24596a)) {
                    C7480zt ztVar = this.f24586m;
                    if (ztVar == null || !ztVar.f24631j) {
                        this.f24585l = uri;
                        ((C7473zm) this.f24576c.get(uri)).mo16885d();
                    }
                } else {
                    i++;
                }
            }
        }
        return a;
    }

    /* renamed from: g */
    public final long mo14310g() {
        return this.f24588o;
    }

    /* renamed from: h */
    public final boolean mo14311h(Uri uri) {
        return ((C7473zm) this.f24576c.get(uri)).mo16883b();
    }

    /* renamed from: i */
    public final void mo14312i() {
        ada ada = this.f24581h;
        if (ada != null) {
            ada.mo14468a();
        }
        Uri uri = this.f24585l;
        if (uri != null) {
            mo14313j(uri);
        }
    }

    /* renamed from: j */
    public final void mo14313j(Uri uri) {
        ((C7473zm) this.f24576c.get(uri)).mo16886e();
    }

    /* renamed from: k */
    public final void mo14314k(Uri uri) {
        ((C7473zm) this.f24576c.get(uri)).mo16885d();
    }

    /* renamed from: l */
    public final boolean mo14315l() {
        return this.f24587n;
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ acu mo14455v(acw acw, long j, long j2, IOException iOException, int i) {
        add add = (add) acw;
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        C7313to toVar = new C7313to();
        int i2 = add.f20345c;
        long c = acj.m18243c(new acr(iOException, i));
        boolean z = c == -9223372036854775807L;
        this.f24580g.mo16564m(toVar, add.f20345c, iOException, z);
        if (!z) {
            return ada.m18269b(false, c);
        }
        long j4 = add.f20343a;
        return ada.f20339b;
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
        this.f24580g.mo16561j(toVar, 4);
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ void mo14457x(acw acw, long j, long j2) {
        add add = (add) acw;
        C7481zu zuVar = (C7481zu) add.mo14478a();
        boolean z = zuVar instanceof C7480zt;
        C7478zr b = z ? C7478zr.m22699b(zuVar.f24637p) : (C7478zr) zuVar;
        this.f24584k = b;
        this.f24579f = this.f24575b.mo16881b(b);
        this.f24585l = ((C7477zq) b.f24604c.get(0)).f24596a;
        List list = b.f24603b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list.get(i);
            this.f24576c.put(uri, new C7473zm(this, uri));
        }
        C7473zm zmVar = (C7473zm) this.f24576c.get(this.f24585l);
        long j3 = add.f20343a;
        acb acb = add.f20344b;
        add.mo14480e();
        add.mo14481f();
        add.mo14479d();
        C7313to toVar = new C7313to();
        if (z) {
            zmVar.m22660j((C7480zt) zuVar, toVar);
        } else {
            zmVar.mo16885d();
        }
        long j4 = add.f20343a;
        this.f24580g.mo16558g(toVar, 4);
    }
}
