package com.google.android.libraries.search.silk.web.uimodes;

import com.google.android.libraries.silk.p3205a.p3207aa.C41710a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.uimodes.h */
/* compiled from: PG */
public final /* synthetic */ class C40944h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkUiModesMessageHandler f107223a;

    public /* synthetic */ C40944h(SilkUiModesMessageHandler silkUiModesMessageHandler) {
        this.f107223a = silkUiModesMessageHandler;
    }

    public final void accept(Object obj) {
        this.f107223a.mo42963h((C41710a) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
