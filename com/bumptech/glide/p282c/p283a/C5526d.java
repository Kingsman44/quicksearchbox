package com.bumptech.glide.p282c.p283a;

import androidx.p104d.p105a.C2164c;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;

/* renamed from: com.bumptech.glide.c.a.d */
/* compiled from: PG */
final class C5526d implements C5592i {

    /* renamed from: a */
    private final C2164c f16751a;

    public C5526d(C2164c cVar) {
        this.f16751a = cVar;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        C2164c cVar = this.f16751a;
        Throwable th = apVar;
        if (apVar == null) {
            th = new RuntimeException("Unknown error");
        }
        cVar.mo5439d(th);
        return true;
    }

    /* renamed from: b */
    public final boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        try {
            this.f16751a.mo5437b(new C5527e(obj));
            return true;
        } catch (Throwable th) {
            this.f16751a.mo5439d(th);
            return true;
        }
    }
}
