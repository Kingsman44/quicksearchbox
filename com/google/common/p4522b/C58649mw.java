package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.common.b.mw */
/* compiled from: PG */
abstract class C58649mw extends C58755qu {
    /* renamed from: a */
    public abstract Map mo55683a();

    public final void clear() {
        mo55683a().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object g = C58662ni.m90348g(mo55683a(), key);
        if (!C58832aw.m90831a(g, entry.getValue())) {
            return false;
        }
        if (g != null || mo55683a().containsKey(key)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        return mo55683a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return mo55683a().keySet().remove(((Map.Entry) obj).getKey());
    }

    public final int size() {
        return mo55683a().size();
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return C58758qx.m90655m(this, collection);
        } catch (UnsupportedOperationException unused) {
            return C58758qx.m90656n(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet g = C58758qx.m90649g(collection.size());
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    g.add(((Map.Entry) next).getKey());
                }
            }
            return mo55683a().keySet().retainAll(g);
        }
    }
}
