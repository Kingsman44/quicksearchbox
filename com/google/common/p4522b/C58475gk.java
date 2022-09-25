package com.google.common.p4522b;

import java.io.Serializable;
import java.util.EnumSet;

/* renamed from: com.google.common.b.gk */
/* compiled from: PG */
final class C58475gk implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final EnumSet f156102a;

    public C58475gk(EnumSet enumSet) {
        this.f156102a = enumSet;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return new C58476gl(this.f156102a.clone());
    }
}
