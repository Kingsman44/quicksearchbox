package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.nlp.p4735b.p4736a.C62841h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.r */
/* compiled from: PG */
public final /* synthetic */ class C83099r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82841ck f226708a;

    public /* synthetic */ C83099r(C82841ck ckVar) {
        this.f226708a = ckVar;
    }

    public final void accept(Object obj) {
        C82841ck ckVar = this.f226708a;
        C62841h hVar = (C62841h) obj;
        ckVar.copyOnWrite();
        C82843cm cmVar = C82843cm.f225889f;
        hVar.getClass();
        ((C82843cm) ckVar.instance).f225892b = hVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
