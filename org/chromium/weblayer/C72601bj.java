package org.chromium.weblayer;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72327aw;
import p3186j$.util.Objects;

/* renamed from: org.chromium.weblayer.bj */
/* compiled from: PG */
public final class C72601bj {

    /* renamed from: a */
    public static final Map f193143a = new HashMap();

    /* renamed from: b */
    public Throwable f193144b;

    /* renamed from: c */
    public final C72566ab f193145c;

    /* renamed from: d */
    public final C72571ag f193146d;

    /* renamed from: e */
    public final C72581aq f193147e;

    /* renamed from: f */
    public C72615d f193148f;

    /* renamed from: g */
    public C72597bf f193149g;

    /* renamed from: h */
    public C72579ao f193150h;

    /* renamed from: i */
    public final C72581aq f193151i;

    /* renamed from: j */
    public final int f193152j;

    /* renamed from: k */
    public C72327aw f193153k;

    /* renamed from: l */
    private final C72578an f193154l;

    protected C72601bj() {
        this.f193153k = null;
        this.f193154l = null;
        this.f193145c = null;
        this.f193146d = null;
        this.f193147e = null;
        this.f193151i = null;
        this.f193152j = 0;
    }

    /* renamed from: b */
    public static Set m107380b(C72615d dVar) {
        HashSet hashSet = new HashSet();
        for (C72601bj bjVar : f193143a.values()) {
            if (bjVar.mo64473c() == dVar) {
                hashSet.add(bjVar);
            }
        }
        return hashSet;
    }

    /* renamed from: e */
    static C72601bj m107381e(int i) {
        return (C72601bj) f193143a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final String mo64472a() {
        C72604bm.m107399a();
        mo64476g();
        try {
            return this.f193153k.mo63735f();
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: c */
    public final C72615d mo64473c() {
        C72604bm.m107399a();
        mo64476g();
        return this.f193148f;
    }

    /* renamed from: d */
    public final C72578an mo64474d() {
        C72604bm.m107399a();
        mo64476g();
        return this.f193154l;
    }

    /* renamed from: f */
    public final void mo64475f(C72602bk bkVar) {
        C72604bm.m107399a();
        mo64476g();
        this.f193147e.mo64455c(bkVar);
    }

    /* renamed from: g */
    public final void mo64476g() {
        if (this.f193153k == null) {
            throw new IllegalStateException("Tab can not be used once destroyed", this.f193144b);
        }
    }

    /* renamed from: h */
    public final boolean mo64477h() {
        C72604bm.m107399a();
        mo64476g();
        try {
            return this.f193153k.mo63747r();
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: i */
    public final boolean mo64478i() {
        C72604bm.m107399a();
        return this.f193153k == null;
    }

    public C72601bj(C72327aw awVar, C72615d dVar) {
        this.f193153k = awVar;
        this.f193148f = dVar;
        try {
            int e = awVar.mo63734e();
            this.f193152j = e;
            this.f193153k.mo63738i(new C72599bh(this));
            this.f193147e = new C72581aq();
            this.f193151i = new C72581aq();
            C72327aw awVar2 = this.f193153k;
            C72578an anVar = new C72578an();
            try {
                Objects.requireNonNull(anVar);
                anVar.f193107b = awVar2.mo63753x(new C72577am(anVar));
                this.f193154l = anVar;
                C72327aw awVar3 = this.f193153k;
                this.f193145c = new C72566ab(awVar3);
                this.f193146d = new C72571ag(awVar3);
                f193143a.put(Integer.valueOf(e), this);
            } catch (RemoteException e2) {
                throw new C72304a(e2);
            }
        } catch (RemoteException e3) {
            throw new C72304a(e3);
        }
    }
}
