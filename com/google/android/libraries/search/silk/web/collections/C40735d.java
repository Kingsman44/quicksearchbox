package com.google.android.libraries.search.silk.web.collections;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3219h.C41722a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.collections.d */
/* compiled from: PG */
public final /* synthetic */ class C40735d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkCollectionsV2MessageHandler f106831a;

    public /* synthetic */ C40735d(SilkCollectionsV2MessageHandler silkCollectionsV2MessageHandler) {
        this.f106831a = silkCollectionsV2MessageHandler;
    }

    public final void accept(Object obj) {
        SilkCollectionsV2MessageHandler silkCollectionsV2MessageHandler = this.f106831a;
        C41722a aVar = (C41722a) obj;
        ((PostMessageMixinImpl) silkCollectionsV2MessageHandler.f106825c).mo46952c(R.id.open_collection, C40739h.f106835a, new C40740i(silkCollectionsV2MessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkCollectionsV2MessageHandler.f106825c).mo46952c(R.id.save, C40741j.f106838a, new C40742k(silkCollectionsV2MessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkCollectionsV2MessageHandler.f106825c).mo46952c(R.id.unsave, C40743l.f106841a, new C40744m(silkCollectionsV2MessageHandler, aVar), true, C41743a.f109088b);
        ((PostMessageMixinImpl) silkCollectionsV2MessageHandler.f106825c).mo46952c(R.id.set_active_list, C40745n.f106844a, new C40746o(silkCollectionsV2MessageHandler, aVar), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
