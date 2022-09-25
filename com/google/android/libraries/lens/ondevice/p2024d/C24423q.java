package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.lens.p4701g.C62331d;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.ondevice.d.q */
/* compiled from: PG */
public final class C24423q {

    /* renamed from: a */
    static final C58495hd f66873a;

    /* renamed from: b */
    public static final /* synthetic */ int f66874b = 0;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55432k((Iterable) Stream.CC.m71936of((T[]) new C24418l[]{new C24363cp(), new C24384dj(), new C24369cv(), new C24394dt(), new C24398dx(), new C24390dp(), new C24343bw(), new C24348ca(), new C24353cf(), new C24358ck(), new C24375da(), new C24337bq(), new C24404ec(), new C24401e()}).map(C24422p.f66872a).collect(C58370cn.f155946a));
        f66873a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static C24418l m45484a(C62331d dVar) {
        C58495hd hdVar = f66873a;
        if (hdVar.containsKey(dVar)) {
            return (C24418l) hdVar.get(dVar);
        }
        int i = dVar.f168273v;
        throw new IllegalArgumentException("CascadeType number=" + i + " is not registered.");
    }
}
