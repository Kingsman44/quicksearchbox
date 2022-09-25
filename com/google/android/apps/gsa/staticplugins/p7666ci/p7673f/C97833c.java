package com.google.android.apps.gsa.staticplugins.p7666ci.p7673f;

import android.graphics.Bitmap;
import android.widget.ImageView;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.f.c */
/* compiled from: PG */
public final /* synthetic */ class C97833c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ ImageView f273196a;

    public /* synthetic */ C97833c(ImageView imageView) {
        this.f273196a = imageView;
    }

    public final void accept(Object obj) {
        this.f273196a.setImageBitmap((Bitmap) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
