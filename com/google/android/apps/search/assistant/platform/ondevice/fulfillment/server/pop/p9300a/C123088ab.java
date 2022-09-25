package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C123088ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C2164c f340682a;

    /* renamed from: b */
    public final /* synthetic */ PortableAssistant f340683b;

    public /* synthetic */ C123088ab(C2164c cVar, PortableAssistant portableAssistant) {
        this.f340682a = cVar;
        this.f340683b = portableAssistant;
    }

    public final void accept(Object obj) {
        Void voidR = (Void) obj;
        this.f340682a.mo5437b(this.f340683b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
