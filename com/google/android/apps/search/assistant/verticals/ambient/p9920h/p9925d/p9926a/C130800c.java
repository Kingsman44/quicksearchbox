package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9925d.p9926a;

import com.google.assistant.p3860as.C49744ag;
import com.google.assistant.p3886c.C50841m;
import com.google.assistant.p3886c.C50842n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.d.a.c */
/* compiled from: PG */
public final /* synthetic */ class C130800c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50841m f358040a;

    public /* synthetic */ C130800c(C50841m mVar) {
        this.f358040a = mVar;
    }

    public final void accept(Object obj) {
        C50841m mVar = this.f358040a;
        C49744ag agVar = (C49744ag) obj;
        mVar.copyOnWrite();
        C50842n nVar = (C50842n) mVar.instance;
        C50842n nVar2 = C50842n.f132378f;
        agVar.getClass();
        nVar.f132383d = agVar;
        nVar.f132380a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
