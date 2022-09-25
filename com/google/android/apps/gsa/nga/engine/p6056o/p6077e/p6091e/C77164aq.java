package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.aq */
/* compiled from: PG */
public final /* synthetic */ class C77164aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C77167at f212950a;

    /* renamed from: b */
    public final /* synthetic */ C51588ng f212951b;

    public /* synthetic */ C77164aq(C77167at atVar, C51588ng ngVar) {
        this.f212950a = atVar;
        this.f212951b = ngVar;
    }

    public final void accept(Object obj) {
        this.f212950a.mo72464c(this.f212951b, (Duration) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
