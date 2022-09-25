package com.google.apps.tiktok.tracing.contrib.p3703e;

import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.e.b */
/* compiled from: PG */
public final class C47658b implements C5592i {

    /* renamed from: a */
    private final C5592i f123605a;

    /* renamed from: b */
    private final C47770dh f123606b;

    public C47658b(C5592i iVar, C47770dh dhVar) {
        this.f123605a = iVar;
        this.f123606b = dhVar;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        if (C47831fm.m85027v()) {
            return this.f123605a.mo11905a(apVar, obj, nVar, z);
        }
        C47538ax b = this.f123606b.mo51612b(C47658b.class, "onLoadFailed");
        try {
            boolean a = this.f123605a.mo11905a(apVar, obj, nVar, z);
            if (b != null) {
                b.close();
            }
            return a;
        } catch (Throwable th) {
            C47657a.m84787a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        if (C47831fm.m85027v()) {
            return this.f123605a.mo11906b(obj, obj2, nVar, aVar, z);
        }
        C47538ax b = this.f123606b.mo51612b(C47658b.class, "onResourceReady");
        try {
            boolean b2 = this.f123605a.mo11906b(obj, obj2, nVar, aVar, z);
            if (b != null) {
                b.close();
            }
            return b2;
        } catch (Throwable th) {
            C47657a.m84787a(th, th);
        }
        throw th;
    }
}
