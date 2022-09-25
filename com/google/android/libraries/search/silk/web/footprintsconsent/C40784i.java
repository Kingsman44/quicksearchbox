package com.google.android.libraries.search.silk.web.footprintsconsent;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3222k.C41725a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.footprintsconsent.i */
/* compiled from: PG */
public final /* synthetic */ class C40784i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkFootprintsConsentMessageHandler f106921a;

    public /* synthetic */ C40784i(SilkFootprintsConsentMessageHandler silkFootprintsConsentMessageHandler) {
        this.f106921a = silkFootprintsConsentMessageHandler;
    }

    public final void accept(Object obj) {
        SilkFootprintsConsentMessageHandler silkFootprintsConsentMessageHandler = this.f106921a;
        C41725a aVar = (C41725a) obj;
        ((PostMessageMixinImpl) silkFootprintsConsentMessageHandler.f106909c).mo46952c(R.id.send_loading_result, C40780e.f106915a, new C40781f(silkFootprintsConsentMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkFootprintsConsentMessageHandler.f106909c).mo46952c(R.id.send_consent_result, C40782g.f106918a, new C40783h(silkFootprintsConsentMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
