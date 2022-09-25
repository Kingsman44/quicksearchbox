package com.bumptech.glide.load.p297b;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.ag */
/* compiled from: PG */
public final class C5755ag implements C5751ac {

    /* renamed from: b */
    public final Map f17334b;

    /* renamed from: c */
    public volatile Map f17335c;

    public C5755ag(Map map) {
        this.f17334b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5755ag) {
            return this.f17334b.equals(((C5755ag) obj).f17334b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17334b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f17334b);
        return "LazyHeaders{headers=" + valueOf + "}";
    }
}
