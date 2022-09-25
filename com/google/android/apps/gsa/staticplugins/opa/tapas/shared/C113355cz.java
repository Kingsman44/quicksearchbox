package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.widget.ImageView;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.IntConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cz */
/* compiled from: PG */
public final /* synthetic */ class C113355cz implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ ImageView f313882a;

    public /* synthetic */ C113355cz(ImageView imageView) {
        this.f313882a = imageView;
    }

    public final void accept(int i) {
        ImageView imageView = this.f313882a;
        C59071e eVar = C113367dh.f313907a;
        imageView.setPadding(i, i, i, i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
