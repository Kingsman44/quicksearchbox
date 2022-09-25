package com.google.common.p4522b;

import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.b.ru */
/* compiled from: PG */
final class C58782ru extends C58779rr implements Set {
    private static final long serialVersionUID = 0;

    public C58782ru(Set set, Object obj) {
        super(set, obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Collection mo55949a() {
        return (Set) ((Collection) this.f156561a);
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f156562b) {
            equals = ((Set) ((Collection) this.f156561a)).equals(obj);
        }
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f156562b) {
            hashCode = ((Set) ((Collection) this.f156561a)).hashCode();
        }
        return hashCode;
    }
}
