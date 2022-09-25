package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.i */
/* compiled from: PG */
public final /* synthetic */ class C123119i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C2164c f340767a;

    /* renamed from: b */
    public final /* synthetic */ PortableAssistant f340768b;

    public /* synthetic */ C123119i(C2164c cVar, PortableAssistant portableAssistant) {
        this.f340767a = cVar;
        this.f340768b = portableAssistant;
    }

    public final void accept(Object obj) {
        C2164c cVar = this.f340767a;
        PortableAssistant portableAssistant = this.f340768b;
        ((C59052c) ((C59052c) ((C59052c) C123089ac.f340684a.mo56225c()).mo56382g((Throwable) obj)).mo56372aa(35061)).mo56386p("WarmUp pop fail.");
        cVar.mo5437b(portableAssistant);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
