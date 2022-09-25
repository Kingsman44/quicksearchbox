package com.google.protobuf;

import java.util.Map;

/* renamed from: com.google.protobuf.cm */
/* compiled from: PG */
final class C62966cm implements Map.Entry {

    /* renamed from: a */
    final /* synthetic */ C62970cp f169999a;

    /* renamed from: b */
    private final Map.Entry f170000b;

    public C62966cm(C62970cp cpVar, Map.Entry entry) {
        this.f169999a = cpVar;
        this.f170000b = entry;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    public final Object getKey() {
        return this.f170000b.getKey();
    }

    public final Object getValue() {
        return this.f169999a.f170007a.mo58930a((Integer) this.f170000b.getValue());
    }

    public final int hashCode() {
        return this.f170000b.hashCode();
    }

    public final Object setValue(Object obj) {
        Object value = this.f170000b.setValue(C62965cl.m95516b((C62957cd) obj));
        if (value == null) {
            return null;
        }
        return this.f169999a.f170007a.mo58930a((Integer) value);
    }
}
