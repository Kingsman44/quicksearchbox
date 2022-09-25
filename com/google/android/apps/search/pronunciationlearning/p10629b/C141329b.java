package com.google.android.apps.search.pronunciationlearning.p10629b;

import com.google.common.p4552o.aqc;
import com.google.common.p4552o.aqf;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.pronunciationlearning.b.b */
/* compiled from: PG */
public final /* synthetic */ class C141329b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ aqc f383687a;

    public /* synthetic */ C141329b(aqc aqc) {
        this.f383687a = aqc;
    }

    public final void accept(Object obj) {
        aqc aqc = this.f383687a;
        long longValue = ((Long) obj).longValue();
        aqc.copyOnWrite();
        aqf aqf = (aqf) aqc.instance;
        aqf aqf2 = aqf.f159731k;
        aqf.f159734a |= 1;
        aqf.f159735b = longValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
