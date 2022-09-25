package com.google.android.libraries.onegoogle.accountmenu;

import android.view.View;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.shared.monet.p7116h.C90337f;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.c */
/* compiled from: PG */
final class C30330c implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C2391v f82014a;

    /* renamed from: b */
    final /* synthetic */ AccountMenuDiscBinder f82015b;

    public C30330c(C2391v vVar, AccountMenuDiscBinder accountMenuDiscBinder) {
        this.f82014a = vVar;
        this.f82015b = accountMenuDiscBinder;
    }

    public final void onViewAttachedToWindow(View view) {
        ((C90337f) this.f82014a).f252289b.mo5790b(this.f82015b.f81897e);
    }

    public final void onViewDetachedFromWindow(View view) {
        ((C90337f) this.f82014a).f252289b.mo5791c(this.f82015b.f81897e);
        AccountMenuDiscBinder accountMenuDiscBinder = this.f82015b;
        C30306o i = accountMenuDiscBinder.f81894b.mo35858i();
        i.f81934a.f81880a.remove(accountMenuDiscBinder.f81896d);
        AccountParticleDisc accountParticleDisc = accountMenuDiscBinder.f81893a;
        accountParticleDisc.f81550d.remove(accountMenuDiscBinder.f81895c);
    }
}
