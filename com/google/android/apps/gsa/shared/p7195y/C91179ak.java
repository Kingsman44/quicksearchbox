package com.google.android.apps.gsa.shared.p7195y;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.shared.y.ak */
/* compiled from: PG */
final class C91179ak extends C91229u {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f254550a;

    /* renamed from: b */
    final /* synthetic */ C91188at f254551b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91179ak(C91188at atVar, C5572n nVar, SettableFuture settableFuture) {
        super(nVar);
        this.f254551b = atVar;
        this.f254550a = settableFuture;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        super.mo11859a(drawable);
        this.f254550a.mo57357o(new C5673ap("Load failed", Collections.emptyList()));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        super.mo11861c((Drawable) obj, fVar);
        this.f254550a.mo57356n(C118826c.f331422a);
    }

    /* renamed from: f */
    public final void mo11991f(Drawable drawable) {
        super.mo11991f(drawable);
        if ((drawable instanceof Animatable) && this.f254551b.f254577f.mo85441d()) {
            ((Animatable) drawable).start();
        }
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        super.mo11992fB(drawable);
        this.f254550a.mo57357o(new CancellationException());
    }

    /* renamed from: p */
    public final void mo11881p() {
        this.f254550a.mo57357o(new CancellationException());
    }
}
