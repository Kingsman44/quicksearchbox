package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5955n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.ar */
/* compiled from: PG */
public final class C5675ar {

    /* renamed from: a */
    private final Map f17119a = new HashMap();

    /* renamed from: b */
    private final Map f17120b = new HashMap();

    /* renamed from: a */
    public final Map mo12177a(boolean z) {
        return z ? this.f17120b : this.f17119a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12178b(C5955n nVar, C5667aj ajVar) {
        Map a = mo12177a(ajVar.f17081g);
        if (ajVar.equals(a.get(nVar))) {
            a.remove(nVar);
        }
    }
}
