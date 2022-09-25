package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82832cb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82833cc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.u */
/* compiled from: PG */
public final /* synthetic */ class C83184u implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82832cb f226801a;

    public /* synthetic */ C83184u(C82832cb cbVar) {
        this.f226801a = cbVar;
    }

    public final void accept(Object obj) {
        C82832cb cbVar = this.f226801a;
        cbVar.copyOnWrite();
        C82833cc ccVar = (C82833cc) cbVar.instance;
        C82833cc ccVar2 = C82833cc.f225801h;
        ccVar.f225804b = ((C82835ce) obj).f225873aj;
        ccVar.f225803a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
