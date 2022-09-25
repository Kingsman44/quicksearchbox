package com.google.android.libraries.search.silk.web.share;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3235x.C41739b;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.share.j */
/* compiled from: PG */
public final /* synthetic */ class C40914j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkShareMessageHandler f107163a;

    public /* synthetic */ C40914j(SilkShareMessageHandler silkShareMessageHandler) {
        this.f107163a = silkShareMessageHandler;
    }

    public final void accept(Object obj) {
        SilkShareMessageHandler silkShareMessageHandler = this.f107163a;
        C41739b bVar = (C41739b) obj;
        ((PostMessageMixinImpl) silkShareMessageHandler.f107151d).mo46952c(R.id.show_share_sheet, C40915k.f107164a, new C40916l(silkShareMessageHandler, bVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkShareMessageHandler.f107151d).mo46952c(R.id.bind_callback_to_native_share_button, C40917m.f107167a, new C40918n(silkShareMessageHandler, bVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkShareMessageHandler.f107151d).mo46952c(R.id.remove_binding_to_native_share_button, C40919o.f107170a, new C40920p(silkShareMessageHandler, bVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkShareMessageHandler.f107151d).mo46952c(R.id.share_button_tap_event_subscription, C40921q.f107173a, new C40922r(silkShareMessageHandler), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkShareMessageHandler.f107151d).mo46952c(R.id.share_button_tap_event_unsubscription, C40909e.f107158a, new C40910f(silkShareMessageHandler), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
