package com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a;

import com.google.assistant.p3931f.p3939c.C52828e;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58486gv;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.e.a.i */
/* compiled from: PG */
public final /* synthetic */ class C130367i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58486gv f357288a;

    public /* synthetic */ C130367i(C58486gv gvVar) {
        this.f357288a = gvVar;
    }

    public final void accept(Object obj) {
        C52828e eVar = (C52828e) obj;
        this.f357288a.mo55421e(eVar.f138604a, (Iterable) Collection.EL.stream(eVar.f138606c).filter(C130374p.f357295a).collect(C58370cn.f155946a));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
