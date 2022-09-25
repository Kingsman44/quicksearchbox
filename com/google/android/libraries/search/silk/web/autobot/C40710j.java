package com.google.android.libraries.search.silk.web.autobot;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3215d.C41718a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.autobot.j */
/* compiled from: PG */
public final /* synthetic */ class C40710j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkAutobotMessageHandler f106771a;

    public /* synthetic */ C40710j(SilkAutobotMessageHandler silkAutobotMessageHandler) {
        this.f106771a = silkAutobotMessageHandler;
    }

    public final void accept(Object obj) {
        SilkAutobotMessageHandler silkAutobotMessageHandler = this.f106771a;
        C41718a aVar = (C41718a) obj;
        ((PostMessageMixinImpl) silkAutobotMessageHandler.f106758c).mo46952c(R.id.start_autobot, C40705e.f106764a, new C40706f(silkAutobotMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkAutobotMessageHandler.f106758c).mo46952c(R.id.start_autobot_via_intent, C40707g.f106767a, new C40708h(silkAutobotMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
