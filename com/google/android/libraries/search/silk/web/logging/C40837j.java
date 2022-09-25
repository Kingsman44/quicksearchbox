package com.google.android.libraries.search.silk.web.logging;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3227p.C41730a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.logging.j */
/* compiled from: PG */
public final /* synthetic */ class C40837j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkLoggingMessageHandler f107017a;

    public /* synthetic */ C40837j(SilkLoggingMessageHandler silkLoggingMessageHandler) {
        this.f107017a = silkLoggingMessageHandler;
    }

    public final void accept(Object obj) {
        SilkLoggingMessageHandler silkLoggingMessageHandler = this.f107017a;
        C41730a aVar = (C41730a) obj;
        ((PostMessageMixinImpl) silkLoggingMessageHandler.f107004c).mo46952c(R.id.log, C40832e.f107010a, new C40833f(silkLoggingMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkLoggingMessageHandler.f107004c).mo46952c(R.id.log_test_code_event, C40834g.f107013a, new C40835h(silkLoggingMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
