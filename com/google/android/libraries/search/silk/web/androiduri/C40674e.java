package com.google.android.libraries.search.silk.web.androiduri;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3213b.C41716a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.androiduri.e */
/* compiled from: PG */
public final /* synthetic */ class C40674e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkAndroidUriMessageHandler f106714a;

    public /* synthetic */ C40674e(SilkAndroidUriMessageHandler silkAndroidUriMessageHandler) {
        this.f106714a = silkAndroidUriMessageHandler;
    }

    public final void accept(Object obj) {
        SilkAndroidUriMessageHandler silkAndroidUriMessageHandler = this.f106714a;
        C41716a aVar = (C41716a) obj;
        ((PostMessageMixinImpl) silkAndroidUriMessageHandler.f106708c).mo46952c(R.id.can_uri_be_handled_by_package, C40678i.f106718a, new C40679j(silkAndroidUriMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkAndroidUriMessageHandler.f106708c).mo46952c(R.id.can_uri_be_handled, C40680k.f106721a, new C40681l(silkAndroidUriMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkAndroidUriMessageHandler.f106708c).mo46952c(R.id.can_launch_app, C40682m.f106724a, new C40683n(silkAndroidUriMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkAndroidUriMessageHandler.f106708c).mo46952c(R.id.launch_app_via_intent_uri, C40684o.f106727a, new C40685p(silkAndroidUriMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
