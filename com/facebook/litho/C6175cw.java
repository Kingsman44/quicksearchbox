package com.facebook.litho;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.DesugarCollections;

/* renamed from: com.facebook.litho.cw */
/* compiled from: PG */
public final class C6175cw {

    /* renamed from: a */
    final Map f18220a = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: b */
    public final Map f18221b = new HashMap();

    /* renamed from: c */
    final Set f18222c = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo13149a(C6280fw fwVar) {
        this.f18222c.add(fwVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo13150b(C6280fw fwVar) {
        this.f18222c.remove(fwVar);
        if (this.f18222c.isEmpty()) {
            this.f18221b.clear();
            this.f18220a.clear();
        }
    }
}
