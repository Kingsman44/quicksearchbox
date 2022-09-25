package com.google.android.libraries.search.silk.web.close;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3218g.C41721a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.close.g */
/* compiled from: PG */
public final /* synthetic */ class C40731g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkCloseMessageHandler f106819a;

    public /* synthetic */ C40731g(SilkCloseMessageHandler silkCloseMessageHandler) {
        this.f106819a = silkCloseMessageHandler;
    }

    public final void accept(Object obj) {
        SilkCloseMessageHandler silkCloseMessageHandler = this.f106819a;
        ((PostMessageMixinImpl) silkCloseMessageHandler.f106810c).mo46952c(R.id.close, C40729e.f106816a, new C40730f(silkCloseMessageHandler, (C41721a) obj), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
