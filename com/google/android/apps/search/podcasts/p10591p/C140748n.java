package com.google.android.apps.search.podcasts.p10591p;

import java.util.List;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.p.n */
/* compiled from: PG */
final class C140748n extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ String f382197a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140748n(String str) {
        super(0);
        this.f382197a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        List E = C69764m.m101188E(this.f382197a, new String[]{"."});
        if (E.size() < 2) {
            return this.f382197a;
        }
        Object obj = E.get(0);
        Object obj2 = E.get(1);
        return obj + "." + obj2;
    }
}
