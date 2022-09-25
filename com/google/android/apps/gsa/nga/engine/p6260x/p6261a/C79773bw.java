package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bw */
/* compiled from: PG */
public final /* synthetic */ class C79773bw implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C60548tz f218704a;

    public /* synthetic */ C79773bw(C60548tz tzVar) {
        this.f218704a = tzVar;
    }

    public final void accept(Object obj) {
        C60548tz tzVar = this.f218704a;
        String str = (String) obj;
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        C60555uf ufVar2 = C60555uf.f164065cO;
        str.getClass();
        ufVar.f164093a |= 4;
        ufVar.f164259n = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
