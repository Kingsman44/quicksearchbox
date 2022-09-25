package com.google.android.libraries.search.silk.web.channels;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3217f.C41720a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.channels.j */
/* compiled from: PG */
public final /* synthetic */ class C40722j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkChannelsMessageHandler f106802a;

    public /* synthetic */ C40722j(SilkChannelsMessageHandler silkChannelsMessageHandler) {
        this.f106802a = silkChannelsMessageHandler;
    }

    public final void accept(Object obj) {
        SilkChannelsMessageHandler silkChannelsMessageHandler = this.f106802a;
        C41720a aVar = (C41720a) obj;
        ((PostMessageMixinImpl) silkChannelsMessageHandler.f106787c).mo46952c(R.id.open_channel, C40716d.f106793a, new C40717e(silkChannelsMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkChannelsMessageHandler.f106787c).mo46952c(R.id.get_channel_follow_state, C40718f.f106796a, new C40719g(silkChannelsMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkChannelsMessageHandler.f106787c).mo46952c(R.id.set_channel_follow_state, C40720h.f106799a, new C40721i(silkChannelsMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
