package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.o */
/* compiled from: PG */
public final class C5996o {

    /* renamed from: a */
    public final Map f17674a;

    public C5996o(C5965m mVar) {
        this.f17674a = Collections.unmodifiableMap(new HashMap(mVar.f17624a));
    }

    /* renamed from: a */
    public final boolean mo12437a(Class cls) {
        return this.f17674a.containsKey(cls);
    }
}
