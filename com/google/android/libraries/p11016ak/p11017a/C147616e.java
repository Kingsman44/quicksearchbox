package com.google.android.libraries.p11016ak.p11017a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.IntFunction;
import p5285d.p5290b.p5291a.p5292a.C68169be;
import p5285d.p5290b.p5291a.p5292a.C68172bh;

/* renamed from: com.google.android.libraries.ak.a.e */
/* compiled from: PG */
public final /* synthetic */ class C147616e implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ Map f398429a;

    /* renamed from: b */
    public final /* synthetic */ List f398430b;

    /* renamed from: c */
    public final /* synthetic */ double f398431c;

    /* renamed from: d */
    public final /* synthetic */ double f398432d;

    public /* synthetic */ C147616e(Map map, List list, double d, double d2) {
        this.f398429a = map;
        this.f398430b = list;
        this.f398431c = d;
        this.f398432d = d2;
    }

    public final Object apply(int i) {
        Map map = this.f398429a;
        List list = this.f398430b;
        double d = this.f398431c;
        double d2 = this.f398432d;
        Integer valueOf = Integer.valueOf(i);
        C68169be beVar = ((C68172bh) list.get(i)).f184476b;
        if (beVar == null) {
            beVar = C68169be.f184463c;
        }
        double d3 = (double) beVar.f184466b;
        Double.isNaN(d3);
        return (C62910ar) Map.EL.getOrDefault(map, valueOf, C62948a.m95459j((long) ((d3 / d) * d2)));
    }
}
