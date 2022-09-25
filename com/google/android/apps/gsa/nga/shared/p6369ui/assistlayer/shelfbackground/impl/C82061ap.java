package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.ap */
/* compiled from: PG */
public final /* synthetic */ class C82061ap implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C82071az f224294a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f224295b;

    public /* synthetic */ C82061ap(C82071az azVar, C22871g gVar) {
        this.f224294a = azVar;
        this.f224295b = gVar;
    }

    public final void run() {
        C82071az azVar = this.f224294a;
        C83349aj.m132647b(this.f224295b, azVar.f224325b, Boolean.valueOf(DesugarArrays.stream((T[]) new View[]{azVar.f224332i, azVar.f224328e}).anyMatch(C82059an.f224292a)), "isVisible");
    }
}
