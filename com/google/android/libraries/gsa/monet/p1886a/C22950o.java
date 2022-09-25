package com.google.android.libraries.gsa.monet.p1886a;

import com.google.android.libraries.gsa.monet.shared.C23085ap;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.a.o */
/* compiled from: PG */
public final class C22950o extends C22936a {

    /* renamed from: a */
    private final Map f63132a;

    public C22950o(Map map) {
        this.f63132a = map;
    }

    /* renamed from: a */
    public final C22939d mo28284a(String str, C22945j jVar) {
        C22946k kVar = (C22946k) this.f63132a.get(str);
        if (kVar == null) {
            return null;
        }
        return kVar.mo28318b(jVar);
    }

    /* renamed from: b */
    public final C23115k mo28322b(String str) {
        C22946k kVar = (C22946k) this.f63132a.get(str);
        if (kVar != null) {
            return kVar.mo28317a();
        }
        throw new C23085ap(C23129y.m43315a(str));
    }
}
