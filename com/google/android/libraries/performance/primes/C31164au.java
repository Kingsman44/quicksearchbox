package com.google.android.libraries.performance.primes;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58827ar;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58597ky;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.performance.primes.au */
/* compiled from: PG */
public final class C31164au {

    /* renamed from: a */
    public final String f84029a;

    public C31164au(String str) {
        this.f84029a = str;
    }

    /* renamed from: a */
    public static C31164au m58091a(C31164au auVar, C31164au... auVarArr) {
        return new C31164au(String.valueOf(auVar.f84029a).concat(new C58827ar(BuildConfig.FLAVOR).mo56097d(C58597ky.m90217h(Arrays.asList(auVarArr), C31163at.f84028a))));
    }

    /* renamed from: b */
    public static C31164au m58092b(String str) {
        str.getClass();
        return new C31164au(str);
    }

    /* renamed from: c */
    public static C31164au m58093c(String str, Enum enumR) {
        if (!C58837ba.m90859h(str)) {
            return new C31164au(String.valueOf(str).concat(String.valueOf(enumR.name())));
        }
        return new C31164au(enumR.name());
    }

    /* renamed from: d */
    public static String m58094d(C31164au auVar) {
        if (auVar == null) {
            return null;
        }
        return auVar.f84029a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C31164au) {
            return this.f84029a.equals(((C31164au) obj).f84029a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f84029a.hashCode();
    }

    public final String toString() {
        return this.f84029a;
    }
}
