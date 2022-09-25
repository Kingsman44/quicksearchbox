package com.google.protobuf;

import java.util.Map;

/* renamed from: com.google.protobuf.cw */
/* compiled from: PG */
final class C62977cw implements Map.Entry {

    /* renamed from: a */
    public final Map.Entry f170034a;

    public C62977cw(Map.Entry entry) {
        this.f170034a = entry;
    }

    public final Object getKey() {
        return this.f170034a.getKey();
    }

    public final Object getValue() {
        if (((C62979cy) this.f170034a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            C62979cy cyVar = (C62979cy) this.f170034a.getValue();
            MessageLite messageLite = cyVar.f170036a;
            cyVar.f170037b = null;
            cyVar.f170036a = (MessageLite) obj;
            return messageLite;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
