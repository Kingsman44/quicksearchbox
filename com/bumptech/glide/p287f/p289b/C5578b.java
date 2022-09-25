package com.bumptech.glide.p287f.p289b;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* renamed from: com.bumptech.glide.f.b.b */
/* compiled from: PG */
public final class C5578b implements C5582f {

    /* renamed from: a */
    private final int f16872a;

    /* renamed from: b */
    private final boolean f16873b;

    public C5578b(int i, boolean z) {
        this.f16872a = i;
        this.f16873b = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12028a(Object obj, C5581e eVar) {
        Drawable drawable = (Drawable) obj;
        Drawable j = eVar.mo12002j();
        if (j == null) {
            j = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{j, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f16873b);
        transitionDrawable.startTransition(this.f16872a);
        eVar.mo12004l(transitionDrawable);
        return true;
    }
}
