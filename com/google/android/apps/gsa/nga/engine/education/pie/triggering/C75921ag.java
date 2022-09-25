package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.common.p4552o.C59999iw;
import com.google.common.p4552o.C60000ix;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.ag */
/* compiled from: PG */
public final /* synthetic */ class C75921ag implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C59999iw f210647a;

    public /* synthetic */ C75921ag(C59999iw iwVar) {
        this.f210647a = iwVar;
    }

    public final void accept(Object obj) {
        C59999iw iwVar = this.f210647a;
        int intValue = ((Integer) obj).intValue();
        iwVar.copyOnWrite();
        C60000ix ixVar = (C60000ix) iwVar.instance;
        C60000ix ixVar2 = C60000ix.f162157e;
        ixVar.f162160a |= 4;
        ixVar.f162163d = intValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
