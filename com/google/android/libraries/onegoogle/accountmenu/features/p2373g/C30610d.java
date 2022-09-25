package com.google.android.libraries.onegoogle.accountmenu.features.p2373g;

import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.C30208h;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.g.d */
/* compiled from: PG */
final class C30610d implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C30208h f82688a;

    /* renamed from: b */
    final /* synthetic */ C30611e f82689b;

    public C30610d(C30611e eVar, C30208h hVar) {
        this.f82689b = eVar;
        this.f82688a = hVar;
    }

    public final void onViewAttachedToWindow(View view) {
        AccountParticleDisc accountParticleDisc = this.f82689b.f82690a;
        accountParticleDisc.f81550d.add(this.f82688a);
        ((C30609c) this.f82688a).f82687a.mo36310b();
    }

    public final void onViewDetachedFromWindow(View view) {
        AccountParticleDisc accountParticleDisc = this.f82689b.f82690a;
        accountParticleDisc.f81550d.remove(this.f82688a);
    }
}
