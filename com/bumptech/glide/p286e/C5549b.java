package com.bumptech.glide.p286e;

import com.bumptech.glide.load.C5819c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.b */
/* compiled from: PG */
public final class C5549b {

    /* renamed from: a */
    private final List f16798a = new ArrayList();

    /* renamed from: a */
    public final synchronized C5819c mo11936a(Class cls) {
        for (C5548a aVar : this.f16798a) {
            if (aVar.f16796a.isAssignableFrom(cls)) {
                return aVar.f16797b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final synchronized void mo11937b(Class cls, C5819c cVar) {
        this.f16798a.add(new C5548a(cls, cVar));
    }
}
