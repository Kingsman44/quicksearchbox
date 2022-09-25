package com.google.apps.tiktok.experiments.phenotype;

import com.google.common.util.concurrent.C60856cj;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ab */
/* compiled from: PG */
final class C46908ab implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f122381a;

    public C46908ab(List list) {
        this.f122381a = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        List<Future> list = this.f122381a;
        int b = C69505av.m100860b(C69540x.m100804k(list, 10));
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (Future r : list) {
            C69685i iVar = (C69685i) C60856cj.m92909r(r);
            linkedHashMap.put(iVar.f186052a, iVar.f186053b);
        }
        return linkedHashMap;
    }
}
