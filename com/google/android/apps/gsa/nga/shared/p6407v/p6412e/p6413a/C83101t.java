package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.t */
/* compiled from: PG */
public final /* synthetic */ class C83101t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82841ck f226710a;

    public /* synthetic */ C83101t(C82841ck ckVar) {
        this.f226710a = ckVar;
    }

    public final void accept(Object obj) {
        C82841ck ckVar = this.f226710a;
        C82988hw hwVar = (C82988hw) obj;
        ckVar.copyOnWrite();
        C82843cm cmVar = C82843cm.f225889f;
        hwVar.getClass();
        ((C82843cm) ckVar.instance).f225895e = hwVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
