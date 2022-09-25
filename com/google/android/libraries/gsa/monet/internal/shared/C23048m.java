package com.google.android.libraries.gsa.monet.internal.shared;

import com.google.android.libraries.gsa.monet.shared.C23081al;
import com.google.android.libraries.gsa.monet.shared.C23082am;
import com.google.android.libraries.gsa.monet.shared.C23083an;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23091e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.m */
/* compiled from: PG */
public final class C23048m implements C23083an {

    /* renamed from: a */
    private final C23081al f63401a;

    /* renamed from: b */
    private final Map f63402b = new HashMap();

    /* renamed from: c */
    private C23081al f63403c;

    public C23048m(C23081al alVar) {
        this.f63401a = alVar;
    }

    /* renamed from: b */
    private final void m43185b(Class cls) {
        C23067b.m43230c(!this.f63402b.containsKey(cls), "A service already exists for class: %s", cls.getName());
    }

    /* renamed from: A */
    public final void mo28418A(Class cls) {
        C23067b.m43230c(this.f63402b.remove(cls) != null, "No service exists for class: %s", cls.getName());
        this.f63403c = null;
    }

    /* renamed from: a */
    public final C23081al mo28486a() {
        if (this.f63403c == null) {
            this.f63403c = C23082am.m43257a(new C23091e(this.f63402b));
        }
        return this.f63403c;
    }

    /* renamed from: s */
    public final void mo28429s(Class cls) {
        C23067b.m43230c(!this.f63402b.containsKey(cls), "A service already exists for class: %s", cls.getName());
        Object i = this.f63401a.mo28424i(cls);
        if (i != null) {
            mo28433w(cls, i);
        }
    }

    /* renamed from: t */
    public final void mo28430t(Class cls) {
        m43185b(cls);
        mo28433w(cls, this.f63401a.mo28425j(cls));
    }

    /* renamed from: w */
    public final void mo28433w(Class cls, Object obj) {
        m43185b(cls);
        this.f63402b.put(cls, obj);
        this.f63403c = null;
    }
}
