package com.google.android.libraries.onegoogle.accountmenu;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.x */
/* compiled from: PG */
final class C30797x implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C30799z f83102a;

    public C30797x(C30799z zVar) {
        this.f83102a = zVar;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.f83102a.f83105a.mo35858i().f81934a.f81882c) {
            C30799z zVar = this.f83102a;
            zVar.mo36483b(C30281j.m56319c(zVar.f83105a.mo35858i().f81934a.f81883d));
        }
        this.f83102a.f83106b.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
