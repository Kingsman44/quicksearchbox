package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.he */
/* compiled from: PG */
final class C58496he implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58495hd f156132a;

    public C58496he(C58495hd hdVar) {
        this.f156132a = hdVar;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.f156132a.entrySet();
    }
}
