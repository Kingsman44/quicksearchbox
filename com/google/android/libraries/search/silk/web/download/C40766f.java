package com.google.android.libraries.search.silk.web.download;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3220i.C41723a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.download.f */
/* compiled from: PG */
public final /* synthetic */ class C40766f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkDownloadMessageHandler f106878a;

    public /* synthetic */ C40766f(SilkDownloadMessageHandler silkDownloadMessageHandler) {
        this.f106878a = silkDownloadMessageHandler;
    }

    public final void accept(Object obj) {
        SilkDownloadMessageHandler silkDownloadMessageHandler = this.f106878a;
        ((PostMessageMixinImpl) silkDownloadMessageHandler.f106870c).mo46952c(R.id.start_image_download, C40764d.f106875a, new C40765e(silkDownloadMessageHandler, (C41723a) obj), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
