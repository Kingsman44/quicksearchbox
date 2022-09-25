package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.app.Activity;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.l */
/* compiled from: PG */
public abstract class C31389l {
    /* renamed from: d */
    public static C31389l m58509d(Activity activity) {
        return new C31381d(new C31164au(activity.getClass().getName()), true);
    }

    /* renamed from: e */
    public static C31389l m58510e(C31164au auVar) {
        return new C31381d(auVar, false);
    }

    /* renamed from: a */
    public abstract C31164au mo37080a();

    /* renamed from: b */
    public abstract String mo37081b();

    /* renamed from: c */
    public abstract boolean mo37082c();

    public final boolean equals(Object obj) {
        if (!(obj instanceof C31389l)) {
            return false;
        }
        C31389l lVar = (C31389l) obj;
        if (!mo37093f().equals(lVar.mo37093f()) || mo37082c() != lVar.mo37082c()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo37093f() {
        C31164au a = mo37080a();
        if (a != null) {
            return a.f84029a;
        }
        String b = mo37081b();
        C58893dc.m90996a(b);
        return b;
    }

    public final int hashCode() {
        return (mo37093f().hashCode() * 31) ^ (true != mo37082c() ? 1237 : 1231);
    }
}
