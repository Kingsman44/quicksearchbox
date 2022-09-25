package com.google.android.libraries.web.contrib.favicon.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.libraries.web.contrib.favicon.C43546e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.favicon.internal.a */
/* compiled from: PG */
public final /* synthetic */ class C43551a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f113714a;

    /* renamed from: b */
    public final /* synthetic */ Uri f113715b;

    public /* synthetic */ C43551a(Bitmap bitmap, Uri uri) {
        this.f113714a = bitmap;
        this.f113715b = uri;
    }

    public final void accept(Object obj) {
        ((C43546e) obj).mo46610a(this.f113714a, this.f113715b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
