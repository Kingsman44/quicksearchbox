package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import java.util.Map;

/* renamed from: com.google.common.b.aj */
/* compiled from: PG */
abstract class C58312aj implements Map.Entry {
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!C58832aw.m90831a(getKey(), entry.getKey()) || !C58832aw.m90831a(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
