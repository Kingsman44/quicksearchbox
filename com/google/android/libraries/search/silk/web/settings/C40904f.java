package com.google.android.libraries.search.silk.web.settings;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3234w.C41737a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.settings.f */
/* compiled from: PG */
public final /* synthetic */ class C40904f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkSettingsMessageHandler f107144a;

    public /* synthetic */ C40904f(SilkSettingsMessageHandler silkSettingsMessageHandler) {
        this.f107144a = silkSettingsMessageHandler;
    }

    public final void accept(Object obj) {
        SilkSettingsMessageHandler silkSettingsMessageHandler = this.f107144a;
        ((PostMessageMixinImpl) silkSettingsMessageHandler.f107135c).mo46952c(R.id.update_setting_value, C40901c.f107140a, new C40902d(silkSettingsMessageHandler, (C41737a) obj), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
