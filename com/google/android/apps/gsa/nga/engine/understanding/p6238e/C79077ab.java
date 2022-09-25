package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p5913am.p5922i.C74920l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.ab */
/* compiled from: PG */
public final /* synthetic */ class C79077ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79086ak f217433a;

    public /* synthetic */ C79077ab(C79086ak akVar) {
        this.f217433a = akVar;
    }

    public final void accept(Object obj) {
        C79086ak akVar = this.f217433a;
        C80513b bVar = (C80513b) obj;
        if (akVar.f217446b.isPresent()) {
            ((C74920l) akVar.f217446b.get()).mo71297a();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
