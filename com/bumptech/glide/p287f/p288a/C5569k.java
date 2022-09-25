package com.bumptech.glide.p287f.p288a;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.C5514ad;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p287f.p289b.C5582f;

/* renamed from: com.bumptech.glide.f.a.k */
/* compiled from: PG */
public final class C5569k extends C5561c {

    /* renamed from: b */
    private static final Handler f16852b = new Handler(Looper.getMainLooper(), new C5568j());

    /* renamed from: a */
    public final C5514ad f16853a;

    public C5569k(C5514ad adVar, int i, int i2) {
        super(i, i2);
        this.f16853a = adVar;
    }

    /* renamed from: c */
    public final void mo11861c(Object obj, C5582f fVar) {
        C5588e eVar = this.f16843c;
        if (eVar != null && eVar.mo12024l()) {
            f16852b.obtainMessage(1, this).sendToTarget();
        }
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
    }
}
