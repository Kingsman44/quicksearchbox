package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqg */
/* compiled from: PG */
abstract class aqg implements Map.Entry {
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!apz.m19253b(getKey(), entry.getKey()) || !apz.m19253b(getValue(), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public final int hashCode() {
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
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
