package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.m */
/* compiled from: PG */
public final /* synthetic */ class C122705m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ TextAnnotatorImpl f339985a;

    public /* synthetic */ C122705m(TextAnnotatorImpl textAnnotatorImpl) {
        this.f339985a = textAnnotatorImpl;
    }

    public final void accept(Object obj) {
        ((C122695c) obj).mo105716b(new C122701i(this.f339985a));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
