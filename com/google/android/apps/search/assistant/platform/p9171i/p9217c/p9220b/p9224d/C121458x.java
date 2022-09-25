package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d;

import com.google.assistant.p3781ad.p3787c.p3788a.C48516bh;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import java.util.Collections;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.d.x */
/* compiled from: PG */
public final class C121458x extends C121436b {

    /* renamed from: b */
    private volatile transient C58495hd f337122b;

    public C121458x(C48516bh bhVar) {
        super(bhVar);
    }

    /* renamed from: b */
    public final C58495hd mo105153b() {
        if (this.f337122b == null) {
            synchronized (this) {
                if (this.f337122b == null) {
                    this.f337122b = (C58495hd) Collection.EL.stream(Collections.unmodifiableMap(this.f337092a.f125337f).entrySet()).map(C121448n.f337103a).filter(C121449o.f337104a).collect(C58370cn.m89403c(C121450p.f337105a, C121451q.f337106a, C121452r.f337107a));
                    if (this.f337122b == null) {
                        throw new NullPointerException("getActionStatByIntent() cannot return null");
                    }
                }
            }
        }
        return this.f337122b;
    }
}
