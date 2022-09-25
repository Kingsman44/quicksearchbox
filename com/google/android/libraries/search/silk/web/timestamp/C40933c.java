package com.google.android.libraries.search.silk.web.timestamp;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3237z.C41741a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.timestamp.c */
/* compiled from: PG */
public final /* synthetic */ class C40933c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkTimestampMessageHandler f107201a;

    public /* synthetic */ C40933c(SilkTimestampMessageHandler silkTimestampMessageHandler) {
        this.f107201a = silkTimestampMessageHandler;
    }

    public final void accept(Object obj) {
        SilkTimestampMessageHandler silkTimestampMessageHandler = this.f107201a;
        ((PostMessageMixinImpl) silkTimestampMessageHandler.f107196c).mo46952c(R.id.get_first_byte_time, C40934d.f107202a, new C40935e(silkTimestampMessageHandler, (C41741a) obj), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
