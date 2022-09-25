package com.google.android.libraries.search.silk.web.phonecall;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3231t.C41734a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.phonecall.f */
/* compiled from: PG */
public final /* synthetic */ class C40880f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkPhonecallMessageHandler f107093a;

    public /* synthetic */ C40880f(SilkPhonecallMessageHandler silkPhonecallMessageHandler) {
        this.f107093a = silkPhonecallMessageHandler;
    }

    public final void accept(Object obj) {
        SilkPhonecallMessageHandler silkPhonecallMessageHandler = this.f107093a;
        ((PostMessageMixinImpl) silkPhonecallMessageHandler.f107085c).mo46952c(R.id.call_phone_number, C40878d.f107090a, new C40879e(silkPhonecallMessageHandler, (C41734a) obj), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
