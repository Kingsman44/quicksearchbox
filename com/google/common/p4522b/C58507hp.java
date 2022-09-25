package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.hp */
/* compiled from: PG */
final class C58507hp extends C58471gg {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58512hu f156148a;

    public C58507hp(C58512hu huVar) {
        this.f156148a = huVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return this.f156148a.map.mo55193c();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f156148a.mo54952E(entry.getKey(), entry.getValue());
    }

    public final /* synthetic */ Iterator iterator() {
        return new C58504hm(this.f156148a);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return new C58504hm(this.f156148a);
    }

    public final int size() {
        return this.f156148a.size;
    }
}
