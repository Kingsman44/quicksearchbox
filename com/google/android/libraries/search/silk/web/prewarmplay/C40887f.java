package com.google.android.libraries.search.silk.web.prewarmplay;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3232u.C41735a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.prewarmplay.f */
/* compiled from: PG */
public final /* synthetic */ class C40887f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkPrewarmPlayMessageHandler f107107a;

    public /* synthetic */ C40887f(SilkPrewarmPlayMessageHandler silkPrewarmPlayMessageHandler) {
        this.f107107a = silkPrewarmPlayMessageHandler;
    }

    public final void accept(Object obj) {
        SilkPrewarmPlayMessageHandler silkPrewarmPlayMessageHandler = this.f107107a;
        C41735a aVar = (C41735a) obj;
        ((PostMessageMixinImpl) silkPrewarmPlayMessageHandler.f107100c).mo46952c(R.id.prewarm, C40888g.f107108a, new C40889h(silkPrewarmPlayMessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkPrewarmPlayMessageHandler.f107100c).mo46952c(R.id.detach, C40890i.f107111a, new C40891j(silkPrewarmPlayMessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
