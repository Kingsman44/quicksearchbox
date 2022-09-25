package com.google.android.libraries.gsa.monet.shared;

import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23091e;

/* renamed from: com.google.android.libraries.gsa.monet.shared.am */
/* compiled from: PG */
public final class C23082am implements C23081al {

    /* renamed from: a */
    public static final C23082am f63431a = new C23082am(new C23091e());

    /* renamed from: b */
    public final C23091e f63432b;

    private C23082am(C23091e eVar) {
        this.f63432b = eVar;
    }

    /* renamed from: a */
    public static C23082am m43257a(C23091e eVar) {
        return eVar.isEmpty() ? f63431a : new C23082am(eVar);
    }

    /* renamed from: i */
    public final Object mo28424i(Class cls) {
        return cls.cast(this.f63432b.get(cls));
    }

    /* renamed from: j */
    public final Object mo28425j(Class cls) {
        Object obj = this.f63432b.get(cls);
        C23067b.m43230c(obj != null, "No service found for class: %s", cls.getName());
        obj.getClass();
        return cls.cast(obj);
    }
}
