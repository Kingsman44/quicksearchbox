package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.ComponentName;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4764a.p4765a.p4766a.C63116c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.t.h.bj */
/* compiled from: PG */
public final /* synthetic */ class C118417bj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328663a;

    public /* synthetic */ C118417bj(C118426bs bsVar) {
        this.f328663a = bsVar;
    }

    public final void accept(Object obj) {
        C63116c cVar = (C63116c) obj;
        this.f328663a.f328701v.put(new ComponentName(cVar.f170384a, cVar.f170385b), Long.valueOf(cVar.f170386c));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
