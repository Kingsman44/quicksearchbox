package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a;

import java.util.HashMap;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.a.m */
/* compiled from: PG */
final class C121424m {

    /* renamed from: a */
    public final HashMap f337076a = new HashMap();

    public C121424m(Stream stream) {
        stream.forEach(new C121423l(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo105135a(Object obj) {
        if (!this.f337076a.containsKey(obj)) {
            return true;
        }
        Integer num = (Integer) this.f337076a.get(obj);
        num.getClass();
        int intValue = num.intValue();
        this.f337076a.put(obj, Integer.valueOf(intValue - 1));
        if (intValue > 0) {
            return true;
        }
        return false;
    }
}
