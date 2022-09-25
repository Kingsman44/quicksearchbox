package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.d */
/* compiled from: PG */
public final /* synthetic */ class C81607d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223257a;

    public /* synthetic */ C81607d(C81603ae aeVar) {
        this.f223257a = aeVar;
    }

    public final void accept(Object obj) {
        C81603ae aeVar = this.f223257a;
        View view = (View) obj;
        C83361k kVar = new C83361k(false, C81519a.class);
        aeVar.f223228h.mo76663c(aeVar.f223227g.mo75160m(), new C83369s(aeVar.f223226f, "leftIconStateChanged", new C81600ab(aeVar, view)));
        aeVar.f223228h.mo76663c(C83349aj.m132655j(kVar, aeVar.f223227g.mo75151d(), aeVar.f223227g.mo75160m(), C81601ac.f223218a), new C83369s(aeVar.f223226f, "onRightIconVeIdReceived", new C81602ad(aeVar, view)));
        aeVar.f223226f.mo28212l("[NGA] addView", new C81605b(aeVar, view, kVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
