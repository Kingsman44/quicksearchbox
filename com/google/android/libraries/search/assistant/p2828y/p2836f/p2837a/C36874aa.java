package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import com.google.common.p4522b.C58557jl;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import org.p5633c.p5634a.C72145ac;
import org.p5633c.p5634a.p5639e.C72267x;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.aa */
/* compiled from: PG */
public final class C36874aa {
    /* renamed from: a */
    static long m65567a(C58148f fVar, String str) {
        Optional e = m65571e(fVar, str);
        if (e.isEmpty()) {
            return 0;
        }
        return C72145ac.m105759b((String) e.get()).mo63428a().f191964b;
    }

    /* renamed from: b */
    static long m65568b(C58148f fVar, String str) {
        Optional e = m65571e(fVar, str);
        if (e.isEmpty()) {
            return -1;
        }
        return C72267x.f192327h.mo63598d((String) e.get()).mo63386q().f192450a;
    }

    /* renamed from: c */
    static Optional m65569c(C58148f fVar, String str) {
        Optional d = m65570d(fVar, str);
        if (d.isEmpty() || ((C58146d) d.get()).f155449e.size() <= 0) {
            return Optional.empty();
        }
        return Optional.m71637of(Integer.valueOf((String) ((C58146d) d.get()).f155449e.get(0)));
    }

    /* renamed from: d */
    static Optional m65570d(C58148f fVar, String str) {
        return Optional.ofNullable((C58146d) C58557jl.m90144y(fVar.f155457d, new C36902z(str)));
    }

    /* renamed from: e */
    static Optional m65571e(C58148f fVar, String str) {
        Optional d = m65570d(fVar, str);
        if (d.isEmpty() || ((C58146d) d.get()).f155449e.size() <= 0) {
            return Optional.empty();
        }
        return Optional.m71637of((String) ((C58146d) d.get()).f155449e.get(0));
    }
}
