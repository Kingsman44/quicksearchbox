package com.google.android.libraries.search.silk.web.xblendcontainer;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3211ae.C41714a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.xblendcontainer.d */
/* compiled from: PG */
public final /* synthetic */ class C41375d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkXblendContainerMessageHandler f108113a;

    public /* synthetic */ C41375d(SilkXblendContainerMessageHandler silkXblendContainerMessageHandler) {
        this.f108113a = silkXblendContainerMessageHandler;
    }

    public final void accept(Object obj) {
        SilkXblendContainerMessageHandler silkXblendContainerMessageHandler = this.f108113a;
        C41714a aVar = (C41714a) obj;
        ((PostMessageMixinImpl) silkXblendContainerMessageHandler.f108107c).mo46952c(R.id.open_full_screen_pane, C41378g.f108116a, new C41379h(silkXblendContainerMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkXblendContainerMessageHandler.f108107c).mo46952c(R.id.prefetch_xblend_content, C41380i.f108119a, new C41381j(silkXblendContainerMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkXblendContainerMessageHandler.f108107c).mo46952c(R.id.get_prefetched_xblend_content, C41382k.f108122a, new C41383l(silkXblendContainerMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
