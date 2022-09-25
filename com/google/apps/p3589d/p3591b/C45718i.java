package com.google.apps.p3589d.p3591b;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: com.google.apps.d.b.i */
/* compiled from: PG */
public class C45718i {

    /* renamed from: a */
    public HashMap f120221a;

    protected C45718i(HashMap hashMap) {
        this.f120221a = hashMap;
    }

    /* renamed from: a */
    public final Object mo49822a(Object obj) {
        Object obj2 = this.f120221a.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void mo49823b(C45717h hVar) {
        for (Map.Entry entry : this.f120221a.entrySet()) {
            hVar.mo49821a(entry.getKey(), entry.getValue());
        }
    }
}
