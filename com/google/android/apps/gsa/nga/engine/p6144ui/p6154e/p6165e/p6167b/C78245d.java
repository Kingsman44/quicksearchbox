package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.e.b.d */
/* compiled from: PG */
public abstract class C78245d {

    /* renamed from: a */
    public static final C58528ij f215382a = C58528ij.m90011K(e.bv, e.br);

    static {
        C58528ij.m90015O(e.bm, e.bn, e.bo, e.bp, e.bq, e.bs, e.bt, e.br);
    }

    /* renamed from: c */
    public static C78244c m125621c() {
        return new C78249h();
    }

    /* renamed from: a */
    public abstract C78243b mo73179a();

    /* renamed from: b */
    public abstract C78243b mo73180b();

    /* renamed from: d */
    public final boolean mo73181d() {
        return mo73180b().mo73169a().equals(e.f);
    }

    /* renamed from: e */
    public final boolean mo73182e() {
        int h = mo73180b().mo73175h();
        boolean z = true;
        if (h != 1) {
            z = false;
        }
        if (h != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: f */
    public final boolean mo73183f() {
        int h = mo73180b().mo73175h();
        if (h == 0) {
            throw null;
        } else if (h != 1) {
            return false;
        } else {
            int f = mo73180b().mo73173f();
            if (f == 0) {
                throw null;
            } else if (f == 8) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo73184g() {
        int h = mo73180b().mo73175h();
        boolean z = h == 2;
        if (h != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: h */
    public final boolean mo73185h() {
        int g = mo73180b().mo73174g();
        boolean z = true;
        if (g != 1) {
            z = false;
        }
        if (g != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: i */
    public final boolean mo73186i() {
        int h = mo73180b().mo73175h();
        if (h == 0) {
            throw null;
        } else if (h != 3) {
            return false;
        } else {
            int f = mo73180b().mo73173f();
            if (f != 0) {
                return f == 4;
            }
            throw null;
        }
    }

    /* renamed from: j */
    public final boolean mo73187j() {
        int h = mo73180b().mo73175h();
        if (h == 0) {
            throw null;
        } else if (h != 3) {
            return false;
        } else {
            int f = mo73180b().mo73173f();
            if (f != 0) {
                return f == 3;
            }
            throw null;
        }
    }

    /* renamed from: k */
    public final boolean mo73188k() {
        int h = mo73180b().mo73175h();
        if (h == 0) {
            throw null;
        } else if (h != 3) {
            return false;
        } else {
            int f = mo73180b().mo73173f();
            if (f != 0) {
                return f == 9;
            }
            throw null;
        }
    }

    /* renamed from: l */
    public final boolean mo73189l() {
        int f = mo73180b().mo73173f();
        boolean z = f == 6;
        if (f != 0) {
            return z;
        }
        throw null;
    }

    public final String toString() {
        return String.format("previousState: %s\nstate: %s", new Object[]{mo73179a(), mo73180b()});
    }
}
