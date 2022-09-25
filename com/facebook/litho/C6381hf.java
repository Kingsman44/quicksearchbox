package com.facebook.litho;

import java.util.HashMap;
import java.util.Map;
import p3186j$.util.DesugarCollections;

/* renamed from: com.facebook.litho.hf */
/* compiled from: PG */
public final class C6381hf {

    /* renamed from: a */
    private final Map f18886a = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static C6381hf m17119a(C6381hf hfVar) {
        C6381hf hfVar2 = new C6381hf();
        if (hfVar != null) {
            synchronized (hfVar.f18886a) {
                hfVar2.f18886a.putAll(hfVar.f18886a);
            }
        }
        return hfVar2;
    }

    /* renamed from: b */
    public static C6381hf m17120b(C6381hf hfVar) {
        if (hfVar == null) {
            return null;
        }
        return m17119a(hfVar);
    }

    /* renamed from: c */
    public final Object mo13397c(Class cls) {
        return this.f18886a.get(cls);
    }

    /* renamed from: d */
    public final void mo13398d(Class cls, Object obj) {
        this.f18886a.put(cls, obj);
    }
}
