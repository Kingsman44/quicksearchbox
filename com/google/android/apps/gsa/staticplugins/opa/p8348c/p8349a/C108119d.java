package com.google.android.apps.gsa.staticplugins.opa.p8348c.p8349a;

import com.google.common.p4522b.C58557jl;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import org.p5633c.p5634a.C72145ac;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.c.a.d */
/* compiled from: PG */
public final class C108119d {
    /* renamed from: a */
    static long m179486a(C58148f fVar, String str) {
        String e = m179490e(fVar, str);
        if (e == null) {
            return 0;
        }
        return C72145ac.m105759b(e).mo63428a().f191964b;
    }

    /* renamed from: b */
    static long m179487b(C58148f fVar, String str) {
        String e = m179490e(fVar, str);
        if (e == null) {
            return -1;
        }
        return C72267x.f192327h.mo63598d(e).mo63386q().f192450a;
    }

    /* renamed from: c */
    static C58146d m179488c(C58148f fVar, String str) {
        return (C58146d) C58557jl.m90144y(fVar.f155457d, new C108118c(str));
    }

    /* renamed from: d */
    static Integer m179489d(C58148f fVar, String str) {
        C58146d c = m179488c(fVar, str);
        if (c == null || c.f155449e.size() <= 0) {
            return null;
        }
        return Integer.valueOf((String) c.f155449e.get(0));
    }

    /* renamed from: e */
    static String m179490e(C58148f fVar, String str) {
        C58146d c = m179488c(fVar, str);
        if (c == null || c.f155449e.size() <= 0) {
            return null;
        }
        return (String) c.f155449e.get(0);
    }
}
