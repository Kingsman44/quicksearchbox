package com.google.android.libraries.search.silk.web.panes;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3230s.C41733a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.panes.f */
/* compiled from: PG */
public final /* synthetic */ class C40862f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkPanesMessageHandler f107063a;

    public /* synthetic */ C40862f(SilkPanesMessageHandler silkPanesMessageHandler) {
        this.f107063a = silkPanesMessageHandler;
    }

    public final void accept(Object obj) {
        SilkPanesMessageHandler silkPanesMessageHandler = this.f107063a;
        C41733a aVar = (C41733a) obj;
        ((PostMessageMixinImpl) silkPanesMessageHandler.f107054c).mo46952c(R.id.open_media_pane, C40867k.f107068a, new C40868l(silkPanesMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkPanesMessageHandler.f107054c).mo46952c(R.id.close_media_pane, C40869m.f107071a, new C40870n(silkPanesMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkPanesMessageHandler.f107054c).mo46952c(R.id.open_modal_pane, C40871o.f107074a, new C40872p(silkPanesMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkPanesMessageHandler.f107054c).mo46952c(R.id.close_modal_pane, C40873q.f107077a, new C40874r(silkPanesMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkPanesMessageHandler.f107054c).mo46952c(R.id.close, C40860d.f107060a, new C40861e(silkPanesMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
