package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.widget.ImageView;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.nga.shared.p6417x.C83369s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.c */
/* compiled from: PG */
public final /* synthetic */ class C81606c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223256a;

    public /* synthetic */ C81606c(C81603ae aeVar) {
        this.f223256a = aeVar;
    }

    public final void accept(Object obj) {
        C81603ae aeVar = this.f223256a;
        ImageView imageView = (ImageView) obj;
        C83361k kVar = new C83361k(false, C81519a.class);
        aeVar.f223228h.mo76663c(aeVar.f223227g.mo75162o(), new C83369s(aeVar.f223226f, "rightIcon", new C81617n(aeVar, imageView)));
        aeVar.f223228h.mo76663c(C83349aj.m132655j(kVar, aeVar.f223227g.mo75151d(), aeVar.f223227g.mo75162o(), C81618o.f223270a), new C83369s(aeVar.f223226f, "onRightIconVeIdReceived", new C81619p(aeVar, imageView)));
        aeVar.f223226f.mo28212l("[NGA] addView", new C81620q(aeVar, imageView, kVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
