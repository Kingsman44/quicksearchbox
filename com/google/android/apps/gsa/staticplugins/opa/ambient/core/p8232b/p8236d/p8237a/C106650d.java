package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8236d.p8237a;

import com.google.assistant.p3860as.C49744ag;
import com.google.assistant.p3886c.C50841m;
import com.google.assistant.p3886c.C50842n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C106650d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C50841m f297308a;

    public /* synthetic */ C106650d(C50841m mVar) {
        this.f297308a = mVar;
    }

    public final void accept(Object obj) {
        C50841m mVar = this.f297308a;
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
