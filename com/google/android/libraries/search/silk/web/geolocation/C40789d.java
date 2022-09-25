package com.google.android.libraries.search.silk.web.geolocation;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3223l.C41726a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.geolocation.d */
/* compiled from: PG */
public final /* synthetic */ class C40789d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkGeolocationMessageHandler f106933a;

    public /* synthetic */ C40789d(SilkGeolocationMessageHandler silkGeolocationMessageHandler) {
        this.f106933a = silkGeolocationMessageHandler;
    }

    public final void accept(Object obj) {
        SilkGeolocationMessageHandler silkGeolocationMessageHandler = this.f106933a;
        C41726a aVar = (C41726a) obj;
        ((PostMessageMixinImpl) silkGeolocationMessageHandler.f106928c).mo46952c(R.id.get_current_location, C40790e.f106934a, new C40791f(silkGeolocationMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkGeolocationMessageHandler.f106928c).mo46952c(R.id.get_current_location_with_options, C40792g.f106937a, new C40793h(silkGeolocationMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkGeolocationMessageHandler.f106928c).mo46952c(R.id.get_geolocation_permission_state, C40794i.f106940a, new C40795j(silkGeolocationMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
