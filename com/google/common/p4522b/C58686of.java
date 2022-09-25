package com.google.common.p4522b;

import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: com.google.common.b.of */
/* compiled from: PG */
abstract class C58686of extends AbstractCollection {
    /* renamed from: a */
    public abstract C58671nr mo54940a();

    public final void clear() {
        mo54940a().mo54917u();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return mo54940a().mo54952E(entry.getKey(), entry.getValue());
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return mo54940a().mo54956I(entry.getKey(), entry.getValue());
    }

    public final int size() {
        return mo54940a().mo54906j();
    }
}
