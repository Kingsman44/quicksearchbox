package com.google.android.libraries.gsa.monet.service;

import com.google.android.libraries.gsa.monet.shared.C23085ap;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.service.n */
/* compiled from: PG */
public final class C23063n extends C23050a {

    /* renamed from: a */
    private final Map f63417a;

    public C23063n(Map map) {
        this.f63417a = map;
    }

    /* renamed from: a */
    public final C23056g mo28487a(String str, C23052c cVar) {
        C23053d dVar = (C23053d) this.f63417a.get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.mo28440a(cVar);
    }

    /* renamed from: b */
    public final C23115k mo28322b(String str) {
        C23053d dVar = (C23053d) this.f63417a.get(str);
        if (dVar != null) {
            return dVar.mo28441b();
        }
        throw new C23085ap(C23129y.m43315a(str));
    }
}
