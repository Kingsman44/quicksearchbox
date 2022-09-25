package com.google.common.p4522b;

import java.io.Serializable;

/* renamed from: com.google.common.b.hg */
/* compiled from: PG */
final class C58498hg implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58495hd f156133a;

    public C58498hg(C58495hd hdVar) {
        this.f156133a = hdVar;
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        return this.f156133a.keySet();
    }
}
