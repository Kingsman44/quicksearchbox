package com.google.android.libraries.search.silk.web.amp;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3206a.C41709a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.amp.d */
/* compiled from: PG */
public final /* synthetic */ class C40663d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkAmpMessageHandler f106695a;

    public /* synthetic */ C40663d(SilkAmpMessageHandler silkAmpMessageHandler) {
        this.f106695a = silkAmpMessageHandler;
    }

    public final void accept(Object obj) {
        SilkAmpMessageHandler silkAmpMessageHandler = this.f106695a;
        C41709a aVar = (C41709a) obj;
        ((PostMessageMixinImpl) silkAmpMessageHandler.f106689c).mo46952c(R.id.prefetch, C40664e.f106696a, new C40665f(silkAmpMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkAmpMessageHandler.f106689c).mo46952c(R.id.open, C40666g.f106699a, new C40667h(silkAmpMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
