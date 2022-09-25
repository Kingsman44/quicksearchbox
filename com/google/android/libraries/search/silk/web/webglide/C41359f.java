package com.google.android.libraries.search.silk.web.webglide;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3210ad.C41713a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.webglide.f */
/* compiled from: PG */
public final /* synthetic */ class C41359f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkWebGlideMessageHandler f108089a;

    public /* synthetic */ C41359f(SilkWebGlideMessageHandler silkWebGlideMessageHandler) {
        this.f108089a = silkWebGlideMessageHandler;
    }

    public final void accept(Object obj) {
        SilkWebGlideMessageHandler silkWebGlideMessageHandler = this.f108089a;
        ((PostMessageMixinImpl) silkWebGlideMessageHandler.f108080d).mo46952c(R.id.open_web_pages, C41362i.f108092a, new C41363j(silkWebGlideMessageHandler, (C41713a) obj), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkWebGlideMessageHandler.f108080d).mo46952c(R.id.result_tapped_event_subscription, C41364k.f108095a, new C41365l(silkWebGlideMessageHandler), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkWebGlideMessageHandler.f108080d).mo46952c(R.id.result_tapped_event_unsubscription, C41366m.f108097a, new C41367n(silkWebGlideMessageHandler), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkWebGlideMessageHandler.f108080d).mo46952c(R.id.close_tapped_event_subscription, C41368o.f108099a, new C41369p(silkWebGlideMessageHandler), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkWebGlideMessageHandler.f108080d).mo46952c(R.id.close_tapped_event_unsubscription, C41370q.f108101a, new C41358e(silkWebGlideMessageHandler), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
