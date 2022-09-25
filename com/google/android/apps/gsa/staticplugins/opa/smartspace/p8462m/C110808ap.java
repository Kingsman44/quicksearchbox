package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.ap */
/* compiled from: PG */
public final /* synthetic */ class C110808ap implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C110812at f308719a;

    public /* synthetic */ C110808ap(C110812at atVar) {
        this.f308719a = atVar;
    }

    public final void accept(Object obj) {
        C50738bc bcVar = (C50738bc) obj;
        C58970a aVar = (C58970a) ((C58970a) this.f308719a.f308736j.mo56224b()).mo56372aa(26807);
        String str = bcVar.f132037d;
        C50701am a = C50701am.m85887a(bcVar.f132040g);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        aVar.mo56359L("chip in smartspace cache: %s, %s, %s", str, a.name(), bcVar.f132038e);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
