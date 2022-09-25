package com.google.android.libraries.onegoogle.accountmenu.p2353c;

import android.view.View;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.c.h */
/* compiled from: PG */
final class C30338h implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C30282k f82028a;

    /* renamed from: b */
    final /* synthetic */ C30339i f82029b;

    public C30338h(C30339i iVar, C30282k kVar) {
        this.f82029b = iVar;
        this.f82028a = kVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C30306o oVar = this.f82029b.f82031b;
        oVar.f81934a.f81880a.add(this.f82028a);
        if (this.f82029b.f82031b.f81934a.f81882c) {
            this.f82028a.mo18104a();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C30306o oVar = this.f82029b.f82031b;
        oVar.f81934a.f81880a.remove(this.f82028a);
    }
}
