package com.google.android.libraries.search.silk.web.lens;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3226o.C41729a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.lens.d */
/* compiled from: PG */
public final /* synthetic */ class C40821d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkLensMessageHandler f106990a;

    public /* synthetic */ C40821d(SilkLensMessageHandler silkLensMessageHandler) {
        this.f106990a = silkLensMessageHandler;
    }

    public final void accept(Object obj) {
        SilkLensMessageHandler silkLensMessageHandler = this.f106990a;
        C41729a aVar = (C41729a) obj;
        ((PostMessageMixinImpl) silkLensMessageHandler.f106985c).mo46952c(R.id.get_lens_api_capabilities, C40823f.f106992a, new C40824g(silkLensMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkLensMessageHandler.f106985c).mo46952c(R.id.start_lens, C40825h.f106995a, new C40826i(silkLensMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
