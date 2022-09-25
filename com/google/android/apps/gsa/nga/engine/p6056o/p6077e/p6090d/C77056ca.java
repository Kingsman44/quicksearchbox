package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80334cb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80335cc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.ca */
/* compiled from: PG */
public final /* synthetic */ class C77056ca implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80334cb f212672a;

    public /* synthetic */ C77056ca(C80334cb cbVar) {
        this.f212672a = cbVar;
    }

    public final void accept(Object obj) {
        C80334cb cbVar = this.f212672a;
        String str = (String) obj;
        cbVar.copyOnWrite();
        C80335cc ccVar = C80335cc.f220436e;
        str.getClass();
        ((C80335cc) cbVar.instance).f220438a = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
