package com.google.android.libraries.search.silk.web.weathersettings;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3209ac.C41712a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.weathersettings.f */
/* compiled from: PG */
public final /* synthetic */ class C41352f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkWeatherSettingsMessageHandler f108072a;

    public /* synthetic */ C41352f(SilkWeatherSettingsMessageHandler silkWeatherSettingsMessageHandler) {
        this.f108072a = silkWeatherSettingsMessageHandler;
    }

    public final void accept(Object obj) {
        SilkWeatherSettingsMessageHandler silkWeatherSettingsMessageHandler = this.f108072a;
        ((PostMessageMixinImpl) silkWeatherSettingsMessageHandler.f108064c).mo46952c(R.id.update_temperature_unit, C41350d.f108069a, new C41351e(silkWeatherSettingsMessageHandler, (C41712a) obj), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
