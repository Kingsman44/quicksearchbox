package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.hk */
/* compiled from: PG */
final class C58502hk implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58495hd f156138a;

    public C58502hk(C58495hd hdVar) {
        this.f156138a = hdVar;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.f156138a.values();
    }
}
