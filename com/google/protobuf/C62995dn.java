package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.dn */
/* compiled from: PG */
public final class C62995dn extends LinkedHashMap {

    /* renamed from: a */
    public static final C62995dn f170057a;

    /* renamed from: b */
    public boolean f170058b = true;

    static {
        C62995dn dnVar = new C62995dn();
        f170057a = dnVar;
        dnVar.f170058b = false;
    }

    private C62995dn() {
    }

    /* renamed from: c */
    private static int m95601c(Object obj) {
        if (obj instanceof byte[]) {
            return C62972cr.m95542b((byte[]) obj);
        }
        if (!(obj instanceof C62957cd)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final C62995dn mo58980a() {
        return isEmpty() ? new C62995dn() : new C62995dn(this);
    }

    /* renamed from: b */
    public final void mo58981b() {
        if (!this.f170058b) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo58981b();
        super.clear();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m95601c(entry.getValue()) ^ m95601c(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        mo58981b();
        C62972cr.m95548h(obj);
        C62972cr.m95548h(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo58981b();
        for (Object next : map.keySet()) {
            C62972cr.m95548h(next);
            C62972cr.m95548h(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        mo58981b();
        return super.remove(obj);
    }

    private C62995dn(Map map) {
        super(map);
    }
}
