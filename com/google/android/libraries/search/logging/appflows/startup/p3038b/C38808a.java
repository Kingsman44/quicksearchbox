package com.google.android.libraries.search.logging.appflows.startup.p3038b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.search.logging.appflows.startup.b.a */
/* compiled from: PG */
public final class C38808a extends C38816i {

    /* renamed from: a */
    public C58833ax f102424a = C58836b.f156633a;

    /* renamed from: b */
    private Object f102425b;

    /* renamed from: a */
    public final C38817j mo41648a() {
        Object obj = this.f102425b;
        if (obj != null) {
            return new C38809b(obj, this.f102424a);
        }
        throw new IllegalStateException("Missing required properties: firstDrawDoneEvent");
    }

    /* renamed from: b */
    public final void mo41649b(Object obj) {
        if (obj != null) {
            this.f102425b = obj;
            return;
        }
        throw new NullPointerException("Null firstDrawDoneEvent");
    }
}
