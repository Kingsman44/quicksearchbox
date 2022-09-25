package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.net.Uri;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.w */
/* compiled from: PG */
public final /* synthetic */ class C93051w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259563a;

    /* renamed from: b */
    public final /* synthetic */ String f259564b;

    public /* synthetic */ C93051w(ChatPerformer chatPerformer, String str) {
        this.f259563a = chatPerformer;
        this.f259564b = str;
    }

    public final void accept(Object obj) {
        this.f259563a.f259391c.grantUriPermission(this.f259564b, (Uri) obj, 1);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
