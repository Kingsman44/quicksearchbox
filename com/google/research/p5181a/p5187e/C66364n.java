package com.google.research.p5181a.p5187e;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.research.a.e.n */
/* compiled from: PG */
public class C66364n {

    /* renamed from: a */
    private final HashMap f180451a = new HashMap();

    /* renamed from: f */
    public int f180452f = 0;

    /* renamed from: g */
    public final List f180453g = new ArrayList();

    /* renamed from: c */
    public final Integer mo59598c(C66361k kVar) {
        return (Integer) this.f180451a.get(kVar);
    }

    /* renamed from: d */
    public final void mo59599d(C66361k kVar, int i) {
        this.f180453g.add(kVar);
        this.f180451a.put(kVar, Integer.valueOf(i));
    }

    /* renamed from: e */
    public final void mo59600e(C66355e eVar) {
        for (C66361k m : this.f180453g) {
            m.mo59595m(eVar);
        }
    }
}
