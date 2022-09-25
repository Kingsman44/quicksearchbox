package com.bumptech.glide.p286e;

import com.bumptech.glide.load.C5963v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.i */
/* compiled from: PG */
public final class C5556i {

    /* renamed from: a */
    private final List f16812a = new ArrayList();

    /* renamed from: a */
    public final synchronized C5963v mo11946a(Class cls) {
        int size = this.f16812a.size();
        for (int i = 0; i < size; i++) {
            C5555h hVar = (C5555h) this.f16812a.get(i);
            if (hVar.f16810a.isAssignableFrom(cls)) {
                return hVar.f16811b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final synchronized void mo11947b(Class cls, C5963v vVar) {
        this.f16812a.add(new C5555h(cls, vVar));
    }
}
