package com.google.android.libraries.onegoogle.accountmenu.features.p2373g;

import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.g.g */
/* compiled from: PG */
public final class C30613g implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ AccountParticleDisc f82701a;

    /* renamed from: b */
    public final /* synthetic */ C30611e f82702b;

    public C30613g(AccountParticleDisc accountParticleDisc, C30611e eVar) {
        this.f82701a = accountParticleDisc;
        this.f82702b = eVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f82702b.mo36309a();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f82701a.removeOnAttachStateChangeListener(this);
    }
}
