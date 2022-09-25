package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82832cb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82833cc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.w */
/* compiled from: PG */
public final /* synthetic */ class C83186w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82832cb f226803a;

    public /* synthetic */ C83186w(C82832cb cbVar) {
        this.f226803a = cbVar;
    }

    public final void accept(Object obj) {
        C82832cb cbVar = this.f226803a;
        cbVar.copyOnWrite();
        C82833cc ccVar = (C82833cc) cbVar.instance;
        C82833cc ccVar2 = C82833cc.f225801h;
        ccVar.f225805c = ((C82831ca) obj).f225800aL;
        ccVar.f225803a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
