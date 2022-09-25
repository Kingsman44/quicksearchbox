package com.google.android.libraries.p2460r.p2469c;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.r.c.aj */
/* compiled from: PG */
public final class C32079aj extends HashMap {

    /* renamed from: a */
    private final String f86135a;

    /* renamed from: b */
    private final C57404cb f86136b;

    public C32079aj(String str, C57404cb cbVar) {
        this.f86135a = str;
        this.f86136b = cbVar;
    }

    public final Object put(Object obj, Object obj2) {
        if (!containsKey(obj)) {
            return super.put(obj, obj2);
        }
        throw new C32083an(this.f86136b, String.format("%s key '%s' already defined", new Object[]{this.f86135a, obj}));
    }
}
