package com.google.apps.tiktok.experiments.phenotype;

import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.am */
/* compiled from: PG */
public final class C46919am {

    /* renamed from: a */
    final /* synthetic */ Map f122400a;

    public C46919am(Map map) {
        this.f122400a = map;
    }

    /* renamed from: a */
    public final String mo50923a(String str) {
        C69664n.m101061g(str, "mendelPackage");
        String str2 = (String) this.f122400a.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new IllegalStateException("Unknown package ".concat(String.valueOf(str)));
    }
}
