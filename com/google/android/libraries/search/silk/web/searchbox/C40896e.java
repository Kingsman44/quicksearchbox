package com.google.android.libraries.search.silk.web.searchbox;

import com.google.android.libraries.silk.p3205a.p3233v.C41736a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.searchbox.e */
/* compiled from: PG */
public final /* synthetic */ class C40896e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkSearchboxMessageHandler f107127a;

    public /* synthetic */ C40896e(SilkSearchboxMessageHandler silkSearchboxMessageHandler) {
        this.f107127a = silkSearchboxMessageHandler;
    }

    public final void accept(Object obj) {
        this.f107127a.mo42889h((C41736a) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
